package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object billingPlan {
  
  @JSImport("paypal-rest-sdk", "billingPlan")
  @js.native
  val ^ : js.Any = js.native
  
  inline def activate(id: String, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("activate")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def activate(id: String, config: Any, cb: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("activate")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def create(data: Any, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(data: Any, config: Any, cb: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get(id: String, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(id: String, config: Any, cb: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def list(data: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def list(data: Any, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: Any, config: Any, cb: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: Any, config: Unit, cb: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def update(id: String, data: Any, config: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(id: String, data: Any, config: Any, cb: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
