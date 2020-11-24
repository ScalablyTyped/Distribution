package typings.nodePersist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-persist", "set")
@js.native
object set extends js.Object {
  
  def apply(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
  def apply(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
}
