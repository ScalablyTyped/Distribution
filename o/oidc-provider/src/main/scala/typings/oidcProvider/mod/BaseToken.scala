package typings.oidcProvider.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseToken
  extends StObject
     with BaseModel {
  
  var client: js.UndefOr[Client] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  val expiration: Double = js.native
  
  val format: js.UndefOr[String] = js.native
  
  @JSName("iat")
  var iat_BaseToken: Double = js.native
  
  val isExpired: Boolean = js.native
  
  val isValid: Boolean = js.native
  
  val remainingTTL: Double = js.native
  
  val scopes: Set[String] = js.native
  
  def ttlPercentagePassed(): Double = js.native
}
