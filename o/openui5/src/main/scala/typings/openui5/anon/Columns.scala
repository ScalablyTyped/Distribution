package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var columns: int
  
  var rows: int
}
object Columns {
  
  inline def apply(columns: int, rows: int): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: int): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setRows(value: int): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
