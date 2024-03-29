package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookApplication
  extends StObject
     with Entity {
  
  // Returns the calculation mode used in the workbook. Possible values are: Automatic, AutomaticExceptTables, Manual.
  var calculationMode: js.UndefOr[String] = js.undefined
}
object WorkbookApplication {
  
  inline def apply(): WorkbookApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookApplication] (val x: Self) extends AnyVal {
    
    inline def setCalculationMode(value: String): Self = StObject.set(x, "calculationMode", value.asInstanceOf[js.Any])
    
    inline def setCalculationModeUndefined: Self = StObject.set(x, "calculationMode", js.undefined)
  }
}
