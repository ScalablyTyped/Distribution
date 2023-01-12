package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.Range
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBaseMouseTarget extends StObject {
  
  /**
    * The target element
    */
  val element: Element | Null
  
  /**
    * Desired mouse column (e.g. when position.column gets clamped to text length -- clicking after text on a line).
    */
  val mouseColumn: Double
  
  /**
    * The 'approximate' editor position
    */
  val position: Position | Null
  
  /**
    * The 'approximate' editor range
    */
  val range: Range | Null
}
object IBaseMouseTarget {
  
  inline def apply(mouseColumn: Double): IBaseMouseTarget = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], element = null, position = null, range = null)
    __obj.asInstanceOf[IBaseMouseTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBaseMouseTarget] (val x: Self) extends AnyVal {
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementNull: Self = StObject.set(x, "element", null)
    
    inline def setMouseColumn(value: Double): Self = StObject.set(x, "mouseColumn", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeNull: Self = StObject.set(x, "range", null)
  }
}
