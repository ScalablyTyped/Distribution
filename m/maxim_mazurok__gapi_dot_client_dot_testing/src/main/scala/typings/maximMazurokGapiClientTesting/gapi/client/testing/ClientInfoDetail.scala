package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientInfoDetail extends StObject {
  
  /** Required. The key of detailed client information. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Required. The value of detailed client information. */
  var value: js.UndefOr[String] = js.undefined
}
object ClientInfoDetail {
  
  @scala.inline
  def apply(): ClientInfoDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientInfoDetail]
  }
  
  @scala.inline
  implicit class ClientInfoDetailMutableBuilder[Self <: ClientInfoDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
