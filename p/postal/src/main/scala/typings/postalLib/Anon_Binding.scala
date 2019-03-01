package typings
package postalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Binding extends js.Object {
  var binding: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var topic: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Binding {
  @scala.inline
  def apply(
    binding: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    topic: java.lang.String = null
  ): Anon_Binding = {
    val __obj = js.Dynamic.literal()
    if (binding != null) __obj.updateDynamic("binding")(binding)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[Anon_Binding]
  }
}

