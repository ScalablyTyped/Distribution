package typings.popcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopcornManifest extends StObject {
  
  var about: PopcornManifestAbout
  
  var options: PopcornManifestOptions
}
object PopcornManifest {
  
  inline def apply(about: PopcornManifestAbout, options: PopcornManifestOptions): PopcornManifest = {
    val __obj = js.Dynamic.literal(about = about.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopcornManifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopcornManifest] (val x: Self) extends AnyVal {
    
    inline def setAbout(value: PopcornManifestAbout): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PopcornManifestOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
