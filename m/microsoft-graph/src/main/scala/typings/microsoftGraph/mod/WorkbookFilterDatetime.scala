package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookFilterDatetime extends StObject {
  
  var date: js.UndefOr[NullableOption[String]] = js.undefined
  
  var specificity: js.UndefOr[String] = js.undefined
}
object WorkbookFilterDatetime {
  
  @scala.inline
  def apply(): WorkbookFilterDatetime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFilterDatetime]
  }
  
  @scala.inline
  implicit class WorkbookFilterDatetimeMutableBuilder[Self <: WorkbookFilterDatetime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: NullableOption[String]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateNull: Self = StObject.set(x, "date", null)
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setSpecificity(value: String): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecificityUndefined: Self = StObject.set(x, "specificity", js.undefined)
  }
}
