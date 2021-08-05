package typings.next

import typings.next.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontUtilsMod {
  
  @JSImport("next/dist/next-server/server/font-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFontDefinitionFromManifest(url: String, manifest: FontManifest): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontDefinitionFromManifest")(url.asInstanceOf[js.Any], manifest.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getFontDefinitionFromNetwork(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontDefinitionFromNetwork")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  type FontManifest = js.Array[Content]
}
