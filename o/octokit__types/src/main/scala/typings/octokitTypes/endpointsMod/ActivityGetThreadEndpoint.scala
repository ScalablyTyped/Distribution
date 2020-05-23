package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityGetThreadEndpoint extends js.Object {
  var thread_id: Double
}

object ActivityGetThreadEndpoint {
  @scala.inline
  def apply(thread_id: Double): ActivityGetThreadEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetThreadEndpoint]
  }
}

