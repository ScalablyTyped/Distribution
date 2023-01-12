package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupedResult extends StObject {
  
  /** The bounding polygon around the product detected in the query image. */
  var boundingPoly: js.UndefOr[BoundingPoly] = js.undefined
  
  /** List of generic predictions for the object in the bounding box. */
  var objectAnnotations: js.UndefOr[js.Array[ObjectAnnotation]] = js.undefined
  
  /** List of results, one for each product match. */
  var results: js.UndefOr[js.Array[Result]] = js.undefined
}
object GroupedResult {
  
  inline def apply(): GroupedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupedResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupedResult] (val x: Self) extends AnyVal {
    
    inline def setBoundingPoly(value: BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    inline def setObjectAnnotations(value: js.Array[ObjectAnnotation]): Self = StObject.set(x, "objectAnnotations", value.asInstanceOf[js.Any])
    
    inline def setObjectAnnotationsUndefined: Self = StObject.set(x, "objectAnnotations", js.undefined)
    
    inline def setObjectAnnotationsVarargs(value: ObjectAnnotation*): Self = StObject.set(x, "objectAnnotations", js.Array(value*))
    
    inline def setResults(value: js.Array[Result]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: Result*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
