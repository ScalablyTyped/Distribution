package typings.meteorDashAccountsDashPhone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", JSImport.Namespace)
@js.native
object meteorMeteorMod extends js.Object {
  @JSName("Meteor")
  @js.native
  object MeteorNs extends js.Object {
    def loginWithPhoneAndPassword(selector: String, password: String): Unit = js.native
    def loginWithPhoneAndPassword(selector: String, password: String, callback: js.Function): Unit = js.native
    def loginWithPhoneAndPassword(selector: js.Object, password: String): Unit = js.native
    def loginWithPhoneAndPassword(selector: js.Object, password: String, callback: js.Function): Unit = js.native
  }
  
}

