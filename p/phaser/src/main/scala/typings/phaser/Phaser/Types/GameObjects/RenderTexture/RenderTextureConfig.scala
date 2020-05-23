package typings.phaser.Phaser.Types.GameObjects.RenderTexture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderTextureConfig extends js.Object {
  /**
    * the frame to make the RenderTexture from.
    */
  var frame: js.UndefOr[String] = js.undefined
  /**
    * The height of the RenderTexture.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The texture key to make the RenderTexture from.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The width of the RenderTexture.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The x coordinate of the RenderTextures position.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y coordinate of the RenderTextures position.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object RenderTextureConfig {
  @scala.inline
  def apply(
    frame: String = null,
    height: js.UndefOr[Double] = js.undefined,
    key: String = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): RenderTextureConfig = {
    val __obj = js.Dynamic.literal()
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderTextureConfig]
  }
}

