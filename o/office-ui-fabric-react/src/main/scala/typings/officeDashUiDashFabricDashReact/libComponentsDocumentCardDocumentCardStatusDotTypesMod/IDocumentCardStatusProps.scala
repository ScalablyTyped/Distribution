package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardStatusDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardStatusDotBaseMod.DocumentCardStatusBase
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardStatusProps extends Props[DocumentCardStatusBase] {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IDocumentCardStatus]] = js.undefined
  /**
    * Describe status information. Required field.
    */
  var status: String
  /**
    * Describes DocumentCard status icon.
    */
  var statusIcon: js.UndefOr[String] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardStatusStyleProps, IDocumentCardStatusStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IDocumentCardStatusProps {
  @scala.inline
  def apply(
    status: String,
    children: ReactNode = null,
    className: String = null,
    componentRef: IRefObject[IDocumentCardStatus] = null,
    key: Key = null,
    ref: LegacyRef[DocumentCardStatusBase] = null,
    statusIcon: String = null,
    styles: IStyleFunctionOrObject[IDocumentCardStatusStyleProps, IDocumentCardStatusStyles] = null,
    theme: ITheme = null
  ): IDocumentCardStatusProps = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (statusIcon != null) __obj.updateDynamic("statusIcon")(statusIcon.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardStatusProps]
  }
}

