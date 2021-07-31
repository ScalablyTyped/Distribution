package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Oid")
@js.native
class Oid ()
  extends typings.nodegit.oidMod.Oid
/* static members */
object Oid {
  
  @JSImport("nodegit", "Oid")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromString(str: String): typings.nodegit.oidMod.Oid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.nodegit.oidMod.Oid]
}
