package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardLogoDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardLogoDotBaseMod.DocumentCardLogoBase
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardLogoProps extends ClassAttributes[DocumentCardLogoBase] {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IDocumentCardLogo]] = js.undefined
  /**
    * Describes DocumentCard Logo badge.
    */
  var logoIcon: String
  /**
    * Describe Logo name, optional.
    */
  var logoName: js.UndefOr[String] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardLogoStyleProps, IDocumentCardLogoStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IDocumentCardLogoProps {
  @scala.inline
  def apply(
    logoIcon: String,
    className: String = null,
    componentRef: IRefObject[IDocumentCardLogo] = null,
    key: Key = null,
    logoName: String = null,
    ref: LegacyRef[DocumentCardLogoBase] = null,
    styles: IStyleFunctionOrObject[IDocumentCardLogoStyleProps, IDocumentCardLogoStyles] = null,
    theme: ITheme = null
  ): IDocumentCardLogoProps = {
    val __obj = js.Dynamic.literal(logoIcon = logoIcon)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (logoName != null) __obj.updateDynamic("logoName")(logoName)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IDocumentCardLogoProps]
  }
}

