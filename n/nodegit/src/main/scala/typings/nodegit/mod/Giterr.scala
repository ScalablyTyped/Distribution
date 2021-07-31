package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Giterr")
@js.native
class Giterr ()
  extends typings.nodegit.gitErrMod.Giterr
/* static members */
object Giterr {
  
  @JSImport("nodegit", "Giterr")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def errClear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("errClear")().asInstanceOf[Unit]
  
  @scala.inline
  def errLast(): typings.nodegit.errorMod.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("errLast")().asInstanceOf[typings.nodegit.errorMod.Error]
  
  @scala.inline
  def errSetOom(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("errSetOom")().asInstanceOf[Unit]
  
  @scala.inline
  def errSetString(errorClass: Double, string: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("errSetString")(errorClass.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
