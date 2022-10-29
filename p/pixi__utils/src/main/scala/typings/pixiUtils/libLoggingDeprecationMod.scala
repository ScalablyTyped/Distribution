package typings.pixiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoggingDeprecationMod {
  
  @JSImport("@pixi/utils/lib/logging/deprecation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deprecation(version: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecation")(version.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deprecation(version: String, message: String, ignoreDepth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecation")(version.asInstanceOf[js.Any], message.asInstanceOf[js.Any], ignoreDepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
