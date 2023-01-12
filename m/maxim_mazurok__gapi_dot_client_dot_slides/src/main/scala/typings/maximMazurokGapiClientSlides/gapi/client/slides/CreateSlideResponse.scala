package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSlideResponse extends StObject {
  
  /** The object ID of the created slide. */
  var objectId: js.UndefOr[String] = js.undefined
}
object CreateSlideResponse {
  
  inline def apply(): CreateSlideResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSlideResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSlideResponse] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
