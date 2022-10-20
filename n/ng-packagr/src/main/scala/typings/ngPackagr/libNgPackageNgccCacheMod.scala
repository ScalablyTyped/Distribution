package typings.ngPackagr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageNgccCacheMod {
  
  @JSImport("ng-packagr/lib/ng-package/ngcc-cache", "NgccProcessingCache")
  @js.native
  open class NgccProcessingCache () extends StObject {
    
    def clear(): Unit = js.native
    
    def hasProcessed(moduleName: String): Boolean = js.native
    
    def markProcessed(moduleName: String): Unit = js.native
    
    /* private */ var populate: Any = js.native
    
    /* private */ val processedModuleNames: Any = js.native
  }
}
