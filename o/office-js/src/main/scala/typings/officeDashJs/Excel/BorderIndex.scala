package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.BorderIndex.diagonalDown
import typings.officeDashJs.Excel.BorderIndex.diagonalUp
import typings.officeDashJs.Excel.BorderIndex.edgeBottom
import typings.officeDashJs.Excel.BorderIndex.edgeLeft
import typings.officeDashJs.Excel.BorderIndex.edgeRight
import typings.officeDashJs.Excel.BorderIndex.edgeTop
import typings.officeDashJs.Excel.BorderIndex.insideHorizontal
import typings.officeDashJs.Excel.BorderIndex.insideVertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderIndex extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BorderIndex")
@js.native
object BorderIndex extends js.Object {
  @js.native
  sealed trait diagonalDown extends BorderIndex
  
  @js.native
  sealed trait diagonalUp extends BorderIndex
  
  @js.native
  sealed trait edgeBottom extends BorderIndex
  
  @js.native
  sealed trait edgeLeft extends BorderIndex
  
  @js.native
  sealed trait edgeRight extends BorderIndex
  
  @js.native
  sealed trait edgeTop extends BorderIndex
  
  @js.native
  sealed trait insideHorizontal extends BorderIndex
  
  @js.native
  sealed trait insideVertical extends BorderIndex
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderIndex with String] = js.native
  /* "DiagonalDown" */ @js.native
  object diagonalDown extends TopLevel[diagonalDown with String]
  
  /* "DiagonalUp" */ @js.native
  object diagonalUp extends TopLevel[diagonalUp with String]
  
  /* "EdgeBottom" */ @js.native
  object edgeBottom extends TopLevel[edgeBottom with String]
  
  /* "EdgeLeft" */ @js.native
  object edgeLeft extends TopLevel[edgeLeft with String]
  
  /* "EdgeRight" */ @js.native
  object edgeRight extends TopLevel[edgeRight with String]
  
  /* "EdgeTop" */ @js.native
  object edgeTop extends TopLevel[edgeTop with String]
  
  /* "InsideHorizontal" */ @js.native
  object insideHorizontal extends TopLevel[insideHorizontal with String]
  
  /* "InsideVertical" */ @js.native
  object insideVertical extends TopLevel[insideVertical with String]
  
}

