package typings.openpgp.mod

import typings.openpgp.AnonData
import typings.openpgp.AnonMessage
import typings.openpgp.AnonSignature
import typings.openpgp.AnonSignatureSignature
import typings.openpgp.SignOptionsarmorfalsedeta
import typings.openpgp.SignOptionsarmorfalsedetaArmor
import typings.openpgp.SignOptionsarmortruedetac
import typings.openpgp.SignOptionsarmortruedetacArmor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "sign")
@js.native
object sign extends js.Object {
  def apply(options: SignOptionsarmorfalsedeta): js.Promise[AnonMessage] = js.native
  def apply(options: SignOptionsarmorfalsedetaArmor): js.Promise[AnonSignatureSignature] = js.native
  def apply(options: SignOptionsarmortruedetac): js.Promise[AnonData] = js.native
  def apply(options: SignOptionsarmortruedetacArmor): js.Promise[AnonSignature] = js.native
  def apply(options: SignOptions): js.Promise[SignResult] = js.native
}

