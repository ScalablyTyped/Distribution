package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  content_reference_id  :number,   title  :string,   body  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'corsair'> */
trait AppsCreateContentAttachmentEndpoint extends js.Object {
  /**
    * The body text of the content attachment displayed in the body or comment of an issue or pull request. This parameter supports markdown.
    */
  var body: String
  var content_reference_id: Double
  var mediaType: `4`
  /**
    * The title of the content attachment displayed in the body or comment of an issue or pull request.
    */
  var title: String
}

object AppsCreateContentAttachmentEndpoint {
  @scala.inline
  def apply(body: String, content_reference_id: Double, mediaType: `4`, title: String): AppsCreateContentAttachmentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], content_reference_id = content_reference_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateContentAttachmentEndpoint]
  }
}

