package typings.ngDashStomp

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.IHttpPromise
import typings.ngDashStomp.ngStomp.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ngStomp extends js.Object {
  var debug: js.Any = js.native
  var off: js.Any = js.native
  var sock: js.Any = js.native
  var stomp: js.Any = js.native
  def connect(endpoint: String): IHttpPromise[_] = js.native
  def connect(endpoint: String, headers: Headers): IHttpPromise[_] = js.native
  def disconnect(callback: js.Function0[Unit]): IHttpPromise[_] = js.native
  def send(destination: String, body: js.Any, headers: Headers): js.Any = js.native
  def setDebug(callback: js.Function): Unit = js.native
  def subscribe(
    destination: String,
    callback: js.Function3[/* payload */ String, /* headers */ Headers, /* res */ js.Function, Unit]
  ): js.Any = js.native
  def subscribe(
    destination: String,
    callback: js.Function3[/* payload */ String, /* headers */ Headers, /* res */ js.Function, Unit],
    headers: Headers
  ): js.Any = js.native
  def subscribe(
    destination: String,
    callback: js.Function3[/* payload */ String, /* headers */ Headers, /* res */ js.Function, Unit],
    headers: Headers,
    scope: js.Any
  ): js.Any = js.native
  def unsubscribe(): js.Any = js.native
}

@JSGlobal("ngStomp")
@js.native
object ngStomp extends js.Object {
  type Headers = StringDictionary[js.Any]
}

