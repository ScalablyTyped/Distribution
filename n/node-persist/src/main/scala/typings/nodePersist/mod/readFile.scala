package typings.nodePersist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-persist", "readFile")
@js.native
object readFile extends js.Object {
  
  def apply(file: String): js.Promise[Datum | String] = js.native
  def apply(file: String, options: DatumOptions): js.Promise[Datum | String] = js.native
}
