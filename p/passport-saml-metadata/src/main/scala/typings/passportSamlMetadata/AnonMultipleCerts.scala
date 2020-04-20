package typings.passportSamlMetadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMultipleCerts extends js.Object {
  var multipleCerts: Boolean
}

object AnonMultipleCerts {
  @scala.inline
  def apply(multipleCerts: Boolean): AnonMultipleCerts = {
    val __obj = js.Dynamic.literal(multipleCerts = multipleCerts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMultipleCerts]
  }
}

