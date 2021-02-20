package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryRoleTemplate extends DirectoryObject {
  
  // The description to set for the directory role. Read-only.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // The display name to set for the directory role. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
}
object DirectoryRoleTemplate {
  
  @scala.inline
  def apply(): DirectoryRoleTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryRoleTemplate]
  }
  
  @scala.inline
  implicit class DirectoryRoleTemplateMutableBuilder[Self <: DirectoryRoleTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
