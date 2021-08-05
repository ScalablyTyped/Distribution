package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISelection extends StObject {
  
  /**
    * The column on `positionLineNumber` where the selection has ended.
    */
  val positionColumn: Double
  
  /**
    * The line number on which the selection has ended.
    */
  val positionLineNumber: Double
  
  /**
    * The column on `selectionStartLineNumber` where the selection has started.
    */
  val selectionStartColumn: Double
  
  /**
    * The line number on which the selection has started.
    */
  val selectionStartLineNumber: Double
}
object ISelection {
  
  inline def apply(
    positionColumn: Double,
    positionLineNumber: Double,
    selectionStartColumn: Double,
    selectionStartLineNumber: Double
  ): ISelection = {
    val __obj = js.Dynamic.literal(positionColumn = positionColumn.asInstanceOf[js.Any], positionLineNumber = positionLineNumber.asInstanceOf[js.Any], selectionStartColumn = selectionStartColumn.asInstanceOf[js.Any], selectionStartLineNumber = selectionStartLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelection]
  }
  
  extension [Self <: ISelection](x: Self) {
    
    inline def setPositionColumn(value: Double): Self = StObject.set(x, "positionColumn", value.asInstanceOf[js.Any])
    
    inline def setPositionLineNumber(value: Double): Self = StObject.set(x, "positionLineNumber", value.asInstanceOf[js.Any])
    
    inline def setSelectionStartColumn(value: Double): Self = StObject.set(x, "selectionStartColumn", value.asInstanceOf[js.Any])
    
    inline def setSelectionStartLineNumber(value: Double): Self = StObject.set(x, "selectionStartLineNumber", value.asInstanceOf[js.Any])
  }
}
