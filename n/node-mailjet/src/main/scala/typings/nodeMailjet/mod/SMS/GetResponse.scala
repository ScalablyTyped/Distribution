package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// responses
trait GetResponse extends StObject {
  
  val body: GetResponseData
}
object GetResponse {
  
  inline def apply(body: GetResponseData): GetResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: GetResponseData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
