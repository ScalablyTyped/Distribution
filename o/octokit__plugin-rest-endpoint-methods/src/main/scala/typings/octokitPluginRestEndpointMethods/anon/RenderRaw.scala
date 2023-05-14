package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderRaw extends StObject {
  
  var render: `1227`
  
  var renderRaw: `1228`
}
object RenderRaw {
  
  inline def apply(render: `1227`, renderRaw: `1228`): RenderRaw = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], renderRaw = renderRaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderRaw]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderRaw] (val x: Self) extends AnyVal {
    
    inline def setRender(value: `1227`): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderRaw(value: `1228`): Self = StObject.set(x, "renderRaw", value.asInstanceOf[js.Any])
  }
}
