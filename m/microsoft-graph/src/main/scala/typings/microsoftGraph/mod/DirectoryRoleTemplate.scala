package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryRoleTemplate
  extends StObject
     with DirectoryObject {
  
  // The description to set for the directory role. Read-only.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name to set for the directory role. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object DirectoryRoleTemplate {
  
  inline def apply(): DirectoryRoleTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryRoleTemplate]
  }
  
  extension [Self <: DirectoryRoleTemplate](x: Self) {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
