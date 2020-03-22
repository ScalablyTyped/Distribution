package typings.openfin.externalApplicationExternalApplicationMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalApplicationInfo extends js.Object {
  var parent: Identity
}

object ExternalApplicationInfo {
  @scala.inline
  def apply(parent: Identity): ExternalApplicationInfo = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExternalApplicationInfo]
  }
}

