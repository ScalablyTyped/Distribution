package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedAppPolicy extends Entity {
  
  // The date and time the policy was created.
  var createdDateTime: js.UndefOr[String] = js.native
  
  // The policy's description.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Policy display name.
  var displayName: js.UndefOr[String] = js.native
  
  // Last time the policy was modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  // Version of the entity.
  var version: js.UndefOr[NullableOption[String]] = js.native
}
object ManagedAppPolicy {
  
  @scala.inline
  def apply(): ManagedAppPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppPolicy]
  }
  
  @scala.inline
  implicit class ManagedAppPolicyMutableBuilder[Self <: ManagedAppPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
