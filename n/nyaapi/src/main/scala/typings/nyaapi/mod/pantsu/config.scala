package typings.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  @JSImport("nyaapi", "pantsu.config")
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateBaseUrl(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateBaseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("nyaapi", "pantsu.config.url")
  @js.native
  val url: String = js.native
}
