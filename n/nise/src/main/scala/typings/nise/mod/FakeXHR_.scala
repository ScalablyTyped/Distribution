package typings.nise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeXHR_ extends js.Object {
  var FakeXMLHttpRequest: FakeXMLHttpRequestStatic
  def useFakeXMLHttpRequest(): FakeXMLHttpRequestStatic
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
}

