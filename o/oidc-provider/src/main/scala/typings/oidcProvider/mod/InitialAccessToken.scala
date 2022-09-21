package typings.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialAccessToken
  extends StObject
     with BaseToken {
  
  @JSName("clientId")
  var clientId_InitialAccessToken: Unit = js.native
  
  @JSName("kind")
  val kind_InitialAccessToken: typings.oidcProvider.oidcProviderStrings.InitialAccessToken = js.native
  
  var policies: js.UndefOr[js.Array[String]] = js.native
}
