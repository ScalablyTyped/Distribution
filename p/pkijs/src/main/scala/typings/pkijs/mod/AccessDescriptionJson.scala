package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON representation of {@link AccessDescription}
  */
trait AccessDescriptionJson extends StObject {
  
  var accessLocation: GeneralNameJson
  
  var accessMethod: String
}
object AccessDescriptionJson {
  
  inline def apply(accessLocation: GeneralNameJson, accessMethod: String): AccessDescriptionJson = {
    val __obj = js.Dynamic.literal(accessLocation = accessLocation.asInstanceOf[js.Any], accessMethod = accessMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessDescriptionJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessDescriptionJson] (val x: Self) extends AnyVal {
    
    inline def setAccessLocation(value: GeneralNameJson): Self = StObject.set(x, "accessLocation", value.asInstanceOf[js.Any])
    
    inline def setAccessMethod(value: String): Self = StObject.set(x, "accessMethod", value.asInstanceOf[js.Any])
  }
}
