package typings.parse.mod._Global_.Parse

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
    if (!js.isUndefined(cascadeSave)) __obj.updateDynamic("cascadeSave")(cascadeSave.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascadeSaveOption]
  }
}

