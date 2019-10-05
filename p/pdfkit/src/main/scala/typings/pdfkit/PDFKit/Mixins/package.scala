package typings.pdfkit.PDFKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Mixins {
  import typings.pdfkit.PDFKit.PDFGradient

  // The color forms accepted by PDFKit:
  //     example:   "red"                  [R, G, B]                  [C, M, Y, K]
  type ColorValue = String | PDFGradient | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
}
