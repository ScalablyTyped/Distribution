package typings.phaser.Phaser.Types.Input

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputConfiguration extends js.Object {
  /**
    * If `pixelPerfect` is set, this is the alpha tolerance threshold value used in the callback.
    */
  var alphaTolerance: js.UndefOr[integer] = js.undefined
  /**
    * The CSS string to be used when the cursor is over this Interactive Object.
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * If `true` the Interactive Object will be set to be draggable and emit drag events.
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true` the Interactive Object will be set to be a drop zone for draggable objects.
    */
  var dropZone: js.UndefOr[Boolean] = js.undefined
  /**
    * The object / shape to use as the Hit Area. If not given it will try to create a Rectangle based on the texture frame.
    */
  var hitArea: js.UndefOr[js.Any] = js.undefined
  /**
    * The callback that determines if the pointer is within the Hit Area shape or not.
    */
  var hitAreaCallback: js.UndefOr[js.Function] = js.undefined
  /**
    * If `true` the a pixel perfect function will be set for the hit area callback. Only works with texture based Game Objects.
    */
  var pixelPerfect: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true` the Interactive Object will set the `pointer` hand cursor when a pointer is over it. This is a short-cut for setting `cursor: 'pointer'`.
    */
  var useHandCursor: js.UndefOr[Boolean] = js.undefined
}

object InputConfiguration {
  @scala.inline
  def apply(
    alphaTolerance: Int | Double = null,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    dropZone: js.UndefOr[Boolean] = js.undefined,
    hitArea: js.Any = null,
    hitAreaCallback: js.Function = null,
    pixelPerfect: js.UndefOr[Boolean] = js.undefined,
    useHandCursor: js.UndefOr[Boolean] = js.undefined
  ): InputConfiguration = {
    val __obj = js.Dynamic.literal()
    if (alphaTolerance != null) __obj.updateDynamic("alphaTolerance")(alphaTolerance.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(dropZone)) __obj.updateDynamic("dropZone")(dropZone.asInstanceOf[js.Any])
    if (hitArea != null) __obj.updateDynamic("hitArea")(hitArea.asInstanceOf[js.Any])
    if (hitAreaCallback != null) __obj.updateDynamic("hitAreaCallback")(hitAreaCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelPerfect)) __obj.updateDynamic("pixelPerfect")(pixelPerfect.asInstanceOf[js.Any])
    if (!js.isUndefined(useHandCursor)) __obj.updateDynamic("useHandCursor")(useHandCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputConfiguration]
  }
}

