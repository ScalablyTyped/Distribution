package typings.pdfImage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConvertOptions = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in pdf-image.pdf-image.ConvertOptionKey ]:? string}
    */ typings.pdfImage.pdfImageStrings.ConvertOptions with js.Any
  type OptionalSpread[CombinedImage /* <: scala.Boolean */] = js.Array[
    (typings.pdfImage.mod.Options with typings.pdfImage.AnonCombinedImageOptional[CombinedImage]) | (typings.pdfImage.mod.Options with typings.pdfImage.AnonCombinedImage[CombinedImage]) | js.Any
  ]
}
