package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "TupleDictionary")
@js.native
class TupleDictionary () extends js.Object {
  var data: js.Any = js.native
  var keys: js.Array[Double] = js.native
  def copy(dict: TupleDictionary): Unit = js.native
  def get(i: Double, j: Double): Double = js.native
  def getByKey(key: Double): js.Any = js.native
  def getKey(id1: Double, id2: Double): String = js.native
  def reset(): Unit = js.native
  def set(i: Double, j: Double, value: Double): Double = js.native
}

