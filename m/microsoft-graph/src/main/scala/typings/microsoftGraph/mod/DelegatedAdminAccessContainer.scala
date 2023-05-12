package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedAdminAccessContainer extends StObject {
  
  /**
    * The identifier of the access container (for example, a security group). For 'securityGroup' access containers, this
    * must be a valid ID of an Azure AD security group in the Microsoft partner's tenant.
    */
  var accessContainerId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of access container (for example, security group) that will be assigned one or more roles through a delegated
    * admin relationship. The possible values are: securityGroup, unknownFutureValue.
    */
  var accessContainerType: js.UndefOr[DelegatedAdminAccessContainerType] = js.undefined
}
object DelegatedAdminAccessContainer {
  
  inline def apply(): DelegatedAdminAccessContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdminAccessContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelegatedAdminAccessContainer] (val x: Self) extends AnyVal {
    
    inline def setAccessContainerId(value: String): Self = StObject.set(x, "accessContainerId", value.asInstanceOf[js.Any])
    
    inline def setAccessContainerIdUndefined: Self = StObject.set(x, "accessContainerId", js.undefined)
    
    inline def setAccessContainerType(value: DelegatedAdminAccessContainerType): Self = StObject.set(x, "accessContainerType", value.asInstanceOf[js.Any])
    
    inline def setAccessContainerTypeUndefined: Self = StObject.set(x, "accessContainerType", js.undefined)
  }
}
