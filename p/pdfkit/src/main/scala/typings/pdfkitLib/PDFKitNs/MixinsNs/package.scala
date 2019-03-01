package typings
package pdfkitLib.PDFKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MixinsNs {
  // The color forms accepted by PDFKit:
  //     example:   "red"                  [R, G, B]                  [C, M, Y, K]
  type ColorValue = java.lang.String | pdfkitLib.PDFKitNs.PDFGradient | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
}
