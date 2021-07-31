package typings.openseadragon.anon

import typings.openseadragon.mod.Viewer
import typings.openseadragon.mod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugGridColor extends StObject {
  
  var debugGridColor: js.UndefOr[String] = js.undefined
  
  var element: typings.std.Element
  
  var viewer: Viewer
  
  var viewport: Viewport
}
object DebugGridColor {
  
  @scala.inline
  def apply(element: typings.std.Element, viewer: Viewer, viewport: Viewport): DebugGridColor = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], viewer = viewer.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugGridColor]
  }
  
  @scala.inline
  implicit class DebugGridColorMutableBuilder[Self <: DebugGridColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugGridColor(value: String): Self = StObject.set(x, "debugGridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugGridColorUndefined: Self = StObject.set(x, "debugGridColor", js.undefined)
    
    @scala.inline
    def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer(value: Viewer): Self = StObject.set(x, "viewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
