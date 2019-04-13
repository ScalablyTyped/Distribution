package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateParamsOutput extends js.Object {
  var annotations: js.UndefOr[js.Array[ChecksUpdateParamsOutputAnnotations]] = js.undefined
  var images: js.UndefOr[js.Array[ChecksUpdateParamsOutputImages]] = js.undefined
  var summary: java.lang.String
  var text: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ChecksUpdateParamsOutput {
  @scala.inline
  def apply(
    summary: java.lang.String,
    annotations: js.Array[ChecksUpdateParamsOutputAnnotations] = null,
    images: js.Array[ChecksUpdateParamsOutputImages] = null,
    text: java.lang.String = null,
    title: java.lang.String = null
  ): ChecksUpdateParamsOutput = {
    val __obj = js.Dynamic.literal(summary = summary)
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (images != null) __obj.updateDynamic("images")(images)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ChecksUpdateParamsOutput]
  }
}

