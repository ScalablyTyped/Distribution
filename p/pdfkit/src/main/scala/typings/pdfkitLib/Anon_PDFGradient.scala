package typings
package pdfkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PDFGradient extends js.Object {
  var PDFGradient: pdfkitLib.PDFKitNs.PDFGradient
  var PDFLinearGradient: pdfkitLib.PDFKitNs.PDFLinearGradient
  var PDFRadialGradiant: pdfkitLib.PDFKitNs.PDFRadialGradient
}

object Anon_PDFGradient {
  @scala.inline
  def apply(
    PDFGradient: pdfkitLib.PDFKitNs.PDFGradient,
    PDFLinearGradient: pdfkitLib.PDFKitNs.PDFLinearGradient,
    PDFRadialGradiant: pdfkitLib.PDFKitNs.PDFRadialGradient
  ): Anon_PDFGradient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PDFGradient")(PDFGradient)
    __obj.updateDynamic("PDFLinearGradient")(PDFLinearGradient)
    __obj.updateDynamic("PDFRadialGradiant")(PDFRadialGradiant)
    __obj.asInstanceOf[Anon_PDFGradient]
  }
}

