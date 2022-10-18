package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppDirPages extends StObject {
  
  var appDir: js.UndefOr[String] = js.undefined
  
  var pages: js.UndefOr[String] = js.undefined
}
object AppDirPages {
  
  inline def apply(): AppDirPages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppDirPages]
  }
  
  extension [Self <: AppDirPages](x: Self) {
    
    inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
    
    inline def setAppDirUndefined: Self = StObject.set(x, "appDir", js.undefined)
    
    inline def setPages(value: String): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
  }
}
