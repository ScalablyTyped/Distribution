package typings.nodeObjectHash

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-object-hash/dist/stringifiers", JSImport.Namespace)
@js.native
object stringifiersMod extends js.Object {
  @JSName("_array")
  def array(obj: js.Array[_]): String = js.native
  @JSName("_arraySort")
  def arraySort(obj: js.Array[_]): String = js.native
  @JSName("_boolean")
  def boolean(obj: Boolean): String = js.native
  @JSName("_booleanCoerce")
  def booleanCoerce(obj: Boolean): String = js.native
  @JSName("_date")
  def date(obj: Date): String = js.native
  @JSName("_dateCoerce")
  def dateCoerce(obj: Date): String = js.native
  @JSName("_function")
  def function(obj: js.Function): String = js.native
  @JSName("_functionCoerce")
  def functionCoerce(obj: js.Function): String = js.native
  @JSName("_functionTrim")
  def functionTrim(obj: js.Function): String = js.native
  @JSName("_functionTrimCoerce")
  def functionTrimCoerce(obj: js.Function): String = js.native
  @JSName("_map")
  def map(obj: Map[_, _]): String = js.native
  @JSName("_mapSort")
  def mapSort(obj: Map[_, _]): String = js.native
  @JSName("_null")
  def `null`(): String = js.native
  @JSName("_nullCoerce")
  def nullCoerce(): String = js.native
  @JSName("_number")
  def number(obj: Double): String = js.native
  @JSName("_numberCoerce")
  def numberCoerce(obj: Double): String = js.native
  @JSName("_object")
  def `object`(obj: StringDictionary[js.Any]): String = js.native
  @JSName("_objectSort")
  def objectSort(obj: StringDictionary[js.Any]): String = js.native
  @JSName("_set")
  def set(obj: Set[_]): String = js.native
  @JSName("_setCoerce")
  def setCoerce(obj: Set[_]): String = js.native
  @JSName("_setSort")
  def setSort(obj: Set[_]): String = js.native
  @JSName("_setSortCoerce")
  def setSortCoerce(obj: Set[_]): String = js.native
  @JSName("_string")
  def string(obj: String): String = js.native
  @JSName("_stringCoerce")
  def stringCoerce(obj: String): String = js.native
  @JSName("_stringTrim")
  def stringTrim(obj: String): String = js.native
  @JSName("_stringTrimCoerce")
  def stringTrimCoerce(obj: String): String = js.native
  @JSName("_symbol")
  def symbol(obj: js.Symbol): String = js.native
  @JSName("_symbolCoerce")
  def symbolCoerce(): String = js.native
  @JSName("_undefined")
  def undefined(): String = js.native
  @JSName("_undefinedCoerce")
  def undefinedCoerce(): String = js.native
  @js.native
  object PREFIX extends js.Object {
    var array: String = js.native
    var boolean: String = js.native
    var date: String = js.native
    var function: String = js.native
    var map: String = js.native
    var `null`: String = js.native
    var number: String = js.native
    var set: String = js.native
    var string: String = js.native
    var symbol: String = js.native
    var undefined: String = js.native
  }
  
  type Stringifiers = StringDictionary[js.Function1[/* obj */ js.Any, String]]
}

