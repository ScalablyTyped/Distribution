package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverviewRulerPosition extends js.Object {
  
  /**
    * Height of the overview ruler
    */
  val height: Double = js.native
  
  /**
    * Right position for the overview ruler
    */
  val right: Double = js.native
  
  /**
    * Top position for the overview ruler
    */
  val top: Double = js.native
  
  /**
    * Width of the overview ruler
    */
  val width: Double = js.native
}
object OverviewRulerPosition {
  
  @scala.inline
  def apply(height: Double, right: Double, top: Double, width: Double): OverviewRulerPosition = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverviewRulerPosition]
  }
  
  @scala.inline
  implicit class OverviewRulerPositionOps[Self <: OverviewRulerPosition] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
