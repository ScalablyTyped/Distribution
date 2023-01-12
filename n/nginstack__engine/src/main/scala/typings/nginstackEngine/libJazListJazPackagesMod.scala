package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJazListJazPackagesMod {
  
  inline def apply(): js.Array[JazPackageInfo] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[JazPackageInfo]]
  
  @JSImport("@nginstack/engine/lib/jaz/listJazPackages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JazPackageInfo extends StObject {
    
    var name: String
    
    var ufsPath: String
    
    var version: String
  }
  object JazPackageInfo {
    
    inline def apply(name: String, ufsPath: String, version: String): JazPackageInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ufsPath = ufsPath.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[JazPackageInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JazPackageInfo] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUfsPath(value: String): Self = StObject.set(x, "ufsPath", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
