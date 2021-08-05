package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsCreateContentAttachmentResponseData extends StObject {
  
  var body: String
  
  var id: Double
  
  var title: String
}
object AppsCreateContentAttachmentResponseData {
  
  inline def apply(body: String, id: Double, title: String): AppsCreateContentAttachmentResponseData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateContentAttachmentResponseData]
  }
  
  extension [Self <: AppsCreateContentAttachmentResponseData](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
