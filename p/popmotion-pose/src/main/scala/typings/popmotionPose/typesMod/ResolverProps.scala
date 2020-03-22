package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popmotion-pose.popmotion-pose/lib/types.TransitionProps & {[key: string] : any} */
trait ResolverProps
  extends /* key */ StringDictionary[js.Any] {
  var dimensions: Dimensions
  var from: String | Double
  var key: String
  var prevPoseKey: String
  var to: String | Double
  var velocity: Double
}

object ResolverProps {
  @scala.inline
  def apply(
    dimensions: Dimensions,
    from: String | Double,
    key: String,
    prevPoseKey: String,
    to: String | Double,
    velocity: Double,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): ResolverProps = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], prevPoseKey = prevPoseKey.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ResolverProps]
  }
}

