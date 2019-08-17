package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardPlainCardPlainCardDotTypesMod

import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardBaseCardDotTypesMod.IBaseCardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlainCardProps extends IBaseCardProps[IPlainCard, IPlainCardStyles, IPlainCardStyleProps] {
  /**
    *  Render function to populate compact content area
    */
  var onRenderPlainCard: js.UndefOr[IRenderFunction[_]] = js.undefined
}

object IPlainCardProps {
  @scala.inline
  def apply(
    IBaseCardProps: IBaseCardProps[IPlainCard, IPlainCardStyles, IPlainCardStyleProps] = null,
    onRenderPlainCard: IRenderFunction[_] = null
  ): IPlainCardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBaseCardProps)
    if (onRenderPlainCard != null) __obj.updateDynamic("onRenderPlainCard")(onRenderPlainCard)
    __obj.asInstanceOf[IPlainCardProps]
  }
}

