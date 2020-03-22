package typings.meteor.tinyTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILengthAble extends js.Object {
  var length: Double
}

object ILengthAble {
  @scala.inline
  def apply(length: Double): ILengthAble = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILengthAble]
  }
}

