package typings.minappEnv.WXNS

import typings.minappEnv.AnyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDownloadFileTask extends js.Object {
  
  def abort(args: js.Any*): js.Any = js.native
  @JSName("abort")
  var abort_Original: AnyFunction = js.native
  
  def onProgressUpdate(fn: js.Function1[/* event */ IProgressUpdateEvent, Unit]): Unit = js.native
}
