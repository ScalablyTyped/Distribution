package typings.packageInfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(name: String): js.Promise[Package] = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Package]]
  
  @JSImport("package-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Package extends StObject {
    
    var author: String
    
    var description: String
    
    var homepage: String
    
    var license: String
    
    var name: String
    
    var version: String
  }
  object Package {
    
    @scala.inline
    def apply(
      author: String,
      description: String,
      homepage: String,
      license: String,
      name: String,
      version: String
    ): Package = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Package]
    }
    
    @scala.inline
    implicit class PackageMutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
