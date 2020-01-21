package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongestPathTree extends js.Object {
  def getDistTo(vertex: Double): Double
  def hasDistTo(vertex: Double): Boolean
  def pathTo(vertex: Double): js.Array[Double]
}

object LongestPathTree {
  @scala.inline
  def apply(getDistTo: Double => Double, hasDistTo: Double => Boolean, pathTo: Double => js.Array[Double]): LongestPathTree = {
    val __obj = js.Dynamic.literal(getDistTo = js.Any.fromFunction1(getDistTo), hasDistTo = js.Any.fromFunction1(hasDistTo), pathTo = js.Any.fromFunction1(pathTo))
  
    __obj.asInstanceOf[LongestPathTree]
  }
}

