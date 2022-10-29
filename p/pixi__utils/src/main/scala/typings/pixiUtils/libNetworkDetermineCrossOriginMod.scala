package typings.pixiUtils

import typings.std.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNetworkDetermineCrossOriginMod {
  
  @JSImport("@pixi/utils/lib/network/determineCrossOrigin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def determineCrossOrigin(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("determineCrossOrigin")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def determineCrossOrigin(url: String, loc: Location): String = (^.asInstanceOf[js.Dynamic].applyDynamic("determineCrossOrigin")(url.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[String]
}
