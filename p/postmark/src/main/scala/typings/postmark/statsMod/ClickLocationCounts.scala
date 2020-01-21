package typings.postmark.statsMod

import typings.postmark.AnonDateHTML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickLocationCounts extends js.Object {
  var Days: js.Array[AnonDateHTML]
  var HTML: Double
  var Text: Double
}

object ClickLocationCounts {
  @scala.inline
  def apply(Days: js.Array[AnonDateHTML], HTML: Double, Text: Double): ClickLocationCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], HTML = HTML.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClickLocationCounts]
  }
}

