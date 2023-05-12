package typings.ol

import typings.ol.colorlikeMod.ColorLike
import typings.ol.olStrings.declutter
import typings.ol.olStrings.none
import typings.ol.olStrings.obstacle
import typings.ol.sizeMod.Size
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleRegularShapeMod {
  
  /**
    * Specify radius for regular polygons, or radius1 and radius2 for stars.
    * @typedef {Object} Options
    * @property {import("./Fill.js").default} [fill] Fill style.
    * @property {number} points Number of points for stars and regular polygons. In case of a polygon, the number of points
    * is the number of sides.
    * @property {number} [radius] Radius of a regular polygon.
    * @property {number} [radius1] First radius of a star. Ignored if radius is set.
    * @property {number} [radius2] Second radius of a star.
    * @property {number} [angle=0] Shape's angle in radians. A value of 0 will have one of the shape's points facing up.
    * @property {Array<number>} [displacement=[0, 0]] Displacement of the shape in pixels.
    * Positive values will shift the shape right and up.
    * @property {import("./Stroke.js").default} [stroke] Stroke style.
    * @property {number} [rotation=0] Rotation in radians (positive rotation clockwise).
    * @property {boolean} [rotateWithView=false] Whether to rotate the shape with the view.
    * @property {number|import("../size.js").Size} [scale=1] Scale. Unless two dimensional scaling is required a better
    * result may be obtained with appropriate settings for `radius`, `radius1` and `radius2`.
    * @property {"declutter"|"obstacle"|"none"|undefined} [declutterMode] Declutter mode.
    */
  /**
    * @typedef {Object} RenderOptions
    * @property {import("../colorlike.js").ColorLike} [strokeStyle] StrokeStyle.
    * @property {number} strokeWidth StrokeWidth.
    * @property {number} size Size.
    * @property {Array<number>|null} lineDash LineDash.
    * @property {number} lineDashOffset LineDashOffset.
    * @property {CanvasLineJoin} lineJoin LineJoin.
    * @property {number} miterLimit MiterLimit.
    */
  /**
    * @classdesc
    * Set regular shape style for vector features. The resulting shape will be
    * a regular polygon when `radius` is provided, or a star when `radius1` and
    * `radius2` are provided.
    * @api
    */
  @JSImport("ol/style/RegularShape", JSImport.Default)
  @js.native
  open class default protected () extends RegularShape {
    /**
      * @param {Options} options Options.
      */
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Shape's angle in radians. A value of 0 will have one of the shape's points facing up.
      */
    var angle: js.UndefOr[Double] = js.undefined
    
    /**
      * Declutter mode.
      */
    var declutterMode: js.UndefOr[declutter | obstacle | none] = js.undefined
    
    /**
      * Displacement of the shape in pixels.
      * Positive values will shift the shape right and up.
      */
    var displacement: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Fill style.
      */
    var fill: js.UndefOr[typings.ol.styleFillMod.default] = js.undefined
    
    /**
      * Number of points for stars and regular polygons. In case of a polygon, the number of points
      * is the number of sides.
      */
    var points: Double
    
    /**
      * Radius of a regular polygon.
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /**
      * First radius of a star. Ignored if radius is set.
      */
    var radius1: js.UndefOr[Double] = js.undefined
    
    /**
      * Second radius of a star.
      */
    var radius2: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to rotate the shape with the view.
      */
    var rotateWithView: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rotation in radians (positive rotation clockwise).
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * Scale. Unless two dimensional scaling is required a better
      * result may be obtained with appropriate settings for `radius`, `radius1` and `radius2`.
      */
    var scale: js.UndefOr[Double | Size] = js.undefined
    
    /**
      * Stroke style.
      */
    var stroke: js.UndefOr[typings.ol.styleStrokeMod.default] = js.undefined
  }
  object Options {
    
    inline def apply(points: Double): Options = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setDeclutterMode(value: declutter | obstacle | none): Self = StObject.set(x, "declutterMode", value.asInstanceOf[js.Any])
      
      inline def setDeclutterModeUndefined: Self = StObject.set(x, "declutterMode", js.undefined)
      
      inline def setDisplacement(value: js.Array[Double]): Self = StObject.set(x, "displacement", value.asInstanceOf[js.Any])
      
      inline def setDisplacementUndefined: Self = StObject.set(x, "displacement", js.undefined)
      
      inline def setDisplacementVarargs(value: Double*): Self = StObject.set(x, "displacement", js.Array(value*))
      
      inline def setFill(value: typings.ol.styleFillMod.default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadius1(value: Double): Self = StObject.set(x, "radius1", value.asInstanceOf[js.Any])
      
      inline def setRadius1Undefined: Self = StObject.set(x, "radius1", js.undefined)
      
      inline def setRadius2(value: Double): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
      
      inline def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      inline def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Double | Size): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
      
      inline def setStroke(value: typings.ol.styleStrokeMod.default): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  /**
    * Specify radius for regular polygons, or radius1 and radius2 for stars.
    * @typedef {Object} Options
    * @property {import("./Fill.js").default} [fill] Fill style.
    * @property {number} points Number of points for stars and regular polygons. In case of a polygon, the number of points
    * is the number of sides.
    * @property {number} [radius] Radius of a regular polygon.
    * @property {number} [radius1] First radius of a star. Ignored if radius is set.
    * @property {number} [radius2] Second radius of a star.
    * @property {number} [angle=0] Shape's angle in radians. A value of 0 will have one of the shape's points facing up.
    * @property {Array<number>} [displacement=[0, 0]] Displacement of the shape in pixels.
    * Positive values will shift the shape right and up.
    * @property {import("./Stroke.js").default} [stroke] Stroke style.
    * @property {number} [rotation=0] Rotation in radians (positive rotation clockwise).
    * @property {boolean} [rotateWithView=false] Whether to rotate the shape with the view.
    * @property {number|import("../size.js").Size} [scale=1] Scale. Unless two dimensional scaling is required a better
    * result may be obtained with appropriate settings for `radius`, `radius1` and `radius2`.
    * @property {"declutter"|"obstacle"|"none"|undefined} [declutterMode] Declutter mode.
    */
  /**
    * @typedef {Object} RenderOptions
    * @property {import("../colorlike.js").ColorLike} [strokeStyle] StrokeStyle.
    * @property {number} strokeWidth StrokeWidth.
    * @property {number} size Size.
    * @property {Array<number>|null} lineDash LineDash.
    * @property {number} lineDashOffset LineDashOffset.
    * @property {CanvasLineJoin} lineJoin LineJoin.
    * @property {number} miterLimit MiterLimit.
    */
  /**
    * @classdesc
    * Set regular shape style for vector features. The resulting shape will be
    * a regular polygon when `radius` is provided, or a star when `radius1` and
    * `radius2` are provided.
    * @api
    */
  @js.native
  trait RegularShape
    extends typings.ol.styleImageMod.default {
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var angle_ : Any = js.native
    
    /**
      * Calculate additional canvas size needed for the miter.
      * @param {string} lineJoin Line join
      * @param {number} strokeWidth Stroke width
      * @param {number} miterLimit Miter limit
      * @return {number} Additional canvas size needed
      * @private
      */
    /* private */ var calculateLineJoinSize_ : Any = js.native
    
    /**
      * @private
      * @type {Object<number, HTMLCanvasElement>}
      */
    /* private */ var canvas_ : Any = js.native
    
    /**
      * @private
      * @param {RenderOptions} renderOptions Render options.
      */
    /* private */ var createHitDetectionCanvas_ : Any = js.native
    
    /**
      * @private
      * @param {CanvasRenderingContext2D} context The context to draw in.
      */
    /* private */ var createPath_ : Any = js.native
    
    /**
      * @return {RenderOptions}  The render options
      * @protected
      */
    /* protected */ def createRenderOptions(): RenderOptions = js.native
    
    /**
      * @private
      * @param {RenderOptions} renderOptions Render options.
      * @param {CanvasRenderingContext2D} context The context.
      */
    /* private */ var drawHitDetectionCanvas_ : Any = js.native
    
    /**
      * @private
      * @param {RenderOptions} renderOptions Render options.
      * @param {CanvasRenderingContext2D} context The rendering context.
      * @param {number} pixelRatio The pixel ratio.
      */
    /* private */ var draw_ : Any = js.native
    
    /**
      * @private
      * @type {import("./Fill.js").default}
      */
    /* private */ var fill_ : Any = js.native
    
    /**
      * Get the angle used in generating the shape.
      * @return {number} Shape's rotation in radians.
      * @api
      */
    def getAngle(): Double = js.native
    
    /**
      * Get the fill style for the shape.
      * @return {import("./Fill.js").default} Fill style.
      * @api
      */
    def getFill(): typings.ol.styleFillMod.default = js.native
    
    /**
      * Get the number of points for generating the shape.
      * @return {number} Number of points for stars and regular polygons.
      * @api
      */
    def getPoints(): Double = js.native
    
    /**
      * Get the (primary) radius for the shape.
      * @return {number} Radius.
      * @api
      */
    def getRadius(): Double = js.native
    
    /**
      * Get the secondary radius for the shape.
      * @return {number|undefined} Radius2.
      * @api
      */
    def getRadius2(): js.UndefOr[Double] = js.native
    
    /**
      * Get the stroke style for the shape.
      * @return {import("./Stroke.js").default} Stroke style.
      * @api
      */
    def getStroke(): typings.ol.styleStrokeMod.default = js.native
    
    /**
      * @private
      * @type {HTMLCanvasElement}
      */
    /* private */ var hitDetectionCanvas_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var origin_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var points_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var radius2_ : Any = js.native
    
    /**
      * @protected
      * @type {number}
      */
    /* protected */ var radius_ : Double = js.native
    
    /**
      * @protected
      */
    /* protected */ def render(): Unit = js.native
    
    /**
      * @private
      * @type {RenderOptions}
      */
    /* private */ var renderOptions_ : Any = js.native
    
    /**
      * Set the fill style.
      * @param {import("./Fill.js").default} fill Fill style.
      * @api
      */
    def setFill(fill: typings.ol.styleFillMod.default): Unit = js.native
    
    /**
      * Set the stroke style.
      * @param {import("./Stroke.js").default} stroke Stroke style.
      * @api
      */
    def setStroke(stroke: typings.ol.styleStrokeMod.default): Unit = js.native
    
    /**
      * @private
      * @type {import("../size.js").Size}
      */
    /* private */ var size_ : Any = js.native
    
    /**
      * @private
      * @type {import("./Stroke.js").default}
      */
    /* private */ var stroke_ : Any = js.native
  }
  
  trait RenderOptions extends StObject {
    
    /**
      * LineDash.
      */
    var lineDash: js.Array[Double] | Null
    
    /**
      * LineDashOffset.
      */
    var lineDashOffset: Double
    
    /**
      * LineJoin.
      */
    var lineJoin: CanvasLineJoin
    
    /**
      * MiterLimit.
      */
    var miterLimit: Double
    
    /**
      * Size.
      */
    var size: Double
    
    /**
      * StrokeStyle.
      */
    var strokeStyle: js.UndefOr[ColorLike] = js.undefined
    
    /**
      * StrokeWidth.
      */
    var strokeWidth: Double
  }
  object RenderOptions {
    
    inline def apply(
      lineDashOffset: Double,
      lineJoin: CanvasLineJoin,
      miterLimit: Double,
      size: Double,
      strokeWidth: Double
    ): RenderOptions = {
      val __obj = js.Dynamic.literal(lineDashOffset = lineDashOffset.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], lineDash = null)
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      inline def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      inline def setLineDashNull: Self = StObject.set(x, "lineDash", null)
      
      inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value*))
      
      inline def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyle(value: ColorLike): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    }
  }
}
