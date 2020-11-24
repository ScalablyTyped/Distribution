package typings.passportOauth2.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-oauth2", "AuthorizationError")
@js.native
class AuthorizationError protected () extends Error {
  def this(message: js.UndefOr[scala.Nothing], code: String) = this()
  def this(message: String, code: String) = this()
  def this(message: js.UndefOr[scala.Nothing], code: String, uri: String) = this()
  def this(message: String, code: String, uri: String) = this()
  def this(message: js.UndefOr[scala.Nothing], code: String, uri: js.UndefOr[scala.Nothing], status: Double) = this()
  def this(message: js.UndefOr[scala.Nothing], code: String, uri: String, status: Double) = this()
  def this(message: String, code: String, uri: js.UndefOr[scala.Nothing], status: Double) = this()
  def this(message: String, code: String, uri: String, status: Double) = this()
  
  var code: String = js.native
  
  var status: Double = js.native
  
  var uri: js.UndefOr[String] = js.native
}
