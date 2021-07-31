package typings.popcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopcornManifestOption extends StObject {
  
  var elem: String
  
  var label: String
  
  var `type`: String
}
object PopcornManifestOption {
  
  @scala.inline
  def apply(elem: String, label: String, `type`: String): PopcornManifestOption = {
    val __obj = js.Dynamic.literal(elem = elem.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopcornManifestOption]
  }
  
  @scala.inline
  implicit class PopcornManifestOptionMutableBuilder[Self <: PopcornManifestOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElem(value: String): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
