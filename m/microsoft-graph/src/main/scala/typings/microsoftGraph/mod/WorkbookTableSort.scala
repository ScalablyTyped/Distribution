package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookTableSort
  extends StObject
     with Entity {
  
  // Represents the current conditions used to last sort the table. Read-only.
  var fields: js.UndefOr[NullableOption[js.Array[WorkbookSortField]]] = js.undefined
  
  // Represents whether the casing impacted the last sort of the table. Read-only.
  var matchCase: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents Chinese character ordering method last used to sort the table. The possible values are: PinYin, StrokeCount.
    * Read-only.
    */
  var method: js.UndefOr[String] = js.undefined
}
object WorkbookTableSort {
  
  inline def apply(): WorkbookTableSort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookTableSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookTableSort] (val x: Self) extends AnyVal {
    
    inline def setFields(value: NullableOption[js.Array[WorkbookSortField]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: WorkbookSortField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    inline def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
