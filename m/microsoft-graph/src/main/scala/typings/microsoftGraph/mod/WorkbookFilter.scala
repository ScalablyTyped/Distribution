package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookFilter
  extends StObject
     with Entity {
  
  // The currently applied filter on the given column. Read-only.
  var criteria: js.UndefOr[NullableOption[WorkbookFilterCriteria]] = js.undefined
}
object WorkbookFilter {
  
  inline def apply(): WorkbookFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookFilter] (val x: Self) extends AnyVal {
    
    inline def setCriteria(value: NullableOption[WorkbookFilterCriteria]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaNull: Self = StObject.set(x, "criteria", null)
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
  }
}
