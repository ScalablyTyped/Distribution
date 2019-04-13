package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateResponseOutput extends js.Object {
  var annotations_count: scala.Double
  var annotations_url: java.lang.String
  var summary: java.lang.String
  var text: java.lang.String
  var title: java.lang.String
}

object ChecksUpdateResponseOutput {
  @scala.inline
  def apply(
    annotations_count: scala.Double,
    annotations_url: java.lang.String,
    summary: java.lang.String,
    text: java.lang.String,
    title: java.lang.String
  ): ChecksUpdateResponseOutput = {
    val __obj = js.Dynamic.literal(annotations_count = annotations_count, annotations_url = annotations_url, summary = summary, text = text, title = title)
  
    __obj.asInstanceOf[ChecksUpdateResponseOutput]
  }
}

