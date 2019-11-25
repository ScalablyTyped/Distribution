package typings.popcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Footnote extends js.Object {
  var end: Double
  var start: Double
  var target: String
  var text: String
}

object Footnote {
  @scala.inline
  def apply(end: Double, start: Double, target: String, text: String): Footnote = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Footnote]
  }
}

