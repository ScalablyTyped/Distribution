package typings.mobx.internalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "runInAction")
@js.native
object runInAction extends js.Object {
  
  def apply[T](block: js.Function0[T]): T = js.native
  def apply[T](name: String, block: js.Function0[T]): T = js.native
}
