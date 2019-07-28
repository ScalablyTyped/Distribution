package typings.officeDashJsDashPreview.ExcelNs

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
  
  /* "Center" */ val center: typings.officeDashJsDashPreview.ExcelNs.ShapeTextHorizontalAlignment.center with String = js.native
  /* "Distributed" */ val distributed: typings.officeDashJsDashPreview.ExcelNs.ShapeTextHorizontalAlignment.distributed with String = js.native
  /* "Justify" */ val justify: typings.officeDashJsDashPreview.ExcelNs.ShapeTextHorizontalAlignment.justify with String = js.native
  /* "JustifyLow" */ val justifyLow: typings.officeDashJsDashPreview.ExcelNs.ShapeTextHorizontalAlignment.justifyLow with String = js.native
  /* "Left" */ val left: typings.officeDashJsDashPreview.ExcelNs.ShapeTextHorizontalAlignment.left with String = js.native
  /* "Right" */ val right: typings.officeDashJsDashPreview.ExcelNs.ShapeTextHorizontalAlignment.right with String = js.native
  /* "ThaiDistributed" */ val thaiDistributed: typings.officeDashJsDashPreview.ExcelNs.ShapeTextHorizontalAlignment.thaiDistributed with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeTextHorizontalAlignment with String] = js.native
}

