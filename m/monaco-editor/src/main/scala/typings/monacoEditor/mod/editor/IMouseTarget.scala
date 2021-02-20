package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.Range
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMouseTarget extends StObject {
  
  /**
    * Some extra detail.
    */
  val detail: js.Any = js.native
  
  /**
    * The target element
    */
  val element: Element | Null = js.native
  
  /**
    * Desired mouse column (e.g. when position.column gets clamped to text length -- clicking after text on a line).
    */
  val mouseColumn: Double = js.native
  
  /**
    * The 'approximate' editor position
    */
  val position: Position | Null = js.native
  
  /**
    * The 'approximate' editor range
    */
  val range: Range | Null = js.native
  
  /**
    * The target type
    */
  val `type`: MouseTargetType = js.native
}
object IMouseTarget {
  
  @scala.inline
  def apply(detail: js.Any, mouseColumn: Double, `type`: MouseTargetType): IMouseTarget = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], mouseColumn = mouseColumn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTarget]
  }
  
  @scala.inline
  implicit class IMouseTargetMutableBuilder[Self <: IMouseTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: js.Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementNull: Self = StObject.set(x, "element", null)
    
    @scala.inline
    def setMouseColumn(value: Double): Self = StObject.set(x, "mouseColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionNull: Self = StObject.set(x, "position", null)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNull: Self = StObject.set(x, "range", null)
    
    @scala.inline
    def setType(value: MouseTargetType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
