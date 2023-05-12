package typings.pdfjsDist

import typings.pdfjsDist.typesSrcDisplayEditorEditorMod.AnnotationEditor
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.Path2D
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorInkMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/ink", "InkEditor")
  @js.native
  open class InkEditor protected () extends AnnotationEditor {
    def this(params: Any) = this()
    
    var bezierPath2D: js.Array[Any] = js.native
    
    var canvas: js.UndefOr[HTMLCanvasElement | Null] = js.native
    
    /**
      * onpointerdown callback for the canvas we're drawing on.
      * @param {PointerEvent} event
      */
    def canvasPointerdown(event: PointerEvent): Unit = js.native
    
    /**
      * onpointerleave callback for the canvas we're drawing on.
      * @param {PointerEvent} event
      */
    def canvasPointerleave(event: PointerEvent): Unit = js.native
    
    /**
      * onpointermove callback for the canvas we're drawing on.
      * @param {PointerEvent} event
      */
    def canvasPointermove(event: PointerEvent): Unit = js.native
    
    /**
      * onpointerup callback for the canvas we're drawing on.
      * @param {PointerEvent} event
      */
    def canvasPointerup(event: PointerEvent): Unit = js.native
    
    var color: Any = js.native
    
    var ctx: js.UndefOr[CanvasRenderingContext2D | Null] = js.native
    
    var currentPath: js.Array[Any] = js.native
    
    def onScaleChanging(): Unit = js.native
    
    var opacity: Any = js.native
    
    var paths: js.Array[Any] = js.native
    
    var scaleFactor: Double = js.native
    
    /**
      * When the dimensions of the div change the inner canvas must
      * renew its dimensions, hence it must redraw its own contents.
      * @param {number} width - the new width of the div
      * @param {number} height - the new height of the div
      * @returns
      */
    def setDimensions(width: Double, height: Double): Unit = js.native
    
    var thickness: Any = js.native
    
    var translationX: Double = js.native
    
    var translationY: Double = js.native
    
    /** @inheritdoc */
    def updateParams(`type`: Any, value: Any): Unit = js.native
  }
  /* static members */
  object InkEditor {
    
    @JSImport("pdfjs-dist/types/src/display/editor/ink", "InkEditor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert the output of fitCurve in some Path2D.
      * @param {Arra<Array<number>} bezier
      * @returns {Path2D}
      */
    inline def `__Numbersign4@NumbersignbuildPath2D`(
      bezier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Arra<Array<number>> */ Any
    ): Path2D = ^.asInstanceOf[js.Dynamic].applyDynamic("__#4@#buildPath2D")(bezier.asInstanceOf[js.Any]).asInstanceOf[Path2D]
    
    @JSImport("pdfjs-dist/types/src/display/editor/ink", "InkEditor._defaultColor")
    @js.native
    def _defaultColor: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def _defaultColor_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultColor")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/ink", "InkEditor._defaultOpacity")
    @js.native
    def _defaultOpacity: Double = js.native
    inline def _defaultOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/ink", "InkEditor._defaultThickness")
    @js.native
    def _defaultThickness: Double = js.native
    inline def _defaultThickness_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultThickness")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/ink", "InkEditor._l10nPromise")
    @js.native
    def _l10nPromise: Any = js.native
    inline def _l10nPromise_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_l10nPromise")(x.asInstanceOf[js.Any])
    
    @JSImport("pdfjs-dist/types/src/display/editor/ink", "InkEditor._type")
    @js.native
    def _type: String = js.native
    inline def _type_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_type")(x.asInstanceOf[js.Any])
    
    /** @inheritdoc */
    inline def deserialize(data: Any, parent: Any, uiManager: Any): AnnotationEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], uiManager.asInstanceOf[js.Any])).asInstanceOf[AnnotationEditor]
    
    inline def initialize(l10n: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(l10n.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def updateDefaultParams(`type`: Any, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDefaultParams")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
