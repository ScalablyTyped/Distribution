package typings.nodegit

import typings.nodegit.errorMod.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitErrMod {
  
  @JSImport("nodegit/git-err", "Giterr")
  @js.native
  class Giterr () extends StObject
  /* static members */
  object Giterr {
    
    @JSImport("nodegit/git-err", "Giterr")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def errClear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("errClear")().asInstanceOf[Unit]
    
    @scala.inline
    def errLast(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("errLast")().asInstanceOf[Error]
    
    @scala.inline
    def errSetOom(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("errSetOom")().asInstanceOf[Unit]
    
    @scala.inline
    def errSetString(errorClass: Double, string: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("errSetString")(errorClass.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
