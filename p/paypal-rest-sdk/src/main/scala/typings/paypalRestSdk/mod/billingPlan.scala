package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object billingPlan {
  
  @JSImport("paypal-rest-sdk", "billingPlan")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def activate(id: String, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("activate")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def activate(id: String, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("activate")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def create(data: js.Any, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def create(data: js.Any, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def get(id: String, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def get(id: String, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def list(data: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def list(data: js.Any, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def list(data: js.Any, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def list(data: js.Any, config: Unit, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def update(id: String, data: js.Any, config: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def update(id: String, data: js.Any, config: js.Any, cb: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
