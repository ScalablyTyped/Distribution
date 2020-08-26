package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popmotion-pose.popmotion-pose/lib/types.TransitionProps & {[key: string] : any} */
@js.native
trait ResolverProps
  extends /* key */ StringDictionary[js.Any] {
  var dimensions: Dimensions = js.native
  var from: String | Double = js.native
  var key: String = js.native
  var prevPoseKey: String = js.native
  var to: String | Double = js.native
  var velocity: Double = js.native
}

object ResolverProps {
  @scala.inline
  def apply(
    dimensions: Dimensions,
    from: String | Double,
    key: String,
    prevPoseKey: String,
    to: String | Double,
    velocity: Double
  ): ResolverProps = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], prevPoseKey = prevPoseKey.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverProps]
  }
  @scala.inline
  implicit class ResolverPropsOps[Self <: ResolverProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDimensions(value: Dimensions): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String | Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevPoseKey(value: String): Self = this.set("prevPoseKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String | Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
  }
  
}

