package typings
package officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardActionsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardActionsProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[
      officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardActionsDotBaseMod.DocumentCardActionsBase
    ] {
  /**
    * The actions available for this document.
    */
  var actions: js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonProps
  ]
  /**
    * Optional override class name
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IDocumentCardActions]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
    * The number of views this document has received.
    */
  var views: js.UndefOr[stdLib.Number] = js.undefined
}

