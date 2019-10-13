package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardPlainCardPlainCardDotTypesMod

import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsHoverCardBaseCardDotTypesMod.IBaseCardProps
import typings.react.reactMod._Global_.JSX.Element
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
    onRenderPlainCard: (/* props */ js.UndefOr[_], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[_], Element | Null]]) => Element | Null = null
  ): IPlainCardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IBaseCardProps)
    if (onRenderPlainCard != null) __obj.updateDynamic("onRenderPlainCard")(js.Any.fromFunction2(onRenderPlainCard))
    __obj.asInstanceOf[IPlainCardProps]
  }
}

