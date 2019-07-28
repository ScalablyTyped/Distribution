package typings.postal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Binding extends js.Object {
  var binding: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var topic: js.UndefOr[String] = js.undefined
}

object Anon_Binding {
  @scala.inline
  def apply(binding: String = null, compact: js.UndefOr[Boolean] = js.undefined, topic: String = null): Anon_Binding = {
    val __obj = js.Dynamic.literal()
    if (binding != null) __obj.updateDynamic("binding")(binding)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[Anon_Binding]
  }
}

