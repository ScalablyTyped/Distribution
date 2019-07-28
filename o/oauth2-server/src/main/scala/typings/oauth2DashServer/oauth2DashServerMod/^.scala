package typings.oauth2DashServer.oauth2DashServerMod

import typings.oauth2DashServer.TypeofClassOAuth2Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an OAuth2 server instance.
  */
@JSImport("oauth2-server", JSImport.Namespace)
@js.native
class ^ protected () extends OAuth2Server {
  /**
    * Instantiates OAuth2Server using the supplied model
    */
  def this(options: ServerOptions) = this()
}

@JSImport("oauth2-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var OAuth2Server: TypeofClassOAuth2Server = js.native
}

