package typings.msRestAzure.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "interactiveLogin")
@js.native
object interactiveLogin extends js.Object {
  
  def apply(): js.Promise[DeviceTokenCredentials] = js.native
  def apply(
    optionalCallback: js.Function3[
      /* err */ Error, 
      /* credentials */ DeviceTokenCredentials, 
      /* subscriptions */ js.Array[LinkedSubscription], 
      Unit
    ]
  ): Unit = js.native
  def apply(options: InteractiveLoginOptions): js.Promise[DeviceTokenCredentials] = js.native
  def apply(
    options: InteractiveLoginOptions,
    optionalCallback: js.Function3[
      /* err */ Error, 
      /* credentials */ DeviceTokenCredentials, 
      /* subscriptions */ js.Array[LinkedSubscription], 
      Unit
    ]
  ): Unit = js.native
}
