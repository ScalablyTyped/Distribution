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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfoAccessJson] (val x: Self) extends AnyVal {
    
    inline def setAccessDescriptions(value: js.Array[AccessDescriptionJson]): Self = StObject.set(x, "accessDescriptions", value.asInstanceOf[js.Any])
    
    inline def setAccessDescriptionsVarargs(value: AccessDescriptionJson*): Self = StObject.set(x, "accessDescriptions", js.Array(value*))
  }
}
