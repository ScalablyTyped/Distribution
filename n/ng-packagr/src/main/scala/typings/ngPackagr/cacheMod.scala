package typings.ngPackagr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("ng-packagr/lib/utils/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateKey(valuesToConsider: String*): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(valuesToConsider.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[String]]
  
  inline def readCacheEntry(cachePath: String, key: String): js.Promise[js.UndefOr[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readCacheEntry")(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Any]]]
  
  inline def saveCacheEntry(cachePath: String, key: String, content: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("saveCacheEntry")(cachePath.asInstanceOf[js.Any], key.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
