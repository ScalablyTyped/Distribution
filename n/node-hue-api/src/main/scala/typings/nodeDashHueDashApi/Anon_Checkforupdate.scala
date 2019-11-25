package typings.nodeDashHueDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checkforupdate extends js.Object {
  var checkforupdate: Boolean
  var devicetypes: Anon_Bridge
  @JSName("notify")
  var notify_FAnon_Checkforupdate: Boolean
  var text: String
  var updatestate: Double
  var url: String
}

object Anon_Checkforupdate {
  @scala.inline
  def apply(
    checkforupdate: Boolean,
    devicetypes: Anon_Bridge,
    notify: Boolean,
    text: String,
    updatestate: Double,
    url: String
  ): Anon_Checkforupdate = {
    val __obj = js.Dynamic.literal(checkforupdate = checkforupdate.asInstanceOf[js.Any], devicetypes = devicetypes.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatestate = updatestate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Checkforupdate]
  }
}

