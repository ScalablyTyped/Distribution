package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`16`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  template_owner :string,   template_repo :string,   owner :string | undefined,   name :string,   description :string | undefined,   private :boolean | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'baptiste'> */
@js.native
trait ReposCreateUsingTemplateEndpoint extends js.Object {
  /**
    * A short description of the new repository.
    */
  var description: js.UndefOr[String] = js.native
  var mediaType: `16` = js.native
  /**
    * The name of the new repository.
    */
  var name: String = js.native
  /**
    * The organization or person who will own the new repository. To create a new repository in an organization, the authenticated user must be a member of the specified organization.
    */
  var owner: js.UndefOr[String] = js.native
  /**
    * Either `true` to create a new private repository or `false` to create a new public one.
    */
  var `private`: js.UndefOr[Boolean] = js.native
  var template_owner: String = js.native
  var template_repo: String = js.native
}

object ReposCreateUsingTemplateEndpoint {
  @scala.inline
  def apply(mediaType: `16`, name: String, template_owner: String, template_repo: String): ReposCreateUsingTemplateEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], template_owner = template_owner.asInstanceOf[js.Any], template_repo = template_repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateUsingTemplateEndpoint]
  }
  @scala.inline
  implicit class ReposCreateUsingTemplateEndpointOps[Self <: ReposCreateUsingTemplateEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMediaType(value: `16`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate_owner(value: String): Self = this.set("template_owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate_repo(value: String): Self = this.set("template_repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
  }
  
}

