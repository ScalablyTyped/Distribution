package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.renderCanvasMod.FillState
import typings.ol.renderCanvasMod.StrokeState
import typings.ol.renderCanvasMod.TextState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasTextBuilderMod {
  
  @JSImport("ol/render/canvas/TextBuilder", JSImport.Default)
  @js.native
  open class default () extends CanvasTextBuilder
  
  object TEXT_ALIGN {
    
    @JSImport("ol/render/canvas/TextBuilder", "TEXT_ALIGN.alphabetic")
    @js.native
    val alphabetic: Double = js.native
    
    @JSImport("ol/render/canvas/TextBuilder", "TEXT_ALIGN.bottom")
    @js.native
    val bottom: Double = js.native
    
    @JSImport("ol/render/canvas/TextBuilder", "TEXT_ALIGN.center")
    @js.native
    val center: Double = js.native
    
    @JSImport("ol/render/canvas/TextBuilder", "TEXT_ALIGN.end")
    @js.native
    val end: Double = js.native
    
    @JSImport("ol/render/canvas/TextBuilder", "TEXT_ALIGN.hanging")
    @js.native
    val hanging: Double = js.native
    
    @JSImport("ol/render/canvas/TextBuilder", "TEXT_ALIGN.ideographic")
    @js.native
    val ideographic: Double = js.native
    
    @JSImport("ol/render/canvas/TextBuilder", "TEXT_ALIGN.left")
    @js.native
    val left: Double = js.native
    
    @JSImport("ol/render/canvas/TextBuilder", "TEXT_ALIGN.middle")
    @js.native
    val middle: Double = js.native
    
    @JSImport("ol/render/canvas/TextBuilder", "TEXT_ALIGN.right")
    @js.native
    val right: Double = js.native
    
    @JSImport("ol/render/canvas/TextBuilder", "TEXT_ALIGN.start")
    @js.native
    val start: Double = js.native
    
    @JSImport("ol/render/canvas/TextBuilder", "TEXT_ALIGN.top")
    @js.native
    val top: Double = js.native
  }
  type TEXT_ALIGN = Double
  
  @js.native
  trait CanvasTextBuilder
    extends typings.ol.renderCanvasBuilderMod.default {
    
    /**
      * Data shared with an image builder for combined decluttering.
      * @private
      * @type {import("../canvas.js").DeclutterImageWithText}
      */
    /* private */ var declutterImageWithText_ : Any = js.native
    
    /**
      * @private
      * @param {number} begin Begin.
      * @param {number} end End.
      */
    /* private */ var drawChars_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var fillKey_ : Any = js.native
    
    /**
      * @type {!Object<string, import("../canvas.js").FillState>}
      */
    var fillStates: StringDictionary[FillState] = js.native
    
    /**
      * @private
      * @type {Array<HTMLCanvasElement>}
      */
    /* private */ var labels_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var saveTextStates_ : Any = js.native
    
    def setTextStyle(textStyle: typings.ol.styleTextMod.default, sharedData: Any): Unit = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var strokeKey_ : Any = js.native
    
    /**
      * @type {!Object<string, import("../canvas.js").StrokeState>}
      */
    var strokeStates: StringDictionary[StrokeState] = js.native
    
    /**
      * @private
      * @type {?import("../canvas.js").FillState}
      */
    /* private */ var textFillState_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var textKey_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var textOffsetX_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var textOffsetY_ : Any = js.native
    
    /**
      * @private
      * @type {boolean|undefined}
      */
    /* private */ var textRotateWithView_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var textRotation_ : Any = js.native
    
    /**
      * @private
      * @type {import("../canvas.js").TextState}
      */
    /* private */ var textState_ : Any = js.native
    
    /**
      * @type {!Object<string, import("../canvas.js").TextState>}
      */
    var textStates: StringDictionary[TextState] = js.native
    
    /**
      * @private
      * @type {?import("../canvas.js").StrokeState}
      */
    /* private */ var textStrokeState_ : Any = js.native
    
    /**
      * @private
      * @type {string|Array<string>}
      */
    /* private */ var text_ : Any = js.native
  }
}
