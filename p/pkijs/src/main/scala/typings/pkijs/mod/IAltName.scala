package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAltName extends StObject {
  
  /**
    * Array of alternative names in GeneralName type
    */
  var altNames: js.Array[GeneralName]
}
object IAltName {
  
  inline def apply(altNames: js.Array[GeneralName]): IAltName = {
    val __obj = js.Dynamic.literal(altNames = altNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAltName]
  }
  
  extension [Self <: IAltName](x: Self) {
    
    inline def setAltNames(value: js.Array[GeneralName]): Self = StObject.set(x, "altNames", value.asInstanceOf[js.Any])
    
    inline def setAltNamesVarargs(value: GeneralName*): Self = StObject.set(x, "altNames", js.Array(value*))
  }
}
