package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewMetadata extends StObject {
  
  var columns: js.Array[DataViewMetadataColumn]
  
  /** Describes the data reduction applied to this data set when limits are exceeded. */
  var dataReduction: js.UndefOr[DataViewReductionMetadata] = js.undefined
  
  /** The metadata repetition objects. */
  var objects: js.UndefOr[DataViewObjects] = js.undefined
  
  /** When defined, describes whether the DataView contains just a segment of the complete data set. */
  var segment: js.UndefOr[js.Object] = js.undefined
}
object DataViewMetadata {
  
  inline def apply(columns: js.Array[DataViewMetadataColumn]): DataViewMetadata = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewMetadata]
  }
  
  extension [Self <: DataViewMetadata](x: Self) {
    
    inline def setColumns(value: js.Array[DataViewMetadataColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: DataViewMetadataColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDataReduction(value: DataViewReductionMetadata): Self = StObject.set(x, "dataReduction", value.asInstanceOf[js.Any])
    
    inline def setDataReductionUndefined: Self = StObject.set(x, "dataReduction", js.undefined)
    
    inline def setObjects(value: DataViewObjects): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setSegment(value: js.Object): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
