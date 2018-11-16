package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangeValueType extends js.Object

/**
     * [Api set: ExcelApi 1.1 for Unknown, Empty, String, Integer, Double, Boolean, Error. 1.7 for RichValue]
     */
@JSGlobal("Excel.RangeValueType")
@js.native
object RangeValueType extends js.Object {
  @js.native
  sealed trait boolean
    extends officeDashJsLib.ExcelNs.RangeValueType
  
  @js.native
  sealed trait double
    extends officeDashJsLib.ExcelNs.RangeValueType
  
  @js.native
  sealed trait empty
    extends officeDashJsLib.ExcelNs.RangeValueType
  
  @js.native
  sealed trait error
    extends officeDashJsLib.ExcelNs.RangeValueType
  
  @js.native
  sealed trait integer
    extends officeDashJsLib.ExcelNs.RangeValueType
  
  @js.native
  sealed trait richValue
    extends officeDashJsLib.ExcelNs.RangeValueType
  
  @js.native
  sealed trait string
    extends officeDashJsLib.ExcelNs.RangeValueType
  
  @js.native
  sealed trait unknown
    extends officeDashJsLib.ExcelNs.RangeValueType
  
  /* "Boolean" */ val boolean: boolean with java.lang.String = js.native
  /* "Double" */ val double: double with java.lang.String = js.native
  /* "Empty" */ val empty: empty with java.lang.String = js.native
  /* "Error" */ val error: error with java.lang.String = js.native
  /* "Integer" */ val integer: integer with java.lang.String = js.native
  /* "RichValue" */ val richValue: richValue with java.lang.String = js.native
  /* "String" */ val string: string with java.lang.String = js.native
  /* "Unknown" */ val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.RangeValueType with java.lang.String] = js.native
}

