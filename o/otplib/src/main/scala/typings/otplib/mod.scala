package typings.otplib

import typings.otplibCore.authenticatorMod.AuthenticatorOptions_
import typings.otplibCore.hotpMod.HOTPOptions_
import typings.otplibCore.mod.Authenticator
import typings.otplibCore.mod.HOTP
import typings.otplibCore.mod.TOTP
import typings.otplibCore.totpMod.TOTPOptions_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("otplib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val authenticator: Authenticator[AuthenticatorOptions_[String]] = js.native
  
  val hotp: HOTP[HOTPOptions_[String]] = js.native
  
  val totp: TOTP[TOTPOptions_[String]] = js.native
}
