package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableViewCol extends StObject {
  
  var classes: js.UndefOr[js.Object] = js.native
  
  var columns: js.Array[_] = js.native
  
  var `object`: js.Object = js.native
  
  def onColumnUpdate(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
}
object MUIDataTableViewCol {
  
  @scala.inline
  def apply(columns: js.Array[_], `object`: js.Object, onColumnUpdate: js.Any => js.Any): MUIDataTableViewCol = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnUpdate = js.Any.fromFunction1(onColumnUpdate))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableViewCol]
  }
  
  @scala.inline
  implicit class MUIDataTableViewColMutableBuilder[Self <: MUIDataTableViewCol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[_]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: js.Any*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setObject(value: js.Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnColumnUpdate(value: js.Any => js.Any): Self = StObject.set(x, "onColumnUpdate", js.Any.fromFunction1(value))
  }
}
