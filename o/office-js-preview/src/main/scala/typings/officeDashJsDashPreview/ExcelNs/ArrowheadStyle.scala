package typings.officeDashJsDashPreview.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowheadStyle extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ArrowheadStyle")
@js.native
object ArrowheadStyle extends js.Object {
  @js.native
  sealed trait diamond extends ArrowheadStyle
  
  @js.native
  sealed trait none extends ArrowheadStyle
  
  @js.native
  sealed trait open extends ArrowheadStyle
  
  @js.native
  sealed trait oval extends ArrowheadStyle
  
  @js.native
  sealed trait stealth extends ArrowheadStyle
  
  @js.native
  sealed trait triangle extends ArrowheadStyle
  
  /* "Diamond" */ val diamond: typings.officeDashJsDashPreview.ExcelNs.ArrowheadStyle.diamond with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.ExcelNs.ArrowheadStyle.none with String = js.native
  /* "Open" */ val open: typings.officeDashJsDashPreview.ExcelNs.ArrowheadStyle.open with String = js.native
  /* "Oval" */ val oval: typings.officeDashJsDashPreview.ExcelNs.ArrowheadStyle.oval with String = js.native
  /* "Stealth" */ val stealth: typings.officeDashJsDashPreview.ExcelNs.ArrowheadStyle.stealth with String = js.native
  /* "Triangle" */ val triangle: typings.officeDashJsDashPreview.ExcelNs.ArrowheadStyle.triangle with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ArrowheadStyle with String] = js.native
}

