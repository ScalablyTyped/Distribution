package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupedResult extends StObject {
  
  /** The bounding polygon around the product detected in the query image. */
  var boundingPoly: js.UndefOr[BoundingPoly] = js.native
  
  /** List of generic predictions for the object in the bounding box. */
  var objectAnnotations: js.UndefOr[js.Array[ObjectAnnotation]] = js.native
  
  /** List of results, one for each product match. */
  var results: js.UndefOr[js.Array[Result]] = js.native
}
object GroupedResult {
  
  @scala.inline
  def apply(): GroupedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupedResult]
  }
  
  @scala.inline
  implicit class GroupedResultMutableBuilder[Self <: GroupedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingPoly(value: BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    @scala.inline
    def setObjectAnnotations(value: js.Array[ObjectAnnotation]): Self = StObject.set(x, "objectAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectAnnotationsUndefined: Self = StObject.set(x, "objectAnnotations", js.undefined)
    
    @scala.inline
    def setObjectAnnotationsVarargs(value: ObjectAnnotation*): Self = StObject.set(x, "objectAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[Result]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: Result*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
