package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelegatedPermissionClassification extends Entity {
  
  var classification: js.UndefOr[NullableOption[PermissionClassificationType]] = js.native
  
  var permissionId: js.UndefOr[NullableOption[String]] = js.native
  
  var permissionName: js.UndefOr[NullableOption[String]] = js.native
}
object DelegatedPermissionClassification {
  
  @scala.inline
  def apply(): DelegatedPermissionClassification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedPermissionClassification]
  }
  
  @scala.inline
  implicit class DelegatedPermissionClassificationMutableBuilder[Self <: DelegatedPermissionClassification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassification(value: NullableOption[PermissionClassificationType]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationNull: Self = StObject.set(x, "classification", null)
    
    @scala.inline
    def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    @scala.inline
    def setPermissionId(value: NullableOption[String]): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionIdNull: Self = StObject.set(x, "permissionId", null)
    
    @scala.inline
    def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
    
    @scala.inline
    def setPermissionName(value: NullableOption[String]): Self = StObject.set(x, "permissionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionNameNull: Self = StObject.set(x, "permissionName", null)
    
    @scala.inline
    def setPermissionNameUndefined: Self = StObject.set(x, "permissionName", js.undefined)
  }
}
