package typings.nodemailer.sharedMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/shared", "callbackPromise")
@js.native
object callbackPromise extends js.Object {
  def apply(resolve: js.Function1[/* repeated */ js.Any, Unit], reject: js.Function1[/* err */ Error, Unit]): js.Function0[Unit] = js.native
}

