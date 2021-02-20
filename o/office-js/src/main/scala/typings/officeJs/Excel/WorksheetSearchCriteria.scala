package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the worksheet search criteria to be used.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait WorksheetSearchCriteria extends StObject {
  
  /**
    *
    * Specifies if the match needs to be complete or partial.
    A complete match matches the entire contents of the cell. A partial match matches a substring within the content of the cell (e.g., `cat` partially matches `caterpillar` and `scatter`).
    Default is false (partial).
    *
    * [Api set: ExcelApi 1.9]
    */
  var completeMatch: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the match is case sensitive. Default is false (insensitive).
    *
    * [Api set: ExcelApi 1.9]
    */
  var matchCase: js.UndefOr[Boolean] = js.native
}
object WorksheetSearchCriteria {
  
  @scala.inline
  def apply(): WorksheetSearchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetSearchCriteria]
  }
  
  @scala.inline
  implicit class WorksheetSearchCriteriaMutableBuilder[Self <: WorksheetSearchCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleteMatch(value: Boolean): Self = StObject.set(x, "completeMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteMatchUndefined: Self = StObject.set(x, "completeMatch", js.undefined)
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
  }
}
