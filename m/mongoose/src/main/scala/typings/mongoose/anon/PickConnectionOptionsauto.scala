package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<mongoose.mongoose.ConnectionOptions, 'autoIndex' | 'autoCreate' | 'useCreateIndex' | 'useFindAndModify' | 'bufferCommands'> */
trait PickConnectionOptionsauto extends js.Object {
  var autoCreate: js.UndefOr[Boolean] = js.undefined
  var autoIndex: js.UndefOr[Boolean] = js.undefined
  var bufferCommands: js.UndefOr[Boolean] = js.undefined
  var useCreateIndex: js.UndefOr[Boolean] = js.undefined
  var useFindAndModify: js.UndefOr[Boolean] = js.undefined
}

object PickConnectionOptionsauto {
  @scala.inline
  def apply(
    autoCreate: js.UndefOr[Boolean] = js.undefined,
    autoIndex: js.UndefOr[Boolean] = js.undefined,
    bufferCommands: js.UndefOr[Boolean] = js.undefined,
    useCreateIndex: js.UndefOr[Boolean] = js.undefined,
    useFindAndModify: js.UndefOr[Boolean] = js.undefined
  ): PickConnectionOptionsauto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoIndex)) __obj.updateDynamic("autoIndex")(autoIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferCommands)) __obj.updateDynamic("bufferCommands")(bufferCommands.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useCreateIndex)) __obj.updateDynamic("useCreateIndex")(useCreateIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useFindAndModify)) __obj.updateDynamic("useFindAndModify")(useFindAndModify.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickConnectionOptionsauto]
  }
}

