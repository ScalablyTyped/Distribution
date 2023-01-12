package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewReductionAlgorithmMetadata extends StObject {
  
  var binnedLineSample: js.UndefOr[js.Object] = js.undefined
}
object DataViewReductionAlgorithmMetadata {
  
  inline def apply(): DataViewReductionAlgorithmMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewReductionAlgorithmMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataViewReductionAlgorithmMetadata] (val x: Self) extends AnyVal {
    
    inline def setBinnedLineSample(value: js.Object): Self = StObject.set(x, "binnedLineSample", value.asInstanceOf[js.Any])
    
    inline def setBinnedLineSampleUndefined: Self = StObject.set(x, "binnedLineSample", js.undefined)
  }
}
