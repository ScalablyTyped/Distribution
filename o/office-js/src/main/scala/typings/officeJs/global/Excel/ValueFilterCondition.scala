package typings.officeJs.global.Excel

import typings.officeJs.Excel.ValueFilterCondition.equals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Enum representing all accepted conditions by which a value filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  `PivotFilter.exclusive` can be set to true to invert many of these conditions.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.ValueFilterCondition")
@js.native
object ValueFilterCondition extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ValueFilterCondition & String] = js.native
  
  /* "Between" */ val between: typings.officeJs.Excel.ValueFilterCondition.between & String = js.native
  
  /* "BottomN" */ val bottomN: typings.officeJs.Excel.ValueFilterCondition.bottomN & String = js.native
  
  /* "Equals" */ @JSName("equals")
  val equals_ : equals & String = js.native
  
  /* "GreaterThan" */ val greaterThan: typings.officeJs.Excel.ValueFilterCondition.greaterThan & String = js.native
  
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typings.officeJs.Excel.ValueFilterCondition.greaterThanOrEqualTo & String = js.native
  
  /* "LessThan" */ val lessThan: typings.officeJs.Excel.ValueFilterCondition.lessThan & String = js.native
  
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typings.officeJs.Excel.ValueFilterCondition.lessThanOrEqualTo & String = js.native
  
  /* "TopN" */ val topN: typings.officeJs.Excel.ValueFilterCondition.topN & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJs.Excel.ValueFilterCondition.unknown & String = js.native
}
