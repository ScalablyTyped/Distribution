package typings.postmark.mod

import typings.postmark.modelsMod.ClientOptions.Configuration
import typings.postmark.serverClientMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark", "ServerClient")
@js.native
class ServerClient protected () extends default {
  /**
    * Create a client.
    *
    * @param serverToken - The token for the server that you wish to interact with.
    * @param configOptions - Options to customize the behavior of the this client.
    */
  def this(serverToken: String) = this()
  def this(serverToken: String, configOptions: Configuration) = this()
}
