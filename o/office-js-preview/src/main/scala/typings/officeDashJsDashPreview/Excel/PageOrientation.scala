package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PageOrientation with String] = js.native
  /* "Landscape" */ @js.native
  object landscape extends TopLevel[landscape with String]
  
  /* "Portrait" */ @js.native
  object portrait extends TopLevel[portrait with String]
  
}

