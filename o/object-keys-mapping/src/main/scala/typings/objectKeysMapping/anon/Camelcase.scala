package typings.objectKeysMapping.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Camelcase extends js.Object {
  var camelcase: js.UndefOr[Boolean] = js.undefined
}

object Camelcase {
  @scala.inline
  def apply(camelcase: js.UndefOr[Boolean] = js.undefined): Camelcase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(camelcase)) __obj.updateDynamic("camelcase")(camelcase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camelcase]
  }
}

