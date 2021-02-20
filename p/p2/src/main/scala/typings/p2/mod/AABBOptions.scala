package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AABBOptions extends StObject {
  
  var lowerBound: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var upperBound: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}
object AABBOptions {
  
  @scala.inline
  def apply(): AABBOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AABBOptions]
  }
  
  @scala.inline
  implicit class AABBOptionsMutableBuilder[Self <: AABBOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLowerBound(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    @scala.inline
    def setUpperBound(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
  }
}
