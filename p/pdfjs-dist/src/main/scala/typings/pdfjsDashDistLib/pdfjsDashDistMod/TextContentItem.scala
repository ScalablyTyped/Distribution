package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextContentItem extends js.Object {
  var dir: java.lang.String
   // Left-to-right (ltr), etc
  var fontName: java.lang.String
  var height: scala.Double
  var str: java.lang.String
  var transform: js.Array[scala.Double]
   // [0..5]   4=x, 5=y
  var width: scala.Double
}

