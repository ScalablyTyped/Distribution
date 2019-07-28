package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomControlOptions extends js.Object {
  var legendDisabled: Boolean
  var position: Position
  var style: ZoomControlStyle
}

object ZoomControlOptions {
  @scala.inline
  def apply(legendDisabled: Boolean, position: Position, style: ZoomControlStyle): ZoomControlOptions = {
    val __obj = js.Dynamic.literal(legendDisabled = legendDisabled, position = position, style = style)
  
    __obj.asInstanceOf[ZoomControlOptions]
  }
}

