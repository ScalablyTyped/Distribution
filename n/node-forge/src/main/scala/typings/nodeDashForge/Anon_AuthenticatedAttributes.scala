package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.pki.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticatedAttributes extends js.Object {
  var authenticatedAttributes: js.Array[Anon_Type]
  var certificate: Certificate | String
  var digestAlgorithm: String
  var key: String
}

object Anon_AuthenticatedAttributes {
  @scala.inline
  def apply(
    authenticatedAttributes: js.Array[Anon_Type],
    certificate: Certificate | String,
    digestAlgorithm: String,
    key: String
  ): Anon_AuthenticatedAttributes = {
    val __obj = js.Dynamic.literal(authenticatedAttributes = authenticatedAttributes, certificate = certificate.asInstanceOf[js.Any], digestAlgorithm = digestAlgorithm, key = key)
  
    __obj.asInstanceOf[Anon_AuthenticatedAttributes]
  }
}

