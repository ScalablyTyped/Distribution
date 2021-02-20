package typings.phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends StObject {
  
  def off(event: String, callback: js.Function1[/* event */ js.Any, Unit]): Unit = js.native
  def off(event: String, callback: js.Function1[/* event */ js.Any, Unit], useCapture: Boolean): Unit = js.native
  
  def on(event: String, callback: js.Function1[/* event */ js.Any, Unit]): Unit = js.native
  def on(event: String, callback: js.Function1[/* event */ js.Any, Unit], useCapture: Boolean): Unit = js.native
}
