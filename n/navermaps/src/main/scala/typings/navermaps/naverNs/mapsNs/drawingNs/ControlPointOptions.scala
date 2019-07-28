package typings.navermaps.naverNs.mapsNs.drawingNs

import typings.navermaps.naverNs.mapsNs.CircleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlPointOptions extends js.Object {
  var anchorPointOptions: CircleOptions
  var midPointOptions: CircleOptions
}

object ControlPointOptions {
  @scala.inline
  def apply(anchorPointOptions: CircleOptions, midPointOptions: CircleOptions): ControlPointOptions = {
    val __obj = js.Dynamic.literal(anchorPointOptions = anchorPointOptions, midPointOptions = midPointOptions)
  
    __obj.asInstanceOf[ControlPointOptions]
  }
}

