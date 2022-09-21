package typings.nyaapi.mod.si

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  @JSImport("nyaapi", "si.config")
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateBaseUrl(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateBaseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("nyaapi", "si.config.url")
  @js.native
  val url: String = js.native
}
