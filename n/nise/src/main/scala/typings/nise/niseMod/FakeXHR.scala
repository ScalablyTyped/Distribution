package typings.nise.niseMod

import org.scalablytyped.runtime.TopLevel
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
    useFakeXMLHttpRequest: () => FakeXMLHttpRequestStatic
  ): FakeXHR = {
    val __obj = js.Dynamic.literal(FakeXMLHttpRequest = FakeXMLHttpRequest, useFakeXMLHttpRequest = js.Any.fromFunction0(useFakeXMLHttpRequest))
  
    __obj.asInstanceOf[FakeXHR]
  }
}

@JSImport("nise", "fakeXhr")
@js.native
object fakeXhr extends TopLevel[FakeXHR]

