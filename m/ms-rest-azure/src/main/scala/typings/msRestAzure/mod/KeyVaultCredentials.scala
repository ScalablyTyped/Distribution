package typings.msRestAzure.mod

import typings.msRest.mod.ServiceCallback
import typings.msRest.mod.ServiceClientCredentials
import typings.msRest.mod.WebResource
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest-azure", "KeyVaultCredentials")
@js.native
class KeyVaultCredentials protected () extends ServiceClientCredentials {
  def this(
    authenticator: js.Function2[/* challenge */ js.Object, /* callback */ js.Any, _],
    credentials: js.Object
  ) = this()
  def addChallengeToCache(webResource: WebResource, chalenge: js.Object): Unit = js.native
  def createSigningFilter(): js.Function3[
    /* resource */ WebResource, 
    /* next */ js.Function, 
    /* callback */ ServiceCallback[_], 
    _
  ] = js.native
  def getCachedChallenge(webResource: WebResource): js.Object = js.native
  def handleUnauthorized(
    webResource: WebResource,
    next: js.Function,
    err: Error,
    response: js.Object,
    body: js.Any,
    callback: ServiceCallback[_]
  ): js.Any = js.native
}

