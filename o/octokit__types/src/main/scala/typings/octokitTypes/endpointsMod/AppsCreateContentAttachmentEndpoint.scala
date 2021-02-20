package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  content_reference_id :number,   title :string,   body :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'corsair'> */
@js.native
trait AppsCreateContentAttachmentEndpoint extends StObject {
  
  /**
    * The body text of the content attachment displayed in the body or comment of an issue or pull request. This parameter supports markdown.
    */
  var body: String = js.native
  
  var content_reference_id: Double = js.native
  
  var mediaType: `1` = js.native
  
  /**
    * The title of the content attachment displayed in the body or comment of an issue or pull request.
    */
  var title: String = js.native
}
object AppsCreateContentAttachmentEndpoint {
  
  @scala.inline
  def apply(body: String, content_reference_id: Double, mediaType: `1`, title: String): AppsCreateContentAttachmentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], content_reference_id = content_reference_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateContentAttachmentEndpoint]
  }
  
  @scala.inline
  implicit class AppsCreateContentAttachmentEndpointMutableBuilder[Self <: AppsCreateContentAttachmentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_reference_id(value: Double): Self = StObject.set(x, "content_reference_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `1`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
