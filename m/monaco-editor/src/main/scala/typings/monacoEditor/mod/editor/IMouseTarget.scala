package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.Range
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMouseTarget extends js.Object {
  
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
  implicit class IMouseTargetOps[Self <: IMouseTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetail(value: js.Any): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseColumn(value: Double): Self = this.set("mouseColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MouseTargetType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: Element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementNull: Self = this.set("element", null)
    
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
    
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNull: Self = this.set("range", null)
  }
}
