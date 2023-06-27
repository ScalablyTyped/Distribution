package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters244 extends StObject {
  
  /**
    * List repository collaborators
    * @description For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.
    * Organization members with write, maintain, or admin privileges on the organization-owned repository can use this endpoint.
    *
    * Team members will include the members of child teams.
    *
    * You must authenticate using an access token with the `read:org` and `repo` scopes with push access to use this
    * endpoint. GitHub Apps must have the `members` organization permission and `metadata` repository permission to use this
    * endpoint.
    */
  var get: Parameters244
}
object GetParameters244 {
  
  inline def apply(get: Parameters244): GetParameters244 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters244]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters244] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters244): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
