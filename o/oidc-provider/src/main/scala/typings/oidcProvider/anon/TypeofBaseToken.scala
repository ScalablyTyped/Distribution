package typings.oidcProvider.anon

import typings.oidcProvider.mod.Adapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBaseToken extends StObject {
  
  /* static member */
  var IN_PAYLOAD: js.Array[String] = js.native
  
  /* static member */
  val adapter: Adapter = js.native
  
  /* static member */
  def find[T](jti: String): js.Promise[js.UndefOr[T]] = js.native
  def find[T](jti: String, options: IgnoreExpiration): js.Promise[js.UndefOr[T]] = js.native
}
