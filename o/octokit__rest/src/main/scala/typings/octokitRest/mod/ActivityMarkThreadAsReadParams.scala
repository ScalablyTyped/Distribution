package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityMarkThreadAsReadParams extends js.Object {
  var thread_id: Double
}

object ActivityMarkThreadAsReadParams {
  @scala.inline
  def apply(thread_id: Double): ActivityMarkThreadAsReadParams = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityMarkThreadAsReadParams]
  }
}

