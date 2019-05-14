package typings
package popmotionDashPoseLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomPopmotionConfig
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var dragBounds: js.UndefOr[DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds])] = js.undefined
  var draggable: js.UndefOr[Draggable] = js.undefined
  var hoverable: js.UndefOr[scala.Boolean] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* e */ stdLib.MouseEvent | stdLib.TouchEvent, _]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* e */ stdLib.MouseEvent | stdLib.TouchEvent, _]] = js.undefined
  var onPressEnd: js.UndefOr[js.Function1[/* e */ stdLib.MouseEvent | stdLib.TouchEvent, _]] = js.undefined
  var onPressStart: js.UndefOr[js.Function1[/* e */ stdLib.MouseEvent | stdLib.TouchEvent, _]] = js.undefined
  var props: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object DomPopmotionConfig {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dragBounds: DragBounds | (js.Function1[/* props */ ResolverProps, DragBounds]) = null,
    draggable: Draggable = null,
    hoverable: js.UndefOr[scala.Boolean] = js.undefined,
    onDragEnd: /* e */ stdLib.MouseEvent | stdLib.TouchEvent => _ = null,
    onDragStart: /* e */ stdLib.MouseEvent | stdLib.TouchEvent => _ = null,
    onPressEnd: /* e */ stdLib.MouseEvent | stdLib.TouchEvent => _ = null,
    onPressStart: /* e */ stdLib.MouseEvent | stdLib.TouchEvent => _ = null,
    props: org.scalablytyped.runtime.StringDictionary[js.Any] = null
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

