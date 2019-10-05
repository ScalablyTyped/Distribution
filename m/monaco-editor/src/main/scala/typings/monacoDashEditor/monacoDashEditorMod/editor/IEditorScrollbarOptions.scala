package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorStrings.auto
import typings.monacoDashEditor.monacoDashEditorStrings.hidden
import typings.monacoDashEditor.monacoDashEditorStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorScrollbarOptions extends js.Object {
  /**
    * The size of arrows (if displayed).
    * Defaults to 11.
    */
  var arrowSize: js.UndefOr[Double] = js.undefined
  /**
    * Listen to mouse wheel events and react to them by scrolling.
    * Defaults to true.
    */
  var handleMouseWheel: js.UndefOr[Boolean] = js.undefined
  /**
    * Render horizontal scrollbar.
    * Defaults to 'auto'.
    */
  var horizontal: js.UndefOr[auto | visible | hidden] = js.undefined
  /**
    * Render arrows at the left and right of the horizontal scrollbar.
    * Defaults to false.
    */
  var horizontalHasArrows: js.UndefOr[Boolean] = js.undefined
  /**
    * Height in pixels for the horizontal scrollbar.
    * Defaults to 10 (px).
    */
  var horizontalScrollbarSize: js.UndefOr[Double] = js.undefined
  /**
    * Height in pixels for the horizontal slider.
    * Defaults to `horizontalScrollbarSize`.
    */
  var horizontalSliderSize: js.UndefOr[Double] = js.undefined
  /**
    * Cast horizontal and vertical shadows when the content is scrolled.
    * Defaults to true.
    */
  var useShadows: js.UndefOr[Boolean] = js.undefined
  /**
    * Render vertical scrollbar.
    * Defaults to 'auto'.
    */
  var vertical: js.UndefOr[auto | visible | hidden] = js.undefined
  /**
    * Render arrows at the top and bottom of the vertical scrollbar.
    * Defaults to false.
    */
  var verticalHasArrows: js.UndefOr[Boolean] = js.undefined
  /**
    * Width in pixels for the vertical scrollbar.
    * Defaults to 10 (px).
    */
  var verticalScrollbarSize: js.UndefOr[Double] = js.undefined
  /**
    * Width in pixels for the vertical slider.
    * Defaults to `verticalScrollbarSize`.
    */
  var verticalSliderSize: js.UndefOr[Double] = js.undefined
}

object IEditorScrollbarOptions {
  @scala.inline
  def apply(
    arrowSize: Int | Double = null,
    handleMouseWheel: js.UndefOr[Boolean] = js.undefined,
    horizontal: auto | visible | hidden = null,
    horizontalHasArrows: js.UndefOr[Boolean] = js.undefined,
    horizontalScrollbarSize: Int | Double = null,
    horizontalSliderSize: Int | Double = null,
    useShadows: js.UndefOr[Boolean] = js.undefined,
    vertical: auto | visible | hidden = null,
    verticalHasArrows: js.UndefOr[Boolean] = js.undefined,
    verticalScrollbarSize: Int | Double = null,
    verticalSliderSize: Int | Double = null
  ): IEditorScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    if (arrowSize != null) __obj.updateDynamic("arrowSize")(arrowSize.asInstanceOf[js.Any])
    if (!js.isUndefined(handleMouseWheel)) __obj.updateDynamic("handleMouseWheel")(handleMouseWheel)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalHasArrows)) __obj.updateDynamic("horizontalHasArrows")(horizontalHasArrows)
    if (horizontalScrollbarSize != null) __obj.updateDynamic("horizontalScrollbarSize")(horizontalScrollbarSize.asInstanceOf[js.Any])
    if (horizontalSliderSize != null) __obj.updateDynamic("horizontalSliderSize")(horizontalSliderSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useShadows)) __obj.updateDynamic("useShadows")(useShadows)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalHasArrows)) __obj.updateDynamic("verticalHasArrows")(verticalHasArrows)
    if (verticalScrollbarSize != null) __obj.updateDynamic("verticalScrollbarSize")(verticalScrollbarSize.asInstanceOf[js.Any])
    if (verticalSliderSize != null) __obj.updateDynamic("verticalSliderSize")(verticalSliderSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorScrollbarOptions]
  }
}

