package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbedOptions extends StObject {
  
  var height: Double | String
  
  var width: Double | String
}
object EmbedOptions {
  
  inline def apply(height: Double | String, width: Double | String): EmbedOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmbedOptions] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
