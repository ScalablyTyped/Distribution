package typings.next.anon

import typings.next.distBuildOutputStoreMod.OutputState
import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppUrl
  extends StObject
     with OutputState {
  
  var appUrl: String | Null
  
  var bindAddr: String | Null
  
  var bootstrap: `true`
}
object AppUrl {
  
  inline def apply(): AppUrl = {
    val __obj = js.Dynamic.literal(bootstrap = true, appUrl = null, bindAddr = null)
    __obj.asInstanceOf[AppUrl]
  }
  
  extension [Self <: AppUrl](x: Self) {
    
    inline def setAppUrl(value: String): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
    
    inline def setAppUrlNull: Self = StObject.set(x, "appUrl", null)
    
    inline def setBindAddr(value: String): Self = StObject.set(x, "bindAddr", value.asInstanceOf[js.Any])
    
    inline def setBindAddrNull: Self = StObject.set(x, "bindAddr", null)
    
    inline def setBootstrap(value: `true`): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
  }
}
