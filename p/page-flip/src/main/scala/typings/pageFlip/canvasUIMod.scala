package typings.pageFlip

import typings.pageFlip.pageFlipMod.PageFlip
import typings.pageFlip.settingsMod.FlipSetting
import typings.pageFlip.uIMod.UI
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasUIMod {
  
  @JSImport("page-flip/dist/UI/CanvasUI", "CanvasUI")
  @js.native
  open class CanvasUI protected () extends UI {
    def this(inBlock: HTMLElement, app: PageFlip, setting: FlipSetting) = this()
    
    /* private */ val canvas: Any = js.native
    
    /**
      * Get canvas element
      */
    def getCanvas(): HTMLCanvasElement = js.native
    
    /* private */ var resizeCanvas: Any = js.native
  }
}
