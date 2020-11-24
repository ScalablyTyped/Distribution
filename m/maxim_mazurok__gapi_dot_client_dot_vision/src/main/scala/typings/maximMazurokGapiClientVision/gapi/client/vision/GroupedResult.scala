package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupedResult extends js.Object {
  
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
  implicit class GroupedResultOps[Self <: GroupedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoundingPoly(value: BoundingPoly): Self = this.set("boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingPoly: Self = this.set("boundingPoly", js.undefined)
    
    @scala.inline
    def setObjectAnnotationsVarargs(value: ObjectAnnotation*): Self = this.set("objectAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setObjectAnnotations(value: js.Array[ObjectAnnotation]): Self = this.set("objectAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectAnnotations: Self = this.set("objectAnnotations", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: Result*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[Result]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
