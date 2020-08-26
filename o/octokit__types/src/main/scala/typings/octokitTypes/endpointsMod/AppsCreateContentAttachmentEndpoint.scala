package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  content_reference_id :number,   title :string,   body :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'corsair'> */
@js.native
trait AppsCreateContentAttachmentEndpoint extends js.Object {
  /**
    * The body text of the content attachment displayed in the body or comment of an issue or pull request. This parameter supports markdown.
    */
  var body: String = js.native
  var content_reference_id: Double = js.native
  var mediaType: `3` = js.native
  /**
    * The title of the content attachment displayed in the body or comment of an issue or pull request.
    */
  var title: String = js.native
}

object AppsCreateContentAttachmentEndpoint {
  @scala.inline
  def apply(body: String, content_reference_id: Double, mediaType: `3`, title: String): AppsCreateContentAttachmentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], content_reference_id = content_reference_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateContentAttachmentEndpoint]
  }
  @scala.inline
  implicit class AppsCreateContentAttachmentEndpointOps[Self <: AppsCreateContentAttachmentEndpoint] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent_reference_id(value: Double): Self = this.set("content_reference_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: `3`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

