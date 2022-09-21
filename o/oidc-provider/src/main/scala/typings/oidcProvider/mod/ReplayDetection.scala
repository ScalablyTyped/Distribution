package typings.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplayDetection extends StObject {
  
  val adapter: Adapter = js.native
  
  val kind: typings.oidcProvider.oidcProviderStrings.ReplayDetection = js.native
  
  def unique(iss: String, jti: String): js.Promise[Boolean] = js.native
  def unique(iss: String, jti: String, exp: Double): js.Promise[Boolean] = js.native
}
