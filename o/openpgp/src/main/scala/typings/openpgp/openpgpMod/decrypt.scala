package typings.openpgp.openpgpMod

import typings.openpgp.Anon_Binary
import typings.openpgp.Anon_DataNodeStream
import typings.openpgp.Anon_Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "decrypt")
@js.native
object decrypt extends js.Object {
  def apply(options: (DecryptOptions with Anon_Format with Anon_Binary) | DecryptOptions): js.Promise[DecryptResult with Anon_DataNodeStream] = js.native
}

