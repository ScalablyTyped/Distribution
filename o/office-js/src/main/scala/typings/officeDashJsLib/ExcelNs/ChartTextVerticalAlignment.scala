package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartTextVerticalAlignment extends js.Object

/**
  *
  * Represents the vertical alignment for the specified object.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTextVerticalAlignment")
@js.native
object ChartTextVerticalAlignment extends js.Object {
  @js.native
  sealed trait bottom
    extends officeDashJsLib.ExcelNs.ChartTextVerticalAlignment
  
  @js.native
  sealed trait center
    extends officeDashJsLib.ExcelNs.ChartTextVerticalAlignment
  
  @js.native
  sealed trait distributed
    extends officeDashJsLib.ExcelNs.ChartTextVerticalAlignment
  
  @js.native
  sealed trait justify
    extends officeDashJsLib.ExcelNs.ChartTextVerticalAlignment
  
  @js.native
  sealed trait top
    extends officeDashJsLib.ExcelNs.ChartTextVerticalAlignment
  
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Center" */ val center: center with java.lang.String = js.native
  /* "Distributed" */ val distributed: distributed with java.lang.String = js.native
  /* "Justify" */ val justify: justify with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartTextVerticalAlignment with java.lang.String] = js.native
}

