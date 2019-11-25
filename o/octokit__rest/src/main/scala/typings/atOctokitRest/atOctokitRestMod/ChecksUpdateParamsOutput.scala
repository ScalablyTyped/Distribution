package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateParamsOutput extends js.Object {
  var annotations: js.UndefOr[js.Array[ChecksUpdateParamsOutputAnnotations]] = js.undefined
  var images: js.UndefOr[js.Array[ChecksUpdateParamsOutputImages]] = js.undefined
  var summary: String
  var text: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object ChecksUpdateParamsOutput {
  @scala.inline
  def apply(
    summary: String,
    annotations: js.Array[ChecksUpdateParamsOutputAnnotations] = null,
    images: js.Array[ChecksUpdateParamsOutputImages] = null,
    text: String = null,
    title: String = null
  ): ChecksUpdateParamsOutput = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateParamsOutput]
  }
}

