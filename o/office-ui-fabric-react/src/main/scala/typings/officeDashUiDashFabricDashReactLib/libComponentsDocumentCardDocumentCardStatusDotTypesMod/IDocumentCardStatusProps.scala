package typings
package officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardStatusDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardStatusProps
  extends reactLib.reactMod.ReactNs.Props[
      officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardStatusDotBaseMod.DocumentCardStatusBase
    ] {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IDocumentCardStatus]] = js.undefined
  /**
    * Describe status information. Required field.
    */
  var status: java.lang.String
  /**
    * Describes DocumentCard status icon.
    */
  var statusIcon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDocumentCardStatusStyleProps, IDocumentCardStatusStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

