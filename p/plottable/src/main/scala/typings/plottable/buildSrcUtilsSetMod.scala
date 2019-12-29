package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/set", JSImport.Namespace)
@js.native
object buildSrcUtilsSetMod extends js.Object {
  @js.native
  class Set[T] () extends js.Object {
    var _es6Set: js.Any = js.native
    var _values: js.Any = js.native
    var size: Double = js.native
    def add(value: T): this.type = js.native
    def delete(value: T): Boolean = js.native
    def forEach(callback: js.Function3[/* value */ T, /* value2 */ T, /* set */ Set[T], Unit]): Unit = js.native
    def forEach(callback: js.Function3[/* value */ T, /* value2 */ T, /* set */ Set[T], Unit], thisArg: js.Any): Unit = js.native
    def has(value: T): Boolean = js.native
  }
  
}

