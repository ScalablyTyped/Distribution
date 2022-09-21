package typings.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseModel extends StObject {
  
  val adapter: Adapter = js.native
  
  def destroy(): js.Promise[Unit] = js.native
  
  def emit(eventName: String): Unit = js.native
  
  var exp: js.UndefOr[Double] = js.native
  
  var iat: js.UndefOr[Double] = js.native
  
  var jti: String = js.native
  
  var kind: String = js.native
  
  def save(): js.Promise[String] = js.native
  def save(ttl: Double): js.Promise[String] = js.native
}
