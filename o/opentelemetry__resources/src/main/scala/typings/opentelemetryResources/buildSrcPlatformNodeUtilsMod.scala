package typings.opentelemetryResources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeUtilsMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/node/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeArch(nodeArchString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeArch")(nodeArchString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeType(nodePlatform: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeType")(nodePlatform.asInstanceOf[js.Any]).asInstanceOf[String]
}
