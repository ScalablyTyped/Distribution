package typings.playcanvas

import typings.playcanvas.pc.TextureAtlas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAtlas extends js.Object {
  var atlas: js.UndefOr[TextureAtlas] = js.undefined
  var frameKeys: js.UndefOr[js.Array[String]] = js.undefined
  var pixelsPerUnit: js.UndefOr[Double] = js.undefined
  var renderMode: js.UndefOr[Double] = js.undefined
}

object AnonAtlas {
  @scala.inline
  def apply(
    atlas: TextureAtlas = null,
    frameKeys: js.Array[String] = null,
    pixelsPerUnit: Int | Double = null,
    renderMode: Int | Double = null
  ): AnonAtlas = {
    val __obj = js.Dynamic.literal()
    if (atlas != null) __obj.updateDynamic("atlas")(atlas.asInstanceOf[js.Any])
    if (frameKeys != null) __obj.updateDynamic("frameKeys")(frameKeys.asInstanceOf[js.Any])
    if (pixelsPerUnit != null) __obj.updateDynamic("pixelsPerUnit")(pixelsPerUnit.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAtlas]
  }
}

