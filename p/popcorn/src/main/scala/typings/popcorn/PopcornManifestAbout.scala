package typings.popcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopcornManifestAbout extends StObject {
  
  var author: String
  
  var name: String
  
  var version: String
  
  var website: String
}
object PopcornManifestAbout {
  
  inline def apply(author: String, name: String, version: String, website: String): PopcornManifestAbout = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopcornManifestAbout]
  }
  
  extension [Self <: PopcornManifestAbout](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
  }
}
