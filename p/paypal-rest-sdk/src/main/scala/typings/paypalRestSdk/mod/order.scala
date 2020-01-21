package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "order")
@js.native
object order extends js.Object {
  def authorize(id: String, data: js.Any, config: js.Any): Unit = js.native
  def authorize(id: String, data: js.Any, config: js.Any, cb: js.Any): Unit = js.native
  def capture(id: String, data: js.Any, config: js.Any): Unit = js.native
  def capture(id: String, data: js.Any, config: js.Any, cb: js.Any): Unit = js.native
  // function void(id: string, config: any, cb?: any): void;
  def get(id: String, config: js.Any): Unit = js.native
  def get(id: String, config: js.Any, cb: js.Any): Unit = js.native
}

