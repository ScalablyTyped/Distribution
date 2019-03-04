package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameAnimationEvent extends js.Object {
  var animation: plotlyDotJsLib.Anon_Frame
  var frame: Frame
  var name: java.lang.String
}

object FrameAnimationEvent {
  @scala.inline
  def apply(animation: plotlyDotJsLib.Anon_Frame, frame: Frame, name: java.lang.String): FrameAnimationEvent = {
    val __obj = js.Dynamic.literal(animation = animation, frame = frame, name = name)
  
    __obj.asInstanceOf[FrameAnimationEvent]
  }
}

