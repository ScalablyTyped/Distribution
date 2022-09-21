package typings.nginstackEngine.anon

import typings.nginstackEngine.virtualFileSystemMod.DBKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseDirectory extends StObject {
  
  var baseDirectory: js.UndefOr[Double | DBKey] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[Double | DBKey] = js.undefined
}
object BaseDirectory {
  
  inline def apply(): BaseDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseDirectory]
  }
  
  extension [Self <: BaseDirectory](x: Self) {
    
    inline def setBaseDirectory(value: Double | DBKey): Self = StObject.set(x, "baseDirectory", value.asInstanceOf[js.Any])
    
    inline def setBaseDirectoryUndefined: Self = StObject.set(x, "baseDirectory", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setKey(value: Double | DBKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
