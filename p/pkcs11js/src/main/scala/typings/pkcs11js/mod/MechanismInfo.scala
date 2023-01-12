package typings.pkcs11js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about a particular mechanism
  */
trait MechanismInfo extends StObject {
  
  /**
    * Bit flags specifying mechanism capabilities
    */
  var flags: Double
  
  /**
    * The maximum size of the key for the mechanism
    */
  var maxKeySize: Double
  
  /**
    * The minimum size of the key for the mechanism
    */
  var minKeySize: Double
}
object MechanismInfo {
  
  inline def apply(flags: Double, maxKeySize: Double, minKeySize: Double): MechanismInfo = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], maxKeySize = maxKeySize.asInstanceOf[js.Any], minKeySize = minKeySize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MechanismInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MechanismInfo] (val x: Self) extends AnyVal {
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setMaxKeySize(value: Double): Self = StObject.set(x, "maxKeySize", value.asInstanceOf[js.Any])
    
    inline def setMinKeySize(value: Double): Self = StObject.set(x, "minKeySize", value.asInstanceOf[js.Any])
  }
}
