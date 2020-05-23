package typings.passportSamlMetadata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleCerts extends js.Object {
  var multipleCerts: Boolean
}

object MultipleCerts {
  @scala.inline
  def apply(multipleCerts: Boolean): MultipleCerts = {
    val __obj = js.Dynamic.literal(multipleCerts = multipleCerts.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleCerts]
  }
}

