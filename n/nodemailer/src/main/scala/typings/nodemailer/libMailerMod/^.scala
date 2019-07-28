package typings.nodemailer.libMailerMod

import typings.nodemailer.nodemailerMod.Transport
import typings.nodemailer.nodemailerMod.TransportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates an object for exposing the Mail API */
@JSImport("nodemailer/lib/mailer", JSImport.Namespace)
@js.native
class ^ protected () extends Mail {
  def this(transporter: Transport) = this()
  def this(transporter: Transport, options: TransportOptions) = this()
  def this(transporter: Transport, options: TransportOptions, defaults: TransportOptions) = this()
}

