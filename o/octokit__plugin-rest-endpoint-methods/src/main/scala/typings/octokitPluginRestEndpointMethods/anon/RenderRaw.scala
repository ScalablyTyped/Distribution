package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderRaw extends StObject {
  
  var render: `760` = js.native
  
  var renderRaw: `761` = js.native
}
object RenderRaw {
  
  @scala.inline
  def apply(render: `760`, renderRaw: `761`): RenderRaw = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], renderRaw = renderRaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderRaw]
  }
  
  @scala.inline
  implicit class RenderRawMutableBuilder[Self <: RenderRaw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRender(value: `760`): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderRaw(value: `761`): Self = StObject.set(x, "renderRaw", value.asInstanceOf[js.Any])
  }
}
