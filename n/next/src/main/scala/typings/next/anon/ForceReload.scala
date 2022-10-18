package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceReload extends StObject {
  
  var dev: Boolean
  
  var forceReload: js.UndefOr[Boolean] = js.undefined
}
object ForceReload {
  
  inline def apply(dev: Boolean): ForceReload = {
    val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceReload]
  }
  
  extension [Self <: ForceReload](x: Self) {
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setForceReload(value: Boolean): Self = StObject.set(x, "forceReload", value.asInstanceOf[js.Any])
    
    inline def setForceReloadUndefined: Self = StObject.set(x, "forceReload", js.undefined)
  }
}
