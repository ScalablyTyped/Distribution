package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HybridAmp extends StObject {
  
  var hybridAmp: Boolean
  
  var inAmpMode: Boolean
}
object HybridAmp {
  
  inline def apply(hybridAmp: Boolean, inAmpMode: Boolean): HybridAmp = {
    val __obj = js.Dynamic.literal(hybridAmp = hybridAmp.asInstanceOf[js.Any], inAmpMode = inAmpMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HybridAmp]
  }
  
  extension [Self <: HybridAmp](x: Self) {
    
    inline def setHybridAmp(value: Boolean): Self = StObject.set(x, "hybridAmp", value.asInstanceOf[js.Any])
    
    inline def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
  }
}
