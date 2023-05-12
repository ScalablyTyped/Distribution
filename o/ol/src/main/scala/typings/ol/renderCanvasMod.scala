package typings.ol

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.ol.anon.Height
import typings.ol.colorlikeMod.ColorLike
import typings.ol.objectMod.default
import typings.ol.renderCanvasExecutorMod.ReplayImageOrLabelArgs
import typings.ol.sizeMod.Size
import typings.ol.styleTextMod.TextJustify
import typings.ol.styleTextMod.TextPlacement
import typings.ol.transformMod.Transform
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import typings.std.CanvasRenderingContext2D
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasMod {
  
  @JSImport("ol/render/canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/render/canvas", "checkedFonts")
  @js.native
  val checkedFonts: default = js.native
  
  @JSImport("ol/render/canvas", "defaultFillStyle")
  @js.native
  val defaultFillStyle: ColorLike = js.native
  
  @JSImport("ol/render/canvas", "defaultFont")
  @js.native
  val defaultFont: String = js.native
  
  @JSImport("ol/render/canvas", "defaultLineCap")
  @js.native
  val defaultLineCap: CanvasLineCap = js.native
  
  @JSImport("ol/render/canvas", "defaultLineDash")
  @js.native
  val defaultLineDash: js.Array[Double] = js.native
  
  @JSImport("ol/render/canvas", "defaultLineDashOffset")
  @js.native
  val defaultLineDashOffset: Double = js.native
  
  @JSImport("ol/render/canvas", "defaultLineJoin")
  @js.native
  val defaultLineJoin: CanvasLineJoin = js.native
  
  @JSImport("ol/render/canvas", "defaultLineWidth")
  @js.native
  val defaultLineWidth: Double = js.native
  
  @JSImport("ol/render/canvas", "defaultMiterLimit")
  @js.native
  val defaultMiterLimit: Double = js.native
  
  @JSImport("ol/render/canvas", "defaultPadding")
  @js.native
  val defaultPadding: js.Array[Double] = js.native
  
  @JSImport("ol/render/canvas", "defaultStrokeStyle")
  @js.native
  val defaultStrokeStyle: ColorLike = js.native
  
  @JSImport("ol/render/canvas", "defaultTextAlign")
  @js.native
  val defaultTextAlign: CanvasTextAlign = js.native
  
  @JSImport("ol/render/canvas", "defaultTextBaseline")
  @js.native
  val defaultTextBaseline: CanvasTextBaseline = js.native
  
  inline def drawImageOrLabel(
    context: CanvasRenderingContext2D,
    transform: Null,
    opacity: Double,
    labelOrImage: Label,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Size
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImageOrLabel")(context.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], labelOrImage.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawImageOrLabel(
    context: CanvasRenderingContext2D,
    transform: Null,
    opacity: Double,
    labelOrImage: HTMLCanvasElement,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Size
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImageOrLabel")(context.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], labelOrImage.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawImageOrLabel(
    context: CanvasRenderingContext2D,
    transform: Null,
    opacity: Double,
    labelOrImage: HTMLImageElement,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Size
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImageOrLabel")(context.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], labelOrImage.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawImageOrLabel(
    context: CanvasRenderingContext2D,
    transform: Null,
    opacity: Double,
    labelOrImage: HTMLVideoElement,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Size
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImageOrLabel")(context.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], labelOrImage.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawImageOrLabel(
    context: CanvasRenderingContext2D,
    transform: Transform,
    opacity: Double,
    labelOrImage: Label,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Size
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImageOrLabel")(context.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], labelOrImage.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawImageOrLabel(
    context: CanvasRenderingContext2D,
    transform: Transform,
    opacity: Double,
    labelOrImage: HTMLCanvasElement,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Size
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImageOrLabel")(context.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], labelOrImage.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawImageOrLabel(
    context: CanvasRenderingContext2D,
    transform: Transform,
    opacity: Double,
    labelOrImage: HTMLImageElement,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Size
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImageOrLabel")(context.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], labelOrImage.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawImageOrLabel(
    context: CanvasRenderingContext2D,
    transform: Transform,
    opacity: Double,
    labelOrImage: HTMLVideoElement,
    originX: Double,
    originY: Double,
    w: Double,
    h: Double,
    x: Double,
    y: Double,
    scale: Size
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImageOrLabel")(context.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], labelOrImage.asInstanceOf[js.Any], originX.asInstanceOf[js.Any], originY.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getTextDimensions(baseStyle: TextState, chunks: js.Array[String]): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextDimensions")(baseStyle.asInstanceOf[js.Any], chunks.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def measureAndCacheTextWidth(font: String, text: String, cache: StringDictionary[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("measureAndCacheTextWidth")(font.asInstanceOf[js.Any], text.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def measureTextHeight(fontSpec: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("measureTextHeight")(fontSpec.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def measureTextWidth(font: String, text: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("measureTextWidth")(font.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def registerFont(fontSpec: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFont")(fontSpec.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def rotateAtOffset(context: CanvasRenderingContext2D, rotation: Double, offsetX: Double, offsetY: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateAtOffset")(context.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.Circle
    - typings.ol.olStrings.Image
    - typings.ol.olStrings.LineString
    - typings.ol.olStrings.Polygon
    - typings.ol.olStrings.Text
    - typings.ol.olStrings.Default
  */
  trait BuilderType extends StObject
  object BuilderType {
    
    inline def Circle: typings.ol.olStrings.Circle = "Circle".asInstanceOf[typings.ol.olStrings.Circle]
    
    inline def Default: typings.ol.olStrings.Default = "Default".asInstanceOf[typings.ol.olStrings.Default]
    
    inline def Image: typings.ol.olStrings.Image = "Image".asInstanceOf[typings.ol.olStrings.Image]
    
    inline def LineString: typings.ol.olStrings.LineString = "LineString".asInstanceOf[typings.ol.olStrings.LineString]
    
    inline def Polygon: typings.ol.olStrings.Polygon = "Polygon".asInstanceOf[typings.ol.olStrings.Polygon]
    
    inline def Text: typings.ol.olStrings.Text = "Text".asInstanceOf[typings.ol.olStrings.Text]
  }
  
  type DeclutterImageWithText = NumberDictionary[ReplayImageOrLabelArgs]
  
  trait FillState extends StObject {
    
    /**
      * FillStyle.
      */
    var fillStyle: ColorLike
  }
  object FillState {
    
    inline def apply(fillStyle: ColorLike): FillState = {
      val __obj = js.Dynamic.literal(fillStyle = fillStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[FillState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FillState] (val x: Self) extends AnyVal {
      
      inline def setFillStyle(value: ColorLike): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    }
  }
  
  trait FillStrokeState extends StObject {
    
    /**
      * Current FillStyle.
      */
    var currentFillStyle: js.UndefOr[ColorLike] = js.undefined
    
    /**
      * Current LineCap.
      */
    var currentLineCap: js.UndefOr[CanvasLineCap] = js.undefined
    
    /**
      * Current LineDash.
      */
    var currentLineDash: js.Array[Double]
    
    /**
      * Current LineDashOffset.
      */
    var currentLineDashOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Current LineJoin.
      */
    var currentLineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
    
    /**
      * Current LineWidth.
      */
    var currentLineWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Current MiterLimit.
      */
    var currentMiterLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Current StrokeStyle.
      */
    var currentStrokeStyle: js.UndefOr[ColorLike] = js.undefined
    
    /**
      * FillStyle.
      */
    var fillStyle: js.UndefOr[ColorLike] = js.undefined
    
    /**
      * Last stroke.
      */
    var lastStroke: js.UndefOr[Double] = js.undefined
    
    /**
      * LineCap.
      */
    var lineCap: js.UndefOr[CanvasLineCap] = js.undefined
    
    /**
      * LineDash.
      */
    var lineDash: js.Array[Double]
    
    /**
      * LineDashOffset.
      */
    var lineDashOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * LineJoin.
      */
    var lineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
    
    /**
      * LineWidth.
      */
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * MiterLimit.
      */
    var miterLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * StrokeStyle.
      */
    var strokeStyle: js.UndefOr[ColorLike] = js.undefined
  }
  object FillStrokeState {
    
    inline def apply(currentLineDash: js.Array[Double], lineDash: js.Array[Double]): FillStrokeState = {
      val __obj = js.Dynamic.literal(currentLineDash = currentLineDash.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any])
      __obj.asInstanceOf[FillStrokeState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FillStrokeState] (val x: Self) extends AnyVal {
      
      inline def setCurrentFillStyle(value: ColorLike): Self = StObject.set(x, "currentFillStyle", value.asInstanceOf[js.Any])
      
      inline def setCurrentFillStyleUndefined: Self = StObject.set(x, "currentFillStyle", js.undefined)
      
      inline def setCurrentLineCap(value: CanvasLineCap): Self = StObject.set(x, "currentLineCap", value.asInstanceOf[js.Any])
      
      inline def setCurrentLineCapUndefined: Self = StObject.set(x, "currentLineCap", js.undefined)
      
      inline def setCurrentLineDash(value: js.Array[Double]): Self = StObject.set(x, "currentLineDash", value.asInstanceOf[js.Any])
      
      inline def setCurrentLineDashOffset(value: Double): Self = StObject.set(x, "currentLineDashOffset", value.asInstanceOf[js.Any])
      
      inline def setCurrentLineDashOffsetUndefined: Self = StObject.set(x, "currentLineDashOffset", js.undefined)
      
      inline def setCurrentLineDashVarargs(value: Double*): Self = StObject.set(x, "currentLineDash", js.Array(value*))
      
      inline def setCurrentLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "currentLineJoin", value.asInstanceOf[js.Any])
      
      inline def setCurrentLineJoinUndefined: Self = StObject.set(x, "currentLineJoin", js.undefined)
      
      inline def setCurrentLineWidth(value: Double): Self = StObject.set(x, "currentLineWidth", value.asInstanceOf[js.Any])
      
      inline def setCurrentLineWidthUndefined: Self = StObject.set(x, "currentLineWidth", js.undefined)
      
      inline def setCurrentMiterLimit(value: Double): Self = StObject.set(x, "currentMiterLimit", value.asInstanceOf[js.Any])
      
      inline def setCurrentMiterLimitUndefined: Self = StObject.set(x, "currentMiterLimit", js.undefined)
      
      inline def setCurrentStrokeStyle(value: ColorLike): Self = StObject.set(x, "currentStrokeStyle", value.asInstanceOf[js.Any])
      
      inline def setCurrentStrokeStyleUndefined: Self = StObject.set(x, "currentStrokeStyle", js.undefined)
      
      inline def setFillStyle(value: ColorLike): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
      
      inline def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
      
      inline def setLastStroke(value: Double): Self = StObject.set(x, "lastStroke", value.asInstanceOf[js.Any])
      
      inline def setLastStrokeUndefined: Self = StObject.set(x, "lastStroke", js.undefined)
      
      inline def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
      
      inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value*))
      
      inline def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      inline def setStrokeStyle(value: ColorLike): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    }
  }
  
  trait Label extends StObject {
    
    /**
      * ContextInstructions.
      */
    var contextInstructions: js.Array[String | Double]
    
    /**
      * Height.
      */
    var height: Double
    
    /**
      * Width.
      */
    var width: Double
  }
  object Label {
    
    inline def apply(contextInstructions: js.Array[String | Double], height: Double, width: Double): Label = {
      val __obj = js.Dynamic.literal(contextInstructions = contextInstructions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      inline def setContextInstructions(value: js.Array[String | Double]): Self = StObject.set(x, "contextInstructions", value.asInstanceOf[js.Any])
      
      inline def setContextInstructionsVarargs(value: (String | Double)*): Self = StObject.set(x, "contextInstructions", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializableInstructions extends StObject {
    
    /**
      * The array of all coordinates.
      */
    var coordinates: js.Array[Double]
    
    /**
      * The fill states (decluttering).
      */
    var fillStates: js.UndefOr[StringDictionary[FillState]] = js.undefined
    
    /**
      * The rendering hit detection instructions.
      */
    var hitDetectionInstructions: js.Array[Any]
    
    /**
      * The rendering instructions.
      */
    var instructions: js.Array[Any]
    
    /**
      * The stroke states (decluttering).
      */
    var strokeStates: js.UndefOr[StringDictionary[StrokeState]] = js.undefined
    
    /**
      * The text states (decluttering).
      */
    var textStates: js.UndefOr[StringDictionary[TextState]] = js.undefined
  }
  object SerializableInstructions {
    
    inline def apply(
      coordinates: js.Array[Double],
      hitDetectionInstructions: js.Array[Any],
      instructions: js.Array[Any]
    ): SerializableInstructions = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], hitDetectionInstructions = hitDetectionInstructions.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializableInstructions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializableInstructions] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setFillStates(value: StringDictionary[FillState]): Self = StObject.set(x, "fillStates", value.asInstanceOf[js.Any])
      
      inline def setFillStatesUndefined: Self = StObject.set(x, "fillStates", js.undefined)
      
      inline def setHitDetectionInstructions(value: js.Array[Any]): Self = StObject.set(x, "hitDetectionInstructions", value.asInstanceOf[js.Any])
      
      inline def setHitDetectionInstructionsVarargs(value: Any*): Self = StObject.set(x, "hitDetectionInstructions", js.Array(value*))
      
      inline def setInstructions(value: js.Array[Any]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
      
      inline def setInstructionsVarargs(value: Any*): Self = StObject.set(x, "instructions", js.Array(value*))
      
      inline def setStrokeStates(value: StringDictionary[StrokeState]): Self = StObject.set(x, "strokeStates", value.asInstanceOf[js.Any])
      
      inline def setStrokeStatesUndefined: Self = StObject.set(x, "strokeStates", js.undefined)
      
      inline def setTextStates(value: StringDictionary[TextState]): Self = StObject.set(x, "textStates", value.asInstanceOf[js.Any])
      
      inline def setTextStatesUndefined: Self = StObject.set(x, "textStates", js.undefined)
    }
  }
  
  trait StrokeState extends StObject {
    
    /**
      * LineCap.
      */
    var lineCap: CanvasLineCap
    
    /**
      * LineDash.
      */
    var lineDash: js.Array[Double]
    
    /**
      * LineDashOffset.
      */
    var lineDashOffset: Double
    
    /**
      * LineJoin.
      */
    var lineJoin: CanvasLineJoin
    
    /**
      * LineWidth.
      */
    var lineWidth: Double
    
    /**
      * MiterLimit.
      */
    var miterLimit: Double
    
    /**
      * StrokeStyle.
      */
    var strokeStyle: ColorLike
  }
  object StrokeState {
    
    inline def apply(
      lineCap: CanvasLineCap,
      lineDash: js.Array[Double],
      lineDashOffset: Double,
      lineJoin: CanvasLineJoin,
      lineWidth: Double,
      miterLimit: Double,
      strokeStyle: ColorLike
    ): StrokeState = {
      val __obj = js.Dynamic.literal(lineCap = lineCap.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any], lineDashOffset = lineDashOffset.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrokeState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrokeState] (val x: Self) extends AnyVal {
      
      inline def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value*))
      
      inline def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyle(value: ColorLike): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextState extends StObject {
    
    /**
      * BackgroundFill.
      */
    var backgroundFill: js.UndefOr[typings.ol.styleFillMod.default] = js.undefined
    
    /**
      * BackgroundStroke.
      */
    var backgroundStroke: js.UndefOr[typings.ol.styleStrokeMod.default] = js.undefined
    
    /**
      * Font.
      */
    var font: String
    
    /**
      * Justify.
      */
    var justify: js.UndefOr[TextJustify] = js.undefined
    
    /**
      * MaxAngle.
      */
    var maxAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * Overflow.
      */
    var overflow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Padding.
      */
    var padding: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Placement.
      */
    var placement: js.UndefOr[TextPlacement] = js.undefined
    
    /**
      * Repeat.
      */
    var repeat: js.UndefOr[Double] = js.undefined
    
    /**
      * Scale.
      */
    var scale: js.UndefOr[Size] = js.undefined
    
    /**
      * TextAlign.
      */
    var textAlign: js.UndefOr[CanvasTextAlign] = js.undefined
    
    /**
      * TextBaseline.
      */
    var textBaseline: CanvasTextBaseline
  }
  object TextState {
    
    inline def apply(font: String, textBaseline: CanvasTextBaseline): TextState = {
      val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextState] (val x: Self) extends AnyVal {
      
      inline def setBackgroundFill(value: typings.ol.styleFillMod.default): Self = StObject.set(x, "backgroundFill", value.asInstanceOf[js.Any])
      
      inline def setBackgroundFillUndefined: Self = StObject.set(x, "backgroundFill", js.undefined)
      
      inline def setBackgroundStroke(value: typings.ol.styleStrokeMod.default): Self = StObject.set(x, "backgroundStroke", value.asInstanceOf[js.Any])
      
      inline def setBackgroundStrokeUndefined: Self = StObject.set(x, "backgroundStroke", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setJustify(value: TextJustify): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      inline def setMaxAngle(value: Double): Self = StObject.set(x, "maxAngle", value.asInstanceOf[js.Any])
      
      inline def setMaxAngleUndefined: Self = StObject.set(x, "maxAngle", js.undefined)
      
      inline def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setPlacement(value: TextPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setScale(value: Size): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
      
      inline def setTextAlign(value: CanvasTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextBaseline(value: CanvasTextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
    }
  }
}
