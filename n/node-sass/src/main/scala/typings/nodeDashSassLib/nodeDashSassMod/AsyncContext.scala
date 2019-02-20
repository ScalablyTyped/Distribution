package typings
package nodeDashSassLib.nodeDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncContext extends Context {
  @JSName("callback")
  var callback_Original: SassRenderCallback = js.native
  @JSName("callback")
  def callback_MAsyncContext(err: SassError, result: Result): js.Any = js.native
}

