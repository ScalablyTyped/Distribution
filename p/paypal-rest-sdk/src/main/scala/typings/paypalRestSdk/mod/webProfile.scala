package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webProfile {
  
  @JSImport("paypal-rest-sdk", "webProfile")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(data: js.Any, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(data: js.Any, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def del(id: String, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def del(id: String, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get(id: String, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(id: String, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def list(data: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def list(data: js.Any, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: js.Any, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def list(data: js.Any, config: Unit, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replace(id: String, data: js.Any, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replace(id: String, data: js.Any, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def update(id: String, data: js.Any, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def update(id: String, data: js.Any, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
