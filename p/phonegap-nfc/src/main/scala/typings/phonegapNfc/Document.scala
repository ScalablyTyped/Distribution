package typings.phonegapNfc

import typings.phonegapNfc.phonegapNfcStrings.deviceready
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_deviceready(`type`: deviceready, listener: js.Function1[/* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceready(`type`: deviceready, listener: js.Function1[/* ev */ Event, Any], useCapture: Boolean): Unit = js.native
}
