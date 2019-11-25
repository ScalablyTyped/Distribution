package typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerState extends js.Object {
  /**
    * Flag for knowing when to remove the shimmerWrapper from the DOM.
    */
  var contentLoaded: js.UndefOr[Boolean] = js.undefined
}

object IShimmerState {
  @scala.inline
  def apply(contentLoaded: js.UndefOr[Boolean] = js.undefined): IShimmerState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentLoaded)) __obj.updateDynamic("contentLoaded")(contentLoaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerState]
  }
}

