package typings.payuEmeaSdk.payu

import typings.payuEmeaSdk.payuEmeaSdkStrings.change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecureForm extends StObject {
  
  def clear(): SecureForm = js.native
  
  def focus(): SecureForm = js.native
  
  def on(event: eventTypes, handler: js.Function0[Unit]): SecureForm = js.native
  @JSName("on")
  def on_change(event: change, handler: js.Function1[/* body */ SecureFormChangeResponse, Unit]): SecureForm = js.native
  
  def remove(): SecureForm = js.native
  
  def render(selector: String): SecureForm = js.native
  
  def update(options: SecureFormOptions): SecureForm = js.native
}
