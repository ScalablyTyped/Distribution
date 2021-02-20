package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object order {
  
  @JSImport("paypal-rest-sdk", "order.authorize")
  @js.native
  def authorize(id: String, data: js.Any, config: js.Any): Unit = js.native
  @JSImport("paypal-rest-sdk", "order.authorize")
  @js.native
  def authorize(id: String, data: js.Any, config: js.Any, cb: js.Any): Unit = js.native
  
  @JSImport("paypal-rest-sdk", "order.capture")
  @js.native
  def capture(id: String, data: js.Any, config: js.Any): Unit = js.native
  @JSImport("paypal-rest-sdk", "order.capture")
  @js.native
  def capture(id: String, data: js.Any, config: js.Any, cb: js.Any): Unit = js.native
  
  // function void(id: string, config: any, cb?: any): void;
  @JSImport("paypal-rest-sdk", "order.get")
  @js.native
  def get(id: String, config: js.Any): Unit = js.native
  @JSImport("paypal-rest-sdk", "order.get")
  @js.native
  def get(id: String, config: js.Any, cb: js.Any): Unit = js.native
}
