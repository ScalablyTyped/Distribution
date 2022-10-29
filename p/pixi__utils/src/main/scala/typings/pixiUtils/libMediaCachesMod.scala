package typings.pixiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaCachesMod {
  
  @JSImport("@pixi/utils/lib/media/caches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearTextureCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTextureCache")().asInstanceOf[Unit]
  
  inline def destroyTextureCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyTextureCache")().asInstanceOf[Unit]
}
