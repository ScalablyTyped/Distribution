package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.editor.MouseTargetType.OVERVIEW_RULER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetOverviewRuler
  extends StObject
     with IBaseMouseTarget
     with IMouseTarget {
  
  val `type`: OVERVIEW_RULER
}
object IMouseTargetOverviewRuler {
  
  inline def apply(mouseColumn: Double, `type`: OVERVIEW_RULER): IMouseTargetOverviewRuler = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], element = null, position = null, range = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetOverviewRuler]
  }
  
  extension [Self <: IMouseTargetOverviewRuler](x: Self) {
    
    inline def setType(value: OVERVIEW_RULER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
