package typings.nodeForge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detached extends StObject {
  
  var detached: js.UndefOr[Boolean] = js.undefined
}
object Detached {
  
  inline def apply(): Detached = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detached]
  }
  
  extension [Self <: Detached](x: Self) {
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
  }
}
