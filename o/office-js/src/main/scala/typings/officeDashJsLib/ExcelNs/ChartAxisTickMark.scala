package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisTickMark extends js.Object

/**
     * [Api set: ExcelApi 1.7]
     */
@JSGlobal("Excel.ChartAxisTickMark")
@js.native
object ChartAxisTickMark extends js.Object {
  @js.native
  sealed trait cross
    extends officeDashJsLib.ExcelNs.ChartAxisTickMark
  
  @js.native
  sealed trait inside
    extends officeDashJsLib.ExcelNs.ChartAxisTickMark
  
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.ChartAxisTickMark
  
  @js.native
  sealed trait outside
    extends officeDashJsLib.ExcelNs.ChartAxisTickMark
  
  /* "Cross" */ val cross: cross with java.lang.String = js.native
  /* "Inside" */ val inside: inside with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Outside" */ val outside: outside with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartAxisTickMark with java.lang.String] = js.native
}

