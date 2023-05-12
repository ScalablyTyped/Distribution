package typings.postgres.anon

import typings.postgres.mod.Row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /** Transforms incoming and outgoing column names */
  var column: js.UndefOr[(js.Function1[/* column */ String, String]) | From] = js.undefined
  
  /** Transforms entire rows */
  var row: js.UndefOr[(js.Function1[/* row */ Row, Any]) | `1`] = js.undefined
  
  /** Transforms outcoming undefined values */
  var undefined: js.UndefOr[Any] = js.undefined
  
  /** Transforms incoming and outgoing row values */
  var value: js.UndefOr[(js.Function1[/* value */ Any, Any]) | `0`] = js.undefined
}
object Column {
  
  inline def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: (js.Function1[/* column */ String, String]) | From): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnFunction1(value: /* column */ String => String): Self = StObject.set(x, "column", js.Any.fromFunction1(value))
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setRow(value: (js.Function1[/* row */ Row, Any]) | `1`): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowFunction1(value: /* row */ Row => Any): Self = StObject.set(x, "row", js.Any.fromFunction1(value))
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setUndefined(value: Any): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    
    inline def setUndefinedUndefined: Self = StObject.set(x, "undefined", js.undefined)
    
    inline def setValue(value: (js.Function1[/* value */ Any, Any]) | `0`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueFunction1(value: /* value */ Any => Any): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
