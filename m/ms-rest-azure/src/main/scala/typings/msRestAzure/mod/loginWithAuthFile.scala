package typings.msRestAzure.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "loginWithAuthFile")
@js.native
object loginWithAuthFile extends js.Object {
  
  def apply(): js.Promise[ApplicationTokenCredentials] = js.native
  def apply(
    callback: js.Function3[
      /* err */ Error, 
      /* credentials */ ApplicationTokenCredentials, 
      /* subscriptions */ js.Array[LinkedSubscription], 
      Unit
    ]
  ): Unit = js.native
  def apply(options: AuthFileOptions): js.Promise[ApplicationTokenCredentials] = js.native
  def apply(
    options: AuthFileOptions,
    callback: js.Function3[
      /* err */ Error, 
      /* credentials */ ApplicationTokenCredentials, 
      /* subscriptions */ js.Array[LinkedSubscription], 
      Unit
    ]
  ): Unit = js.native
}
