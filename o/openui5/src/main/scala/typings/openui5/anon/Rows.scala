package typings.openui5.anon

import typings.openui5.sapMPlanningCalendarRowMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rows extends StObject {
  
  /**
    * Array of rows whose selection has changed.
    */
  var rows: js.UndefOr[js.Array[default]] = js.undefined
}
object Rows {
  
  inline def apply(): Rows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rows]
  }
  
  extension [Self <: Rows](x: Self) {
    
    inline def setRows(value: js.Array[default]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: default*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
