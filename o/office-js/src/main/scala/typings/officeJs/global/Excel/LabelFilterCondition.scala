package typings.officeJs.global.Excel

import typings.officeJs.Excel.LabelFilterCondition.equals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum representing all accepted conditions by which a label filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  `PivotFilter.criteria.exclusive` can be set to `true` to invert many of these conditions.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.LabelFilterCondition")
@js.native
object LabelFilterCondition extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.LabelFilterCondition & String] = js.native
  
  /* "BeginsWith" */ val beginsWith: typings.officeJs.Excel.LabelFilterCondition.beginsWith & String = js.native
  
  /* "Between" */ val between: typings.officeJs.Excel.LabelFilterCondition.between & String = js.native
  
  /* "Contains" */ val contains: typings.officeJs.Excel.LabelFilterCondition.contains & String = js.native
  
  /* "EndsWith" */ val endsWith: typings.officeJs.Excel.LabelFilterCondition.endsWith & String = js.native
  
  /* "Equals" */ @JSName("equals")
  val equals_ : equals & String = js.native
  
  /* "GreaterThan" */ val greaterThan: typings.officeJs.Excel.LabelFilterCondition.greaterThan & String = js.native
  
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typings.officeJs.Excel.LabelFilterCondition.greaterThanOrEqualTo & String = js.native
  
  /* "LessThan" */ val lessThan: typings.officeJs.Excel.LabelFilterCondition.lessThan & String = js.native
  
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typings.officeJs.Excel.LabelFilterCondition.lessThanOrEqualTo & String = js.native
  
  /* "Unknown" */ val unknown: typings.officeJs.Excel.LabelFilterCondition.unknown & String = js.native
}
