package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object custom {
  
  @JSImport("openid-client", "custom")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("openid-client", "custom.clock_tolerance")
  @js.native
  val clockTolerance: js.Symbol = js.native
  
  @JSImport("openid-client", "custom.http_options")
  @js.native
  val httpOptions: js.Symbol = js.native
  
  inline def setHttpOptionsDefaults(params: HttpOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHttpOptionsDefaults")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
