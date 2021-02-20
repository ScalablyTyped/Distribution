package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVideoResponse extends StObject {
  
  /** The object ID of the created video. */
  var objectId: js.UndefOr[String] = js.native
}
object CreateVideoResponse {
  
  @scala.inline
  def apply(): CreateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVideoResponse]
  }
  
  @scala.inline
  implicit class CreateVideoResponseMutableBuilder[Self <: CreateVideoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
