package typings.plotlyDotJs

import typings.plotlyDotJs.plotlyDotJsMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Frame extends js.Object {
  var frame: Anon_Duration
  var transition: Transition
}

object Anon_Frame {
  @scala.inline
  def apply(frame: Anon_Duration, transition: Transition): Anon_Frame = {
    val __obj = js.Dynamic.literal(frame = frame, transition = transition)
  
    __obj.asInstanceOf[Anon_Frame]
  }
}

