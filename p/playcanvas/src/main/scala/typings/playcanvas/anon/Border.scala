package typings.playcanvas.anon

import typings.playcanvas.mod.Vec2
import typings.playcanvas.mod.Vec4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  var border: Vec4
  
  var pivot: Vec2
  
  var rect: Vec4
}
object Border {
  
  inline def apply(border: Vec4, pivot: Vec2, rect: Vec4): Border = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], pivot = pivot.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  extension [Self <: Border](x: Self) {
    
    inline def setBorder(value: Vec4): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setPivot(value: Vec2): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
    
    inline def setRect(value: Vec4): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
  }
}
