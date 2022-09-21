package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object order {
  
  @JSImport("paypal-rest-sdk", "order")
  @js.native
  val ^ : js.Any = js.native
  
  inline def authorize(id: String, data: Any, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def authorize(id: String, data: Any, config: Any, cb: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def capture(id: String, data: Any, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def capture(id: String, data: Any, config: Any, cb: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // function void(id: string, config: any, cb?: any): void;
  inline def get(id: String, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(id: String, config: Any, cb: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
