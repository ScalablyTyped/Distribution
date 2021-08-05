package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResponse extends StObject {
  
  val body: PutResponseData
}
object PutResponse {
  
  inline def apply(body: PutResponseData): PutResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResponse]
  }
  
  extension [Self <: PutResponse](x: Self) {
    
    inline def setBody(value: PutResponseData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
