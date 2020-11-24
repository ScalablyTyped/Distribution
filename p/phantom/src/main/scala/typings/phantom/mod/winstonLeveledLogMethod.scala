package typings.phantom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait winstonLeveledLogMethod extends js.Object {
  
  def apply(infoObject: js.Any): js.Any = js.native
  def apply(message: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  def apply(message: String, meta: js.Any*): js.Any = js.native
  def apply(message: String, meta: js.Any, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
}
