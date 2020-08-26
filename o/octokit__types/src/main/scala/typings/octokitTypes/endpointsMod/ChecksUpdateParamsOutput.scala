package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksUpdateParamsOutput extends js.Object {
  var annotations: js.UndefOr[js.Array[ChecksUpdateParamsOutputAnnotations]] = js.native
  var images: js.UndefOr[js.Array[ChecksUpdateParamsOutputImages]] = js.native
  var summary: String = js.native
  var text: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object ChecksUpdateParamsOutput {
  @scala.inline
  def apply(summary: String): ChecksUpdateParamsOutput = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateParamsOutput]
  }
  @scala.inline
  implicit class ChecksUpdateParamsOutputOps[Self <: ChecksUpdateParamsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnnotationsVarargs(value: ChecksUpdateParamsOutputAnnotations*): Self = this.set("annotations", js.Array(value :_*))
    @scala.inline
    def setAnnotations(value: js.Array[ChecksUpdateParamsOutputAnnotations]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    @scala.inline
    def setImagesVarargs(value: ChecksUpdateParamsOutputImages*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[ChecksUpdateParamsOutputImages]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

