package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.PrivilegeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entity metadata security privileges.
  */
@js.native
trait SecurityPrivilegeMetadata extends StObject {
  
  var CanBeBasic: Boolean = js.native
  
  var CanBeDeep: Boolean = js.native
  
  var CanBeEntityReference: Boolean = js.native
  
  var CanBeGlobal: Boolean = js.native
  
  var CanBeLocal: Boolean = js.native
  
  var CanBeParentEntityReference: Boolean = js.native
  
  var Name: String = js.native
  
  var PrivilegeId: String = js.native
  
  var PrivilegeType: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.PrivilegeType = js.native
}
object SecurityPrivilegeMetadata {
  
  @scala.inline
  def apply(
    CanBeBasic: Boolean,
    CanBeDeep: Boolean,
    CanBeEntityReference: Boolean,
    CanBeGlobal: Boolean,
    CanBeLocal: Boolean,
    CanBeParentEntityReference: Boolean,
    Name: String,
    PrivilegeId: String,
    PrivilegeType: PrivilegeType
  ): SecurityPrivilegeMetadata = {
    val __obj = js.Dynamic.literal(CanBeBasic = CanBeBasic.asInstanceOf[js.Any], CanBeDeep = CanBeDeep.asInstanceOf[js.Any], CanBeEntityReference = CanBeEntityReference.asInstanceOf[js.Any], CanBeGlobal = CanBeGlobal.asInstanceOf[js.Any], CanBeLocal = CanBeLocal.asInstanceOf[js.Any], CanBeParentEntityReference = CanBeParentEntityReference.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PrivilegeId = PrivilegeId.asInstanceOf[js.Any], PrivilegeType = PrivilegeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPrivilegeMetadata]
  }
  
  @scala.inline
  implicit class SecurityPrivilegeMetadataMutableBuilder[Self <: SecurityPrivilegeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanBeBasic(value: Boolean): Self = StObject.set(x, "CanBeBasic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeDeep(value: Boolean): Self = StObject.set(x, "CanBeDeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeEntityReference(value: Boolean): Self = StObject.set(x, "CanBeEntityReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeGlobal(value: Boolean): Self = StObject.set(x, "CanBeGlobal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeLocal(value: Boolean): Self = StObject.set(x, "CanBeLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeParentEntityReference(value: Boolean): Self = StObject.set(x, "CanBeParentEntityReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegeId(value: String): Self = StObject.set(x, "PrivilegeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegeType(value: PrivilegeType): Self = StObject.set(x, "PrivilegeType", value.asInstanceOf[js.Any])
  }
}
