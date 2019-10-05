package typings.officeDashJs.Excel

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
  
  /* "Center" */ val center: typings.officeDashJs.Excel.ShapeTextHorizontalAlignment.center with String = js.native
  /* "Distributed" */ val distributed: typings.officeDashJs.Excel.ShapeTextHorizontalAlignment.distributed with String = js.native
  /* "Justify" */ val justify: typings.officeDashJs.Excel.ShapeTextHorizontalAlignment.justify with String = js.native
  /* "JustifyLow" */ val justifyLow: typings.officeDashJs.Excel.ShapeTextHorizontalAlignment.justifyLow with String = js.native
  /* "Left" */ val left: typings.officeDashJs.Excel.ShapeTextHorizontalAlignment.left with String = js.native
  /* "Right" */ val right: typings.officeDashJs.Excel.ShapeTextHorizontalAlignment.right with String = js.native
  /* "ThaiDistributed" */ val thaiDistributed: typings.officeDashJs.Excel.ShapeTextHorizontalAlignment.thaiDistributed with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextHorizontalAlignment with String] = js.native
}

