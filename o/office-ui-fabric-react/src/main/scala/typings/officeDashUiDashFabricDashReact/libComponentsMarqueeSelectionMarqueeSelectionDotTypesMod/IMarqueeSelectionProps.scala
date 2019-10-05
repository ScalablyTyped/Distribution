package typings.officeDashUiDashFabricDashReact.libComponentsMarqueeSelectionMarqueeSelectionDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunction
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libSelectionSelectionDotTypesMod.ISelection
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarqueeSelectionProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Optional callback to access the IMarqueeSelection interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IMarqueeSelection]] = js.undefined
  /**
    * Optional flag to restrict the drag rect to the root element, instead of allowing the drag
    * rect to start outside of the root element boundaries.
    * @defaultvalue false
    */
  var isDraggingConstrainedToRoot: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional flag to control the enabled state of marquee selection. This allows you to render
    * it and have events all ready to go, but conditionally disable it. That way transitioning
    * between enabled/disabled generate no difference in the DOM.
    * @defaultvalue true
    */
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional callback that is called, when the mouse down event occurs, in order to determine
    * if we should start a marquee selection. If true is returned, we will cancel the mousedown
    * event to prevent upstream mousedown handlers from executing.
    */
  var onShouldStartSelection: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean]] = js.undefined
  /**
    * Optional props to mix into the root DIV element.
    */
  var rootProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  /**
    * The selection object to interact with when updating selection changes.
    */
  var selection: ISelection
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunction[IMarqueeSelectionStyleProps, IMarqueeSelectionStyles]] = js.undefined
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IMarqueeSelectionProps {
  @scala.inline
  def apply(
    selection: ISelection,
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    className: String = null,
    componentRef: IRefObject[IMarqueeSelection] = null,
    isDraggingConstrainedToRoot: js.UndefOr[Boolean] = js.undefined,
    isEnabled: js.UndefOr[Boolean] = js.undefined,
    onShouldStartSelection: /* ev */ MouseEvent => Boolean = null,
    rootProps: HTMLAttributes[HTMLDivElement] = null,
    styles: IMarqueeSelectionStyleProps => Partial[IMarqueeSelectionStyles] = null,
    theme: ITheme = null
  ): IMarqueeSelectionProps = {
    val __obj = js.Dynamic.literal(selection = selection)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraggingConstrainedToRoot)) __obj.updateDynamic("isDraggingConstrainedToRoot")(isDraggingConstrainedToRoot)
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled)
    if (onShouldStartSelection != null) __obj.updateDynamic("onShouldStartSelection")(js.Any.fromFunction1(onShouldStartSelection))
    if (rootProps != null) __obj.updateDynamic("rootProps")(rootProps)
    if (styles != null) __obj.updateDynamic("styles")(js.Any.fromFunction1(styles))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IMarqueeSelectionProps]
  }
}

