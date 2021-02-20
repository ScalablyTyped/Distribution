package typings.popcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopcornManifestOptions extends StObject {
  
  var end: PopcornManifestOption = js.native
  
  var start: PopcornManifestOption = js.native
  
  var target: String = js.native
  
  var text: PopcornManifestOption = js.native
}
object PopcornManifestOptions {
  
  @scala.inline
  def apply(
    end: PopcornManifestOption,
    start: PopcornManifestOption,
    target: String,
    text: PopcornManifestOption
  ): PopcornManifestOptions = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopcornManifestOptions]
  }
  
  @scala.inline
  implicit class PopcornManifestOptionsMutableBuilder[Self <: PopcornManifestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: PopcornManifestOption): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: PopcornManifestOption): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: PopcornManifestOption): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
