package typings.nodegit

import typings.nodegit.repositoryMod.Repository
import typings.nodegit.timeMod.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @JSImport("nodegit/signature", "Signature.default")
    @js.native
    def default(repo: Repository): Signature = js.native
    
    @JSImport("nodegit/signature", "Signature.create")
    @js.native
    def create(name: String, email: String, time: Double, offset: Double): Signature = js.native
    
    @JSImport("nodegit/signature", "Signature.fromBuffer")
    @js.native
    def fromBuffer(buf: String): js.Promise[Signature] = js.native
    
    @JSImport("nodegit/signature", "Signature.now")
    @js.native
    def now(name: String, email: String): Signature = js.native
  }
}
