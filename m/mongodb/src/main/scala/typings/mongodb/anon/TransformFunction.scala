package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformFunction extends js.Object {
  var transform: js.UndefOr[js.Function] = js.undefined
}

object TransformFunction {
  @scala.inline
  def apply(transform: js.Function = null): TransformFunction = {
    val __obj = js.Dynamic.literal()
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformFunction]
  }
}

