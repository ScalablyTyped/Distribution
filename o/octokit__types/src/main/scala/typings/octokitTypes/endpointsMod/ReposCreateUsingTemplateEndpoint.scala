package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`19`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  template_owner  :string,   template_repo  :string,   owner ? :string,   name  :string,   description ? :string,   private ? :boolean} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'baptiste'> */
trait ReposCreateUsingTemplateEndpoint extends js.Object {
  /**
    * A short description of the new repository.
    */
  var description: js.UndefOr[String] = js.undefined
  var mediaType: `19`
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
  def apply(
    mediaType: `19`,
    name: String,
    template_owner: String,
    template_repo: String,
    description: String = null,
    owner: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined
  ): ReposCreateUsingTemplateEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], template_owner = template_owner.asInstanceOf[js.Any], template_repo = template_repo.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateUsingTemplateEndpoint]
  }
}

