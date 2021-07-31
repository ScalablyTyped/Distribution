package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalCellValueOperator extends StObject
/**
  *
  * Represents the operator of the text conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalCellValueOperator")
@js.native
object ConditionalCellValueOperator extends StObject {
  
  @js.native
  sealed trait between
    extends StObject
       with ConditionalCellValueOperator
  
  @js.native
  sealed trait equalTo
    extends StObject
       with ConditionalCellValueOperator
  
  @js.native
  sealed trait greaterThan
    extends StObject
       with ConditionalCellValueOperator
  
  @js.native
  sealed trait greaterThanOrEqual
    extends StObject
       with ConditionalCellValueOperator
  
  @js.native
  sealed trait invalid
    extends StObject
       with ConditionalCellValueOperator
  
  @js.native
  sealed trait lessThan
    extends StObject
       with ConditionalCellValueOperator
  
  @js.native
  sealed trait lessThanOrEqual
    extends StObject
       with ConditionalCellValueOperator
  
  @js.native
  sealed trait notBetween
    extends StObject
       with ConditionalCellValueOperator
  
  @js.native
  sealed trait notEqualTo
    extends StObject
       with ConditionalCellValueOperator
}
