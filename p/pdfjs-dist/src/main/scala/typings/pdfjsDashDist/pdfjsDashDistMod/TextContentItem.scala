package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextContentItem extends js.Object {
  var dir: String
   // Left-to-right (ltr), etc
  var fontName: String
  var height: Double
  var str: String
  var transform: js.Array[Double]
   // [0..5]   4=x, 5=y
  var width: Double
}

object TextContentItem {
  @scala.inline
  def apply(
    dir: String,
    fontName: String,
    height: Double,
    str: String,
    transform: js.Array[Double],
    width: Double
  ): TextContentItem = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextContentItem]
  }
}

