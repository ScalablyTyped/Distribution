package typings.minappEnv.WXNS

import typings.minappEnv.AnyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUploadFileTask extends js.Object {
  @JSName("abort")
  var abort_Original: AnyFunction = js.native
  def abort(args: js.Any*): js.Any = js.native
  def onProgressUpdate(fn: js.Function1[/* event */ IProgressUpdateEvent, Unit]): Unit = js.native
}

