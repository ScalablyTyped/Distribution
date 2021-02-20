package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Hashsig")
@js.native
class Hashsig ()
  extends typings.nodegit.hashSigMod.Hashsig
/* static members */
object Hashsig {
  
  @JSImport("nodegit", "Hashsig.create")
  @js.native
  def create(buf: String, buflen: Double, opts: Double): js.Promise[typings.nodegit.hashSigMod.Hashsig] = js.native
  
  @JSImport("nodegit", "Hashsig.createFromFile")
  @js.native
  def createFromFile(path: String, opts: Double): js.Promise[typings.nodegit.hashSigMod.Hashsig] = js.native
}
