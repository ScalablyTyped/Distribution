package typings.onfidoSdkUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmsNumber extends StObject {
  
  var smsNumber: js.UndefOr[String] = js.undefined
}
object SmsNumber {
  
  inline def apply(): SmsNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmsNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmsNumber] (val x: Self) extends AnyVal {
    
    inline def setSmsNumber(value: String): Self = StObject.set(x, "smsNumber", value.asInstanceOf[js.Any])
    
    inline def setSmsNumberUndefined: Self = StObject.set(x, "smsNumber", js.undefined)
  }
}
