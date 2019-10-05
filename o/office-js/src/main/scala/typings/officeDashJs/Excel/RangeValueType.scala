package typings.officeDashJs.Excel

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
  sealed trait boolean extends RangeValueType
  
  @js.native
  sealed trait double extends RangeValueType
  
  @js.native
  sealed trait empty extends RangeValueType
  
  @js.native
  sealed trait error extends RangeValueType
  
  @js.native
  sealed trait integer extends RangeValueType
  
  @js.native
  sealed trait richValue extends RangeValueType
  
  @js.native
  sealed trait string extends RangeValueType
  
  @js.native
  sealed trait unknown extends RangeValueType
  
  /* "Boolean" */ val boolean: typings.officeDashJs.Excel.RangeValueType.boolean with String = js.native
  /* "Double" */ val double: typings.officeDashJs.Excel.RangeValueType.double with String = js.native
  /* "Empty" */ val empty: typings.officeDashJs.Excel.RangeValueType.empty with String = js.native
  /* "Error" */ val error: typings.officeDashJs.Excel.RangeValueType.error with String = js.native
  /* "Integer" */ val integer: typings.officeDashJs.Excel.RangeValueType.integer with String = js.native
  /* "RichValue" */ val richValue: typings.officeDashJs.Excel.RangeValueType.richValue with String = js.native
  /* "String" */ val string: typings.officeDashJs.Excel.RangeValueType.string with String = js.native
  /* "Unknown" */ val unknown: typings.officeDashJs.Excel.RangeValueType.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RangeValueType with String] = js.native
}

