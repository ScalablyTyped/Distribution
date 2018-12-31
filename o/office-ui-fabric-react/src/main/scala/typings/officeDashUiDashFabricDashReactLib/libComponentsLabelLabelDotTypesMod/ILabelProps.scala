package typings
package officeDashUiDashFabricDashReactLib.libComponentsLabelLabelDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabelProps
  extends reactLib.reactMod.ReactNs.LabelHTMLAttributes[reactLib.HTMLLabelElement] {
  /**
    * Render the root element as another type.
    */
  var as: js.UndefOr[
    atUifabricUtilitiesLib.libIComponentAsMod.IComponentAs[reactLib.reactMod.ReactNs.AllHTMLAttributes[reactLib.HTMLElement]]
  ] = js.undefined
  /**
    * Optional callback to access the ILabel interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ILabel]] = js.undefined
  /**
    * Renders the label as disabled.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the associated form field is required or not
    * @defaultvalue false
    */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Styles for the label.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

