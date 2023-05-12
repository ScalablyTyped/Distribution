package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.renderCanvasMod.FillState
import typings.ol.renderCanvasMod.Label
import typings.ol.renderCanvasMod.SerializableInstructions
import typings.ol.renderCanvasMod.StrokeState
import typings.ol.renderCanvasMod.TextState
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasExecutorMod {
  
  @JSImport("ol/render/canvas/Executor", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Executor {
    /**
      * @param {number} resolution Resolution.
      * @param {number} pixelRatio Pixel ratio.
      * @param {boolean} overlaps The replay can have overlapping geometries.
      * @param {import("../canvas.js").SerializableInstructions} instructions The serializable instructions
      */
    def this(resolution: Double, pixelRatio: Double, overlaps: Boolean, instructions: SerializableInstructions) = this()
  }
  
  trait BBox extends StObject {
    
    /**
      * Maximal x.
      */
    var maxX: Double
    
    /**
      * Maximal y
      */
    var maxY: Double
    
    /**
      * Minimal x.
      */
    var minX: Double
    
    /**
      * Minimal y.
      */
    var minY: Double
    
    /**
      * Value.
      */
    var value: Any
  }
  object BBox {
    
    inline def apply(maxX: Double, maxY: Double, minX: Double, minY: Double, value: Any): BBox = {
      val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BBox]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BBox] (val x: Self) extends AnyVal {
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Executor extends StObject {
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var alignFill_ : Any = js.native
    
    /**
      * @private
      * @param {number} sheetWidth Width of the sprite sheet.
      * @param {number} sheetHeight Height of the sprite sheet.
      * @param {number} centerX X.
      * @param {number} centerY Y.
      * @param {number} width Width.
      * @param {number} height Height.
      * @param {number} anchorX Anchor X.
      * @param {number} anchorY Anchor Y.
      * @param {number} originX Origin X.
      * @param {number} originY Origin Y.
      * @param {number} rotation Rotation.
      * @param {import("../../size.js").Size} scale Scale.
      * @param {boolean} snapToPixel Snap to pixel.
      * @param {Array<number>} padding Padding.
      * @param {boolean} fillStroke Background fill or stroke.
      * @param {import("../../Feature.js").FeatureLike} feature Feature.
      * @return {ImageOrLabelDimensions} Dimensions for positioning and decluttering the image or label.
      */
    /* private */ var calculateImageOrLabelDimensions_ : Any = js.native
    
    /**
      * @private
      * @type {!Object<number,import("../../coordinate.js").Coordinate|Array<import("../../coordinate.js").Coordinate>|Array<Array<import("../../coordinate.js").Coordinate>>>}
      */
    /* private */ var coordinateCache_ : Any = js.native
    
    /**
      * @protected
      * @type {Array<number>}
      */
    /* protected */ var coordinates: js.Array[Double] = js.native
    
    /**
      * @param {string|Array<string>} text Text.
      * @param {string} textKey Text style key.
      * @param {string} fillKey Fill style key.
      * @param {string} strokeKey Stroke style key.
      * @return {import("../canvas.js").Label} Label.
      */
    def createLabel(text: String, textKey: String, fillKey: String, strokeKey: String): Label = js.native
    def createLabel(text: js.Array[String], textKey: String, fillKey: String, strokeKey: String): Label = js.native
    
    /**
      * @private
      * @param {string|Array<string>} text The text to draw.
      * @param {string} textKey The key of the text state.
      * @param {string} strokeKey The key for the stroke state.
      * @param {string} fillKey The key for the fill state.
      * @return {{label: import("../canvas.js").Label, anchorX: number, anchorY: number}} The text image and its anchor.
      */
    /* private */ var drawLabelWithPointPlacement_ : Any = js.native
    
    /**
      * @param {CanvasRenderingContext2D} context Context.
      * @param {number} contextScale Scale of the context.
      * @param {import("../../transform.js").Transform} transform Transform.
      * @param {number} viewRotation View rotation.
      * @param {boolean} snapToPixel Snap point symbols and text to integer pixels.
      * @param {import("rbush").default} [declutterTree] Declutter tree.
      */
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      declutterTree: Any
    ): Unit = js.native
    
    /**
      * @param {CanvasRenderingContext2D} context Context.
      * @param {import("../../transform.js").Transform} transform Transform.
      * @param {number} viewRotation View rotation.
      * @param {FeatureCallback<T>} [featureCallback] Feature callback.
      * @param {import("../../extent.js").Extent} [hitExtent] Only check
      *     features that intersect this extent.
      * @return {T|undefined} Callback result.
      * @template T
      */
    def executeHitDetection[T](context: CanvasRenderingContext2D, transform: Transform, viewRotation: Double): js.UndefOr[T] = js.native
    def executeHitDetection[T](
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      featureCallback: Unit,
      hitExtent: Extent
    ): js.UndefOr[T] = js.native
    def executeHitDetection[T](
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      featureCallback: FeatureCallback[T]
    ): js.UndefOr[T] = js.native
    def executeHitDetection[T](
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      featureCallback: FeatureCallback[T],
      hitExtent: Extent
    ): js.UndefOr[T] = js.native
    
    /**
      * @private
      * @param {CanvasRenderingContext2D} context Context.
      * @param {number} contextScale Scale of the context.
      * @param {import("../../transform.js").Transform} transform Transform.
      * @param {Array<*>} instructions Instructions array.
      * @param {boolean} snapToPixel Snap point symbols and text to integer pixels.
      * @param {FeatureCallback<T>} [featureCallback] Feature callback.
      * @param {import("../../extent.js").Extent} [hitExtent] Only check
      *     features that intersect this extent.
      * @param {import("rbush").default} [declutterTree] Declutter tree.
      * @return {T|undefined} Callback result.
      * @template T
      */
    /* private */ var execute_ : Any = js.native
    
    /**
      * @type {!Object<string, import("../canvas.js").FillState>}
      */
    var fillStates: StringDictionary[FillState] = js.native
    
    /**
      * @private
      * @param {CanvasRenderingContext2D} context Context.
      */
    /* private */ var fill_ : Any = js.native
    
    /**
      * @protected
      * @type {Array<*>}
      */
    /* protected */ var hitDetectionInstructions: js.Array[Any] = js.native
    
    /**
      * @protected
      * @type {Array<*>}
      */
    /* protected */ var instructions: js.Array[Any] = js.native
    
    /**
      * @private
      * @type {Object<string, import("../canvas.js").Label>}
      */
    /* private */ var labels_ : Any = js.native
    
    /**
      * @protected
      * @type {boolean}
      */
    /* protected */ var overlaps: Boolean = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var pixelCoordinates_ : Any = js.native
    
    /**
      * @protected
      * @type {number}
      */
    /* protected */ var pixelRatio: Double = js.native
    
    /**
      * @private
      * @type {!import("../../transform.js").Transform}
      */
    /* private */ var renderedTransform_ : Any = js.native
    
    /**
      * @private
      * @param {CanvasRenderingContext2D} context Context.
      * @param {number} contextScale Scale of the context.
      * @param {import("../canvas.js").Label|HTMLImageElement|HTMLCanvasElement|HTMLVideoElement} imageOrLabel Image.
      * @param {ImageOrLabelDimensions} dimensions Dimensions.
      * @param {number} opacity Opacity.
      * @param {Array<*>} fillInstruction Fill instruction.
      * @param {Array<*>} strokeInstruction Stroke instruction.
      * @return {boolean} The image or label was rendered.
      */
    /* private */ var replayImageOrLabel_ : Any = js.native
    
    /**
      * @param {CanvasRenderingContext2D} context Context.
      * @param {import("../../coordinate.js").Coordinate} p1 1st point of the background box.
      * @param {import("../../coordinate.js").Coordinate} p2 2nd point of the background box.
      * @param {import("../../coordinate.js").Coordinate} p3 3rd point of the background box.
      * @param {import("../../coordinate.js").Coordinate} p4 4th point of the background box.
      * @param {Array<*>} fillInstruction Fill instruction.
      * @param {Array<*>} strokeInstruction Stroke instruction.
      */
    def replayTextBackground_(
      context: CanvasRenderingContext2D,
      p1: Coordinate,
      p2: Coordinate,
      p3: Coordinate,
      p4: Coordinate,
      fillInstruction: js.Array[Any],
      strokeInstruction: js.Array[Any]
    ): Unit = js.native
    
    /**
      * @protected
      * @const
      * @type {number}
      */
    /* protected */ var resolution: Double = js.native
    
    /**
      * @private
      * @param {CanvasRenderingContext2D} context Context.
      * @param {Array<*>} instruction Instruction.
      */
    /* private */ var setStrokeStyle_ : Any = js.native
    
    /**
      * @type {!Object<string, import("../canvas.js").StrokeState>}
      */
    var strokeStates: StringDictionary[StrokeState] = js.native
    
    /**
      * @type {!Object<string, import("../canvas.js").TextState>}
      */
    var textStates: StringDictionary[TextState] = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var viewRotation_ : Any = js.native
    
    /**
      * @private
      * @type {Object<string, Object<string, number>>}
      */
    /* private */ var widths_ : Any = js.native
  }
  
  type FeatureCallback[T] = js.Function2[/* arg0 */ FeatureLike, /* arg1 */ typings.ol.geomSimpleGeometryMod.default, T]
  
  trait ImageOrLabelDimensions extends StObject {
    
    /**
      * CanvasTransform.
      */
    var canvasTransform: Transform
    
    /**
      * DeclutterBox.
      */
    var declutterBox: BBox
    
    /**
      * DrawImageH.
      */
    var drawImageH: Double
    
    /**
      * DrawImageW.
      */
    var drawImageW: Double
    
    /**
      * DrawImageX.
      */
    var drawImageX: Double
    
    /**
      * DrawImageY.
      */
    var drawImageY: Double
    
    /**
      * OriginX.
      */
    var originX: Double
    
    /**
      * OriginY.
      */
    var originY: Double
    
    /**
      * Scale.
      */
    var scale: js.Array[Double]
  }
  object ImageOrLabelDimensions {
    
    inline def apply(
      canvasTransform: Transform,
      declutterBox: BBox,
      drawImageH: Double,
      drawImageW: Double,
      drawImageX: Double,
      drawImageY: Double,
      originX: Double,
      originY: Double,
      scale: js.Array[Double]
    ): ImageOrLabelDimensions = {
      val __obj = js.Dynamic.literal(canvasTransform = canvasTransform.asInstanceOf[js.Any], declutterBox = declutterBox.asInstanceOf[js.Any], drawImageH = drawImageH.asInstanceOf[js.Any], drawImageW = drawImageW.asInstanceOf[js.Any], drawImageX = drawImageX.asInstanceOf[js.Any], drawImageY = drawImageY.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageOrLabelDimensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageOrLabelDimensions] (val x: Self) extends AnyVal {
      
      inline def setCanvasTransform(value: Transform): Self = StObject.set(x, "canvasTransform", value.asInstanceOf[js.Any])
      
      inline def setCanvasTransformVarargs(value: Double*): Self = StObject.set(x, "canvasTransform", js.Array(value*))
      
      inline def setDeclutterBox(value: BBox): Self = StObject.set(x, "declutterBox", value.asInstanceOf[js.Any])
      
      inline def setDrawImageH(value: Double): Self = StObject.set(x, "drawImageH", value.asInstanceOf[js.Any])
      
      inline def setDrawImageW(value: Double): Self = StObject.set(x, "drawImageW", value.asInstanceOf[js.Any])
      
      inline def setDrawImageX(value: Double): Self = StObject.set(x, "drawImageX", value.asInstanceOf[js.Any])
      
      inline def setDrawImageY(value: Double): Self = StObject.set(x, "drawImageY", value.asInstanceOf[js.Any])
      
      inline def setOriginX(value: Double): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
      
      inline def setOriginY(value: Double): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
      
      inline def setScale(value: js.Array[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
    }
  }
  
  trait ReplayImageOrLabelArgs extends StObject {
    
    var `0`: CanvasRenderingContext2D
    
    var `1`: Double
    
    var `2`: Label | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement
    
    var `3`: ImageOrLabelDimensions
    
    var `4`: Double
    
    var `5`: js.Array[Any]
    
    var `6`: js.Array[Any]
  }
  object ReplayImageOrLabelArgs {
    
    inline def apply(
      `0`: CanvasRenderingContext2D,
      `1`: Double,
      `2`: Label | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement,
      `3`: ImageOrLabelDimensions,
      `4`: Double,
      `5`: js.Array[Any],
      `6`: js.Array[Any]
    ): ReplayImageOrLabelArgs = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
      __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
      __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplayImageOrLabelArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplayImageOrLabelArgs] (val x: Self) extends AnyVal {
      
      inline def set0(value: CanvasRenderingContext2D): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: Double): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: Label | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set3(value: ImageOrLabelDimensions): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set4(value: Double): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      inline def set5(value: js.Array[Any]): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      inline def set5Varargs(value: Any*): Self = StObject.set(x, "5", js.Array(value*))
      
      inline def set6(value: js.Array[Any]): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      inline def set6Varargs(value: Any*): Self = StObject.set(x, "6", js.Array(value*))
    }
  }
}
