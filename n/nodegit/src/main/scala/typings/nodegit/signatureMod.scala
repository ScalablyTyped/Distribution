package typings.nodegit

import typings.nodegit.repositoryMod.Repository
import typings.nodegit.timeMod.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureMod {
  
  @JSImport("nodegit/signature", "Signature")
  @js.native
  class Signature () extends StObject {
    
    def dup(): js.Promise[Signature] = js.native
    
    def email(): String = js.native
    
    def free(): Unit = js.native
    
    def name(): String = js.native
    
    def when(): Time = js.native
  }
  /* static members */
  object Signature {
    
    @JSImport("nodegit/signature", "Signature")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def default(repo: Repository): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any]).asInstanceOf[Signature]
    
    @scala.inline
    def create(name: String, email: String, time: Double, offset: Double): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], email.asInstanceOf[js.Any], time.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Signature]
    
    @scala.inline
    def fromBuffer(buf: String): js.Promise[Signature] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Signature]]
    
    @scala.inline
    def now(name: String, email: String): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(name.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Signature]
  }
}
