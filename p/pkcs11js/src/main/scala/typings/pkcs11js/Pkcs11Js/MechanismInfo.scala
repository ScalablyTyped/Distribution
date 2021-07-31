package typings.pkcs11js.Pkcs11Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MechanismInfo extends StObject {
  
  var flags: Double
  
  var maxKeySize: Double
  
  var minKeySize: Double
}
object MechanismInfo {
  
  @scala.inline
  def apply(flags: Double, maxKeySize: Double, minKeySize: Double): MechanismInfo = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], maxKeySize = maxKeySize.asInstanceOf[js.Any], minKeySize = minKeySize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MechanismInfo]
  }
  
  @scala.inline
  implicit class MechanismInfoMutableBuilder[Self <: MechanismInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxKeySize(value: Double): Self = StObject.set(x, "maxKeySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinKeySize(value: Double): Self = StObject.set(x, "minKeySize", value.asInstanceOf[js.Any])
  }
}
