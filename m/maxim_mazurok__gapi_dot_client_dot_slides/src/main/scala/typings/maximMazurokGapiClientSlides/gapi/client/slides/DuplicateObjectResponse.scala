package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DuplicateObjectResponse extends StObject {
  
  /** The ID of the new duplicate object. */
  var objectId: js.UndefOr[String] = js.undefined
}
object DuplicateObjectResponse {
  
  inline def apply(): DuplicateObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateObjectResponse]
  }
  
  extension [Self <: DuplicateObjectResponse](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
