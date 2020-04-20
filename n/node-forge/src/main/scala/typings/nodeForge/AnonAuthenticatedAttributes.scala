package typings.nodeForge

import typings.nodeForge.mod.pki.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthenticatedAttributes extends js.Object {
  var authenticatedAttributes: js.Array[AnonType]
  var certificate: Certificate | String
  var digestAlgorithm: String
  var key: String
}

object AnonAuthenticatedAttributes {
  @scala.inline
  def apply(
    authenticatedAttributes: js.Array[AnonType],
    certificate: Certificate | String,
    digestAlgorithm: String,
    key: String
  ): AnonAuthenticatedAttributes = {
    val __obj = js.Dynamic.literal(authenticatedAttributes = authenticatedAttributes.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthenticatedAttributes]
  }
}

