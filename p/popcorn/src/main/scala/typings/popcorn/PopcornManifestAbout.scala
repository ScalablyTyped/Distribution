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
  
  @scala.inline
  def apply(author: String, name: String, version: String, website: String): PopcornManifestAbout = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopcornManifestAbout]
  }
  
  @scala.inline
  implicit class PopcornManifestAboutMutableBuilder[Self <: PopcornManifestAbout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
  }
}
