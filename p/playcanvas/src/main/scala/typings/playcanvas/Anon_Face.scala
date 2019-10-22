package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Face extends js.Object {
  var face: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
}

object Anon_Face {
  @scala.inline
  def apply(face: Int | Double = null, level: Int | Double = null): Anon_Face = {
    val __obj = js.Dynamic.literal()
    if (face != null) __obj.updateDynamic("face")(face.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Face]
  }
}

