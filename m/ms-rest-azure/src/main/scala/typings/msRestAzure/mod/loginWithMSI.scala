package typings.msRestAzure.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "loginWithMSI")
@js.native
object loginWithMSI extends js.Object {
  
  def apply(): js.Promise[MSIVmTokenCredentials] = js.native
  def apply(callback: js.Function2[/* err */ Error, /* credentials */ MSIVmTokenCredentials, Unit]): Unit = js.native
  def apply(options: MSIVmOptions): js.Promise[MSIVmTokenCredentials] = js.native
  def apply(
    options: MSIVmOptions,
    callback: js.Function2[/* err */ Error, /* credentials */ MSIVmTokenCredentials, Unit]
  ): Unit = js.native
}
