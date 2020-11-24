package typings.mysticateaSpy.mod.Spy_

import typings.mysticateaSpy.mysticateaSpyStrings.`return`
import typings.mysticateaSpy.mysticateaSpyStrings.`throw`
import typings.std.Parameters
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information for each call. */
/* Rewritten from type alias, can be one of: 
  - typings.mysticateaSpy.mod.Spy_.ReturnedCall[T]
  - typings.mysticateaSpy.mod.Spy_.ThrownCall[T]
*/
trait Call[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object
object Call {
  
  @scala.inline
  def ReturnedCall[T /* <: js.Function1[/* repeated */ js.Any, _] */](arguments: Parameters[T], `return`: ReturnType[T], `type`: `return`): Call[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Call[T]]
  }
  
  @scala.inline
  def ThrownCall[T /* <: js.Function1[/* repeated */ js.Any, _] */](arguments: Parameters[T], `throw`: js.Any, `type`: `throw`): Call[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Call[T]]
  }
}
