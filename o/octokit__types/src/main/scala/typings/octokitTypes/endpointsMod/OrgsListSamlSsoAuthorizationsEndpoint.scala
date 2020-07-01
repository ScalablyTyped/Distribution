package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListSamlSsoAuthorizationsEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
}

object OrgsListSamlSsoAuthorizationsEndpoint {
  @scala.inline
  def apply(org_ : String): OrgsListSamlSsoAuthorizationsEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListSamlSsoAuthorizationsEndpoint]
  }
}

