package typings.pixiAssets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsCheckDataUrlMod {
  
  @JSImport("@pixi/assets/lib/utils/checkDataUrl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkDataUrl(url: String, mimes: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataUrl")(url.asInstanceOf[js.Any], mimes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def checkDataUrl(url: String, mimes: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDataUrl")(url.asInstanceOf[js.Any], mimes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
