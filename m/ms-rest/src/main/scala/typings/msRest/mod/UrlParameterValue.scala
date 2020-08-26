package typings.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlParameterValue extends js.Object {
  var skipUrlEncoding: Boolean = js.native
  var value: js.Any = js.native
}

object UrlParameterValue {
  @scala.inline
  def apply(skipUrlEncoding: Boolean, value: js.Any): UrlParameterValue = {
    val __obj = js.Dynamic.literal(skipUrlEncoding = skipUrlEncoding.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlParameterValue]
  }
  @scala.inline
  implicit class UrlParameterValueOps[Self <: UrlParameterValue] (val x: Self) extends AnyVal {
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
    def setSkipUrlEncoding(value: Boolean): Self = this.set("skipUrlEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

