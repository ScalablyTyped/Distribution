package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoRespond extends StObject {
  
  /**
    * If set true, all mock servers will respond automatically. If set false you have to call {@link sap.ui.core.util.MockServer.respond}
    * method for response.
    */
  var autoRespond: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the time in ms after all mock servers should send their response.
    */
  var autoRespondAfter: js.UndefOr[int] = js.undefined
  
  /**
    * If set to true, all mock server will find `_method` parameter in the POST body and use this to override
    * the actual method.
    */
  var fakeHTTPMethods: js.UndefOr[Boolean] = js.undefined
}
object AutoRespond {
  
  inline def apply(): AutoRespond = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRespond]
  }
  
  extension [Self <: AutoRespond](x: Self) {
    
    inline def setAutoRespond(value: Boolean): Self = StObject.set(x, "autoRespond", value.asInstanceOf[js.Any])
    
    inline def setAutoRespondAfter(value: int): Self = StObject.set(x, "autoRespondAfter", value.asInstanceOf[js.Any])
    
    inline def setAutoRespondAfterUndefined: Self = StObject.set(x, "autoRespondAfter", js.undefined)
    
    inline def setAutoRespondUndefined: Self = StObject.set(x, "autoRespond", js.undefined)
    
    inline def setFakeHTTPMethods(value: Boolean): Self = StObject.set(x, "fakeHTTPMethods", value.asInstanceOf[js.Any])
    
    inline def setFakeHTTPMethodsUndefined: Self = StObject.set(x, "fakeHTTPMethods", js.undefined)
  }
}
