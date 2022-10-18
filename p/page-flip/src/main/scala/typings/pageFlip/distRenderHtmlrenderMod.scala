package typings.pageFlip

import typings.pageFlip.distPageFlipMod.PageFlip
import typings.pageFlip.distRenderRenderMod.Render
import typings.pageFlip.distSettingsMod.FlipSetting
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRenderHtmlrenderMod {
  
  @JSImport("page-flip/dist/Render/HTMLRender", "HTMLRender")
  @js.native
  open class HTMLRender protected () extends Render {
    def this(app: PageFlip, setting: FlipSetting, element: HTMLElement) = this()
    
    /* private */ var clear: Any = js.native
    
    /* private */ var createShadows: Any = js.native
    
    /**
      * Draw the next page at the time of flipping
      */
    /* private */ var drawBottomPage: Any = js.native
    
    /**
      * Draw inner shadow to the hard page
      */
    /* private */ var drawHardInnerShadow: Any = js.native
    
    /**
      * Draw outer shadow to the hard page
      */
    /* private */ var drawHardOuterShadow: Any = js.native
    
    /**
      * Draw inner shadow to the soft page
      */
    /* private */ var drawInnerShadow: Any = js.native
    
    /**
      * Draw left static page
      */
    /* private */ var drawLeftPage: Any = js.native
    
    /**
      * Draw outer shadow to the soft page
      */
    /* private */ var drawOuterShadow: Any = js.native
    
    /**
      * Draw right static page
      */
    /* private */ var drawRightPage: Any = js.native
    
    /** Parent HTML Element */
    /* private */ val element: Any = js.native
    
    /* private */ var hardInnerShadow: Any = js.native
    
    /* private */ var hardShadow: Any = js.native
    
    /* private */ var innerShadow: Any = js.native
    
    /** Pages List as HTMLElements */
    /* private */ val items: Any = js.native
    
    /* private */ var outerShadow: Any = js.native
  }
}
