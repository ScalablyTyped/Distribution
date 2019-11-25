package typings.popmotionDashPose.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionProps extends js.Object {
  var dimensions: Dimensions
  var from: String | Double
  var key: String
  var prevPoseKey: String
  var to: String | Double
  var velocity: Double
}

object TransitionProps {
  @scala.inline
  def apply(
    dimensions: Dimensions,
    from: String | Double,
    key: String,
    prevPoseKey: String,
    to: String | Double,
    velocity: Double
  ): TransitionProps = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], prevPoseKey = prevPoseKey.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransitionProps]
  }
}

