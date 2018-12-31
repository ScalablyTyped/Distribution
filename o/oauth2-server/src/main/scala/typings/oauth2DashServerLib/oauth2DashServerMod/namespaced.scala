package typings
package oauth2DashServerLib.oauth2DashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an OAuth2 server instance.
  */
@JSImport("oauth2-server", JSImport.Namespace)
@js.native
class namespaced protected () extends OAuth2Server {
  /**
    * Instantiates OAuth2Server using the supplied model
    */
  def this(options: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.ServerOptions) = this()
}

/**
  * Represents an OAuth2 server instance.
  */
@JSImport("oauth2-server", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var OAuth2Server: oauth2DashServerLib.Anon_OAuthError with (org.scalablytyped.runtime.Instantiable1[
    /* options */ oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.ServerOptions, 
    oauth2DashServerLib.oauth2DashServerMod.OAuth2Server
  ]) = js.native
}

