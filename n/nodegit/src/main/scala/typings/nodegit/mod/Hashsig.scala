package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Hashsig")
@js.native
open class Hashsig ()
  extends typings.nodegit.hashSigMod.Hashsig
/* static members */
object Hashsig {
  
  @JSImport("nodegit", "Hashsig")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(buf: String, buflen: Double, opts: Double): js.Promise[typings.nodegit.hashSigMod.Hashsig] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(buf.asInstanceOf[js.Any], buflen.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.hashSigMod.Hashsig]]
  
  inline def createFromFile(path: String, opts: Double): js.Promise[typings.nodegit.hashSigMod.Hashsig] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromFile")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.hashSigMod.Hashsig]]
}
