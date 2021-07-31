package typings.oauth2Server.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientCredentialsModel
  extends StObject
     with BaseModel
     with RequestAuthenticationModel {
  
  /**
    * Invoked to retrieve the user associated with the specified client.
    *
    */
  def getUserFromClient(client: Client): js.Promise[User | Falsey] = js.native
  def getUserFromClient(client: Client, callback: Callback[User | Falsey]): js.Promise[User | Falsey] = js.native
  
  /**
    * Invoked to check if the requested scope is valid for a particular client/user combination.
    *
    */
  var validateScope: js.UndefOr[
    js.Function4[
      /* user */ User, 
      /* client */ Client, 
      /* scope */ String | js.Array[String], 
      /* callback */ js.UndefOr[Callback[String | Falsey]], 
      js.Promise[String | js.Array[String] | Falsey]
    ]
  ] = js.native
}
