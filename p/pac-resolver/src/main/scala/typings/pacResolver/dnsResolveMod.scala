package typings.pacResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pac-resolver/dist/dnsResolve", JSImport.Namespace)
@js.native
object dnsResolveMod extends js.Object {
  
  def default(host: String): js.Promise[String | Null] = js.native
}
