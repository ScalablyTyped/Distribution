package typings
package plottableLib.buildSrcUtilsMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/map", "Map")
@js.native
class Map[K, V] () extends js.Object {
  var _es6Map: js.Any = js.native
  var _keyValuePairs: js.Any = js.native
  def delete(key: K): scala.Boolean = js.native
  def forEach(callbackFn: js.Function3[/* value */ V, /* key */ K, /* map */ Map[K, V], scala.Unit]): scala.Unit = js.native
  def forEach(
    callbackFn: js.Function3[/* value */ V, /* key */ K, /* map */ Map[K, V], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def get(key: K): V = js.native
  def has(key: K): scala.Boolean = js.native
  def set(key: K, value: V): this.type = js.native
}

