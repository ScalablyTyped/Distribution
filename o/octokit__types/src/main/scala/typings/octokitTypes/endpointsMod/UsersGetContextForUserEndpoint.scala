package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.issue
import typings.octokitTypes.octokitTypesStrings.organization
import typings.octokitTypes.octokitTypesStrings.pull_request
import typings.octokitTypes.octokitTypesStrings.repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersGetContextForUserEndpoint extends StObject {
  
  /**
    * Uses the ID for the `subject_type` you specified. **Required** when using `subject_type`.
    */
  var subject_id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies which additional information you'd like to receive about the person's hovercard. Can be `organization`, `repository`, `issue`, `pull_request`. **Required** when using `subject_id`.
    */
  var subject_type: js.UndefOr[organization | repository | issue | pull_request] = js.undefined
  
  var username: String
}
object UsersGetContextForUserEndpoint {
  
  @scala.inline
  def apply(username: String): UsersGetContextForUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetContextForUserEndpoint]
  }
  
  @scala.inline
  implicit class UsersGetContextForUserEndpointMutableBuilder[Self <: UsersGetContextForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubject_id(value: String): Self = StObject.set(x, "subject_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject_idUndefined: Self = StObject.set(x, "subject_id", js.undefined)
    
    @scala.inline
    def setSubject_type(value: organization | repository | issue | pull_request): Self = StObject.set(x, "subject_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject_typeUndefined: Self = StObject.set(x, "subject_type", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
