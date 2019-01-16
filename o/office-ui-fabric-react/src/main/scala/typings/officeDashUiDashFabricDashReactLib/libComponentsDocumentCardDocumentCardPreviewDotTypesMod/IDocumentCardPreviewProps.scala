package typings
package officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardPreviewDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardPreviewProps
  extends atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[js.Object] {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gets the component ref.
    */
  @JSName("componentRef")
  var componentRef_IDocumentCardPreviewProps: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IDocumentCardPreview]] = js.undefined
  /**
    * The function return string that will describe the number of overflow documents.
    * such as  (overflowCount: number) =\> `+${ overflowCount } more`,
    */
  var getOverflowDocumentCountText: js.UndefOr[js.Function1[/* overflowCount */ scala.Double, java.lang.String]] = js.undefined
  /**
    * One or more preview images to display.
    */
  var previewImages: js.Array[IDocumentCardPreviewImage]
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDocumentCardPreviewStyleProps, IDocumentCardPreviewStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

