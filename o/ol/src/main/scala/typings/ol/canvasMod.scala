package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.colorlikeMod.ColorLike
import typings.ol.objectMod.default
import typings.ol.olMod.Transform
import typings.ol.sizeMod.Size
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasMod {
  
  @JSImport("ol/render/canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/render/canvas", "checkedFonts")
  @js.native
  val checkedFonts: default = js.native
  
  @scala.inline
  def createTransformString(transform: Transform): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformString")(transform.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  val defaultTextAlign: String = js.native
  
  @JSImport("ol/render/canvas", "defaultTextBaseline")
  @js.native
  val defaultTextBaseline: String = js.native
  
  @scala.inline
  def drawImageOrLabel(
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
  @scala.inline
  def drawImageOrLabel(
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
  @scala.inline
  def drawImageOrLabel(
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
  @scala.inline
  def drawImageOrLabel(
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
  @scala.inline
  def drawImageOrLabel(
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
  @scala.inline
  def drawImageOrLabel(
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
  @scala.inline
  def drawImageOrLabel(
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
  @scala.inline
  def drawImageOrLabel(
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
  
  @JSImport("ol/render/canvas", "labelCache")
  @js.native
  val labelCache: js.Any = js.native
  
  @scala.inline
  def measureAndCacheTextWidth(font: String, text: String, cache: StringDictionary[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("measureAndCacheTextWidth")(font.asInstanceOf[js.Any], text.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def measureTextHeight(font: String): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("measureTextHeight")(font.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  @scala.inline
  def measureTextWidth(font: String, text: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("measureTextWidth")(font.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def measureTextWidths(font: String, lines: js.Array[String], widths: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("measureTextWidths")(font.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], widths.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def registerFont(fontSpec: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFont")(fontSpec.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def rotateAtOffset(context: CanvasRenderingContext2D, rotation: Double, offsetX: Double, offsetY: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateAtOffset")(context.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type DeclutterGroup = js.Array[js.Any]
  
  type DeclutterGroups = js.Array[DeclutterGroup]
  
  trait FillState extends StObject {
    
    var fillStyle: ColorLike
  }
  object FillState {
    
    @scala.inline
    def apply(fillStyle: ColorLike): FillState = {
      val __obj = js.Dynamic.literal(fillStyle = fillStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[FillState]
    }
    
    @scala.inline
    implicit class FillStateMutableBuilder[Self <: FillState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFillStyle(value: ColorLike): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    }
  }
  
  trait FillStrokeState extends StObject {
    
    var currentFillStyle: js.UndefOr[ColorLike] = js.undefined
    
    var currentLineCap: js.UndefOr[CanvasLineCap] = js.undefined
    
    var currentLineDash: js.Array[Double]
    
    var currentLineDashOffset: js.UndefOr[Double] = js.undefined
    
    var currentLineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
    
    var currentLineWidth: js.UndefOr[Double] = js.undefined
    
    var currentMiterLimit: js.UndefOr[Double] = js.undefined
    
    var currentStrokeStyle: js.UndefOr[ColorLike] = js.undefined
    
    var fillStyle: js.UndefOr[ColorLike] = js.undefined
    
    var lastStroke: js.UndefOr[Double] = js.undefined
    
    var lineCap: js.UndefOr[CanvasLineCap] = js.undefined
    
    var lineDash: js.Array[Double]
    
    var lineDashOffset: js.UndefOr[Double] = js.undefined
    
    var lineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
    
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    var miterLimit: js.UndefOr[Double] = js.undefined
    
    var strokeStyle: js.UndefOr[ColorLike] = js.undefined
  }
  object FillStrokeState {
    
    @scala.inline
    def apply(currentLineDash: js.Array[Double], lineDash: js.Array[Double]): FillStrokeState = {
      val __obj = js.Dynamic.literal(currentLineDash = currentLineDash.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any])
      __obj.asInstanceOf[FillStrokeState]
    }
    
    @scala.inline
    implicit class FillStrokeStateMutableBuilder[Self <: FillStrokeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentFillStyle(value: ColorLike): Self = StObject.set(x, "currentFillStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentFillStyleUndefined: Self = StObject.set(x, "currentFillStyle", js.undefined)
      
      @scala.inline
      def setCurrentLineCap(value: CanvasLineCap): Self = StObject.set(x, "currentLineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentLineCapUndefined: Self = StObject.set(x, "currentLineCap", js.undefined)
      
      @scala.inline
      def setCurrentLineDash(value: js.Array[Double]): Self = StObject.set(x, "currentLineDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentLineDashOffset(value: Double): Self = StObject.set(x, "currentLineDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentLineDashOffsetUndefined: Self = StObject.set(x, "currentLineDashOffset", js.undefined)
      
      @scala.inline
      def setCurrentLineDashVarargs(value: Double*): Self = StObject.set(x, "currentLineDash", js.Array(value :_*))
      
      @scala.inline
      def setCurrentLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "currentLineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentLineJoinUndefined: Self = StObject.set(x, "currentLineJoin", js.undefined)
      
      @scala.inline
      def setCurrentLineWidth(value: Double): Self = StObject.set(x, "currentLineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentLineWidthUndefined: Self = StObject.set(x, "currentLineWidth", js.undefined)
      
      @scala.inline
      def setCurrentMiterLimit(value: Double): Self = StObject.set(x, "currentMiterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentMiterLimitUndefined: Self = StObject.set(x, "currentMiterLimit", js.undefined)
      
      @scala.inline
      def setCurrentStrokeStyle(value: ColorLike): Self = StObject.set(x, "currentStrokeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentStrokeStyleUndefined: Self = StObject.set(x, "currentStrokeStyle", js.undefined)
      
      @scala.inline
      def setFillStyle(value: ColorLike): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
      
      @scala.inline
      def setLastStroke(value: Double): Self = StObject.set(x, "lastStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastStrokeUndefined: Self = StObject.set(x, "lastStroke", js.undefined)
      
      @scala.inline
      def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      @scala.inline
      def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
      
      @scala.inline
      def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value :_*))
      
      @scala.inline
      def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      @scala.inline
      def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      @scala.inline
      def setStrokeStyle(value: ColorLike): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    }
  }
  
  trait Label extends StObject {
    
    var contextInstructions: js.Array[String | Double]
    
    var height: Double
    
    var width: Double
  }
  object Label {
    
    @scala.inline
    def apply(contextInstructions: js.Array[String | Double], height: Double, width: Double): Label = {
      val __obj = js.Dynamic.literal(contextInstructions = contextInstructions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextInstructions(value: js.Array[String | Double]): Self = StObject.set(x, "contextInstructions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextInstructionsVarargs(value: (String | Double)*): Self = StObject.set(x, "contextInstructions", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait StrokeState extends StObject {
    
    var lineCap: CanvasLineCap
    
    var lineDash: js.Array[Double]
    
    var lineDashOffset: Double
    
    var lineJoin: CanvasLineJoin
    
    var lineWidth: Double
    
    var miterLimit: Double
    
    var strokeStyle: ColorLike
  }
  object StrokeState {
    
    @scala.inline
    def apply(
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
    implicit class StrokeStateMutableBuilder[Self <: StrokeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value :_*))
      
      @scala.inline
      def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStyle(value: ColorLike): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextState extends StObject {
    
    var backgroundFill: js.UndefOr[typings.ol.fillMod.default] = js.undefined
    
    var backgroundStroke: js.UndefOr[typings.ol.strokeMod.default] = js.undefined
    
    var font: String
    
    var maxAngle: js.UndefOr[Double] = js.undefined
    
    var overflow: js.UndefOr[Boolean] = js.undefined
    
    var padding: js.UndefOr[js.Array[Double]] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var scale: js.UndefOr[Size] = js.undefined
    
    var textAlign: js.UndefOr[String] = js.undefined
    
    var textBaseline: String
  }
  object TextState {
    
    @scala.inline
    def apply(font: String, textBaseline: String): TextState = {
      val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextState]
    }
    
    @scala.inline
    implicit class TextStateMutableBuilder[Self <: TextState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundFill(value: typings.ol.fillMod.default): Self = StObject.set(x, "backgroundFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundFillUndefined: Self = StObject.set(x, "backgroundFill", js.undefined)
      
      @scala.inline
      def setBackgroundStroke(value: typings.ol.strokeMod.default): Self = StObject.set(x, "backgroundStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundStrokeUndefined: Self = StObject.set(x, "backgroundStroke", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAngle(value: Double): Self = StObject.set(x, "maxAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAngleUndefined: Self = StObject.set(x, "maxAngle", js.undefined)
      
      @scala.inline
      def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setScale(value: Size): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
    }
  }
}
