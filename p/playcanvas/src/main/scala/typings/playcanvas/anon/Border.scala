package typings.playcanvas.anon

import typings.playcanvas.pc.Vec2
import typings.playcanvas.pc.Vec4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Border extends StObject {
  
  var border: Vec4 = js.native
  
  var pivot: Vec2 = js.native
  
  var rect: Vec4 = js.native
}
object Border {
  
  @scala.inline
  def apply(border: Vec4, pivot: Vec2, rect: Vec4): Border = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], pivot = pivot.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: Vec4): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivot(value: Vec2): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRect(value: Vec4): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
  }
}
