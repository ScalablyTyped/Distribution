package typings
package officeDashUiDashFabricDashReactLib.libComponentsLinkLinkDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinkProps
  extends ILinkHTMLAttributes[
      reactLib.HTMLAnchorElement | reactLib.HTMLButtonElement | reactLib.HTMLElement | officeDashUiDashFabricDashReactLib.libComponentsLinkLinkDotBaseMod.LinkBase
    ] {
  /**
    * A component that should be used as the root element of the link returned from the Link component.
    */
  var as: js.UndefOr[
    java.lang.String | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[js.Object]
  ] = js.undefined
  /**
    * Optional callback to access the ILink interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ILink]] = js.undefined
  /**
    * Optional keytip for this Link
    */
  var keytipProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
  ] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ILinkStyleProps, ILinkStyles]
  ] = js.undefined
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

