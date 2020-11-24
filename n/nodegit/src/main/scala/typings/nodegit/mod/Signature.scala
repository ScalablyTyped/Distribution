package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Signature")
@js.native
class Signature ()
  extends typings.nodegit.signatureMod.Signature
/* static members */
@JSImport("nodegit", "Signature")
@js.native
object Signature extends js.Object {
  
  def create(name: String, email: String, time: Double, offset: Double): typings.nodegit.signatureMod.Signature = js.native
  
  def default(repo: typings.nodegit.repositoryMod.Repository): typings.nodegit.signatureMod.Signature = js.native
  
  def fromBuffer(buf: String): js.Promise[typings.nodegit.signatureMod.Signature] = js.native
  
  def now(name: String, email: String): typings.nodegit.signatureMod.Signature = js.native
}
