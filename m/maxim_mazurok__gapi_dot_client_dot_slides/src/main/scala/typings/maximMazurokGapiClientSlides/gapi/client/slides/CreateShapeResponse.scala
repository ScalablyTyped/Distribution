package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateShapeResponse extends StObject {
  
  /** The object ID of the created shape. */
  var objectId: js.UndefOr[String] = js.undefined
}
object CreateShapeResponse {
  
  inline def apply(): CreateShapeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateShapeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateShapeResponse] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
