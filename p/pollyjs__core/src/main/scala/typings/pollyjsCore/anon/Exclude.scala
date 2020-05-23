package typings.pollyjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exclude extends js.Object {
  var exclude: js.Array[String]
}

object Exclude {
  @scala.inline
  def apply(exclude: js.Array[String]): Exclude = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclude]
  }
}

