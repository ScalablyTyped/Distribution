package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscribed extends StObject {
  
  /** @description Determines if all notifications should be blocked from this repository. */
  var ignored: js.UndefOr[Boolean] = js.undefined
  
  /** @description Determines if notifications should be received from this repository. */
  var subscribed: js.UndefOr[Boolean] = js.undefined
}
object Subscribed {
  
  inline def apply(): Subscribed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscribed]
  }
  
  extension [Self <: Subscribed](x: Self) {
    
    inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
    
    inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    
    inline def setSubscribedUndefined: Self = StObject.set(x, "subscribed", js.undefined)
  }
}
