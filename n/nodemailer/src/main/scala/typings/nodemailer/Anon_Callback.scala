package typings.nodemailer

import typings.nodemailer.libMailerMod.^
import typings.nodemailer.libSesDashTransportMod.SentMessageInfo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  var mail: ^ = js.native
  def callback(err: Null, info: SentMessageInfo): Unit = js.native
  def callback(err: Error, info: SentMessageInfo): Unit = js.native
}

