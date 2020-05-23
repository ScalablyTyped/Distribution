package typings.postal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binding extends js.Object {
  var binding: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var topic: js.UndefOr[String] = js.undefined
}

object Binding {
  @scala.inline
  def apply(binding: String = null, compact: js.UndefOr[Boolean] = js.undefined, topic: String = null): Binding = {
    val __obj = js.Dynamic.literal()
    if (binding != null) __obj.updateDynamic("binding")(binding.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
}

