package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Transform extends js.Object {
  var transform: js.UndefOr[js.Function] = js.undefined
}

object Anon_Transform {
  @scala.inline
  def apply(transform: js.Function = null): Anon_Transform = {
    val __obj = js.Dynamic.literal()
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_Transform]
  }
}

