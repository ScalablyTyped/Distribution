package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Signature")
@js.native
class Signature ()
  extends typings.nodegit.signatureMod.Signature
/* static members */
object Signature {
  
  @JSImport("nodegit", "Signature")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(repo: typings.nodegit.repositoryMod.Repository): typings.nodegit.signatureMod.Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any]).asInstanceOf[typings.nodegit.signatureMod.Signature]
  
  @scala.inline
  def create(name: String, email: String, time: Double, offset: Double): typings.nodegit.signatureMod.Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], email.asInstanceOf[js.Any], time.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.nodegit.signatureMod.Signature]
  
  @scala.inline
  def fromBuffer(buf: String): js.Promise[typings.nodegit.signatureMod.Signature] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.signatureMod.Signature]]
  
  @scala.inline
  def now(name: String, email: String): typings.nodegit.signatureMod.Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(name.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[typings.nodegit.signatureMod.Signature]
}
