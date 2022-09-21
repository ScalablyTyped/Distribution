package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewHierarchy extends StObject {
  
  var levels: js.Array[DataViewHierarchyLevel]
  
  var root: DataViewMatrixNode
}
object DataViewHierarchy {
  
  inline def apply(levels: js.Array[DataViewHierarchyLevel], root: DataViewMatrixNode): DataViewHierarchy = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewHierarchy]
  }
  
  extension [Self <: DataViewHierarchy](x: Self) {
    
    inline def setLevels(value: js.Array[DataViewHierarchyLevel]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsVarargs(value: DataViewHierarchyLevel*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setRoot(value: DataViewMatrixNode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
