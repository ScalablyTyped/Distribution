package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YoutubeResource extends StObject {
  
  var v3: V3Resource
}
object YoutubeResource {
  
  inline def apply(v3: V3Resource): YoutubeResource = {
    val __obj = js.Dynamic.literal(v3 = v3.asInstanceOf[js.Any])
    __obj.asInstanceOf[YoutubeResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YoutubeResource] (val x: Self) extends AnyVal {
    
    inline def setV3(value: V3Resource): Self = StObject.set(x, "v3", value.asInstanceOf[js.Any])
  }
}
