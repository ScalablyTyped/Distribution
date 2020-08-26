package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.failure
import typings.octokitTypes.octokitTypesStrings.notice
import typings.octokitTypes.octokitTypesStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksUpdateParamsOutputAnnotations extends js.Object {
  var annotation_level: notice | warning | failure = js.native
  var end_column: js.UndefOr[Double] = js.native
  var end_line: Double = js.native
  var message: String = js.native
  var path: String = js.native
  var raw_details: js.UndefOr[String] = js.native
  var start_column: js.UndefOr[Double] = js.native
  var start_line: Double = js.native
  var title: js.UndefOr[String] = js.native
}

object ChecksUpdateParamsOutputAnnotations {
  @scala.inline
  def apply(
    annotation_level: notice | warning | failure,
    end_line: Double,
    message: String,
    path: String,
    start_line: Double
  ): ChecksUpdateParamsOutputAnnotations = {
    val __obj = js.Dynamic.literal(annotation_level = annotation_level.asInstanceOf[js.Any], end_line = end_line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateParamsOutputAnnotations]
  }
  @scala.inline
  implicit class ChecksUpdateParamsOutputAnnotationsOps[Self <: ChecksUpdateParamsOutputAnnotations] (val x: Self) extends AnyVal {
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
    def setAnnotation_level(value: notice | warning | failure): Self = this.set("annotation_level", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd_line(value: Double): Self = this.set("end_line", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_line(value: Double): Self = this.set("start_line", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd_column(value: Double): Self = this.set("end_column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_column: Self = this.set("end_column", js.undefined)
    @scala.inline
    def setRaw_details(value: String): Self = this.set("raw_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw_details: Self = this.set("raw_details", js.undefined)
    @scala.inline
    def setStart_column(value: Double): Self = this.set("start_column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_column: Self = this.set("start_column", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

