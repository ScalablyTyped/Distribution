package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetFamily extends StObject {
  
  /**
    * Name of the Illustration Set
    */
  var setFamily: String
  
  /**
    * URL Path of the Illustration Set
    */
  var setURI: String
}
object SetFamily {
  
  inline def apply(setFamily: String, setURI: String): SetFamily = {
    val __obj = js.Dynamic.literal(setFamily = setFamily.asInstanceOf[js.Any], setURI = setURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFamily]
  }
  
  extension [Self <: SetFamily](x: Self) {
    
    inline def setSetFamily(value: String): Self = StObject.set(x, "setFamily", value.asInstanceOf[js.Any])
    
    inline def setSetURI(value: String): Self = StObject.set(x, "setURI", value.asInstanceOf[js.Any])
  }
}
