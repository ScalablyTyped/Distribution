package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthenticatedAttributes extends js.Object {
  var authenticatedAttributes: js.Array[Anon_Type]
  var certificate: nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate
  var digestAlgorithm: java.lang.String
  var key: java.lang.String
}

object Anon_AuthenticatedAttributes {
  @scala.inline
  def apply(
    authenticatedAttributes: js.Array[Anon_Type],
    certificate: nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate,
    digestAlgorithm: java.lang.String,
    key: java.lang.String
  ): Anon_AuthenticatedAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticatedAttributes")(authenticatedAttributes)
    __obj.updateDynamic("certificate")(certificate)
    __obj.updateDynamic("digestAlgorithm")(digestAlgorithm)
    __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_AuthenticatedAttributes]
  }
}

