package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
}

object OrgsGetEndpoint {
  @scala.inline
  def apply(org_ : String): OrgsGetEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetEndpoint]
  }
}

