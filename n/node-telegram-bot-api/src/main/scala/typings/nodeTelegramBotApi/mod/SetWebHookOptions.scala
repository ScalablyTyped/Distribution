package typings.nodeTelegramBotApi.mod

import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetWebHookOptions extends StObject {
  
  var allowed_updates: js.UndefOr[js.Array[String]] = js.undefined
  
  var certificate: js.UndefOr[String | Stream] = js.undefined
  
  var max_connections: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object SetWebHookOptions {
  
  inline def apply(): SetWebHookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetWebHookOptions]
  }
  
  extension [Self <: SetWebHookOptions](x: Self) {
    
    inline def setAllowed_updates(value: js.Array[String]): Self = StObject.set(x, "allowed_updates", value.asInstanceOf[js.Any])
    
    inline def setAllowed_updatesUndefined: Self = StObject.set(x, "allowed_updates", js.undefined)
    
    inline def setAllowed_updatesVarargs(value: String*): Self = StObject.set(x, "allowed_updates", js.Array(value :_*))
    
    inline def setCertificate(value: String | Stream): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setMax_connections(value: Double): Self = StObject.set(x, "max_connections", value.asInstanceOf[js.Any])
    
    inline def setMax_connectionsUndefined: Self = StObject.set(x, "max_connections", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
