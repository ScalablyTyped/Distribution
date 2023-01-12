package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.editor.MouseTargetType.TEXTAREA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetTextarea
  extends StObject
     with IBaseMouseTarget
     with IMouseTarget {
  
  @JSName("position")
  val position_IMouseTargetTextarea: Null
  
  @JSName("range")
  val range_IMouseTargetTextarea: Null
  
  val `type`: TEXTAREA
}
object IMouseTargetTextarea {
  
  inline def apply(mouseColumn: Double, position: Null, range: Null, `type`: TEXTAREA): IMouseTargetTextarea = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetTextarea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMouseTargetTextarea] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: Null): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Null): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: TEXTAREA): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
