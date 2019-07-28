package typings.popmotionDashPose.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomPopmotionConfig
  extends /* key */ StringDictionary[js.Any] {
  var dragBounds: js.UndefOr[DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds])] = js.undefined
  var draggable: js.UndefOr[Draggable] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.undefined
  var onPressEnd: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.undefined
  var onPressStart: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, _]] = js.undefined
  var props: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object DomPopmotionConfig {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    dragBounds: DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds]) = null,
    draggable: Draggable = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    onDragEnd: /* e */ MouseEvent | TouchEvent => _ = null,
    onDragStart: /* e */ MouseEvent | TouchEvent => _ = null,
    onPressEnd: /* e */ MouseEvent | TouchEvent => _ = null,
    onPressStart: /* e */ MouseEvent | TouchEvent => _ = null,
    props: StringDictionary[js.Any] = null
  ): DomPopmotionConfig = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (dragBounds != null) __obj.updateDynamic("dragBounds")(dragBounds.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onPressEnd != null) __obj.updateDynamic("onPressEnd")(js.Any.fromFunction1(onPressEnd))
    if (onPressStart != null) __obj.updateDynamic("onPressStart")(js.Any.fromFunction1(onPressStart))
    if (props != null) __obj.updateDynamic("props")(props)
    __obj.asInstanceOf[DomPopmotionConfig]
  }
}

