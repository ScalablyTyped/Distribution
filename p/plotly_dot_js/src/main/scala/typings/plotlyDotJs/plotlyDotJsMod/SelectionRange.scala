package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRange extends js.Object {
  var x: js.Array[Double]
  var y: js.Array[Double]
}

object SelectionRange {
  @scala.inline
  def apply(x: js.Array[Double], y: js.Array[Double]): SelectionRange = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectionRange]
  }
}

