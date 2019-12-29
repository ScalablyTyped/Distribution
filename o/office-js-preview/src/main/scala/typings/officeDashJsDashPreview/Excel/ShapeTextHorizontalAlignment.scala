package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeTextHorizontalAlignment extends js.Object

/**
  *
  * Specifies the horizontal alignment for the text frame in a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeTextHorizontalAlignment")
@js.native
object ShapeTextHorizontalAlignment extends js.Object {
  @js.native
  sealed trait center extends ShapeTextHorizontalAlignment
  
  @js.native
  sealed trait distributed extends ShapeTextHorizontalAlignment
  
  @js.native
  sealed trait justify extends ShapeTextHorizontalAlignment
  
  @js.native
  sealed trait justifyLow extends ShapeTextHorizontalAlignment
  
  @js.native
  sealed trait left extends ShapeTextHorizontalAlignment
  
  @js.native
  sealed trait right extends ShapeTextHorizontalAlignment
  
  @js.native
  sealed trait thaiDistributed extends ShapeTextHorizontalAlignment
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextHorizontalAlignment with String] = js.native
  /* "Center" */ @js.native
  object center extends TopLevel[center with String]
  
  /* "Distributed" */ @js.native
  object distributed extends TopLevel[distributed with String]
  
  /* "Justify" */ @js.native
  object justify extends TopLevel[justify with String]
  
  /* "JustifyLow" */ @js.native
  object justifyLow extends TopLevel[justifyLow with String]
  
  /* "Left" */ @js.native
  object left extends TopLevel[left with String]
  
  /* "Right" */ @js.native
  object right extends TopLevel[right with String]
  
  /* "ThaiDistributed" */ @js.native
  object thaiDistributed extends TopLevel[thaiDistributed with String]
  
}

