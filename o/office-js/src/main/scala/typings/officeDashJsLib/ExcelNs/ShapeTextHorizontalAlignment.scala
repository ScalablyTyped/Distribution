package typings
package officeDashJsLib.ExcelNs

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
  sealed trait center
    extends officeDashJsLib.ExcelNs.ShapeTextHorizontalAlignment
  
  @js.native
  sealed trait distributed
    extends officeDashJsLib.ExcelNs.ShapeTextHorizontalAlignment
  
  @js.native
  sealed trait justify
    extends officeDashJsLib.ExcelNs.ShapeTextHorizontalAlignment
  
  @js.native
  sealed trait justifyLow
    extends officeDashJsLib.ExcelNs.ShapeTextHorizontalAlignment
  
  @js.native
  sealed trait left
    extends officeDashJsLib.ExcelNs.ShapeTextHorizontalAlignment
  
  @js.native
  sealed trait right
    extends officeDashJsLib.ExcelNs.ShapeTextHorizontalAlignment
  
  @js.native
  sealed trait thaiDistributed
    extends officeDashJsLib.ExcelNs.ShapeTextHorizontalAlignment
  
  /* "Center" */ val center: center with java.lang.String = js.native
  /* "Distributed" */ val distributed: distributed with java.lang.String = js.native
  /* "Justify" */ val justify: justify with java.lang.String = js.native
  /* "JustifyLow" */ val justifyLow: justifyLow with java.lang.String = js.native
  /* "Left" */ val left: left with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  /* "ThaiDistributed" */ val thaiDistributed: thaiDistributed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ShapeTextHorizontalAlignment with java.lang.String] = js.native
}

