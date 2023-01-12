package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents views of a data set. */
trait DataView extends StObject {
  
  var categorical: js.UndefOr[DataViewCategorical] = js.undefined
  
  var matrix: js.UndefOr[DataViewMatrix] = js.undefined
  
  var metadata: DataViewMetadata
  
  var scriptResult: js.UndefOr[DataViewScriptResultData] = js.undefined
  
  var single: js.UndefOr[DataViewSingle] = js.undefined
  
  var table: js.UndefOr[DataViewTable] = js.undefined
  
  var tree: js.UndefOr[DataViewTree] = js.undefined
}
object DataView {
  
  inline def apply(metadata: DataViewMetadata): DataView = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataView] (val x: Self) extends AnyVal {
    
    inline def setCategorical(value: DataViewCategorical): Self = StObject.set(x, "categorical", value.asInstanceOf[js.Any])
    
    inline def setCategoricalUndefined: Self = StObject.set(x, "categorical", js.undefined)
    
    inline def setMatrix(value: DataViewMatrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setMetadata(value: DataViewMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setScriptResult(value: DataViewScriptResultData): Self = StObject.set(x, "scriptResult", value.asInstanceOf[js.Any])
    
    inline def setScriptResultUndefined: Self = StObject.set(x, "scriptResult", js.undefined)
    
    inline def setSingle(value: DataViewSingle): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    inline def setTable(value: DataViewTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setTree(value: DataViewTree): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
  }
}
