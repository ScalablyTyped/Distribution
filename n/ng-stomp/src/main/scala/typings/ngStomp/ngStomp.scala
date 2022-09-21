package typings.ngStomp

import org.scalablytyped.runtime.StringDictionary
import typings.ngStomp.ngStomp.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ngStomp extends StObject {
  
  def connect(endpoint: String): Any = js.native
  def connect(endpoint: String, headers: Headers): Any = js.native
  
  var debug: Any = js.native
  
  def disconnect(callback: js.Function0[Unit]): Any = js.native
  
  var off: Any = js.native
  
  def send(destination: String, body: Any, headers: Headers): Any = js.native
  
  def setDebug(callback: js.Function): Unit = js.native
  
  var sock: Any = js.native
  
  var stomp: Any = js.native
  
  def subscribe(
    destination: String,
    callback: js.Function3[/* payload */ String, /* headers */ Headers, /* res */ js.Function, Unit]
  ): Any = js.native
  def subscribe(
    destination: String,
    callback: js.Function3[/* payload */ String, /* headers */ Headers, /* res */ js.Function, Unit],
    headers: Unit,
    scope: Any
  ): Any = js.native
  def subscribe(
    destination: String,
    callback: js.Function3[/* payload */ String, /* headers */ Headers, /* res */ js.Function, Unit],
    headers: Headers
  ): Any = js.native
  def subscribe(
    destination: String,
    callback: js.Function3[/* payload */ String, /* headers */ Headers, /* res */ js.Function, Unit],
    headers: Headers,
    scope: Any
  ): Any = js.native
  
  def unsubscribe(): Any = js.native
}
object ngStomp {
  
  type Headers = StringDictionary[Any]
}
