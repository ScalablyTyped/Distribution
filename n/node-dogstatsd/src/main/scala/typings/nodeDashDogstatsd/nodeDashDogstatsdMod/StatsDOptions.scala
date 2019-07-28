package typings.nodeDashDogstatsd.nodeDashDogstatsdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsDOptions extends js.Object {
  var global_tags: js.UndefOr[js.Array[String]] = js.undefined
}

object StatsDOptions {
  @scala.inline
  def apply(global_tags: js.Array[String] = null): StatsDOptions = {
    val __obj = js.Dynamic.literal()
    if (global_tags != null) __obj.updateDynamic("global_tags")(global_tags)
    __obj.asInstanceOf[StatsDOptions]
  }
}

