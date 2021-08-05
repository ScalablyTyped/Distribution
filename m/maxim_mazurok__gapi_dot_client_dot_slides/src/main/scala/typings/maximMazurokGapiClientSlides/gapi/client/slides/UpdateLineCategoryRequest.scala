package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLineCategoryRequest extends StObject {
  
  /** The line category to update to. The exact line type is determined based on the category to update to and how it's routed to connect to other page elements. */
  var lineCategory: js.UndefOr[String] = js.undefined
  
  /** The object ID of the line the update is applied to. Only a line with a category indicating it is a "connector" can be updated. The line may be rerouted after updating its category. */
  var objectId: js.UndefOr[String] = js.undefined
}
object UpdateLineCategoryRequest {
  
  inline def apply(): UpdateLineCategoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLineCategoryRequest]
  }
  
  extension [Self <: UpdateLineCategoryRequest](x: Self) {
    
    inline def setLineCategory(value: String): Self = StObject.set(x, "lineCategory", value.asInstanceOf[js.Any])
    
    inline def setLineCategoryUndefined: Self = StObject.set(x, "lineCategory", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
