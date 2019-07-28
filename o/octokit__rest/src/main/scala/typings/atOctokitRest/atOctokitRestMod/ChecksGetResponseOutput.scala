package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksGetResponseOutput extends js.Object {
  var annotations_count: Double
  var annotations_url: String
  var summary: String
  var text: String
  var title: String
}

object ChecksGetResponseOutput {
  @scala.inline
  def apply(annotations_count: Double, annotations_url: String, summary: String, text: String, title: String): ChecksGetResponseOutput = {
    val __obj = js.Dynamic.literal(annotations_count = annotations_count, annotations_url = annotations_url, summary = summary, text = text, title = title)
  
    __obj.asInstanceOf[ChecksGetResponseOutput]
  }
}

