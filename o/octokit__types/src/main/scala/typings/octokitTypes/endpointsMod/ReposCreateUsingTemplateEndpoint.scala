package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.baptiste
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreateUsingTemplateEndpoint
  extends StObject
     with RequiredPreview[baptiste] {
  
  /**
    * A short description of the new repository.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the new repository.
    */
  var name: String
  
  /**
    * The organization or person who will own the new repository. To create a new repository in an organization, the authenticated user must be a member of the specified organization.
    */
  var owner: js.UndefOr[String] = js.undefined
  
  /**
    * Either `true` to create a new private repository or `false` to create a new public one.
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  var template_owner: String
  
  var template_repo: String
}
object ReposCreateUsingTemplateEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[baptiste], name: String, template_owner: String, template_repo: String): ReposCreateUsingTemplateEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], template_owner = template_owner.asInstanceOf[js.Any], template_repo = template_repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateUsingTemplateEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreateUsingTemplateEndpointMutableBuilder[Self <: ReposCreateUsingTemplateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    @scala.inline
    def setTemplate_owner(value: String): Self = StObject.set(x, "template_owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate_repo(value: String): Self = StObject.set(x, "template_repo", value.asInstanceOf[js.Any])
  }
}
