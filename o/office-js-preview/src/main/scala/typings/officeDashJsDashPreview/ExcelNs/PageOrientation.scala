package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageOrientation extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.PageOrientation")
@js.native
object PageOrientation extends js.Object {
  @js.native
  sealed trait landscape extends PageOrientation
  
  @js.native
  sealed trait portrait extends PageOrientation
  
  /* "Landscape" */ val landscape: typings.officeDashJsDashPreview.ExcelNs.PageOrientation.landscape with String = js.native
  /* "Portrait" */ val portrait: typings.officeDashJsDashPreview.ExcelNs.PageOrientation.portrait with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PageOrientation with String] = js.native
}

