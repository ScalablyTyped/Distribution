package typings.openseadragon.anon

import typings.openseadragon.mod.Viewer
import typings.openseadragon.mod.Viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugGridColor extends js.Object {
  
  var debugGridColor: js.UndefOr[String] = js.native
  
  var element: typings.std.Element = js.native
  
  var viewer: Viewer = js.native
  
  var viewport: Viewport = js.native
}
object DebugGridColor {
  
  @scala.inline
  def apply(element: typings.std.Element, viewer: Viewer, viewport: Viewport): DebugGridColor = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], viewer = viewer.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugGridColor]
  }
  
  @scala.inline
  implicit class DebugGridColorOps[Self <: DebugGridColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElement(value: typings.std.Element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer(value: Viewer): Self = this.set("viewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: Viewport): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugGridColor(value: String): Self = this.set("debugGridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugGridColor: Self = this.set("debugGridColor", js.undefined)
  }
}
