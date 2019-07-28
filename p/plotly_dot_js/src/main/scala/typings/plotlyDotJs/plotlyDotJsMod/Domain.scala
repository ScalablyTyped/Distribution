package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var x: js.Array[Double]
  var y: js.Array[Double]
}

object Domain {
  @scala.inline
  def apply(x: js.Array[Double], y: js.Array[Double]): Domain = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Domain]
  }
}

