package typings
package officeDashJsLib.ExcelNs

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
  sealed trait array
    extends officeDashJsLib.ExcelNs.NamedItemType
  
  @js.native
  sealed trait boolean
    extends officeDashJsLib.ExcelNs.NamedItemType
  
  @js.native
  sealed trait double
    extends officeDashJsLib.ExcelNs.NamedItemType
  
  @js.native
  sealed trait error
    extends officeDashJsLib.ExcelNs.NamedItemType
  
  @js.native
  sealed trait integer
    extends officeDashJsLib.ExcelNs.NamedItemType
  
  @js.native
  sealed trait range
    extends officeDashJsLib.ExcelNs.NamedItemType
  
  @js.native
  sealed trait string
    extends officeDashJsLib.ExcelNs.NamedItemType
  
  /* "Array" */ val array: array with java.lang.String = js.native
  /* "Boolean" */ val boolean: boolean with java.lang.String = js.native
  /* "Double" */ val double: double with java.lang.String = js.native
  /* "Error" */ val error: error with java.lang.String = js.native
  /* "Integer" */ val integer: integer with java.lang.String = js.native
  /* "Range" */ val range: range with java.lang.String = js.native
  /* "String" */ val string: string with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.NamedItemType with java.lang.String] = js.native
}

