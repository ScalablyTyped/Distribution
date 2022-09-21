package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.editor.MouseTargetType.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetUnknown
  extends StObject
     with IBaseMouseTarget
     with IMouseTarget {
  
  val `type`: UNKNOWN
}
object IMouseTargetUnknown {
  
  inline def apply(mouseColumn: Double, `type`: UNKNOWN): IMouseTargetUnknown = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], element = null, position = null, range = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetUnknown]
  }
  
  extension [Self <: IMouseTargetUnknown](x: Self) {
    
    inline def setType(value: UNKNOWN): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
