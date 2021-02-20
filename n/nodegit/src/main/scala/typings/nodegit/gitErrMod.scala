package typings.nodegit

import typings.nodegit.errorMod.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitErrMod {
  
  @JSImport("nodegit/git-err", "Giterr")
  @js.native
  class Giterr () extends StObject
  /* static members */
  object Giterr {
    
    @JSImport("nodegit/git-err", "Giterr.errClear")
    @js.native
    def errClear(): Unit = js.native
    
    @JSImport("nodegit/git-err", "Giterr.errLast")
    @js.native
    def errLast(): Error = js.native
    
    @JSImport("nodegit/git-err", "Giterr.errSetOom")
    @js.native
    def errSetOom(): Unit = js.native
    
    @JSImport("nodegit/git-err", "Giterr.errSetString")
    @js.native
    def errSetString(errorClass: Double, string: String): Unit = js.native
  }
}
