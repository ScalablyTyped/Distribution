package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterOn extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.FilterOn")
@js.native
object FilterOn extends js.Object {
  @js.native
  sealed trait bottomItems extends FilterOn
  
  @js.native
  sealed trait bottomPercent extends FilterOn
  
  @js.native
  sealed trait cellColor extends FilterOn
  
  @js.native
  sealed trait custom extends FilterOn
  
  @js.native
  sealed trait dynamic extends FilterOn
  
  @js.native
  sealed trait fontColor extends FilterOn
  
  @js.native
  sealed trait icon extends FilterOn
  
  @js.native
  sealed trait topItems extends FilterOn
  
  @js.native
  sealed trait topPercent extends FilterOn
  
  @js.native
  sealed trait values extends FilterOn
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterOn with String] = js.native
  /* "BottomItems" */ @js.native
  object bottomItems extends TopLevel[bottomItems with String]
  
  /* "BottomPercent" */ @js.native
  object bottomPercent extends TopLevel[bottomPercent with String]
  
  /* "CellColor" */ @js.native
  object cellColor extends TopLevel[cellColor with String]
  
  /* "Custom" */ @js.native
  object custom extends TopLevel[custom with String]
  
  /* "Dynamic" */ @js.native
  object dynamic extends TopLevel[dynamic with String]
  
  /* "FontColor" */ @js.native
  object fontColor extends TopLevel[fontColor with String]
  
  /* "Icon" */ @js.native
  object icon extends TopLevel[icon with String]
  
  /* "TopItems" */ @js.native
  object topItems extends TopLevel[topItems with String]
  
  /* "TopPercent" */ @js.native
  object topPercent extends TopLevel[topPercent with String]
  
  /* "Values" */ @js.native
  object values extends TopLevel[values with String]
  
}

