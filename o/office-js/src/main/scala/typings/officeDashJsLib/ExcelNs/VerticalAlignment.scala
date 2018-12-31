package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  @js.native
  sealed trait bottom
    extends officeDashJsLib.ExcelNs.VerticalAlignment
  
  @js.native
  sealed trait center
    extends officeDashJsLib.ExcelNs.VerticalAlignment
  
  @js.native
  sealed trait distributed
    extends officeDashJsLib.ExcelNs.VerticalAlignment
  
  @js.native
  sealed trait justify
    extends officeDashJsLib.ExcelNs.VerticalAlignment
  
  @js.native
  sealed trait top
    extends officeDashJsLib.ExcelNs.VerticalAlignment
  
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Center" */ val center: center with java.lang.String = js.native
  /* "Distributed" */ val distributed: distributed with java.lang.String = js.native
  /* "Justify" */ val justify: justify with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.VerticalAlignment with java.lang.String] = js.native
}

