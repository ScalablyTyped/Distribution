package typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotBaseMod

import typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageState extends js.Object {
  var loadState: js.UndefOr[ImageLoadState] = js.undefined
}

object IImageState {
  @scala.inline
  def apply(loadState: ImageLoadState = null): IImageState = {
    val __obj = js.Dynamic.literal()
    if (loadState != null) __obj.updateDynamic("loadState")(loadState)
    __obj.asInstanceOf[IImageState]
  }
}

