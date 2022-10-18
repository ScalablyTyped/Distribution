package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagesDir extends StObject {
  
  var dev: Boolean
  
  var filename: String
  
  var pagesDir: js.UndefOr[String] = js.undefined
  
  var runtimeAsset: js.UndefOr[String] = js.undefined
}
object PagesDir {
  
  inline def apply(dev: Boolean, filename: String): PagesDir = {
    val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagesDir]
  }
  
  extension [Self <: PagesDir](x: Self) {
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setPagesDir(value: String): Self = StObject.set(x, "pagesDir", value.asInstanceOf[js.Any])
    
    inline def setPagesDirUndefined: Self = StObject.set(x, "pagesDir", js.undefined)
    
    inline def setRuntimeAsset(value: String): Self = StObject.set(x, "runtimeAsset", value.asInstanceOf[js.Any])
    
    inline def setRuntimeAssetUndefined: Self = StObject.set(x, "runtimeAsset", js.undefined)
  }
}
