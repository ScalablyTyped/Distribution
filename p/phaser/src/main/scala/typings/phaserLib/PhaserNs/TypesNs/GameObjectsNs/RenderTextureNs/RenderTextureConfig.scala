package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.RenderTextureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderTextureConfig extends js.Object {
  /**
    * the frame to make the RenderTexture from.
    */
  var frame: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The height of the RenderTexture.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The texture key to make the RenderTexture from.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the RenderTexture.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * The x coordinate of the RenderTextures position.
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y coordinate of the RenderTextures position.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object RenderTextureConfig {
  @scala.inline
  def apply(
    frame: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    key: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): RenderTextureConfig = {
    val __obj = js.Dynamic.literal()
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderTextureConfig]
  }
}

