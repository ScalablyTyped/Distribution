package typings.nats.errorMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/error", "Messages")
@js.native
open class Messages () extends StObject {
  
  def getMessage(s: String): String = js.native
  
  var messages: Map[String, String] = js.native
}
/* static members */
object Messages {
  
  @JSImport("nats/lib/nats-base-client/error", "Messages")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMessage(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
