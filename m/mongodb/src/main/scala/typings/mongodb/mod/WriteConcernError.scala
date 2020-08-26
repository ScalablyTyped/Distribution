package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteConcernError extends js.Object {
  //Write concern error code.
  var code: scala.Double = js.native
  //Write concern error message.
  var errmsg: String = js.native
}

object WriteConcernError {
  @scala.inline
  def apply(code: scala.Double, errmsg: String): WriteConcernError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errmsg = errmsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteConcernError]
  }
  @scala.inline
  implicit class WriteConcernErrorOps[Self <: WriteConcernError] (val x: Self) extends AnyVal {
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
    def setCode(value: scala.Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrmsg(value: String): Self = this.set("errmsg", value.asInstanceOf[js.Any])
  }
  
}

