package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait diagonalDown
    extends officeDashJsDashPreviewLib.ExcelNs.BorderIndex
  
  @js.native
  sealed trait diagonalUp
    extends officeDashJsDashPreviewLib.ExcelNs.BorderIndex
  
  @js.native
  sealed trait edgeBottom
    extends officeDashJsDashPreviewLib.ExcelNs.BorderIndex
  
  @js.native
  sealed trait edgeLeft
    extends officeDashJsDashPreviewLib.ExcelNs.BorderIndex
  
  @js.native
  sealed trait edgeRight
    extends officeDashJsDashPreviewLib.ExcelNs.BorderIndex
  
  @js.native
  sealed trait edgeTop
    extends officeDashJsDashPreviewLib.ExcelNs.BorderIndex
  
  @js.native
  sealed trait insideHorizontal
    extends officeDashJsDashPreviewLib.ExcelNs.BorderIndex
  
  @js.native
  sealed trait insideVertical
    extends officeDashJsDashPreviewLib.ExcelNs.BorderIndex
  
  /* "DiagonalDown" */ val diagonalDown: diagonalDown with java.lang.String = js.native
  /* "DiagonalUp" */ val diagonalUp: diagonalUp with java.lang.String = js.native
  /* "EdgeBottom" */ val edgeBottom: edgeBottom with java.lang.String = js.native
  /* "EdgeLeft" */ val edgeLeft: edgeLeft with java.lang.String = js.native
  /* "EdgeRight" */ val edgeRight: edgeRight with java.lang.String = js.native
  /* "EdgeTop" */ val edgeTop: edgeTop with java.lang.String = js.native
  /* "InsideHorizontal" */ val insideHorizontal: insideHorizontal with java.lang.String = js.native
  /* "InsideVertical" */ val insideVertical: insideVertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.BorderIndex with java.lang.String] = js.native
}

