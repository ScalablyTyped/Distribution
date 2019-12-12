package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJsDashPreview.Excel.ArrowheadStyle.diamond
import typings.officeDashJsDashPreview.Excel.ArrowheadStyle.none
import typings.officeDashJsDashPreview.Excel.ArrowheadStyle.open
import typings.officeDashJsDashPreview.Excel.ArrowheadStyle.oval
import typings.officeDashJsDashPreview.Excel.ArrowheadStyle.stealth
import typings.officeDashJsDashPreview.Excel.ArrowheadStyle.triangle
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ArrowheadStyle with String] = js.native
  /* "Diamond" */ @js.native
  object diamond extends TopLevel[diamond with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "Open" */ @js.native
  object open extends TopLevel[open with String]
  
  /* "Oval" */ @js.native
  object oval extends TopLevel[oval with String]
  
  /* "Stealth" */ @js.native
  object stealth extends TopLevel[stealth with String]
  
  /* "Triangle" */ @js.native
  object triangle extends TopLevel[triangle with String]
  
}

