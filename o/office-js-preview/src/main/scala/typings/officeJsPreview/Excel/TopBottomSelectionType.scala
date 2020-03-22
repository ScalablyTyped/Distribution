package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TopBottomSelectionType extends js.Object

/**
  *
  * A simple enum for Top/Bottom filters to select whether to filter by the top N or bottom N percent, number, or sum of values.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.TopBottomSelectionType")
@js.native
object TopBottomSelectionType extends js.Object {
  /**
    * Filter the top/bottom N number of items as measured by the chosen value.
    *
    */
  @js.native
  sealed trait items extends TopBottomSelectionType
  
  /**
    * Filter the top/bottom N percent of items as measured by the chosen value.
    *
    */
  @js.native
  sealed trait percent extends TopBottomSelectionType
  
  /**
    * Filter the top/bottom N sum as measured by the chosen value.
    *
    */
  @js.native
  sealed trait sum extends TopBottomSelectionType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TopBottomSelectionType with String] = js.native
  /* "Items" */ @js.native
  object items extends TopLevel[items with String]
  
  /* "Percent" */ @js.native
  object percent extends TopLevel[percent with String]
  
  /* "Sum" */ @js.native
  object sum extends TopLevel[sum with String]
  
}

