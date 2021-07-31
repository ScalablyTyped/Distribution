package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payoutItem {
  
  @JSImport("paypal-rest-sdk", "payoutItem")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cancel(id: String, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def cancel(id: String, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def get(id: String, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def get(id: String, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
