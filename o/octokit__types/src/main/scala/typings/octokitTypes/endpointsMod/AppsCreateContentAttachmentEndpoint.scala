package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.corsair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsCreateContentAttachmentEndpoint
  extends StObject
     with RequiredPreview[corsair] {
  
  /**
    * The body text of the content attachment displayed in the body or comment of an issue or pull request. This parameter supports markdown.
    */
  var body: String
  
  var content_reference_id: Double
  
  /**
    * The title of the content attachment displayed in the body or comment of an issue or pull request.
    */
  var title: String
}
object AppsCreateContentAttachmentEndpoint {
  
  inline def apply(body: String, content_reference_id: Double, mediaType: `0`[corsair], title: String): AppsCreateContentAttachmentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], content_reference_id = content_reference_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateContentAttachmentEndpoint]
  }
  
  extension [Self <: AppsCreateContentAttachmentEndpoint](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setContent_reference_id(value: Double): Self = StObject.set(x, "content_reference_id", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
