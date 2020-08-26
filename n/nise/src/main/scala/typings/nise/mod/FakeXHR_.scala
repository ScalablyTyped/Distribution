package typings.nise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakeXHR_ extends js.Object {
  var FakeXMLHttpRequest: FakeXMLHttpRequestStatic = js.native
  def useFakeXMLHttpRequest(): FakeXMLHttpRequestStatic = js.native
}

object FakeXHR_ {
  @scala.inline
  def apply(
    FakeXMLHttpRequest: FakeXMLHttpRequestStatic,
    useFakeXMLHttpRequest: () => FakeXMLHttpRequestStatic
  ): FakeXHR_ = {
    val __obj = js.Dynamic.literal(FakeXMLHttpRequest = FakeXMLHttpRequest.asInstanceOf[js.Any], useFakeXMLHttpRequest = js.Any.fromFunction0(useFakeXMLHttpRequest))
    __obj.asInstanceOf[FakeXHR_]
  }
  @scala.inline
  implicit class FakeXHR_Ops[Self <: FakeXHR_] (val x: Self) extends AnyVal {
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
    def setFakeXMLHttpRequest(value: FakeXMLHttpRequestStatic): Self = this.set("FakeXMLHttpRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseFakeXMLHttpRequest(value: () => FakeXMLHttpRequestStatic): Self = this.set("useFakeXMLHttpRequest", js.Any.fromFunction0(value))
  }
  
}

