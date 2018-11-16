package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/session", JSImport.Namespace)
@js.native
object sessionMod extends js.Object {
  @JSName("Session")
  @js.native
  object SessionNs extends js.Object {
    def equals(key: java.lang.String, value: java.lang.String): scala.Boolean = js.native
    def equals(key: java.lang.String, value: js.Any): scala.Boolean = js.native
    def equals(key: java.lang.String, value: scala.Boolean): scala.Boolean = js.native
    def equals(key: java.lang.String, value: scala.Double): scala.Boolean = js.native
    def get(key: java.lang.String): js.Any = js.native
    def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
    def set(key: java.lang.String, value: meteorLib.EJSONable): scala.Unit = js.native
    def setDefault(key: java.lang.String, value: js.Any): scala.Unit = js.native
    def setDefault(key: java.lang.String, value: meteorLib.EJSONable): scala.Unit = js.native
  }
  
}

