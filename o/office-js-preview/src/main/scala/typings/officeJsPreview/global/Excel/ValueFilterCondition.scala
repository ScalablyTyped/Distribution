package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.Excel.ValueFilterCondition.equals
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
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ValueFilterCondition & String] = js.native
  
  /* "Between" */ val between: typings.officeJsPreview.Excel.ValueFilterCondition.between & String = js.native
  
  /* "BottomN" */ val bottomN: typings.officeJsPreview.Excel.ValueFilterCondition.bottomN & String = js.native
  
  /* "Equals" */ @JSName("equals")
  val equals_ : equals & String = js.native
  
  /* "GreaterThan" */ val greaterThan: typings.officeJsPreview.Excel.ValueFilterCondition.greaterThan & String = js.native
  
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typings.officeJsPreview.Excel.ValueFilterCondition.greaterThanOrEqualTo & String = js.native
  
  /* "LessThan" */ val lessThan: typings.officeJsPreview.Excel.ValueFilterCondition.lessThan & String = js.native
  
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typings.officeJsPreview.Excel.ValueFilterCondition.lessThanOrEqualTo & String = js.native
  
  /* "TopN" */ val topN: typings.officeJsPreview.Excel.ValueFilterCondition.topN & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJsPreview.Excel.ValueFilterCondition.unknown & String = js.native
}
