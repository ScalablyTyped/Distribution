package typings
package nodemailerLib.libMailerMailDashMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailMessage extends js.Object {
  var data: nodemailerLib.libMailerMod.MailNs.Options = js.native
  var mailer: nodemailerLib.libMailerMod.namespaced = js.native
  var message: nodemailerLib.libMimeDashNodeMod.namespaced = js.native
  def normalize(
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
      /* data */ js.UndefOr[nodemailerLib.libMailerMod.MailNs.Options], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveAll(
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
      /* data */ js.UndefOr[nodemailerLib.libMailerMod.MailNs.Options], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveContent(
    data: js.Array[_],
    key: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* value */ js.UndefOr[js.Any], _]
  ): js.Promise[_] = js.native
  def resolveContent(
    data: js.Array[_],
    key: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* value */ js.UndefOr[js.Any], _]
  ): js.Promise[_] = js.native
  def resolveContent(
    data: js.Object,
    key: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* value */ js.UndefOr[js.Any], _]
  ): js.Promise[_] = js.native
  def resolveContent(
    data: js.Object,
    key: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* value */ js.UndefOr[js.Any], _]
  ): js.Promise[_] = js.native
  def setListHeaders(): scala.Unit = js.native
  def setMailerHeader(): scala.Unit = js.native
  def setPriorityHeaders(): scala.Unit = js.native
}

