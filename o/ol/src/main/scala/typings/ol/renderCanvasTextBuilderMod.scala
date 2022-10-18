package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasTextBuilderMod {
  
  @JSImport("ol/render/canvas/TextBuilder", JSImport.Default)
  @js.native
  open class default protected () extends CanvasTextBuilder {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  sealed trait TEXT_ALIGN extends StObject
  @JSImport("ol/render/canvas/TextBuilder", "TEXT_ALIGN")
  @js.native
  object TEXT_ALIGN extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TEXT_ALIGN & Double] = js.native
    
    @js.native
    sealed trait alphabetic
      extends StObject
         with TEXT_ALIGN
    /* 0.8 */ val alphabetic: typings.ol.renderCanvasTextBuilderMod.TEXT_ALIGN.alphabetic & Double = js.native
    
    @js.native
    sealed trait bottom
      extends StObject
         with TEXT_ALIGN
    /* 1 */ val bottom: typings.ol.renderCanvasTextBuilderMod.TEXT_ALIGN.bottom & Double = js.native
    
    @js.native
    sealed trait center
      extends StObject
         with TEXT_ALIGN
    /* 0.5 */ val center: typings.ol.renderCanvasTextBuilderMod.TEXT_ALIGN.center & Double = js.native
    
    @js.native
    sealed trait end
      extends StObject
         with TEXT_ALIGN
    /* 0 */ val end: typings.ol.renderCanvasTextBuilderMod.TEXT_ALIGN.end & Double = js.native
    
    @js.native
    sealed trait hanging
      extends StObject
         with TEXT_ALIGN
    /* 0.2 */ val hanging: typings.ol.renderCanvasTextBuilderMod.TEXT_ALIGN.hanging & Double = js.native
    
    @js.native
    sealed trait ideographic
      extends StObject
         with TEXT_ALIGN
    /* 0.8 */ val ideographic: typings.ol.renderCanvasTextBuilderMod.TEXT_ALIGN.ideographic & Double = js.native
    
    @js.native
    sealed trait left
      extends StObject
         with TEXT_ALIGN
    /* 0 */ val left: typings.ol.renderCanvasTextBuilderMod.TEXT_ALIGN.left & Double = js.native
    
    @js.native
    sealed trait middle
      extends StObject
         with TEXT_ALIGN
    /* 0.5 */ val middle: typings.ol.renderCanvasTextBuilderMod.TEXT_ALIGN.middle & Double = js.native
    
    @js.native
    sealed trait right
      extends StObject
         with TEXT_ALIGN
    /* 1 */ val right: typings.ol.renderCanvasTextBuilderMod.TEXT_ALIGN.right & Double = js.native
    
    @js.native
    sealed trait start
      extends StObject
         with TEXT_ALIGN
    /* 1 */ val start: typings.ol.renderCanvasTextBuilderMod.TEXT_ALIGN.start & Double = js.native
    
    @js.native
    sealed trait top
      extends StObject
         with TEXT_ALIGN
    /* 0 */ val top: typings.ol.renderCanvasTextBuilderMod.TEXT_ALIGN.top & Double = js.native
  }
  
  @js.native
  trait CanvasTextBuilder
    extends typings.ol.renderCanvasBuilderMod.default {
    
    def setTextStyle(textStyle: typings.ol.styleTextMod.default, opt_sharedData: Any): Unit = js.native
  }
}
