package typings.phonegapPluginPush

import org.scalablytyped.runtime.TopLevel
import typings.phonegapPluginPush.PhonegapPluginPush.InitOptions
import typings.phonegapPluginPush.PhonegapPluginPush.PushNotificationStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class PushNotification protected ()
    extends typings.phonegapPluginPush.PhonegapPluginPush.PushNotification {
    def this(options: InitOptions) = this()
  }
  
  @js.native
  object PushNotification extends TopLevel[PushNotificationStatic]
  
}

