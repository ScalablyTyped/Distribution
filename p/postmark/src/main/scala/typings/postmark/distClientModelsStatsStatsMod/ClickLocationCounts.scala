package typings.postmark.distClientModelsStatsStatsMod

import typings.postmark.Anon_DateHTML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickLocationCounts extends js.Object {
  var Days: js.Array[Anon_DateHTML]
  var HTML: Double
  var Text: Double
}

object ClickLocationCounts {
  @scala.inline
  def apply(Days: js.Array[Anon_DateHTML], HTML: Double, Text: Double): ClickLocationCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], HTML = HTML.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClickLocationCounts]
  }
}

