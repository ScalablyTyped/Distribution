package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewHierarchyLevel extends StObject {
  
  /**
    * The metadata columns of this hierarchy level.
    * In visual DataView, this array is sorted in projection order.
    */
  var sources: js.Array[DataViewMetadataColumn]
}
object DataViewHierarchyLevel {
  
  inline def apply(sources: js.Array[DataViewMetadataColumn]): DataViewHierarchyLevel = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewHierarchyLevel]
  }
  
  extension [Self <: DataViewHierarchyLevel](x: Self) {
    
    inline def setSources(value: js.Array[DataViewMetadataColumn]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: DataViewMetadataColumn*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
