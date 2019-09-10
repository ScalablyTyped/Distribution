package typings.parse.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascadeSaveOption extends js.Object {
  /** If `false`, nested objects will not be saved (default is `true`). */
  var cascadeSave: js.UndefOr[Boolean] = js.undefined
}

object CascadeSaveOption {
  @scala.inline
  def apply(cascadeSave: js.UndefOr[Boolean] = js.undefined): CascadeSaveOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascadeSave)) __obj.updateDynamic("cascadeSave")(cascadeSave)
    __obj.asInstanceOf[CascadeSaveOption]
  }
}

