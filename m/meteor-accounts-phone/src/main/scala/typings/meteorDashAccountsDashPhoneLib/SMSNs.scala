package typings
package meteorDashAccountsDashPhoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SMS")
@js.native
object SMSNs extends js.Object {
  def send(options: js.Object): scala.Unit = js.native
  def send(options: js.Object, callback: js.Function): scala.Unit = js.native
  @js.native
  object phoneTemplate extends js.Object {
    var from: java.lang.String = js.native
    var text: js.Function = js.native
  }
  
  @js.native
  object twilio extends js.Object {
    var ACCOUNT_SID: js.UndefOr[java.lang.String] = js.native
    var AUTH_TOKEN: js.UndefOr[java.lang.String] = js.native
    var FROM: js.UndefOr[java.lang.String] = js.native
  }
  
}

