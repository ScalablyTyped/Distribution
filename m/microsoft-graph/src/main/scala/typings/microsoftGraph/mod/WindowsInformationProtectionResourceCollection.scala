package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsInformationProtectionResourceCollection extends StObject {
  
  // Display name
  var displayName: js.UndefOr[String] = js.undefined
  
  // Collection of resources
  var resources: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object WindowsInformationProtectionResourceCollection {
  
  inline def apply(): WindowsInformationProtectionResourceCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionResourceCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsInformationProtectionResourceCollection] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setResources(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesNull: Self = StObject.set(x, "resources", null)
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
