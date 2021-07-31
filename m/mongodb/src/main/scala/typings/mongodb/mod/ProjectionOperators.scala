package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectionOperators extends StObject {
  
  /** https://docs.mongodb.com/manual/reference/operator/projection/elemMatch/#proj._S_elemMatch */
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[js.Object] = js.undefined
  
  @JSName("$meta")
  var $meta: js.UndefOr[MetaProjectionOperators] = js.undefined
  
  /** https://docs.mongodb.com/manual/reference/operator/projection/slice/#proj._S_slice */
  @JSName("$slice")
  var $slice: js.UndefOr[scala.Double | (js.Tuple2[scala.Double, scala.Double])] = js.undefined
}
object ProjectionOperators {
  
  @scala.inline
  def apply(): ProjectionOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectionOperators]
  }
  
  @scala.inline
  implicit class ProjectionOperatorsMutableBuilder[Self <: ProjectionOperators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$elemMatch(value: js.Object): Self = StObject.set(x, "$elemMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$elemMatchUndefined: Self = StObject.set(x, "$elemMatch", js.undefined)
    
    @scala.inline
    def set$meta(value: MetaProjectionOperators): Self = StObject.set(x, "$meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$metaUndefined: Self = StObject.set(x, "$meta", js.undefined)
    
    @scala.inline
    def set$slice(value: scala.Double | (js.Tuple2[scala.Double, scala.Double])): Self = StObject.set(x, "$slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$sliceUndefined: Self = StObject.set(x, "$slice", js.undefined)
  }
}
