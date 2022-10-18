package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderRaw extends StObject {
  
  var render: `1140`
  
  var renderRaw: `1141`
}
object RenderRaw {
  
  inline def apply(render: `1140`, renderRaw: `1141`): RenderRaw = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], renderRaw = renderRaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderRaw]
  }
  
  extension [Self <: RenderRaw](x: Self) {
    
    inline def setRender(value: `1140`): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderRaw(value: `1141`): Self = StObject.set(x, "renderRaw", value.asInstanceOf[js.Any])
  }
}
