package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortDataOption extends StObject
/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.SortDataOption")
@js.native
object SortDataOption extends StObject {
  
  @js.native
  sealed trait normal
    extends StObject
       with SortDataOption
  
  @js.native
  sealed trait textAsNumber
    extends StObject
       with SortDataOption
}
