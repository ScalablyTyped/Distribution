package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openid-client", "TokenSet")
@js.native
open class TokenSet ()
  extends StObject
     with TokenSetParameters {
  def this(input: TokenSetParameters) = this()
  
  def claims(): IdTokenClaims = js.native
  
  def expired(): Boolean = js.native
  
  var expires_in: js.UndefOr[Double] = js.native
}
