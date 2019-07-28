package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NamedItemType extends js.Object

/**
  * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
  */
@JSGlobal("Excel.NamedItemType")
@js.native
object NamedItemType extends js.Object {
  @js.native
  sealed trait array extends NamedItemType
  
  @js.native
  sealed trait boolean extends NamedItemType
  
  @js.native
  sealed trait double extends NamedItemType
  
  @js.native
  sealed trait error extends NamedItemType
  
  @js.native
  sealed trait integer extends NamedItemType
  
  @js.native
  sealed trait range extends NamedItemType
  
  @js.native
  sealed trait string extends NamedItemType
  
  /* "Array" */ val array: typings.officeDashJs.ExcelNs.NamedItemType.array with String = js.native
  /* "Boolean" */ val boolean: typings.officeDashJs.ExcelNs.NamedItemType.boolean with String = js.native
  /* "Double" */ val double: typings.officeDashJs.ExcelNs.NamedItemType.double with String = js.native
  /* "Error" */ val error: typings.officeDashJs.ExcelNs.NamedItemType.error with String = js.native
  /* "Integer" */ val integer: typings.officeDashJs.ExcelNs.NamedItemType.integer with String = js.native
  /* "Range" */ val range: typings.officeDashJs.ExcelNs.NamedItemType.range with String = js.native
  /* "String" */ val string: typings.officeDashJs.ExcelNs.NamedItemType.string with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NamedItemType with String] = js.native
}

