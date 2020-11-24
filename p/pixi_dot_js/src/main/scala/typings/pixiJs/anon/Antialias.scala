package typings.pixiJs.anon

import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Antialias extends js.Object {
  
  var antialias: js.UndefOr[Boolean] = js.native
  
  var autoDensity: js.UndefOr[Boolean] = js.native
  
  var autoStart: js.UndefOr[Boolean] = js.native
  
  var backgroundColor: js.UndefOr[Double] = js.native
  
  var clearBeforeRender: js.UndefOr[Boolean] = js.native
  
  var forceCanvas: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var powerPreference: js.UndefOr[String] = js.native
  
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
  
  var resizeTo: js.UndefOr[Window | HTMLElement] = js.native
  
  var resolution: js.UndefOr[Double] = js.native
  
  var sharedLoader: js.UndefOr[Boolean] = js.native
  
  var sharedTicker: js.UndefOr[Boolean] = js.native
  
  var transparent: js.UndefOr[Boolean] = js.native
  
  var view: js.UndefOr[HTMLCanvasElement] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Antialias {
  
  @scala.inline
  def apply(): Antialias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Antialias]
  }
  
  @scala.inline
  implicit class AntialiasOps[Self <: Antialias] (val x: Self) extends AnyVal {
    
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
    def setAntialias(value: Boolean): Self = this.set("antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntialias: Self = this.set("antialias", js.undefined)
    
    @scala.inline
    def setAutoDensity(value: Boolean): Self = this.set("autoDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDensity: Self = this.set("autoDensity", js.undefined)
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: Double): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setClearBeforeRender(value: Boolean): Self = this.set("clearBeforeRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearBeforeRender: Self = this.set("clearBeforeRender", js.undefined)
    
    @scala.inline
    def setForceCanvas(value: Boolean): Self = this.set("forceCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceCanvas: Self = this.set("forceCanvas", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setPowerPreference(value: String): Self = this.set("powerPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerPreference: Self = this.set("powerPreference", js.undefined)
    
    @scala.inline
    def setPreserveDrawingBuffer(value: Boolean): Self = this.set("preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveDrawingBuffer: Self = this.set("preserveDrawingBuffer", js.undefined)
    
    @scala.inline
    def setResizeTo(value: Window | HTMLElement): Self = this.set("resizeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeTo: Self = this.set("resizeTo", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    
    @scala.inline
    def setSharedLoader(value: Boolean): Self = this.set("sharedLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedLoader: Self = this.set("sharedLoader", js.undefined)
    
    @scala.inline
    def setSharedTicker(value: Boolean): Self = this.set("sharedTicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedTicker: Self = this.set("sharedTicker", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    
    @scala.inline
    def setView(value: HTMLCanvasElement): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
