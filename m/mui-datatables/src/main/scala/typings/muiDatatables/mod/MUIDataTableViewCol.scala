package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableViewCol extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var columns: js.Array[Any]
  
  var `object`: js.Object
  
  def onColumnUpdate(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Any
}
object MUIDataTableViewCol {
  
  inline def apply(columns: js.Array[Any], `object`: js.Object, onColumnUpdate: Any => Any): MUIDataTableViewCol = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnUpdate = js.Any.fromFunction1(onColumnUpdate))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableViewCol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUIDataTableViewCol] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColumns(value: js.Array[Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: Any*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setObject(value: js.Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOnColumnUpdate(value: Any => Any): Self = StObject.set(x, "onColumnUpdate", js.Any.fromFunction1(value))
  }
}
