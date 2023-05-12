package typings.olMapboxStyle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMapboxMod {
  
  @JSImport("ol-mapbox-style/dist/mapbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMapboxPath(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMapboxPath")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeSourceUrl(url: String, token: String, tokenParam: String, styleUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSourceUrl")(url.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tokenParam.asInstanceOf[js.Any], styleUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def normalizeSpriteUrl(url: String, token: String, styleUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSpriteUrl")(url.asInstanceOf[js.Any], token.asInstanceOf[js.Any], styleUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def normalizeStyleUrl(url: String, token: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStyleUrl")(url.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[String]
}
