package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.PrivilegeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entity metadata security privileges.
  */
trait SecurityPrivilegeMetadata extends StObject {
  
  var CanBeBasic: Boolean
  
  var CanBeDeep: Boolean
  
  var CanBeEntityReference: Boolean
  
  var CanBeGlobal: Boolean
  
  var CanBeLocal: Boolean
  
  var CanBeParentEntityReference: Boolean
  
  var Name: String
  
  var PrivilegeId: String
  
  var PrivilegeType: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.PrivilegeType
}
object SecurityPrivilegeMetadata {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: SecurityPrivilegeMetadata] (val x: Self) extends AnyVal {
    
    inline def setCanBeBasic(value: Boolean): Self = StObject.set(x, "CanBeBasic", value.asInstanceOf[js.Any])
    
    inline def setCanBeDeep(value: Boolean): Self = StObject.set(x, "CanBeDeep", value.asInstanceOf[js.Any])
    
    inline def setCanBeEntityReference(value: Boolean): Self = StObject.set(x, "CanBeEntityReference", value.asInstanceOf[js.Any])
    
    inline def setCanBeGlobal(value: Boolean): Self = StObject.set(x, "CanBeGlobal", value.asInstanceOf[js.Any])
    
    inline def setCanBeLocal(value: Boolean): Self = StObject.set(x, "CanBeLocal", value.asInstanceOf[js.Any])
    
    inline def setCanBeParentEntityReference(value: Boolean): Self = StObject.set(x, "CanBeParentEntityReference", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPrivilegeId(value: String): Self = StObject.set(x, "PrivilegeId", value.asInstanceOf[js.Any])
    
    inline def setPrivilegeType(value: PrivilegeType): Self = StObject.set(x, "PrivilegeType", value.asInstanceOf[js.Any])
  }
}
