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

object TextContentItem {
  @scala.inline
  def apply(
    dir: java.lang.String,
    fontName: java.lang.String,
    height: scala.Double,
    str: java.lang.String,
    transform: js.Array[scala.Double],
    width: scala.Double
  ): TextContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dir")(dir)
    __obj.updateDynamic("fontName")(fontName)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("str")(str)
    __obj.updateDynamic("transform")(transform)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[TextContentItem]
  }
}

