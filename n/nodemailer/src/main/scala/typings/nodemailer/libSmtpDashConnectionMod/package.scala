package typings.nodemailer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSmtpDashConnectionMod {
  type CustomAuthenticationHandlers = StringDictionary[
    js.Function1[/* ctx */ CustomAuthenticationContext, js.Promise[Boolean] | js.Any]
  ]
  type OAuth2 = typings.nodemailer.libXoauth2Mod.Options
  type ms = Double
}
