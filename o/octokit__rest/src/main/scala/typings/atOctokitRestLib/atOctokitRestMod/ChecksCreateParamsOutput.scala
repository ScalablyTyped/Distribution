package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateParamsOutput extends js.Object {
  var annotations: js.UndefOr[js.Array[ChecksCreateParamsOutputAnnotations]] = js.undefined
  var images: js.UndefOr[js.Array[ChecksCreateParamsOutputImages]] = js.undefined
  var summary: java.lang.String
  var text: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
}

object ChecksCreateParamsOutput {
  @scala.inline
  def apply(
    summary: java.lang.String,
    title: java.lang.String,
    annotations: js.Array[ChecksCreateParamsOutputAnnotations] = null,
    images: js.Array[ChecksCreateParamsOutputImages] = null,
    text: java.lang.String = null
  ): ChecksCreateParamsOutput = {
    val __obj = js.Dynamic.literal(summary = summary, title = title)
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (images != null) __obj.updateDynamic("images")(images)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ChecksCreateParamsOutput]
  }
}

