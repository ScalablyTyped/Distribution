package typings.parsePackageName

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(path: String): PackageInfo = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[PackageInfo]
  
  @JSImport("parse-package-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PackageInfo extends StObject {
    
    var name: String
    
    var path: String
    
    var version: String
  }
  object PackageInfo {
    
    @scala.inline
    def apply(name: String, path: String, version: String): PackageInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageInfo]
    }
    
    @scala.inline
    implicit class PackageInfoMutableBuilder[Self <: PackageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
