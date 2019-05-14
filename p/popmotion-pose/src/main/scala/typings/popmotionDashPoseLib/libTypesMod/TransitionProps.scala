package typings
package popmotionDashPoseLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionProps extends js.Object {
  var dimensions: Dimensions
  var from: java.lang.String | scala.Double
  var key: java.lang.String
  var prevPoseKey: java.lang.String
  var to: java.lang.String | scala.Double
  var velocity: scala.Double
}

object TransitionProps {
  @scala.inline
  def apply(
    dimensions: Dimensions,
    from: java.lang.String | scala.Double,
    key: java.lang.String,
    prevPoseKey: java.lang.String,
    to: java.lang.String | scala.Double,
    velocity: scala.Double
  ): TransitionProps = {
    val __obj = js.Dynamic.literal(dimensions = dimensions, from = from.asInstanceOf[js.Any], key = key, prevPoseKey = prevPoseKey, to = to.asInstanceOf[js.Any], velocity = velocity)
  
    __obj.asInstanceOf[TransitionProps]
  }
}

