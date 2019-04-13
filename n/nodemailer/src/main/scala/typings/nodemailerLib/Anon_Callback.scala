package typings
package nodemailerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  var mail: nodemailerLib.libMailerMod.^ = js.native
  def callback(err: scala.Null, info: nodemailerLib.libSesDashTransportMod.SentMessageInfo): scala.Unit = js.native
  def callback(err: stdLib.Error, info: nodemailerLib.libSesDashTransportMod.SentMessageInfo): scala.Unit = js.native
}

