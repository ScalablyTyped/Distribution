package typings.phonegapNfc

import typings.phonegapNfc.phonegapNfcStrings.deviceready
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends js.Object {
  
  @JSName("addEventListener")
  def addEventListener_deviceready(`type`: deviceready, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceready(`type`: deviceready, listener: js.Function1[/* ev */ Event, _], useCapture: Boolean): Unit = js.native
}
