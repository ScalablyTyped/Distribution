package typings.nodemailer.libMailerMailDashMessageMod

import typings.nodemailer.libMailerMod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailMessage extends js.Object {
  var data: Options = js.native
  var mailer: typings.nodemailer.libMailerMod.^ = js.native
  var message: typings.nodemailer.libMimeDashNodeMod.^ = js.native
  def normalize(callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* data */ js.UndefOr[Options], Unit]): Unit = js.native
  def resolveAll(callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* data */ js.UndefOr[Options], Unit]): Unit = js.native
  def resolveContent(
    data: js.Array[_],
    key: String,
    callback: js.Function2[/* err */ Error | Null, /* value */ js.UndefOr[js.Any], _]
  ): js.Promise[_] = js.native
  def resolveContent(
    data: js.Array[_],
    key: Double,
    callback: js.Function2[/* err */ Error | Null, /* value */ js.UndefOr[js.Any], _]
  ): js.Promise[_] = js.native
  def resolveContent(
    data: js.Object,
    key: String,
    callback: js.Function2[/* err */ Error | Null, /* value */ js.UndefOr[js.Any], _]
  ): js.Promise[_] = js.native
  def resolveContent(
    data: js.Object,
    key: Double,
    callback: js.Function2[/* err */ Error | Null, /* value */ js.UndefOr[js.Any], _]
  ): js.Promise[_] = js.native
  def setListHeaders(): Unit = js.native
  def setMailerHeader(): Unit = js.native
  def setPriorityHeaders(): Unit = js.native
}

