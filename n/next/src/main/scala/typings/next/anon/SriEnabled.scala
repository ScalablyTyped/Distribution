package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SriEnabled extends StObject {
  
  var dev: Boolean
  
  var sriEnabled: Boolean
}
object SriEnabled {
  
  inline def apply(dev: Boolean, sriEnabled: Boolean): SriEnabled = {
    val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any], sriEnabled = sriEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SriEnabled]
  }
  
  extension [Self <: SriEnabled](x: Self) {
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setSriEnabled(value: Boolean): Self = StObject.set(x, "sriEnabled", value.asInstanceOf[js.Any])
  }
}
