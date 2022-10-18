package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryPostPayloadMod {
  
  @JSImport("next/dist/telemetry/post-payload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def postPayload(endpoint: String, body: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_postPayload")(endpoint.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Any]
}
