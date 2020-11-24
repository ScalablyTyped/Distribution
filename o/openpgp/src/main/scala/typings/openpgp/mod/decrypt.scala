package typings.openpgp.mod

import typings.openpgp.anon.DecryptOptionsformatbinar
import typings.openpgp.anon.DecryptOptionsformatutf8
import typings.openpgp.anon.DecryptResultdataUint8Arr
import typings.openpgp.anon.DecryptResultdatastringRe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "decrypt")
@js.native
object decrypt extends js.Object {
  
  def apply(options: DecryptOptionsformatbinar): js.Promise[DecryptResultdataUint8Arr] = js.native
  def apply(options: DecryptOptionsformatutf8): js.Promise[DecryptResultdatastringRe] = js.native
  def apply(options: DecryptOptions): js.Promise[DecryptResult] = js.native
}
