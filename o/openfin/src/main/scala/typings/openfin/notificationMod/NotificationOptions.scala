package typings.openfin.notificationMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/api/notification/notification", "NotificationOptions")
@js.native
class NotificationOptions protected () extends js.Object {
  def this(options: js.Any, identity: Identity, notificationId: Double) = this()
  
  var ignoreMouseOver: Boolean = js.native
  
  var message: String = js.native
  
  var notificationId: Double = js.native
  
  var timeout: String | Double = js.native
  
  var url: String = js.native
  
  var uuidOfProxiedApp: String = js.native
}
