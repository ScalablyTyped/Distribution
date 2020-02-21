package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrgState extends js.Object {
  var org: AnonRequired
  var state: AnonEnumRequired
}

object AnonOrgState {
  @scala.inline
  def apply(org: AnonRequired, state: AnonEnumRequired): AnonOrgState = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrgState]
  }
}

