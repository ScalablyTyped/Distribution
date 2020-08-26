package typings.officeUiFabricReact.marqueeSelectionTypesMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunction
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarqueeSelectionProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Optional callback to access the IMarqueeSelection interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IMarqueeSelection]] = js.native
  /**
    * Optional flag to restrict the drag rect to the root element, instead of allowing the drag
    * rect to start outside of the root element boundaries.
    * @defaultvalue false
    */
  var isDraggingConstrainedToRoot: js.UndefOr[Boolean] = js.native
  /**
    * Optional flag to control the enabled state of marquee selection. This allows you to render
    * it and have events all ready to go, but conditionally disable it. That way transitioning
    * between enabled/disabled generate no difference in the DOM.
    * @defaultvalue true
    */
  var isEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Optional callback that is called, when the mouse down event occurs, in order to determine
    * if we should start a marquee selection. If true is returned, we will cancel the mousedown
    * event to prevent upstream mousedown handlers from executing.
    */
  var onShouldStartSelection: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean]] = js.native
  /**
    * Optional props to mix into the root DIV element.
    */
  var rootProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  /**
    * The selection object to interact with when updating selection changes.
    */
  var selection: ISelection[IObjectWithKey] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunction[IMarqueeSelectionStyleProps, IMarqueeSelectionStyles]] = js.native
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IMarqueeSelectionProps {
  @scala.inline
  def apply(selection: ISelection[IObjectWithKey]): IMarqueeSelectionProps = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarqueeSelectionProps]
  }
  @scala.inline
  implicit class IMarqueeSelectionPropsOps[Self <: IMarqueeSelectionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSelection(value: ISelection[IObjectWithKey]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IMarqueeSelection | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IMarqueeSelection]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setIsDraggingConstrainedToRoot(value: Boolean): Self = this.set("isDraggingConstrainedToRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDraggingConstrainedToRoot: Self = this.set("isDraggingConstrainedToRoot", js.undefined)
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    @scala.inline
    def setOnShouldStartSelection(value: /* ev */ MouseEvent => Boolean): Self = this.set("onShouldStartSelection", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShouldStartSelection: Self = this.set("onShouldStartSelection", js.undefined)
    @scala.inline
    def setRootProps(value: HTMLAttributes[HTMLDivElement]): Self = this.set("rootProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootProps: Self = this.set("rootProps", js.undefined)
    @scala.inline
    def setStyles(value: IMarqueeSelectionStyleProps => DeepPartial[IMarqueeSelectionStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

