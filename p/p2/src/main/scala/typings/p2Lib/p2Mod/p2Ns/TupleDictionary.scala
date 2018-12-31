package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TupleDictionary extends js.Object {
  var data: js.Array[scala.Double]
  var keys: js.Array[scala.Double]
  def copy(dict: TupleDictionary): scala.Unit
  def get(i: scala.Double, j: scala.Double): scala.Double
  def getByKey(key: scala.Double): scala.Double
  def getKey(id1: scala.Double, id2: scala.Double): java.lang.String
  def reset(): scala.Unit
  def set(i: scala.Double, j: scala.Double, value: scala.Double): scala.Double
}

