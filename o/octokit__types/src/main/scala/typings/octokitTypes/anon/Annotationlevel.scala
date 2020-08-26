package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annotationlevel extends js.Object {
  var annotation_level: String = js.native
  var end_column: Double = js.native
  var end_line: Double = js.native
  var message: String = js.native
  var path: String = js.native
  var raw_details: String = js.native
  var start_column: Double = js.native
  var start_line: Double = js.native
  var title: String = js.native
}

object Annotationlevel {
  @scala.inline
  def apply(
    annotation_level: String,
    end_column: Double,
    end_line: Double,
    message: String,
    path: String,
    raw_details: String,
    start_column: Double,
    start_line: Double,
    title: String
  ): Annotationlevel = {
    val __obj = js.Dynamic.literal(annotation_level = annotation_level.asInstanceOf[js.Any], end_column = end_column.asInstanceOf[js.Any], end_line = end_line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], raw_details = raw_details.asInstanceOf[js.Any], start_column = start_column.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotationlevel]
  }
  @scala.inline
  implicit class AnnotationlevelOps[Self <: Annotationlevel] (val x: Self) extends AnyVal {
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
    def setAnnotation_level(value: String): Self = this.set("annotation_level", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd_column(value: Double): Self = this.set("end_column", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd_line(value: Double): Self = this.set("end_line", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw_details(value: String): Self = this.set("raw_details", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_column(value: Double): Self = this.set("start_column", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_line(value: Double): Self = this.set("start_line", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

