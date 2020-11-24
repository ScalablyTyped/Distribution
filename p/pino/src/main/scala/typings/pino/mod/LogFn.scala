package typings.pino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogFn extends js.Object {
  
  def apply(msg: String, args: js.Any*): Unit = js.native
  def apply[T /* <: js.Object */](obj: T, msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  /* tslint:disable:no-unnecessary-generics */
  def apply[T /* <: js.Object */](obj: T, msg: String, args: js.Any*): Unit = js.native
}
