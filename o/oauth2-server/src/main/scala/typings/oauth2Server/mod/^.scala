package typings.oauth2Server.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an OAuth2 server instance.
  */
@JSImport("oauth2-server", JSImport.Namespace)
@js.native
open class ^ protected ()
  extends StObject
     with OAuth2Server {
  /**
    * Instantiates OAuth2Server using the supplied model
    */
  def this(options: ServerOptions) = this()
}
@JSImport("oauth2-server", JSImport.Namespace)
@js.native
object ^
  extends StObject
     with TopLevel[js.Object & (Instantiable1[/* options */ ServerOptions, OAuth2Server])]
