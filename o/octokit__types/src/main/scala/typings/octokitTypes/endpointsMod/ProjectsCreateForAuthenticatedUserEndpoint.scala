package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`10`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  name :string,   body :string | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsCreateForAuthenticatedUserEndpoint extends js.Object {
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.native
  var mediaType: `10` = js.native
  /**
    * The name of the project.
    */
  var name: String = js.native
}

object ProjectsCreateForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(mediaType: `10`, name: String): ProjectsCreateForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ProjectsCreateForAuthenticatedUserEndpointOps[Self <: ProjectsCreateForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setMediaType(value: `10`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
  
}

