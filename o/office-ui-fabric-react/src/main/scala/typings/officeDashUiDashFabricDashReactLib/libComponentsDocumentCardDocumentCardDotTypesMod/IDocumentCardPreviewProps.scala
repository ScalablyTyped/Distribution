package typings
package officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardPreviewProps
  extends atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[js.Object] {
  /**
    * The function return string that will describe the number of overflow documents.
    * such as  (overflowCount: number) =\> `+${ overflowCount } more`,
    */
  var getOverflowDocumentCountText: js.UndefOr[js.Function1[/* overflowCount */ scala.Double, java.lang.String]] = js.undefined
  /**
    * One or more preview images to display.
    */
  var previewImages: js.Array[IDocumentCardPreviewImage]
}

