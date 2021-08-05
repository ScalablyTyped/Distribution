package typings.popcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopcornManifestOptions extends StObject {
  
  var end: PopcornManifestOption
  
  var start: PopcornManifestOption
  
  var target: String
  
  var text: PopcornManifestOption
}
object PopcornManifestOptions {
  
  inline def apply(
    end: PopcornManifestOption,
    start: PopcornManifestOption,
    target: String,
    text: PopcornManifestOption
  ): PopcornManifestOptions = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopcornManifestOptions]
  }
  
  extension [Self <: PopcornManifestOptions](x: Self) {
    
    inline def setEnd(value: PopcornManifestOption): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: PopcornManifestOption): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setText(value: PopcornManifestOption): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
