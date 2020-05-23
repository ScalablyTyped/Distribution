package typings.playcanvas.anon

import typings.playcanvas.pc.TextureAtlas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Atlas extends js.Object {
  var atlas: js.UndefOr[TextureAtlas] = js.undefined
  var frameKeys: js.UndefOr[js.Array[String]] = js.undefined
  var pixelsPerUnit: js.UndefOr[Double] = js.undefined
  var renderMode: js.UndefOr[Double] = js.undefined
}

object Atlas {
  @scala.inline
  def apply(
    atlas: TextureAtlas = null,
    frameKeys: js.Array[String] = null,
    pixelsPerUnit: js.UndefOr[Double] = js.undefined,
    renderMode: js.UndefOr[Double] = js.undefined
  ): Atlas = {
    val __obj = js.Dynamic.literal()
    if (atlas != null) __obj.updateDynamic("atlas")(atlas.asInstanceOf[js.Any])
    if (frameKeys != null) __obj.updateDynamic("frameKeys")(frameKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelsPerUnit)) __obj.updateDynamic("pixelsPerUnit")(pixelsPerUnit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderMode)) __obj.updateDynamic("renderMode")(renderMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atlas]
  }
}

