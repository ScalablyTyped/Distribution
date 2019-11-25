package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dispose extends js.Object {
  var key: String
  def dispose(): Unit
}

object Anon_Dispose {
  @scala.inline
  def apply(dispose: () => Unit, key: String): Anon_Dispose = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dispose]
  }
}

