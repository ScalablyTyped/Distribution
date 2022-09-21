package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderRaw extends StObject {
  
  var render: `1112`
  
  var renderRaw: `1113`
}
object RenderRaw {
  
  inline def apply(render: `1112`, renderRaw: `1113`): RenderRaw = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], renderRaw = renderRaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderRaw]
  }
  
  extension [Self <: RenderRaw](x: Self) {
    
    inline def setRender(value: `1112`): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderRaw(value: `1113`): Self = StObject.set(x, "renderRaw", value.asInstanceOf[js.Any])
  }
}
