package typings.nightmare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceError extends js.Object {
  var errorCode: Double = js.native
  var errorString: String = js.native
  var id: Double = js.native
  var url: String = js.native
}

object IResourceError {
  @scala.inline
  def apply(errorCode: Double, errorString: String, id: Double, url: String): IResourceError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorString = errorString.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceError]
  }
  @scala.inline
  implicit class IResourceErrorOps[Self <: IResourceError] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorString(value: String): Self = this.set("errorString", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

