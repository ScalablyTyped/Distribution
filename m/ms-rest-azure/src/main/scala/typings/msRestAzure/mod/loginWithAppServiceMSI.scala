package typings.msRestAzure.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "loginWithAppServiceMSI")
@js.native
object loginWithAppServiceMSI extends js.Object {
  
  def apply(): js.Promise[MSIAppServiceTokenCredentials] = js.native
  def apply(callback: js.Function2[/* err */ Error, /* credentials */ MSIAppServiceTokenCredentials, Unit]): Unit = js.native
  def apply(options: MSIAppServiceOptions): js.Promise[MSIAppServiceTokenCredentials] = js.native
  def apply(
    options: MSIAppServiceOptions,
    callback: js.Function2[/* err */ Error, /* credentials */ MSIAppServiceTokenCredentials, Unit]
  ): Unit = js.native
}
