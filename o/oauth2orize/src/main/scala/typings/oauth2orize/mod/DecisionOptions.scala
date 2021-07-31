package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecisionOptions extends StObject {
  
  var cancelField: String
  
  var sessionKey: String
  
  var userProperty: String
}
object DecisionOptions {
  
  @scala.inline
  def apply(cancelField: String, sessionKey: String, userProperty: String): DecisionOptions = {
    val __obj = js.Dynamic.literal(cancelField = cancelField.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any], userProperty = userProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecisionOptions]
  }
  
  @scala.inline
  implicit class DecisionOptionsMutableBuilder[Self <: DecisionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelField(value: String): Self = StObject.set(x, "cancelField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
  }
}
