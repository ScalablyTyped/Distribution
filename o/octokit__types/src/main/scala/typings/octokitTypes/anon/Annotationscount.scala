package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annotationscount extends js.Object {
  var annotations_count: Double = js.native
  var annotations_url: String = js.native
  var summary: String = js.native
  var text: String = js.native
  var title: String = js.native
}

object Annotationscount {
  @scala.inline
  def apply(annotations_count: Double, annotations_url: String, summary: String, text: String, title: String): Annotationscount = {
    val __obj = js.Dynamic.literal(annotations_count = annotations_count.asInstanceOf[js.Any], annotations_url = annotations_url.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotationscount]
  }
  @scala.inline
  implicit class AnnotationscountOps[Self <: Annotationscount] (val x: Self) extends AnyVal {
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
    def setAnnotations_count(value: Double): Self = this.set("annotations_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnnotations_url(value: String): Self = this.set("annotations_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

