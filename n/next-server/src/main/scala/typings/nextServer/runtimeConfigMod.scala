package typings.nextServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeConfigMod {
  
  @JSImport("next-server/dist/lib/runtime-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Any]
  
  inline def setConfig(configValue: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(configValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
