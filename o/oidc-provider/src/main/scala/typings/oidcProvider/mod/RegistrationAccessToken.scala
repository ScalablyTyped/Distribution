package typings.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistrationAccessToken
  extends StObject
     with BaseToken {
  
  @JSName("kind")
  val kind_RegistrationAccessToken: typings.oidcProvider.oidcProviderStrings.RegistrationAccessToken = js.native
  
  var policies: js.UndefOr[js.Array[String]] = js.native
}
