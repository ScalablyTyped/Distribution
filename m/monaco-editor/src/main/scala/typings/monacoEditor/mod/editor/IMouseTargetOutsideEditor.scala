package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.editor.MouseTargetType.OUTSIDE_EDITOR
import typings.monacoEditor.monacoEditorStrings.above
import typings.monacoEditor.monacoEditorStrings.below
import typings.monacoEditor.monacoEditorStrings.left
import typings.monacoEditor.monacoEditorStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetOutsideEditor
  extends StObject
     with IBaseMouseTarget
     with IMouseTarget {
  
  val outsideDistance: Double
  
  val outsidePosition: above | below | left | right
  
  val `type`: OUTSIDE_EDITOR
}
object IMouseTargetOutsideEditor {
  
  inline def apply(
    mouseColumn: Double,
    outsideDistance: Double,
    outsidePosition: above | below | left | right,
    `type`: OUTSIDE_EDITOR
  ): IMouseTargetOutsideEditor = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], outsideDistance = outsideDistance.asInstanceOf[js.Any], outsidePosition = outsidePosition.asInstanceOf[js.Any], element = null, position = null, range = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetOutsideEditor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMouseTargetOutsideEditor] (val x: Self) extends AnyVal {
    
    inline def setOutsideDistance(value: Double): Self = StObject.set(x, "outsideDistance", value.asInstanceOf[js.Any])
    
    inline def setOutsidePosition(value: above | below | left | right): Self = StObject.set(x, "outsidePosition", value.asInstanceOf[js.Any])
    
    inline def setType(value: OUTSIDE_EDITOR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
