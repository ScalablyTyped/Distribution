package typings
package phaserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FrameHeight extends js.Object {
  /**
    * An optional frame from the Texture this Tile Sprite is rendering with.
    */
  var frame: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The height of the Tile Sprite. If zero it will use the size of the texture frame.
    */
  var height: js.UndefOr[integer] = js.undefined
  /**
    * The key of the Texture this Tile Sprite will use to render with, as stored in the Texture Manager.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the Tile Sprite. If zero it will use the size of the texture frame.
    */
  var width: js.UndefOr[integer] = js.undefined
  /**
    * The x coordinate of the Tile Sprite.
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y coordinate of the Tile Sprite.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_FrameHeight {
  @scala.inline
  def apply(
    frame: java.lang.String = null,
    height: js.UndefOr[integer] = js.undefined,
    key: java.lang.String = null,
    width: js.UndefOr[integer] = js.undefined,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Anon_FrameHeight = {
    val __obj = js.Dynamic.literal()
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FrameHeight]
  }
}

