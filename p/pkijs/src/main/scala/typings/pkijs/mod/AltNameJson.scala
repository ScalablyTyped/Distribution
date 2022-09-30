package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AltNameJson extends StObject {
  
  var altNames: js.Array[GeneralNameJson]
}
object AltNameJson {
  
  inline def apply(altNames: js.Array[GeneralNameJson]): AltNameJson = {
    val __obj = js.Dynamic.literal(altNames = altNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltNameJson]
  }
  
  extension [Self <: AltNameJson](x: Self) {
    
    inline def setAltNames(value: js.Array[GeneralNameJson]): Self = StObject.set(x, "altNames", value.asInstanceOf[js.Any])
    
    inline def setAltNamesVarargs(value: GeneralNameJson*): Self = StObject.set(x, "altNames", js.Array(value*))
  }
}
