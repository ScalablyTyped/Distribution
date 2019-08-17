package typings.officeDashUiDashFabricDashReact.libComponentsListListDotTypesMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPage[T] extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var height: Double
  var isSpacer: js.UndefOr[Boolean] = js.undefined
  var isVisible: js.UndefOr[Boolean] = js.undefined
  var itemCount: Double
  var items: js.UndefOr[js.Array[T]] = js.undefined
  var key: String
  var startIndex: Double
  var style: CSSProperties
  var top: Double
}

object IPage {
  @scala.inline
  def apply[T](
    height: Double,
    itemCount: Double,
    key: String,
    startIndex: Double,
    style: CSSProperties,
    top: Double,
    data: js.Any = null,
    isSpacer: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[T] = null
  ): IPage[T] = {
    val __obj = js.Dynamic.literal(height = height, itemCount = itemCount, key = key, startIndex = startIndex, style = style, top = top)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(isSpacer)) __obj.updateDynamic("isSpacer")(isSpacer)
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[IPage[T]]
  }
}

