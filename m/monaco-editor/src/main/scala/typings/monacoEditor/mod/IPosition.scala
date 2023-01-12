package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPosition extends StObject {
  
  /**
    * column (the first character in a line is between column 1 and column 2)
    */
  val column: Double
  
  /**
    * line number (starts at 1)
    */
  val lineNumber: Double
}
object IPosition {
  
  inline def apply(column: Double, lineNumber: Double): IPosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPosition] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
  }
}
