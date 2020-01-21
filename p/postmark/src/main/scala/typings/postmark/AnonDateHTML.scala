package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateHTML extends js.Object {
  var Date: String
  var HTML: Double
  var Text: Double
}

object AnonDateHTML {
  @scala.inline
  def apply(Date: String, HTML: Double, Text: Double): AnonDateHTML = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], HTML = HTML.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDateHTML]
  }
}

