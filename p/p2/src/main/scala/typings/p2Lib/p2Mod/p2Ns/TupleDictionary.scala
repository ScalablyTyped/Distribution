package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TupleDictionary extends js.Object {
  var data: js.Any
  var keys: js.Array[scala.Double]
  def copy(dict: TupleDictionary): scala.Unit
  def get(i: scala.Double, j: scala.Double): scala.Double
  def getByKey(key: scala.Double): js.Any
  def getKey(id1: scala.Double, id2: scala.Double): java.lang.String
  def reset(): scala.Unit
  def set(i: scala.Double, j: scala.Double, value: scala.Double): scala.Double
}

object TupleDictionary {
  @scala.inline
  def apply(
    copy: js.Function1[TupleDictionary, scala.Unit],
    data: js.Any,
    get: js.Function2[scala.Double, scala.Double, scala.Double],
    getByKey: js.Function1[scala.Double, js.Any],
    getKey: js.Function2[scala.Double, scala.Double, java.lang.String],
    keys: js.Array[scala.Double],
    reset: js.Function0[scala.Unit],
    set: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double]
  ): TupleDictionary = {
    val __obj = js.Dynamic.literal(copy = copy, data = data, get = get, getByKey = getByKey, getKey = getKey, keys = keys, reset = reset, set = set)
  
    __obj.asInstanceOf[TupleDictionary]
  }
}

