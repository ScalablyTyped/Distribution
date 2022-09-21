package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.editor.MouseTargetType.OUTSIDE_EDITOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetOutsideEditor
  extends StObject
     with IBaseMouseTarget
     with IMouseTarget {
  
  val `type`: OUTSIDE_EDITOR
}
object IMouseTargetOutsideEditor {
  
  inline def apply(mouseColumn: Double, `type`: OUTSIDE_EDITOR): IMouseTargetOutsideEditor = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], element = null, position = null, range = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetOutsideEditor]
  }
  
  extension [Self <: IMouseTargetOutsideEditor](x: Self) {
    
    inline def setType(value: OUTSIDE_EDITOR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
