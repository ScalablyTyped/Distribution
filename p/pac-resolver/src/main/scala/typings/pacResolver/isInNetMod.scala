package typings.pacResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pac-resolver/dist/isInNet", JSImport.Namespace)
@js.native
object isInNetMod extends js.Object {
  
  def default(host: String, pattern: String, mask: String): js.Promise[Boolean] = js.native
}
