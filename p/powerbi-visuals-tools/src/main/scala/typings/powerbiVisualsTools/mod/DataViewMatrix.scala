package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewMatrix extends StObject {
  
  var columns: DataViewHierarchy
  
  var rows: DataViewHierarchy
  
  /**
    * The metadata columns of the measure values.
    * In visual DataView, this array is sorted in projection order.
    */
  var valueSources: js.Array[DataViewMetadataColumn]
}
object DataViewMatrix {
  
  inline def apply(
    columns: DataViewHierarchy,
    rows: DataViewHierarchy,
    valueSources: js.Array[DataViewMetadataColumn]
  ): DataViewMatrix = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], valueSources = valueSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewMatrix]
  }
  
  extension [Self <: DataViewMatrix](x: Self) {
    
    inline def setColumns(value: DataViewHierarchy): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setRows(value: DataViewHierarchy): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setValueSources(value: js.Array[DataViewMetadataColumn]): Self = StObject.set(x, "valueSources", value.asInstanceOf[js.Any])
    
    inline def setValueSourcesVarargs(value: DataViewMetadataColumn*): Self = StObject.set(x, "valueSources", js.Array(value*))
  }
}
