package typings.nextServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRuntimeConfigMod {
  
  @JSImport("next-server/dist/lib/runtime-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Any]
  
  inline def setConfig(configValue: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(configValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
