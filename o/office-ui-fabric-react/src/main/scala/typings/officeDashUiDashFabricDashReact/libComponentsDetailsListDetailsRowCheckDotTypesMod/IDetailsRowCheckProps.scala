package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowCheckDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsRowCheckProps extends HTMLAttributes[HTMLElement] {
  /**
    * Is any selected - also true for isSelectionModal
    */
  var anySelected: js.UndefOr[Boolean] = js.undefined
  /**
    * Can this checkbox be selectable
    */
  var canSelect: Boolean
  /**
    * The classname to be passed down to Check component
    */
  var checkClassName: js.UndefOr[String] = js.undefined
  /**
    * Is this in compact mode?
    */
  var compact: js.UndefOr[Boolean] = js.undefined
  /**
    * Is the check part of the header in a DetailsList
    */
  var isHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not this checkbox is visible
    */
  var isVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * If provided, can be used to render a custom checkbox
    */
  var onRenderDetailsCheckbox: js.UndefOr[IRenderFunction[IDetailsCheckboxProps]] = js.undefined
  /**
    * Whether or not this check is selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * Style override
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsRowCheckStyleProps, IDetailsRowCheckStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.undefined
}

object IDetailsRowCheckProps {
  @scala.inline
  def apply(
    canSelect: Boolean,
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    anySelected: js.UndefOr[Boolean] = js.undefined,
    checkClassName: String = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    isHeader: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    onRenderDetailsCheckbox: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => Element | Null = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IDetailsRowCheckStyleProps, IDetailsRowCheckStyles] = null,
    theme: ITheme = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined
  ): IDetailsRowCheckProps = {
    val __obj = js.Dynamic.literal(canSelect = canSelect)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(anySelected)) __obj.updateDynamic("anySelected")(anySelected)
    if (checkClassName != null) __obj.updateDynamic("checkClassName")(checkClassName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (!js.isUndefined(isHeader)) __obj.updateDynamic("isHeader")(isHeader)
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible)
    if (onRenderDetailsCheckbox != null) __obj.updateDynamic("onRenderDetailsCheckbox")(js.Any.fromFunction2(onRenderDetailsCheckbox))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons)
    __obj.asInstanceOf[IDetailsRowCheckProps]
  }
}

