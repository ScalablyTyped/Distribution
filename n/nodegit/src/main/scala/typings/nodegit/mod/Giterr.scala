package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Giterr")
@js.native
class Giterr ()
  extends typings.nodegit.gitErrMod.Giterr
/* static members */
object Giterr {
  
  @JSImport("nodegit", "Giterr.errClear")
  @js.native
  def errClear(): Unit = js.native
  
  @JSImport("nodegit", "Giterr.errLast")
  @js.native
  def errLast(): typings.nodegit.errorMod.Error = js.native
  
  @JSImport("nodegit", "Giterr.errSetOom")
  @js.native
  def errSetOom(): Unit = js.native
  
  @JSImport("nodegit", "Giterr.errSetString")
  @js.native
  def errSetString(errorClass: Double, string: String): Unit = js.native
}
