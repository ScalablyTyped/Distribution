package typings
package passportDashJwtLib.passportDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-jwt", "ExtractJwt")
@js.native
object ExtractJwtNs extends js.Object {
  def fromAuthHeader(): passportDashJwtLib.passportDashJwtMod.JwtFromRequestFunction = js.native
  def fromAuthHeaderAsBearerToken(): passportDashJwtLib.passportDashJwtMod.JwtFromRequestFunction = js.native
  def fromAuthHeaderWithScheme(auth_scheme: java.lang.String): passportDashJwtLib.passportDashJwtMod.JwtFromRequestFunction = js.native
  def fromBodyField(field_name: java.lang.String): passportDashJwtLib.passportDashJwtMod.JwtFromRequestFunction = js.native
  def fromExtractors(extractors: js.Array[passportDashJwtLib.passportDashJwtMod.JwtFromRequestFunction]): passportDashJwtLib.passportDashJwtMod.JwtFromRequestFunction = js.native
  def fromHeader(header_name: java.lang.String): passportDashJwtLib.passportDashJwtMod.JwtFromRequestFunction = js.native
  def fromUrlQueryParameter(param_name: java.lang.String): passportDashJwtLib.passportDashJwtMod.JwtFromRequestFunction = js.native
}

