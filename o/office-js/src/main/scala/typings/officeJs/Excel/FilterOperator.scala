package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterOperator extends StObject
/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.FilterOperator")
@js.native
object FilterOperator extends StObject {
  
  @js.native
  sealed trait and
    extends StObject
       with FilterOperator
  
  @js.native
  sealed trait or
    extends StObject
       with FilterOperator
}
