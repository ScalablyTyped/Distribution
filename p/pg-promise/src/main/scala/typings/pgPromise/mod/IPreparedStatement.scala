package typings.pgPromise.mod

import typings.pgPromise.pgPromiseStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPreparedStatement
  extends StObject
     with _QueryParam {
  
  var binary: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var rowMode: js.UndefOr[array | Null | Unit] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String | QueryFile] = js.undefined
  
  var values: js.UndefOr[js.Array[Any]] = js.undefined
}
object IPreparedStatement {
  
  inline def apply(): IPreparedStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPreparedStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPreparedStatement] (val x: Self) extends AnyVal {
    
    inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRowMode(value: array | Unit): Self = StObject.set(x, "rowMode", value.asInstanceOf[js.Any])
    
    inline def setRowModeNull: Self = StObject.set(x, "rowMode", null)
    
    inline def setRowModeUndefined: Self = StObject.set(x, "rowMode", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setText(value: String | QueryFile): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
