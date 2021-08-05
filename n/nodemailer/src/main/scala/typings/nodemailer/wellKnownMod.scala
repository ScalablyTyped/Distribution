package typings.nodemailer

import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.smtpConnectionMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wellKnownMod {
  
  /** Resolves SMTP config for given key. Key can be a name (like 'Gmail'), alias (like 'Google Mail') or an email address (like 'test@googlemail.com'). */
  inline def apply(key: String): Options | `false` = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[Options | `false`]
  
  @JSImport("nodemailer/lib/well-known", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
