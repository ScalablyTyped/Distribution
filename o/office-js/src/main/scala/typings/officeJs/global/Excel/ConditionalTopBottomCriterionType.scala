package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the criteria for the above/below average conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalTopBottomCriterionType")
@js.native
object ConditionalTopBottomCriterionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ConditionalTopBottomCriterionType & String] = js.native
  
  /* "BottomItems" */ val bottomItems: typings.officeJs.Excel.ConditionalTopBottomCriterionType.bottomItems & String = js.native
  
  /* "BottomPercent" */ val bottomPercent: typings.officeJs.Excel.ConditionalTopBottomCriterionType.bottomPercent & String = js.native
  
  /* "Invalid" */ val invalid: typings.officeJs.Excel.ConditionalTopBottomCriterionType.invalid & String = js.native
  
  /* "TopItems" */ val topItems: typings.officeJs.Excel.ConditionalTopBottomCriterionType.topItems & String = js.native
  
  /* "TopPercent" */ val topPercent: typings.officeJs.Excel.ConditionalTopBottomCriterionType.topPercent & String = js.native
}
