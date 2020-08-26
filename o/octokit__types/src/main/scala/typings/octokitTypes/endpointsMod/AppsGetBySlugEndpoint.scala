package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  app_slug :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'machine-man'> */
@js.native
trait AppsGetBySlugEndpoint extends js.Object {
  var app_slug: String = js.native
  var mediaType: `2` = js.native
}

object AppsGetBySlugEndpoint {
  @scala.inline
  def apply(app_slug: String, mediaType: `2`): AppsGetBySlugEndpoint = {
    val __obj = js.Dynamic.literal(app_slug = app_slug.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetBySlugEndpoint]
  }
  @scala.inline
  implicit class AppsGetBySlugEndpointOps[Self <: AppsGetBySlugEndpoint] (val x: Self) extends AnyVal {
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
    def setApp_slug(value: String): Self = this.set("app_slug", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: `2`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
  }
  
}

