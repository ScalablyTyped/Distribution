package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LinearSpring extends Spring {
  var localAnchorA: js.Array[scala.Double]
  var localAnchorB: js.Array[scala.Double]
  var restLength: scala.Double
  def getWorldAnchorA(result: js.Array[scala.Double]): js.Array[scala.Double]
  def getWorldAnchorB(result: js.Array[scala.Double]): js.Array[scala.Double]
  def setWorldAnchorA(worldAnchorA: js.Array[scala.Double]): scala.Unit
  def setWorldAnchorB(worldAnchorB: js.Array[scala.Double]): scala.Unit
}

