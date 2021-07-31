package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Odb")
@js.native
class Odb ()
  extends typings.nodegit.odbMod.Odb
/* static members */
object Odb {
  
  @JSImport("nodegit", "Odb")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def open(objectsDir: String): js.Promise[typings.nodegit.odbMod.Odb] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(objectsDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.odbMod.Odb]]
}
