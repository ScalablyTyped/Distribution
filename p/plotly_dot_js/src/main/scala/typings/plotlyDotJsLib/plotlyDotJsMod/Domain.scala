package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var x: js.Array[scala.Double]
  var y: js.Array[scala.Double]
}

object Domain {
  @scala.inline
  def apply(x: js.Array[scala.Double], y: js.Array[scala.Double]): Domain = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Domain]
  }
}

