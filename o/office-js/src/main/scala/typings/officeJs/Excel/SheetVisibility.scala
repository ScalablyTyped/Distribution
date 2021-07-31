package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SheetVisibility extends StObject
/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.SheetVisibility")
@js.native
object SheetVisibility extends StObject {
  
  @js.native
  sealed trait hidden
    extends StObject
       with SheetVisibility
  
  @js.native
  sealed trait veryHidden
    extends StObject
       with SheetVisibility
  
  @js.native
  sealed trait visible
    extends StObject
       with SheetVisibility
}
