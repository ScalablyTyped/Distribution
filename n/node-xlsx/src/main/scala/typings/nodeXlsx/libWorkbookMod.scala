package typings.nodeXlsx

import org.scalablytyped.runtime.StringDictionary
import typings.xlsx.mod.WorkSheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWorkbookMod {
  
  @JSImport("node-xlsx/lib/workbook", "WorkBook")
  @js.native
  open class WorkBook ()
    extends StObject
       with typings.xlsx.mod.WorkBook {
    
    /** Ordered list of the sheet names in the workbook */
    /* CompleteClass */
    var SheetNames: js.Array[String] = js.native
    
    /**
      * A dictionary of the worksheets in the workbook.
      * Use SheetNames to reference these.
      */
    /* CompleteClass */
    var Sheets: StringDictionary[WorkSheet] = js.native
  }
}
