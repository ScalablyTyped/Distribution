package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverviewRulerPosition extends StObject {
  
  /**
    * Height of the overview ruler
    */
  val height: Double
  
  /**
    * Right position for the overview ruler
    */
  val right: Double
  
  /**
    * Top position for the overview ruler
    */
  val top: Double
  
  /**
    * Width of the overview ruler
    */
  val width: Double
}
object OverviewRulerPosition {
  
  inline def apply(height: Double, right: Double, top: Double, width: Double): OverviewRulerPosition = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverviewRulerPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverviewRulerPosition] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
