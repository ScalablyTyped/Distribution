package typings.nodeDashPersist.nodeDashPersistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatumOptions extends js.Object {
  var raw: js.UndefOr[Boolean] = js.undefined
}

object DatumOptions {
  @scala.inline
  def apply(raw: js.UndefOr[Boolean] = js.undefined): DatumOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[DatumOptions]
  }
}

