package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardBaseCardDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseCardProps[TComponent, TStyles, TStyleProps] extends HTMLAttributes[HTMLDivElement] {
  /**
    * Optional callback to access the TComponent interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[TComponent]] = js.undefined
  /**
    * How the element should be positioned
    * @defaultvalue DirectionalHint.bottomLeftEdge
    */
  var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
  /**
    * Make callout content show on the set side
    * @defaultvalue true
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.undefined
  /**
    * Focus on first element by default on card or not
    */
  var firstFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * The gap between the card and the target
    * @defaultvalue 0
    */
  var gapSpace: js.UndefOr[Double] = js.undefined
  /**
    * Callback upon focus or mouse enter event
    */
  var onEnter: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.undefined
  /**
    * Callback upon blur or mouse leave event
    */
  var onLeave: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.undefined
  /**
    *  Item to be returned with onRender functions
    */
  var renderData: js.UndefOr[js.Any] = js.undefined
  /**
    * Custom styles for this component
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[
      TStyleProps, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
    */ typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.IBaseCardProps with js.Any
    ]
  ] = js.undefined
  /**
    * Element to anchor the card to.
    */
  var targetElement: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Trap focus or not
    */
  var trapFocus: js.UndefOr[Boolean] = js.undefined
}

object IBaseCardProps {
  @scala.inline
  def apply[TComponent, TStyles, TStyleProps](
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    className: String = null,
    componentRef: IRefObject[TComponent] = null,
    directionalHint: DirectionalHint = null,
    directionalHintFixed: js.UndefOr[Boolean] = js.undefined,
    firstFocus: js.UndefOr[Boolean] = js.undefined,
    gapSpace: Int | Double = null,
    onEnter: /* ev */ js.UndefOr[js.Any] => Unit = null,
    onLeave: /* ev */ js.UndefOr[js.Any] => Unit = null,
    renderData: js.Any = null,
    styles: IStyleFunctionOrObject[
      TStyleProps, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
    */ typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.IBaseCardProps with js.Any
    ] = null,
    targetElement: HTMLElement = null,
    theme: ITheme = null,
    trapFocus: js.UndefOr[Boolean] = js.undefined
  ): IBaseCardProps[TComponent, TStyles, TStyleProps] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint)
    if (!js.isUndefined(directionalHintFixed)) __obj.updateDynamic("directionalHintFixed")(directionalHintFixed)
    if (!js.isUndefined(firstFocus)) __obj.updateDynamic("firstFocus")(firstFocus)
    if (gapSpace != null) __obj.updateDynamic("gapSpace")(gapSpace.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction1(onLeave))
    if (renderData != null) __obj.updateDynamic("renderData")(renderData)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(trapFocus)) __obj.updateDynamic("trapFocus")(trapFocus)
    __obj.asInstanceOf[IBaseCardProps[TComponent, TStyles, TStyleProps]]
  }
}

