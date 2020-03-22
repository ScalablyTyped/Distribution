package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHTML extends js.Object {
  var Date: String
  var HTML: Double
  var Text: Double
}

object AnonHTML {
  @scala.inline
  def apply(Date: String, HTML: Double, Text: Double): AnonHTML = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], HTML = HTML.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHTML]
  }
}

