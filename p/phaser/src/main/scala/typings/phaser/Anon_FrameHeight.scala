package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FrameHeight extends js.Object {
  /**
    * An optional frame from the Texture this Tile Sprite is rendering with.
    */
  var frame: js.UndefOr[String] = js.undefined
  /**
    * The height of the Tile Sprite. If zero it will use the size of the texture frame.
    */
  var height: js.UndefOr[integer] = js.undefined
  /**
    * The key of the Texture this Tile Sprite will use to render with, as stored in the Texture Manager.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The width of the Tile Sprite. If zero it will use the size of the texture frame.
    */
  var width: js.UndefOr[integer] = js.undefined
  /**
    * The x coordinate of the Tile Sprite.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y coordinate of the Tile Sprite.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Anon_FrameHeight {
  @scala.inline
  def apply(
    frame: String = null,
    height: Int | Double = null,
    key: String = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): Anon_FrameHeight = {
    val __obj = js.Dynamic.literal()
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FrameHeight]
  }
}

