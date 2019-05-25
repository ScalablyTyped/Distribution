package typings
package olLib.formatKMLMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GxTrackObject extends js.Object {
  var flatCoordinates: js.Array[scala.Double]
  var whens: js.Array[scala.Double]
}

object GxTrackObject {
  @scala.inline
  def apply(flatCoordinates: js.Array[scala.Double], whens: js.Array[scala.Double]): GxTrackObject = {
    val __obj = js.Dynamic.literal(flatCoordinates = flatCoordinates, whens = whens)
  
    __obj.asInstanceOf[GxTrackObject]
  }
}

