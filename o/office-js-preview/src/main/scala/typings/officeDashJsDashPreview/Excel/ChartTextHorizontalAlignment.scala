package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartTextHorizontalAlignment extends js.Object

/**
  *
  * Represents the horizontal alignment for the specified object.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTextHorizontalAlignment")
@js.native
object ChartTextHorizontalAlignment extends js.Object {
  @js.native
  sealed trait center extends ChartTextHorizontalAlignment
  
  @js.native
  sealed trait distributed extends ChartTextHorizontalAlignment
  
  @js.native
  sealed trait justify extends ChartTextHorizontalAlignment
  
  @js.native
  sealed trait left extends ChartTextHorizontalAlignment
  
  @js.native
  sealed trait right extends ChartTextHorizontalAlignment
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartTextHorizontalAlignment with String] = js.native
  /* "Center" */ @js.native
  object center extends TopLevel[center with String]
  
  /* "Distributed" */ @js.native
  object distributed extends TopLevel[distributed with String]
  
  /* "Justify" */ @js.native
  object justify extends TopLevel[justify with String]
  
  /* "Left" */ @js.native
  object left extends TopLevel[left with String]
  
  /* "Right" */ @js.native
  object right extends TopLevel[right with String]
  
}

