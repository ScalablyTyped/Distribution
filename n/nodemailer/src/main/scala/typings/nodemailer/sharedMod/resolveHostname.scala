package typings.nodemailer.sharedMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/shared", "resolveHostname")
@js.native
object resolveHostname extends js.Object {
  def apply(
    options: js.UndefOr[Null | ResolveHostnameOptions],
    callback: js.Function2[Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = js.native
}

