package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a value at a particular level of a matrix's rows or columns hierarchy.
  * In the hierarchy level node is an instance of a composite group, this object will
  * be one of multiple values
  */
trait DataViewMatrixGroupValue
  extends StObject
     with DataViewTreeNodeValue {
  
  /**
    * Indicates the index of the corresponding column for this group level value
    * (held by DataViewHierarchyLevel.sources).
    *
    * @example
    * // For example, to get the source column metadata of each level value at a particular row hierarchy node:
    * let matrixRowsHierarchy: DataViewHierarchy = dataView.matrix.rows;
    * let targetRowsHierarchyNode = <DataViewMatrixNode>matrixRowsHierarchy.root.children[0];
    * // Use the DataViewMatrixNode.level property to get the corresponding DataViewHierarchyLevel...
    * let targetRowsHierarchyLevel: DataViewHierarchyLevel = matrixRows.levels[targetRowsHierarchyNode.level];
    * for (let levelValue in rowsRootNode.levelValues) {
    *   // columnMetadata is the source column for the particular levelValue.value in this loop iteration
    *   let columnMetadata: DataViewMetadataColumn =
    *     targetRowsHierarchyLevel.sources[levelValue.levelSourceIndex];
    * }
    */
  var levelSourceIndex: Double
}
object DataViewMatrixGroupValue {
  
  inline def apply(levelSourceIndex: Double): DataViewMatrixGroupValue = {
    val __obj = js.Dynamic.literal(levelSourceIndex = levelSourceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewMatrixGroupValue]
  }
  
  extension [Self <: DataViewMatrixGroupValue](x: Self) {
    
    inline def setLevelSourceIndex(value: Double): Self = StObject.set(x, "levelSourceIndex", value.asInstanceOf[js.Any])
  }
}
