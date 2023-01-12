package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookFilterDatetime extends StObject {
  
  var date: js.UndefOr[NullableOption[String]] = js.undefined
  
  var specificity: js.UndefOr[String] = js.undefined
}
object WorkbookFilterDatetime {
  
  inline def apply(): WorkbookFilterDatetime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFilterDatetime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookFilterDatetime] (val x: Self) extends AnyVal {
    
    inline def setDate(value: NullableOption[String]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateNull: Self = StObject.set(x, "date", null)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setSpecificity(value: String): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
    
    inline def setSpecificityUndefined: Self = StObject.set(x, "specificity", js.undefined)
  }
}
