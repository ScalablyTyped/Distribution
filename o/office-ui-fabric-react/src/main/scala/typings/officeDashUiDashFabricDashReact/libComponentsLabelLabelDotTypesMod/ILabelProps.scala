package typings.officeDashUiDashFabricDashReact.libComponentsLabelLabelDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIComponentAsMod.IComponentAs
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.LabelHTMLAttributes
import typings.std.HTMLElement
import typings.std.HTMLLabelElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabelProps extends LabelHTMLAttributes[HTMLLabelElement] {
  /**
    * Render the root element as another type.
    */
  var as: js.UndefOr[IComponentAs[AllHTMLAttributes[HTMLElement]]] = js.undefined
  /**
    * Optional callback to access the ILabel interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ILabel]] = js.undefined
  /**
    * Renders the label as disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the associated form field is required or not
    * @defaultvalue false
    */
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    * Styles for the label.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object ILabelProps {
  @scala.inline
  def apply(
    LabelHTMLAttributes: LabelHTMLAttributes[HTMLLabelElement] = null,
    as: IComponentAs[AllHTMLAttributes[HTMLElement]] = null,
    componentRef: IRefObject[ILabel] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles] = null,
    theme: ITheme = null
  ): ILabelProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, LabelHTMLAttributes)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ILabelProps]
  }
}

