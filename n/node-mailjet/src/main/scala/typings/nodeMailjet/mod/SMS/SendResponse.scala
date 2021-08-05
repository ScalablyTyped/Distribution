package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendResponse extends StObject {
  
  val body: PostResponseData
  
  val url: String
}
object SendResponse {
  
  inline def apply(body: PostResponseData, url: String): SendResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendResponse]
  }
  
  extension [Self <: SendResponse](x: Self) {
    
    inline def setBody(value: PostResponseData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
