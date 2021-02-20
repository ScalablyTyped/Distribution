package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessLocations extends StObject {
  
  // Location IDs excluded from scope of policy.
  var excludeLocations: js.UndefOr[js.Array[String]] = js.native
  
  // Location IDs in scope of policy unless explicitly excluded, All, or AllTrusted.
  var includeLocations: js.UndefOr[js.Array[String]] = js.native
}
object ConditionalAccessLocations {
  
  @scala.inline
  def apply(): ConditionalAccessLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessLocations]
  }
  
  @scala.inline
  implicit class ConditionalAccessLocationsMutableBuilder[Self <: ConditionalAccessLocations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeLocations(value: js.Array[String]): Self = StObject.set(x, "excludeLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeLocationsUndefined: Self = StObject.set(x, "excludeLocations", js.undefined)
    
    @scala.inline
    def setExcludeLocationsVarargs(value: String*): Self = StObject.set(x, "excludeLocations", js.Array(value :_*))
    
    @scala.inline
    def setIncludeLocations(value: js.Array[String]): Self = StObject.set(x, "includeLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLocationsUndefined: Self = StObject.set(x, "includeLocations", js.undefined)
    
    @scala.inline
    def setIncludeLocationsVarargs(value: String*): Self = StObject.set(x, "includeLocations", js.Array(value :_*))
  }
}
