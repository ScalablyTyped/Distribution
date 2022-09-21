package typings.openpay.mod.SDK

import typings.openpay.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Charges extends StObject {
  
  def capture(transactionId: String, callback: Callback[Any]): Unit = js.native
  def capture(transactionId: String, data: Any, callback: Callback[Any]): Unit = js.native
  
  def create(data: Any, callback: Callback[Any]): Unit = js.native
  
  def get(transactionId: String, callback: Callback[Any]): Unit = js.native
  
  def list(data: Any, callback: Callback[Any]): Unit = js.native
  
  def refund(transactionId: String, data: Any, callback: Callback[Any]): Unit = js.native
}
