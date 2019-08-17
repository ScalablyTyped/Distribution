package typings.officeDashUiDashFabricDashReact.libComponentsLinkLinkDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import typings.officeDashUiDashFabricDashReact.libComponentsLinkLinkDotBaseMod.LinkBase
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinkProps extends ILinkHTMLAttributes[HTMLAnchorElement | HTMLButtonElement | HTMLElement | LinkBase] {
  /**
    * A component that should be used as the root element of the link returned from the Link component.
    */
  var as: js.UndefOr[
    String | (ComponentClass[js.Object, ComponentState]) | StatelessComponent[js.Object]
  ] = js.undefined
  /**
    * Optional callback to access the ILink interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ILink]] = js.undefined
  /**
    * Optional keytip for this Link
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ILinkStyleProps, ILinkStyles]] = js.undefined
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object ILinkProps {
  @scala.inline
  def apply(
    ILinkHTMLAttributes: ILinkHTMLAttributes[HTMLAnchorElement | HTMLButtonElement | HTMLElement | LinkBase] = null,
    as: String | (ComponentClass[js.Object, ComponentState]) | StatelessComponent[js.Object] = null,
    componentRef: IRefObject[ILink] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    keytipProps: IKeytipProps = null,
    styles: IStyleFunctionOrObject[ILinkStyleProps, ILinkStyles] = null,
    theme: ITheme = null
  ): ILinkProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ILinkHTMLAttributes)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ILinkProps]
  }
}

