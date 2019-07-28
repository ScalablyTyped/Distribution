package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatOptions extends js.Object {
  var length: Double
  var offset: Double
}

object StatOptions {
  @scala.inline
  def apply(length: Double, offset: Double): StatOptions = {
    val __obj = js.Dynamic.literal(length = length, offset = offset)
  
    __obj.asInstanceOf[StatOptions]
  }
}

