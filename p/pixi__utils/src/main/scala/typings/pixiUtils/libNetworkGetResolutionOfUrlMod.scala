package typings.pixiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNetworkGetResolutionOfUrlMod {
  
  @JSImport("@pixi/utils/lib/network/getResolutionOfUrl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getResolutionOfUrl(url: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolutionOfUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getResolutionOfUrl(url: String, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolutionOfUrl")(url.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
}
