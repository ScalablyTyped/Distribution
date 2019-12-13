package typings.nodeDashObjectDashHash

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-object-hash/dist/stringifiers", JSImport.Namespace)
@js.native
object distStringifiersMod extends js.Object {
  def _array(obj: js.Array[_]): String = js.native
  def _arraySort(obj: js.Array[_]): String = js.native
  def _boolean(obj: Boolean): String = js.native
  def _booleanCoerce(obj: Boolean): String = js.native
  def _date(obj: Date): String = js.native
  def _dateCoerce(obj: Date): String = js.native
  def _function(obj: js.Function): String = js.native
  def _functionCoerce(obj: js.Function): String = js.native
  def _functionTrim(obj: js.Function): String = js.native
  def _functionTrimCoerce(obj: js.Function): String = js.native
  def _map(obj: Map[_, _]): String = js.native
  def _mapSort(obj: Map[_, _]): String = js.native
  def _null(): String = js.native
  def _nullCoerce(): String = js.native
  def _number(obj: Double): String = js.native
  def _numberCoerce(obj: Double): String = js.native
  def _object(obj: StringDictionary[js.Any]): String = js.native
  def _objectSort(obj: StringDictionary[js.Any]): String = js.native
  def _set(obj: Set[_]): String = js.native
  def _setCoerce(obj: Set[_]): String = js.native
  def _setSort(obj: Set[_]): String = js.native
  def _setSortCoerce(obj: Set[_]): String = js.native
  def _string(obj: String): String = js.native
  def _stringCoerce(obj: String): String = js.native
  def _stringTrim(obj: String): String = js.native
  def _stringTrimCoerce(obj: String): String = js.native
  def _symbol(obj: js.Symbol): String = js.native
  def _symbolCoerce(): String = js.native
  def _undefined(): String = js.native
  def _undefinedCoerce(): String = js.native
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

