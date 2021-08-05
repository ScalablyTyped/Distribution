package typings.nodeForge.anon

import typings.nodeForge.mod.tls.Alert.Description
import typings.nodeForge.mod.tls.Verified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alert
  extends StObject
     with Verified {
  
  var alert: js.UndefOr[Description] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object Alert {
  
  inline def apply(): Alert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alert]
  }
  
  extension [Self <: Alert](x: Self) {
    
    inline def setAlert(value: Description): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
