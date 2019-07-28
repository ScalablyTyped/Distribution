package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.Anon_Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameAnimationEvent extends js.Object {
  var animation: Anon_Frame
  var frame: Frame
  var name: String
}

object FrameAnimationEvent {
  @scala.inline
  def apply(animation: Anon_Frame, frame: Frame, name: String): FrameAnimationEvent = {
    val __obj = js.Dynamic.literal(animation = animation, frame = frame, name = name)
  
    __obj.asInstanceOf[FrameAnimationEvent]
  }
}

