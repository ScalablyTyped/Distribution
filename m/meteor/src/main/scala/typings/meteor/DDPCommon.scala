package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import typings.meteor.DDPCommon.MethodInvocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDPCommon")
@js.native
object DDPCommon extends js.Object {
  @js.native
  trait MethodInvocation
    extends Instantiable1[/* options */ js.Object, MethodInvocation] {
    def setUserId(userId: Double): Unit = js.native
    def unblock(): Unit = js.native
  }
  
}

