package typings.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientCredentials
  extends StObject
     with BaseToken {
  
  var aud: String | js.Array[String] = js.native
  
  var extra: js.UndefOr[UnknownObject] = js.native
  
  def isSenderConstrained(): Boolean = js.native
  
  var jkt: js.UndefOr[String] = js.native
  
  @JSName("kind")
  val kind_ClientCredentials: typings.oidcProvider.oidcProviderStrings.ClientCredentials = js.native
  
  var resourceServer: js.UndefOr[ResourceServer] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  val tokenType: String = js.native
  
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.native
}
