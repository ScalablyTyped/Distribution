package typings.openapiRequestValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIRequestValidatorError extends js.Object {
  var errorCode: String = js.native
  var location: js.UndefOr[String] = js.native
  var message: String = js.native
  var path: js.UndefOr[String] = js.native
  var schema: js.UndefOr[js.Any] = js.native
}

object OpenAPIRequestValidatorError {
  @scala.inline
  def apply(errorCode: String, message: String): OpenAPIRequestValidatorError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIRequestValidatorError]
  }
  @scala.inline
  implicit class OpenAPIRequestValidatorErrorOps[Self <: OpenAPIRequestValidatorError] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: String): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSchema(value: js.Any): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
  
}

