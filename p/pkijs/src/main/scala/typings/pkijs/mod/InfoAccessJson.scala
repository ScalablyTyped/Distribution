package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoAccessJson extends StObject {
  
  var accessDescriptions: js.Array[AccessDescriptionJson]
}
object InfoAccessJson {
  
  inline def apply(accessDescriptions: js.Array[AccessDescriptionJson]): InfoAccessJson = {
    val __obj = js.Dynamic.literal(accessDescriptions = accessDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoAccessJson]
  }
  
  extension [Self <: InfoAccessJson](x: Self) {
    
    inline def setAccessDescriptions(value: js.Array[AccessDescriptionJson]): Self = StObject.set(x, "accessDescriptions", value.asInstanceOf[js.Any])
    
    inline def setAccessDescriptionsVarargs(value: AccessDescriptionJson*): Self = StObject.set(x, "accessDescriptions", js.Array(value*))
  }
}
