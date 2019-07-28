package typings.overlayscrollbars

import typings.overlayscrollbars.overlayscrollbarsMod.Position
import typings.overlayscrollbars.overlayscrollbarsMod._Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends _Coordinates {
  var x: js.UndefOr[Position] = js.undefined
  var y: js.UndefOr[Position] = js.undefined
}

object Anon_X {
  @scala.inline
  def apply(x: Position = null, y: Position = null): Anon_X = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_X]
  }
}

