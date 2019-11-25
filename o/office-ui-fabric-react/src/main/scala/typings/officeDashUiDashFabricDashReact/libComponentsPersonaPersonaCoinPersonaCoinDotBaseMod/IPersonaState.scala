package typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaCoinPersonaCoinDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaState extends js.Object {
  var isImageError: js.UndefOr[Boolean] = js.undefined
  var isImageLoaded: js.UndefOr[Boolean] = js.undefined
}

object IPersonaState {
  @scala.inline
  def apply(
    isImageError: js.UndefOr[Boolean] = js.undefined,
    isImageLoaded: js.UndefOr[Boolean] = js.undefined
  ): IPersonaState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isImageError)) __obj.updateDynamic("isImageError")(isImageError.asInstanceOf[js.Any])
    if (!js.isUndefined(isImageLoaded)) __obj.updateDynamic("isImageLoaded")(isImageLoaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaState]
  }
}

