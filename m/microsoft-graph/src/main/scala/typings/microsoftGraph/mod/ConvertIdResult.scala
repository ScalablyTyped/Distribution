package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvertIdResult extends js.Object {
  /**
    * An error object indicating the reason for the conversion failure. This value is not present if the conversion
    * succeeded.
    */
  var errorDetails: js.UndefOr[GenericError] = js.native
  // The identifier that was converted. This value is the original, un-converted identifier.
  var sourceId: js.UndefOr[String] = js.native
  // The converted identifier. This value is not present if the conversion failed.
  var targetId: js.UndefOr[String] = js.native
}

object ConvertIdResult {
  @scala.inline
  def apply(): ConvertIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertIdResult]
  }
  @scala.inline
  implicit class ConvertIdResultOps[Self <: ConvertIdResult] (val x: Self) extends AnyVal {
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
    def setErrorDetails(value: GenericError): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    @scala.inline
    def setSourceId(value: String): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceId: Self = this.set("sourceId", js.undefined)
    @scala.inline
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
  
}

