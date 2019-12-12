package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderIndex.edgeBottom
import typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderIndex.edgeLeft
import typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderIndex.edgeRight
import typings.officeDashJsDashPreview.Excel.ConditionalRangeBorderIndex.edgeTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalRangeBorderIndex extends js.Object

/**
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalRangeBorderIndex")
@js.native
object ConditionalRangeBorderIndex extends js.Object {
  @js.native
  sealed trait edgeBottom extends ConditionalRangeBorderIndex
  
  @js.native
  sealed trait edgeLeft extends ConditionalRangeBorderIndex
  
  @js.native
  sealed trait edgeRight extends ConditionalRangeBorderIndex
  
  @js.native
  sealed trait edgeTop extends ConditionalRangeBorderIndex
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalRangeBorderIndex with String] = js.native
  /* "EdgeBottom" */ @js.native
  object edgeBottom extends TopLevel[edgeBottom with String]
  
  /* "EdgeLeft" */ @js.native
  object edgeLeft extends TopLevel[edgeLeft with String]
  
  /* "EdgeRight" */ @js.native
  object edgeRight extends TopLevel[edgeRight with String]
  
  /* "EdgeTop" */ @js.native
  object edgeTop extends TopLevel[edgeTop with String]
  
}

