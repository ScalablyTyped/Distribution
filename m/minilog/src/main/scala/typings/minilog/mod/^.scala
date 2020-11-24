package typings.minilog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minilog", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(namespace: String): Minilog = js.native
  
  var backends: MinilogBackends = js.native
  
  var defaultBackend: js.Any = js.native
  
  var defaultFormatter: String = js.native
  
  var suggest: Filter = js.native
}
