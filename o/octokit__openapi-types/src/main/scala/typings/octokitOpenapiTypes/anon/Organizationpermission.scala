package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organizationpermission extends StObject {
  
  /**
    * @description Body of the project
    * @example This project represents the sprint of the first week in January
    */
  var body: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description Name of the project
    * @example Week One Sprint
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @description The baseline permission that all organization members have on this project
    * @enum {string}
    */
  var organization_permission: js.UndefOr[read | write | admin | none_] = js.undefined
  
  /** @description Whether or not this project can be seen by everyone. */
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description State of the project; either 'open' or 'closed'
    * @example open
    */
  var state: js.UndefOr[String] = js.undefined
}
object Organizationpermission {
  
  inline def apply(): Organizationpermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organizationpermission]
  }
  
  extension [Self <: Organizationpermission](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrganization_permission(value: read | write | admin | none_): Self = StObject.set(x, "organization_permission", value.asInstanceOf[js.Any])
    
    inline def setOrganization_permissionUndefined: Self = StObject.set(x, "organization_permission", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
