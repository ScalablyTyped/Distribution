package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWorkletCustomPropertiesMod {
  
  @JSImport("popmotion/lib/worklet/custom-properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def namespace(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("namespace")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def registerCustomProperties(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomProperties")().asInstanceOf[Unit]
}
