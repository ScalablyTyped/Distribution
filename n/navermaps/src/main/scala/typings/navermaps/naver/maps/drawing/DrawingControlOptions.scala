package typings.navermaps.naver.maps.drawing

import typings.navermaps.naver.maps.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawingControlOptions extends js.Object {
  var position: js.UndefOr[Position] = js.undefined
  var style: js.UndefOr[DrawingStyle] = js.undefined
}

object DrawingControlOptions {
  @scala.inline
  def apply(position: Position = null, style: DrawingStyle = null): DrawingControlOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawingControlOptions]
  }
}

