package typings.nodemailer.anon

import typings.nodemailer.mailerMod.^
import typings.nodemailer.sesTransportMod.SentMessageInfo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  var mail: ^ = js.native
  def callback(err: Null, info: SentMessageInfo): Unit = js.native
  def callback(err: Error, info: SentMessageInfo): Unit = js.native
}

