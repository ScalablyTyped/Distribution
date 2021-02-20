package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverviewRulerPosition extends StObject {
  
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
  implicit class OverviewRulerPositionMutableBuilder[Self <: OverviewRulerPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
