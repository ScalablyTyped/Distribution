package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateResponseOutput extends js.Object {
  var annotations_count: js.UndefOr[Double] = js.undefined
  var annotations_url: js.UndefOr[String] = js.undefined
  var summary: String
  var text: String
  var title: String
}

object ChecksCreateResponseOutput {
  @scala.inline
  def apply(
    summary: String,
    text: String,
    title: String,
    annotations_count: Int | Double = null,
    annotations_url: String = null
  ): ChecksCreateResponseOutput = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (annotations_count != null) __obj.updateDynamic("annotations_count")(annotations_count.asInstanceOf[js.Any])
    if (annotations_url != null) __obj.updateDynamic("annotations_url")(annotations_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateResponseOutput]
  }
}

