package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyColumnsurl extends StObject {
  
  /**
    * @description Body of the project
    * @example This project represents the sprint of the first week in January
    */
  var body: String | Null
  
  /**
    * Format: uri
    * @example https://api.github.com/projects/1002604/columns
    */
  var columns_url: String
  
  /**
    * Format: date-time
    * @example 2011-04-10T20:09:31Z
    */
  var created_at: String
  
  var creator: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  
  /**
    * Format: uri
    * @example https://github.com/api-playground/projects-test/projects/12
    */
  var html_url: String
  
  /** @example 1002604 */
  var id: Double
  
  /**
    * @description Name of the project
    * @example Week One Sprint
    */
  var name: String
  
  /** @example MDc6UHJvamVjdDEwMDI2MDQ= */
  var node_id: String
  
  /** @example 1 */
  var number: Double
  
  /**
    * @description The baseline permission that all organization members have on this project. Only present if owner is an organization.
    * @enum {string}
    */
  var organization_permission: js.UndefOr[read | write | admin | none_] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/api-playground/projects-test
    */
  var owner_url: String
  
  /** @description Whether or not this project can be seen by everyone. Only present if owner is an organization. */
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description State of the project; either 'open' or 'closed'
    * @example open
    */
  var state: String
  
  /**
    * Format: date-time
    * @example 2014-03-03T18:58:10Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/projects/1002604
    */
  var url: String
}
object BodyColumnsurl {
  
  inline def apply(
    columns_url: String,
    created_at: String,
    creator: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    number: Double,
    owner_url: String,
    state: String,
    updated_at: String,
    url: String
  ): BodyColumnsurl = {
    val __obj = js.Dynamic.literal(columns_url = columns_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner_url = owner_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], body = null)
    __obj.asInstanceOf[BodyColumnsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyColumnsurl] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setColumns_url(value: String): Self = StObject.set(x, "columns_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOrganization_permission(value: read | write | admin | none_): Self = StObject.set(x, "organization_permission", value.asInstanceOf[js.Any])
    
    inline def setOrganization_permissionUndefined: Self = StObject.set(x, "organization_permission", js.undefined)
    
    inline def setOwner_url(value: String): Self = StObject.set(x, "owner_url", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
