package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Summary extends js.Object {
  var summary: String
  var text: String
  var title: String
}

object Summary {
  @scala.inline
  def apply(summary: String, text: String, title: String): Summary = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Summary]
  }
}

