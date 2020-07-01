package typings.pdfkit.PDFKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Mixins {
  // The color forms accepted by PDFKit:
  //     example:   "red"                  [R, G, B]                  [C, M, Y, K]
  type ColorValue = java.lang.String | typings.pdfkit.PDFKit.PDFGradient | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  type PDFFontSource = java.lang.String | typings.node.Buffer | typings.std.Uint8Array | typings.std.ArrayBuffer
}
