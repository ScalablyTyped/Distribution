package typings.next

import typings.next.anon.Ascent
import typings.next.anon.Content
import typings.next.anon.Descent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerFontUtilsMod {
  
  @JSImport("next/dist/server/font-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateOverrideValues(fontMetrics: Any): Ascent = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateOverrideValues")(fontMetrics.asInstanceOf[js.Any]).asInstanceOf[Ascent]
  
  inline def calculateSizeAdjustValues(fontMetrics: Any): Descent = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateSizeAdjustValues")(fontMetrics.asInstanceOf[js.Any]).asInstanceOf[Descent]
  
  inline def getFontDefinitionFromManifest(url: String, manifest: FontManifest): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontDefinitionFromManifest")(url.asInstanceOf[js.Any], manifest.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getFontDefinitionFromNetwork(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontDefinitionFromNetwork")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getFontOverrideCss(url: String, css: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontOverrideCss")(url.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getFontOverrideCss(url: String, css: String, useSizeAdjust: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontOverrideCss")(url.asInstanceOf[js.Any], css.asInstanceOf[js.Any], useSizeAdjust.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type FontConfig = Boolean
  
  type FontManifest = js.Array[Content]
}
