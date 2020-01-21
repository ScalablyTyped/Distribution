package typings.openpgp.mod

import typings.openpgp.AnonBinary
import typings.openpgp.AnonDataNodeStream
import typings.openpgp.AnonFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "decrypt")
@js.native
object decrypt extends js.Object {
  def apply(options: (DecryptOptions with AnonFormat with AnonBinary) | DecryptOptions): js.Promise[DecryptResult with AnonDataNodeStream] = js.native
}

