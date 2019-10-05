package typings.meteorDashTypings.meteorDdpMod

import org.scalablytyped.runtime.Instantiable1
import typings.meteorDashTypings.meteorDdpMod.DDPCommon.MethodInvocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/ddp", "DDPCommon")
@js.native
object DDPCommon extends js.Object {
  @js.native
  trait MethodInvocation
    extends Instantiable1[/* options */ js.Object, MethodInvocation] {
    def setUserId(userId: Double): Unit = js.native
    def unblock(): Unit = js.native
  }
  
}

