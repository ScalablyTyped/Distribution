package typings.postal.anon

import typings.postal.ICallback
import typings.postal.IEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends js.Object {
  
  def callback(data: js.Any, envelope: IEnvelope[_]): Unit = js.native
  @JSName("callback")
  var callback_Original: ICallback[_] = js.native
  
  var channel: js.UndefOr[String] = js.native
  
  var topic: String = js.native
}
