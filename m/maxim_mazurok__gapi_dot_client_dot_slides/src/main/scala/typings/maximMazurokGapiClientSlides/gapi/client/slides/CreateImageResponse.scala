package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageResponse extends StObject {
  
  /** The object ID of the created image. */
  var objectId: js.UndefOr[String] = js.undefined
}
object CreateImageResponse {
  
  inline def apply(): CreateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageResponse]
  }
  
  extension [Self <: CreateImageResponse](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
