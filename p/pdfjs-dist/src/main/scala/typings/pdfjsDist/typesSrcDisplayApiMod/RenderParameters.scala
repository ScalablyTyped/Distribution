package typings.pdfjsDist.typesSrcDisplayApiMod

import typings.pdfjsDist.typesSrcDisplayAnnotationStorageMod.PrintAnnotationStorage
import typings.pdfjsDist.typesSrcDisplayDisplayUtilsMod.PageViewport
import typings.pdfjsDist.typesSrcDisplayOptionalContentConfigMod.OptionalContentConfig
import typings.std.HTMLCanvasElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderParameters extends StObject {
  
  /**
    * - Map some
    * annotation ids with canvases used to render them.
    */
  var annotationCanvasMap: js.UndefOr[Map[String, HTMLCanvasElement]] = js.undefined
  
  /**
    * Controls which annotations are rendered
    * onto the canvas, for annotations with appearance-data; the values from
    * {@link AnnotationMode } should be used. The following values are supported:
    * - `AnnotationMode.DISABLE`, which disables all annotations.
    * - `AnnotationMode.ENABLE`, which includes all possible annotations (thus
    * it also depends on the `intent`-option, see above).
    * - `AnnotationMode.ENABLE_FORMS`, which excludes annotations that contain
    * interactive form elements (those will be rendered in the display layer).
    * - `AnnotationMode.ENABLE_STORAGE`, which includes all possible annotations
    * (as above) but where interactive form elements are updated with data
    * from the {@link AnnotationStorage }-instance; useful e.g. for printing.
    * The default value is `AnnotationMode.ENABLE`.
    */
  var annotationMode: js.UndefOr[Double] = js.undefined
  
  /**
    * - Background to use for the canvas.
    * Any valid `canvas.fillStyle` can be used: a `DOMString` parsed as CSS
    * <color> value, a `CanvasGradient` object (a linear or radial gradient) or
    * a `CanvasPattern` object (a repetitive image). The default value is
    * 'rgb(255,255,255)'.
    *
    * NOTE: This option may be partially, or completely, ignored when the
    * `pageColors`-option is used.
    */
  var background: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * - A 2D context of a DOM Canvas object.
    */
  var canvasContext: js.Object
  
  /**
    * - The factory instance that will be used
    * when creating canvases. The default value is {new DOMCanvasFactory()}.
    */
  var canvasFactory: js.UndefOr[js.Object] = js.undefined
  
  /**
    * - Rendering intent, can be 'display', 'print',
    * or 'any'. The default value is 'display'.
    */
  var intent: js.UndefOr[String] = js.undefined
  
  /**
    * -
    * A promise that should resolve with an {@link OptionalContentConfig }created from `PDFDocumentProxy.getOptionalContentConfig`. If `null`,
    * the configuration will be fetched automatically with the default visibility
    * states set.
    */
  var optionalContentConfigPromise: js.UndefOr[js.Promise[OptionalContentConfig]] = js.undefined
  
  /**
    * - Overwrites background and foreground colors
    * with user defined ones in order to improve readability in high contrast
    * mode.
    */
  var pageColors: js.UndefOr[js.Object] = js.undefined
  
  var printAnnotationStorage: js.UndefOr[PrintAnnotationStorage] = js.undefined
  
  /**
    * - Additional transform, applied just
    * before viewport transform.
    */
  var transform: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * - Rendering viewport obtained by calling
    * the `PDFPageProxy.getViewport` method.
    */
  var viewport: PageViewport
}
object RenderParameters {
  
  inline def apply(canvasContext: js.Object, viewport: PageViewport): RenderParameters = {
    val __obj = js.Dynamic.literal(canvasContext = canvasContext.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderParameters] (val x: Self) extends AnyVal {
    
    inline def setAnnotationCanvasMap(value: Map[String, HTMLCanvasElement]): Self = StObject.set(x, "annotationCanvasMap", value.asInstanceOf[js.Any])
    
    inline def setAnnotationCanvasMapUndefined: Self = StObject.set(x, "annotationCanvasMap", js.undefined)
    
    inline def setAnnotationMode(value: Double): Self = StObject.set(x, "annotationMode", value.asInstanceOf[js.Any])
    
    inline def setAnnotationModeUndefined: Self = StObject.set(x, "annotationMode", js.undefined)
    
    inline def setBackground(value: String | js.Object): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setCanvasContext(value: js.Object): Self = StObject.set(x, "canvasContext", value.asInstanceOf[js.Any])
    
    inline def setCanvasFactory(value: js.Object): Self = StObject.set(x, "canvasFactory", value.asInstanceOf[js.Any])
    
    inline def setCanvasFactoryUndefined: Self = StObject.set(x, "canvasFactory", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setOptionalContentConfigPromise(value: js.Promise[OptionalContentConfig]): Self = StObject.set(x, "optionalContentConfigPromise", value.asInstanceOf[js.Any])
    
    inline def setOptionalContentConfigPromiseUndefined: Self = StObject.set(x, "optionalContentConfigPromise", js.undefined)
    
    inline def setPageColors(value: js.Object): Self = StObject.set(x, "pageColors", value.asInstanceOf[js.Any])
    
    inline def setPageColorsUndefined: Self = StObject.set(x, "pageColors", js.undefined)
    
    inline def setPrintAnnotationStorage(value: PrintAnnotationStorage): Self = StObject.set(x, "printAnnotationStorage", value.asInstanceOf[js.Any])
    
    inline def setPrintAnnotationStorageUndefined: Self = StObject.set(x, "printAnnotationStorage", js.undefined)
    
    inline def setTransform(value: js.Array[Any]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransformVarargs(value: Any*): Self = StObject.set(x, "transform", js.Array(value*))
    
    inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
