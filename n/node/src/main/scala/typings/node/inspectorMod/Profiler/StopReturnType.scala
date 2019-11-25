package typings.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopReturnType extends js.Object {
  /**
    * Recorded profile.
    */
  var profile: Profile
}

object StopReturnType {
  @scala.inline
  def apply(profile: Profile): StopReturnType = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopReturnType]
  }
}

