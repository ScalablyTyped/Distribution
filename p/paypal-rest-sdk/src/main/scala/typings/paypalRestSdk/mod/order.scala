package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object order {
  
  @JSImport("paypal-rest-sdk", "order")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def authorize(id: String, data: js.Any, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def authorize(id: String, data: js.Any, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def capture(id: String, data: js.Any, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def capture(id: String, data: js.Any, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // function void(id: string, config: any, cb?: any): void;
  @scala.inline
  def get(id: String, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def get(id: String, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
