package typings.ol.kmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GxTrackObject extends js.Object {
  var flatCoordinates: js.Array[Double]
  var whens: js.Array[Double]
}

object GxTrackObject {
  @scala.inline
  def apply(flatCoordinates: js.Array[Double], whens: js.Array[Double]): GxTrackObject = {
    val __obj = js.Dynamic.literal(flatCoordinates = flatCoordinates.asInstanceOf[js.Any], whens = whens.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GxTrackObject]
  }
}

