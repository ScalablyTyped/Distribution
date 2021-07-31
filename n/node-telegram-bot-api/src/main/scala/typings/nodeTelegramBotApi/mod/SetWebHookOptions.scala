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
  
  @scala.inline
  def apply(): SetWebHookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetWebHookOptions]
  }
  
  @scala.inline
  implicit class SetWebHookOptionsMutableBuilder[Self <: SetWebHookOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowed_updates(value: js.Array[String]): Self = StObject.set(x, "allowed_updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowed_updatesUndefined: Self = StObject.set(x, "allowed_updates", js.undefined)
    
    @scala.inline
    def setAllowed_updatesVarargs(value: String*): Self = StObject.set(x, "allowed_updates", js.Array(value :_*))
    
    @scala.inline
    def setCertificate(value: String | Stream): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    @scala.inline
    def setMax_connections(value: Double): Self = StObject.set(x, "max_connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_connectionsUndefined: Self = StObject.set(x, "max_connections", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
