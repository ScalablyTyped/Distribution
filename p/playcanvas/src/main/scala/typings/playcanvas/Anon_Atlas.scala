package typings.playcanvas

import typings.playcanvas.pc.TextureAtlas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Atlas extends js.Object {
  var atlas: js.UndefOr[TextureAtlas] = js.undefined
  var pixelsPerUnit: js.UndefOr[Double] = js.undefined
  var renderMode: js.UndefOr[Double] = js.undefined
}

object Anon_Atlas {
  @scala.inline
  def apply(atlas: TextureAtlas = null, pixelsPerUnit: Int | Double = null, renderMode: Int | Double = null): Anon_Atlas = {
    val __obj = js.Dynamic.literal()
    if (atlas != null) __obj.updateDynamic("atlas")(atlas)
    if (pixelsPerUnit != null) __obj.updateDynamic("pixelsPerUnit")(pixelsPerUnit.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Atlas]
  }
}

