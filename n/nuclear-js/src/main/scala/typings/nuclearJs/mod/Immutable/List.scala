package typings.nuclearJs.mod.Immutable

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nuclear-js", "Immutable.List")
@js.native
object List extends js.Object {
  def apply(): typings.immutable.Immutable.List[_] = js.native
  def apply[T](collection: Iterable[T]): typings.immutable.Immutable.List[T] = js.native
  /**
    * True if the provided value is a List
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable');
    * List.isList([]); // false
    * List.isList(List()); // true
    * ```
    */
  def isList(maybeList: js.Any): /* is immutable.Immutable.List<any> */ Boolean = js.native
  /**
    * Creates a new List containing `values`.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable');
    * List.of(1, 2, 3, 4)
    * // List [ 1, 2, 3, 4 ]
    * ```
    *
    * Note: Values are not altered or converted in any way.
    *
    * <!-- runkit:activate -->
    * ```js
    * const { List } = require('immutable');
    * List.of({x:1}, 2, [3], 4)
    * // List [ { x: 1 }, 2, [ 3 ], 4 ]
    * ```
    */
  def of[T](values: T*): typings.immutable.Immutable.List[T] = js.native
}

