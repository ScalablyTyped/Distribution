package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  app_slug  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'machine-man'> */
trait AppsGetBySlugEndpoint extends js.Object {
  var app_slug: String
  var mediaType: `2`
}

object AppsGetBySlugEndpoint {
  @scala.inline
  def apply(app_slug: String, mediaType: `2`): AppsGetBySlugEndpoint = {
    val __obj = js.Dynamic.literal(app_slug = app_slug.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetBySlugEndpoint]
  }
}

