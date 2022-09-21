package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessLocations extends StObject {
  
  // Location IDs excluded from scope of policy.
  var excludeLocations: js.UndefOr[js.Array[String]] = js.undefined
  
  // Location IDs in scope of policy unless explicitly excluded, All, or AllTrusted.
  var includeLocations: js.UndefOr[js.Array[String]] = js.undefined
}
object ConditionalAccessLocations {
  
  inline def apply(): ConditionalAccessLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessLocations]
  }
  
  extension [Self <: ConditionalAccessLocations](x: Self) {
    
    inline def setExcludeLocations(value: js.Array[String]): Self = StObject.set(x, "excludeLocations", value.asInstanceOf[js.Any])
    
    inline def setExcludeLocationsUndefined: Self = StObject.set(x, "excludeLocations", js.undefined)
    
    inline def setExcludeLocationsVarargs(value: String*): Self = StObject.set(x, "excludeLocations", js.Array(value*))
    
    inline def setIncludeLocations(value: js.Array[String]): Self = StObject.set(x, "includeLocations", value.asInstanceOf[js.Any])
    
    inline def setIncludeLocationsUndefined: Self = StObject.set(x, "includeLocations", js.undefined)
    
    inline def setIncludeLocationsVarargs(value: String*): Self = StObject.set(x, "includeLocations", js.Array(value*))
  }
}
