package typings.passportDashJwt.passportDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-jwt", "ExtractJwt")
@js.native
object ExtractJwtNs extends js.Object {
  def fromAuthHeader(): JwtFromRequestFunction = js.native
  def fromAuthHeaderAsBearerToken(): JwtFromRequestFunction = js.native
  def fromAuthHeaderWithScheme(auth_scheme: String): JwtFromRequestFunction = js.native
  def fromBodyField(field_name: String): JwtFromRequestFunction = js.native
  def fromExtractors(extractors: js.Array[JwtFromRequestFunction]): JwtFromRequestFunction = js.native
  def fromHeader(header_name: String): JwtFromRequestFunction = js.native
  def fromUrlQueryParameter(param_name: String): JwtFromRequestFunction = js.native
}

