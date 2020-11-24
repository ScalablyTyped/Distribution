package typings.nodeSass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncContext extends Context {
  
  @JSName("callback")
  def callback_MAsyncContext(err: SassError, result: Result): js.Any = js.native
  @JSName("callback")
  var callback_Original: SassRenderCallback = js.native
}
