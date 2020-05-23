package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsCreateRemoveTokenForOrgEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
}

object ActionsCreateRemoveTokenForOrgEndpoint {
  @scala.inline
  def apply(org_ : String): ActionsCreateRemoveTokenForOrgEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateRemoveTokenForOrgEndpoint]
  }
}

