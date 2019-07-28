package typings.pdfkit.PDFKitNs

import typings.pdfkit.PDFKitNs.PDFGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MixinsNs {
  // The color forms accepted by PDFKit:
  //     example:   "red"                  [R, G, B]                  [C, M, Y, K]
  type ColorValue = String | PDFGradient | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
}
