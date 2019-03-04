package typings
package niseLib.niseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeXHR extends js.Object {
  var FakeXMLHttpRequest: FakeXMLHttpRequestStatic
  def useFakeXMLHttpRequest(): FakeXMLHttpRequestStatic
}

object FakeXHR {
  @scala.inline
  def apply(
    FakeXMLHttpRequest: FakeXMLHttpRequestStatic,
    useFakeXMLHttpRequest: js.Function0[FakeXMLHttpRequestStatic]
  ): FakeXHR = {
    val __obj = js.Dynamic.literal(FakeXMLHttpRequest = FakeXMLHttpRequest, useFakeXMLHttpRequest = useFakeXMLHttpRequest)
  
    __obj.asInstanceOf[FakeXHR]
  }
}

