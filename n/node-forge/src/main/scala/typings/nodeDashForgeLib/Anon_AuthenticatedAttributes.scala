package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticatedAttributes extends js.Object {
  var authenticatedAttributes: js.Array[Anon_Type]
  var certificate: nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate | java.lang.String
  var digestAlgorithm: java.lang.String
  var key: java.lang.String
}

object Anon_AuthenticatedAttributes {
  @scala.inline
  def apply(
    authenticatedAttributes: js.Array[Anon_Type],
    certificate: nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate | java.lang.String,
    digestAlgorithm: java.lang.String,
    key: java.lang.String
  ): Anon_AuthenticatedAttributes = {
    val __obj = js.Dynamic.literal(authenticatedAttributes = authenticatedAttributes, certificate = certificate.asInstanceOf[js.Any], digestAlgorithm = digestAlgorithm, key = key)
  
    __obj.asInstanceOf[Anon_AuthenticatedAttributes]
  }
}

