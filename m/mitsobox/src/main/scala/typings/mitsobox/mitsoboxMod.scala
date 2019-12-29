package typings.mitsobox

import typings.mitsobox.mitsoboxStrings.ABORT
import typings.mitsobox.mitsoboxStrings.CANCEL
import typings.mitsobox.mitsoboxStrings.IGNORE
import typings.mitsobox.mitsoboxStrings.OK
import typings.mitsobox.mitsoboxStrings.RETRY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mitsobox", JSImport.Namespace)
@js.native
object mitsoboxMod extends js.Object {
  def abortRetryIgnore(title: String, message: String): js.Promise[ABORT | RETRY | IGNORE] = js.native
  def ok(title: String, message: String): js.Promise[Unit] = js.native
  def okCancel(title: String, message: String): js.Promise[OK | CANCEL] = js.native
}

