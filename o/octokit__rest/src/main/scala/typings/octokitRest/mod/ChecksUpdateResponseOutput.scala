package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateResponseOutput extends js.Object {
  var annotations_count: Double
  var annotations_url: String
  var summary: String
  var text: String
  var title: String
}

object ChecksUpdateResponseOutput {
  @scala.inline
  def apply(annotations_count: Double, annotations_url: String, summary: String, text: String, title: String): ChecksUpdateResponseOutput = {
    val __obj = js.Dynamic.literal(annotations_count = annotations_count.asInstanceOf[js.Any], annotations_url = annotations_url.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksUpdateResponseOutput]
  }
}

