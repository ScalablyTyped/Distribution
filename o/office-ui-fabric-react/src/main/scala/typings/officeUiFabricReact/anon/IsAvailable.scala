package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAvailable extends StObject {
  
  var isAvailable: Boolean
  
  var isAway: Boolean
  
  var isBlocked: Boolean
  
  var isBusy: Boolean
  
  var isDoNotDisturb: Boolean
  
  var isOffline: Boolean
}
object IsAvailable {
  
  inline def apply(
    isAvailable: Boolean,
    isAway: Boolean,
    isBlocked: Boolean,
    isBusy: Boolean,
    isDoNotDisturb: Boolean,
    isOffline: Boolean
  ): IsAvailable = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], isAway = isAway.asInstanceOf[js.Any], isBlocked = isBlocked.asInstanceOf[js.Any], isBusy = isBusy.asInstanceOf[js.Any], isDoNotDisturb = isDoNotDisturb.asInstanceOf[js.Any], isOffline = isOffline.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAvailable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsAvailable] (val x: Self) extends AnyVal {
    
    inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsAway(value: Boolean): Self = StObject.set(x, "isAway", value.asInstanceOf[js.Any])
    
    inline def setIsBlocked(value: Boolean): Self = StObject.set(x, "isBlocked", value.asInstanceOf[js.Any])
    
    inline def setIsBusy(value: Boolean): Self = StObject.set(x, "isBusy", value.asInstanceOf[js.Any])
    
    inline def setIsDoNotDisturb(value: Boolean): Self = StObject.set(x, "isDoNotDisturb", value.asInstanceOf[js.Any])
    
    inline def setIsOffline(value: Boolean): Self = StObject.set(x, "isOffline", value.asInstanceOf[js.Any])
  }
}
