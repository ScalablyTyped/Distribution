package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "TupleDictionary")
@js.native
class TupleDictionary () extends js.Object {
  var data: js.Any = js.native
  var keys: js.Array[scala.Double] = js.native
  def copy(dict: TupleDictionary): scala.Unit = js.native
  def get(i: scala.Double, j: scala.Double): scala.Double = js.native
  def getByKey(key: scala.Double): js.Any = js.native
  def getKey(id1: scala.Double, id2: scala.Double): java.lang.String = js.native
  def reset(): scala.Unit = js.native
  def set(i: scala.Double, j: scala.Double, value: scala.Double): scala.Double = js.native
}

