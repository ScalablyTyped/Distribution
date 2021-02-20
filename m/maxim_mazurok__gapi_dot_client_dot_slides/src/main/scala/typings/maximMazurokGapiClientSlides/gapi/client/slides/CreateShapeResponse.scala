package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateShapeResponse extends StObject {
  
  /** The object ID of the created shape. */
  var objectId: js.UndefOr[String] = js.native
}
object CreateShapeResponse {
  
  @scala.inline
  def apply(): CreateShapeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateShapeResponse]
  }
  
  @scala.inline
  implicit class CreateShapeResponseMutableBuilder[Self <: CreateShapeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
