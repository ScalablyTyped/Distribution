package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResponse extends StObject {
  
  val body: PutResponseData = js.native
}
object PutResponse {
  
  @scala.inline
  def apply(body: PutResponseData): PutResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResponse]
  }
  
  @scala.inline
  implicit class PutResponseMutableBuilder[Self <: PutResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: PutResponseData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
