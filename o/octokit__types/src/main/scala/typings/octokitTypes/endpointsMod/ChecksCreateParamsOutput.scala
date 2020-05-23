package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateParamsOutput extends js.Object {
  var annotations: js.UndefOr[js.Array[ChecksCreateParamsOutputAnnotations]] = js.undefined
  var images: js.UndefOr[js.Array[ChecksCreateParamsOutputImages]] = js.undefined
  var summary: String
  var text: js.UndefOr[String] = js.undefined
  var title: String
}

object ChecksCreateParamsOutput {
  @scala.inline
  def apply(
    summary: String,
    title: String,
    annotations: js.Array[ChecksCreateParamsOutputAnnotations] = null,
    images: js.Array[ChecksCreateParamsOutputImages] = null,
    text: String = null
  ): ChecksCreateParamsOutput = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateParamsOutput]
  }
}

