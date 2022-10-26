package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppDirPagesDir extends StObject {
  
  var appDir: js.UndefOr[String] = js.undefined
  
  var pagesDir: js.UndefOr[String] = js.undefined
}
object AppDirPagesDir {
  
  inline def apply(): AppDirPagesDir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppDirPagesDir]
  }
  
  extension [Self <: AppDirPagesDir](x: Self) {
    
    inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
    
    inline def setAppDirUndefined: Self = StObject.set(x, "appDir", js.undefined)
    
    inline def setPagesDir(value: String): Self = StObject.set(x, "pagesDir", value.asInstanceOf[js.Any])
    
    inline def setPagesDirUndefined: Self = StObject.set(x, "pagesDir", js.undefined)
  }
}
