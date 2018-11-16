package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PDFPageViewport extends js.Object {
  var fontScale: scala.Double
  var height: scala.Double
  var transforms: js.Array[scala.Double]
  var width: scala.Double
  def clone(options: PDFPageViewportOptions): PDFPageViewport
   // [x1, y1, x2, y2]
  def convertToPdfPoint(x: scala.Double, y: scala.Double): js.Array[scala.Double]
  def convertToViewportPoint(x: scala.Double, y: scala.Double): js.Array[scala.Double]
   // [x, y]
  def convertToViewportRectangle(rect: js.Array[scala.Double]): js.Array[scala.Double]
}

