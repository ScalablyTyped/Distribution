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
    copy: TupleDictionary => scala.Unit,
    data: js.Any,
    get: (scala.Double, scala.Double) => scala.Double,
    getByKey: scala.Double => js.Any,
    getKey: (scala.Double, scala.Double) => java.lang.String,
    keys: js.Array[scala.Double],
    reset: () => scala.Unit,
    set: (scala.Double, scala.Double, scala.Double) => scala.Double
  ): TupleDictionary = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), data = data, get = js.Any.fromFunction2(get), getByKey = js.Any.fromFunction1(getByKey), getKey = js.Any.fromFunction2(getKey), keys = keys, reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction3(set))
  
    __obj.asInstanceOf[TupleDictionary]
  }
}

