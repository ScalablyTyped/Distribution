package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistDirHasServerComponents extends StObject {
  
  var distDir: String
  
  var hasServerComponents: Boolean
  
  var isAppPath: Boolean
  
  var pathname: String
}
object DistDirHasServerComponents {
  
  inline def apply(distDir: String, hasServerComponents: Boolean, isAppPath: Boolean, pathname: String): DistDirHasServerComponents = {
    val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any], hasServerComponents = hasServerComponents.asInstanceOf[js.Any], isAppPath = isAppPath.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistDirHasServerComponents]
  }
  
  extension [Self <: DistDirHasServerComponents](x: Self) {
    
    inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setHasServerComponents(value: Boolean): Self = StObject.set(x, "hasServerComponents", value.asInstanceOf[js.Any])
    
    inline def setIsAppPath(value: Boolean): Self = StObject.set(x, "isAppPath", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
  }
}
