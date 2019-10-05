package typings.officeDashJs.Excel

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
  
  /* "DiagonalDown" */ val diagonalDown: typings.officeDashJs.Excel.BorderIndex.diagonalDown with String = js.native
  /* "DiagonalUp" */ val diagonalUp: typings.officeDashJs.Excel.BorderIndex.diagonalUp with String = js.native
  /* "EdgeBottom" */ val edgeBottom: typings.officeDashJs.Excel.BorderIndex.edgeBottom with String = js.native
  /* "EdgeLeft" */ val edgeLeft: typings.officeDashJs.Excel.BorderIndex.edgeLeft with String = js.native
  /* "EdgeRight" */ val edgeRight: typings.officeDashJs.Excel.BorderIndex.edgeRight with String = js.native
  /* "EdgeTop" */ val edgeTop: typings.officeDashJs.Excel.BorderIndex.edgeTop with String = js.native
  /* "InsideHorizontal" */ val insideHorizontal: typings.officeDashJs.Excel.BorderIndex.insideHorizontal with String = js.native
  /* "InsideVertical" */ val insideVertical: typings.officeDashJs.Excel.BorderIndex.insideVertical with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderIndex with String] = js.native
}

