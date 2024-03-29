package typings.pixiGraphics

import typings.pixiColor.libColorMod.ColorSource
import typings.pixiConstants.mod.BLEND_MODES
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.BatchDrawCall
import typings.pixiCore.mod.Color
import typings.pixiCore.mod.Matrix
import typings.pixiCore.mod.Point
import typings.pixiCore.mod.Polygon
import typings.pixiCore.mod.Renderer
import typings.pixiCore.mod.Shader
import typings.pixiCore.mod.Texture
import typings.pixiDisplay.libDisplayObjectMod.DisplayObject
import typings.pixiDisplay.mod.Container
import typings.pixiGraphics.anon.Adaptive
import typings.pixiGraphics.libConstMod.LINE_CAP
import typings.pixiGraphics.libConstMod.LINE_JOIN
import typings.pixiGraphics.libGraphicsGeometryMod.GraphicsGeometry
import typings.pixiGraphics.libStylesFillStyleMod.FillStyle
import typings.pixiGraphics.libStylesLineStyleMod.LineStyle
import typings.pixiMath.libIpointdataMod.IPointData
import typings.pixiMath.mod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGraphicsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.Graphics * / any */ @JSImport("@pixi/graphics/lib/Graphics", "Graphics")
  @js.native
  /**
    * @param geometry - Geometry to use, if omitted will create a new GraphicsGeometry instance.
    */
  open class Graphics () extends Container[DisplayObject] {
    def this(geometry: GraphicsGeometry) = this()
    
    /** Current fill style. */
    /* protected */ var _fillStyle: FillStyle = js.native
    
    /* private */ var _geometry: Any = js.native
    
    /** Current hole mode is enabled. */
    /* protected */ var _holeMode: Boolean = js.native
    
    /**
      * Initialize the curve
      * @param x
      * @param y
      */
    /* protected */ def _initCurve(): Unit = js.native
    /* protected */ def _initCurve(x: Double): Unit = js.native
    /* protected */ def _initCurve(x: Double, y: Double): Unit = js.native
    /* protected */ def _initCurve(x: Unit, y: Double): Unit = js.native
    
    /** Current line style. */
    /* protected */ var _lineStyle: LineStyle = js.native
    
    /** Current shape transform matrix. */
    /* protected */ var _matrix: Matrix = js.native
    
    /** Populating batches for rendering. */
    /* protected */ def _populateBatches(): Unit = js.native
    
    /**
      * Renders the batches using the BathedRenderer plugin
      * @param renderer - The renderer
      */
    /* protected */ def _renderBatched(renderer: Renderer): Unit = js.native
    
    /**
      * Renders the graphics direct
      * @param renderer - The renderer
      */
    /* protected */ def _renderDirect(renderer: Renderer): Unit = js.native
    
    /**
      * Renders specific DrawCall
      * @param renderer
      * @param drawCall
      */
    /* protected */ def _renderDrawCallDirect(renderer: Renderer, drawCall: BatchDrawCall): Unit = js.native
    
    /**
      * Resolves shader for direct rendering
      * @param renderer - The renderer
      */
    /* protected */ def _resolveDirectShader(renderer: Renderer): Shader = js.native
    
    /* protected */ var _tintColor: Color = js.native
    
    /* protected */ var _transformID: Double = js.native
    
    /**
      * The arc method creates an arc/curve (used to create circles, or parts of circles).
      * @param cx - The x-coordinate of the center of the circle
      * @param cy - The y-coordinate of the center of the circle
      * @param radius - The radius of the circle
      * @param startAngle - The starting angle, in radians (0 is at the 3 o'clock position
      *  of the arc's circle)
      * @param endAngle - The ending angle, in radians
      * @param anticlockwise - Specifies whether the drawing should be
      *  counter-clockwise or clockwise. False is default, and indicates clockwise, while true
      *  indicates counter-clockwise.
      * @returns - This Graphics object. Good for chaining method calls
      */
    def arc(cx: Double, cy: Double, radius: Double, startAngle: Double, endAngle: Double): this.type = js.native
    def arc(
      cx: Double,
      cy: Double,
      radius: Double,
      startAngle: Double,
      endAngle: Double,
      anticlockwise: Boolean
    ): this.type = js.native
    
    /**
      * The `arcTo` method creates an arc/curve between two tangents on the canvas.
      * The first tangent is from the start point to the first control point,
      * and the second tangent is from the first control point to the second control point.
      * Note that the second control point is not necessarily the end point of the arc.
      *
      * "borrowed" from https://code.google.com/p/fxcanvas/ - thanks google!
      * @param x1 - The x-coordinate of the first control point of the arc
      * @param y1 - The y-coordinate of the first control point of the arc
      * @param x2 - The x-coordinate of the second control point of the arc
      * @param y2 - The y-coordinate of the second control point of the arc
      * @param radius - The radius of the arc
      * @returns - This Graphics object. Good for chaining method calls
      */
    def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): this.type = js.native
    
    /** Update dirty for limiting calculating batches.*/
    /* protected */ var batchDirty: Double = js.native
    
    /** Update dirty for limiting calculating tints for batches. */
    /* protected */ var batchTint: Double = js.native
    
    /** A collections of batches! These can be drawn by the renderer batch system. */
    /* protected */ var batches: js.Array[IGraphicsBatchElement] = js.native
    
    /**
      * Specifies a simple one-color fill that subsequent calls to other Graphics methods
      * (such as lineTo() or drawCircle()) use when drawing.
      * @param {PIXI.ColorSource} color - the color of the fill
      * @param alpha - the alpha of the fill, will override the color's alpha
      * @returns - This Graphics object. Suitable for chaining method calls
      */
    def beginFill(): this.type = js.native
    def beginFill(color: Unit, alpha: Double): this.type = js.native
    def beginFill(color: ColorSource): this.type = js.native
    def beginFill(color: ColorSource, alpha: Double): this.type = js.native
    
    /**
      * Begin adding holes to the last draw shape
      * IMPORTANT: holes must be fully inside a shape to work
      * Also weirdness ensues if holes overlap!
      * Ellipses, Circles, Rectangles and Rounded Rectangles cannot be holes or host for holes in CanvasRenderer,
      * please use `moveTo` `lineTo`, `quadraticCurveTo` if you rely on pixi-legacy bundle.
      * @returns - Returns itself.
      */
    def beginHole(): this.type = js.native
    
    /**
      * Begin the texture fill.
      * Note: The wrap mode of the texture is forced to REPEAT on render.
      * @param options - Fill style object.
      * @param {PIXI.Texture} [options.texture=PIXI.Texture.WHITE] - Texture to fill
      * @param {PIXI.ColorSource} [options.color=0xffffff] - Background to fill behind texture
      * @param {number} [options.alpha] - Alpha of fill, overrides the color's alpha
      * @param {PIXI.Matrix} [options.matrix=null] - Transform matrix
      * @returns {PIXI.Graphics} This Graphics object. Good for chaining method calls
      */
    def beginTextureFill(): this.type = js.native
    def beginTextureFill(options: IFillStyleOptions): this.type = js.native
    
    /**
      * Calculate the points for a bezier curve and then draws it.
      * @param cpX - Control point x
      * @param cpY - Control point y
      * @param cpX2 - Second Control point x
      * @param cpY2 - Second Control point y
      * @param toX - Destination point x
      * @param toY - Destination point y
      * @returns This Graphics object. Good for chaining method calls
      */
    def bezierCurveTo(cpX: Double, cpY: Double, cpX2: Double, cpY2: Double, toX: Double, toY: Double): this.type = js.native
    
    def blendMode: BLEND_MODES = js.native
    /**
      * The blend mode to be applied to the graphic shape. Apply a value of
      * `PIXI.BLEND_MODES.NORMAL` to reset the blend mode.  Note that, since each
      * primitive in the GraphicsGeometry list is rendered sequentially, modes
      * such as `PIXI.BLEND_MODES.ADD` and `PIXI.BLEND_MODES.MULTIPLY` will
      * be applied per-primitive.
      * @default PIXI.BLEND_MODES.NORMAL
      */
    def blendMode_=(value: BLEND_MODES): Unit = js.native
    
    /** Recalculate the tint by applying tint to batches using Graphics tint. */
    /* protected */ def calculateTints(): Unit = js.native
    
    /** If there's a transform update or a change to the shape of the geometry, recalculate the vertices. */
    /* protected */ def calculateVertices(): Unit = js.native
    
    /**
      * Clears the graphics that were drawn to this Graphics object, and resets fill and line style settings.
      * @returns - This Graphics object. Good for chaining method calls
      */
    def clear(): this.type = js.native
    
    /**
      * Closes the current path.
      * @returns - Returns itself.
      */
    def closePath(): this.type = js.native
    
    /**
      * Tests if a point is inside this graphics object
      * @param point - the point to test
      * @returns - the result of the test
      */
    def containsPoint(point: IPointData): Boolean = js.native
    
    /**
      * Current path
      * @readonly
      */
    var currentPath: Polygon = js.native
    
    /**
      * Draws a circle.
      * @param x - The X coordinate of the center of the circle
      * @param y - The Y coordinate of the center of the circle
      * @param radius - The radius of the circle
      * @returns - This Graphics object. Good for chaining method calls
      */
    def drawCircle(x: Double, y: Double, radius: Double): this.type = js.native
    
    /**
      * Draws an ellipse.
      * @param x - The X coordinate of the center of the ellipse
      * @param y - The Y coordinate of the center of the ellipse
      * @param width - The half width of the ellipse
      * @param height - The half height of the ellipse
      * @returns - This Graphics object. Good for chaining method calls
      */
    def drawEllipse(x: Double, y: Double, width: Double, height: Double): this.type = js.native
    
    def drawPolygon(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param path because its type Array<number> | Array<IPointData> is not an array type */ path: js.Array[Double | IPointData]
    ): this.type = js.native
    def drawPolygon(path: Polygon): this.type = js.native
    
    /**
      * Draws a rectangle shape.
      * @param x - The X coord of the top-left of the rectangle
      * @param y - The Y coord of the top-left of the rectangle
      * @param width - The width of the rectangle
      * @param height - The height of the rectangle
      * @returns - This Graphics object. Good for chaining method calls
      */
    def drawRect(x: Double, y: Double, width: Double, height: Double): this.type = js.native
    
    /**
      * Draw a rectangle shape with rounded/beveled corners.
      * @param x - The X coord of the top-left of the rectangle
      * @param y - The Y coord of the top-left of the rectangle
      * @param width - The width of the rectangle
      * @param height - The height of the rectangle
      * @param radius - Radius of the rectangle corners
      * @returns - This Graphics object. Good for chaining method calls
      */
    def drawRoundedRect(x: Double, y: Double, width: Double, height: Double, radius: Double): this.type = js.native
    
    /**
      * Draw any shape.
      * @param {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} shape - Shape to draw
      * @returns - This Graphics object. Good for chaining method calls
      */
    def drawShape(shape: IShape): this.type = js.native
    
    /**
      * Applies a fill to the lines and shapes that were added since the last call to the beginFill() method.
      * @returns - This Graphics object. Good for chaining method calls
      */
    def endFill(): this.type = js.native
    
    /**
      * End adding holes to the last draw shape.
      * @returns - Returns itself.
      */
    def endHole(): this.type = js.native
    
    /**
      * The current fill style.
      * @readonly
      */
    def fill: FillStyle = js.native
    
    /**
      * Finish the polygon object.
      * @protected
      */
    def finishPoly(): Unit = js.native
    
    /**
      * Includes vertex positions, face indices, normals, colors, UVs, and
      * custom attributes within buffers, reducing the cost of passing all
      * this data to the GPU. Can be shared between multiple Mesh or Graphics objects.
      * @readonly
      */
    def geometry: GraphicsGeometry = js.native
    
    /**
      * True if graphics consists of one rectangle, and thus, can be drawn like a Sprite and
      * masked with gl.scissor.
      * @returns - True if only 1 rect.
      */
    def isFastRect(): Boolean = js.native
    
    /**
      * The current line style.
      * @readonly
      */
    def line: LineStyle = js.native
    
    /**
      * Specifies the line style used for subsequent calls to Graphics methods such as the lineTo()
      * method or the drawCircle() method.
      * @param options - Line style options
      * @param {number} [options.width=0] - width of the line to draw, will update the objects stored style
      * @param {PIXI.ColorSource} [options.color=0x0] - color of the line to draw, will update the objects stored style
      * @param {number} [options.alpha] - alpha of the line to draw, will update the objects stored style
      * @param {number} [options.alignment=0.5] - alignment of the line to draw, (0 = inner, 0.5 = middle, 1 = outer).
      *        WebGL only.
      * @param {boolean} [options.native=false] - If true the lines will be draw using LINES instead of TRIANGLE_STRIP
      * @param {PIXI.LINE_CAP}[options.cap=PIXI.LINE_CAP.BUTT] - line cap style
      * @param {PIXI.LINE_JOIN}[options.join=PIXI.LINE_JOIN.MITER] - line join style
      * @param {number}[options.miterLimit=10] - miter limit ratio
      * @returns {PIXI.Graphics} This Graphics object. Good for chaining method calls
      */
    def lineStyle(): this.type = js.native
    def lineStyle(options: ILineStyleOptions): this.type = js.native
    /**
      * Specifies the line style used for subsequent calls to Graphics methods such as the lineTo()
      * method or the drawCircle() method.
      * @param [width=0] - width of the line to draw, will update the objects stored style
      * @param [color=0x0] - color of the line to draw, will update the objects stored style
      * @param [alpha=1] - alpha of the line to draw, will update the objects stored style
      * @param [alignment=0.5] - alignment of the line to draw, (0 = inner, 0.5 = middle, 1 = outer).
      *        WebGL only.
      * @param [native=false] - If true the lines will be draw using LINES instead of TRIANGLE_STRIP
      * @returns - This Graphics object. Good for chaining method calls
      */
    def lineStyle(width: Double): this.type = js.native
    def lineStyle(width: Double, color: Unit, alpha: Double): this.type = js.native
    def lineStyle(width: Double, color: Unit, alpha: Double, alignment: Double): this.type = js.native
    def lineStyle(width: Double, color: Unit, alpha: Double, alignment: Double, native: Boolean): this.type = js.native
    def lineStyle(width: Double, color: Unit, alpha: Double, alignment: Unit, native: Boolean): this.type = js.native
    def lineStyle(width: Double, color: Unit, alpha: Unit, alignment: Double): this.type = js.native
    def lineStyle(width: Double, color: Unit, alpha: Unit, alignment: Double, native: Boolean): this.type = js.native
    def lineStyle(width: Double, color: Unit, alpha: Unit, alignment: Unit, native: Boolean): this.type = js.native
    def lineStyle(width: Double, color: ColorSource): this.type = js.native
    def lineStyle(width: Double, color: ColorSource, alpha: Double): this.type = js.native
    def lineStyle(width: Double, color: ColorSource, alpha: Double, alignment: Double): this.type = js.native
    def lineStyle(width: Double, color: ColorSource, alpha: Double, alignment: Double, native: Boolean): this.type = js.native
    def lineStyle(width: Double, color: ColorSource, alpha: Double, alignment: Unit, native: Boolean): this.type = js.native
    def lineStyle(width: Double, color: ColorSource, alpha: Unit, alignment: Double): this.type = js.native
    def lineStyle(width: Double, color: ColorSource, alpha: Unit, alignment: Double, native: Boolean): this.type = js.native
    def lineStyle(width: Double, color: ColorSource, alpha: Unit, alignment: Unit, native: Boolean): this.type = js.native
    
    /**
      * Like line style but support texture for line fill.
      * @param [options] - Collection of options for setting line style.
      * @param {number} [options.width=0] - width of the line to draw, will update the objects stored style
      * @param {PIXI.Texture} [options.texture=PIXI.Texture.WHITE] - Texture to use
      * @param {PIXI.ColorSource} [options.color=0x0] - color of the line to draw, will update the objects stored style.
      *  Default 0xFFFFFF if texture present.
      * @param {number} [options.alpha=1] - alpha of the line to draw, will update the objects stored style
      * @param {PIXI.Matrix} [options.matrix=null] - Texture matrix to transform texture
      * @param {number} [options.alignment=0.5] - alignment of the line to draw, (0 = inner, 0.5 = middle, 1 = outer).
      *        WebGL only.
      * @param {boolean} [options.native=false] - If true the lines will be draw using LINES instead of TRIANGLE_STRIP
      * @param {PIXI.LINE_CAP}[options.cap=PIXI.LINE_CAP.BUTT] - line cap style
      * @param {PIXI.LINE_JOIN}[options.join=PIXI.LINE_JOIN.MITER] - line join style
      * @param {number}[options.miterLimit=10] - miter limit ratio
      * @returns {PIXI.Graphics} This Graphics object. Good for chaining method calls
      */
    def lineTextureStyle(): this.type = js.native
    def lineTextureStyle(options: ILineStyleOptions): this.type = js.native
    
    /**
      * Draws a line using the current line style from the current drawing position to (x, y);
      * The current drawing position is then set to (x, y).
      * @param x - the X coordinate to draw to
      * @param y - the Y coordinate to draw to
      * @returns - This Graphics object. Good for chaining method calls
      */
    def lineTo(x: Double, y: Double): this.type = js.native
    
    /**
      * Moves the current drawing position to x, y.
      * @param x - the X coordinate to move to
      * @param y - the Y coordinate to move to
      * @returns - This Graphics object. Good for chaining method calls
      */
    def moveTo(x: Double, y: Double): this.type = js.native
    
    /**
      * Normalize the color input from options for line style or fill
      * @param {PIXI.IFillStyleOptions} options - Fill style object.
      */
    /* private */ var normalizeColor: Any = js.native
    
    /** Renderer plugin for batching */
    var pluginName: String = js.native
    
    /**
      * Calculate the points for a quadratic bezier curve and then draws it.
      * Based on: https://stackoverflow.com/questions/785097/how-do-i-implement-a-bezier-curve-in-c
      * @param cpX - Control point x
      * @param cpY - Control point y
      * @param toX - Destination point x
      * @param toY - Destination point y
      * @returns - This Graphics object. Good for chaining method calls
      */
    def quadraticCurveTo(cpX: Double, cpY: Double, toX: Double, toY: Double): this.type = js.native
    
    /**
      * Apply a matrix to the positional data.
      * @param matrix - Matrix to use for transform current shape.
      * @returns - Returns itself.
      */
    def setMatrix(matrix: Matrix): this.type = js.native
    
    /**
      * Represents the vertex and fragment shaders that processes the geometry and runs on the GPU.
      * Can be shared between multiple Graphics objects.
      */
    var shader: Shader = js.native
    
    /**
      * Start a polygon object internally.
      * @protected
      */
    /* protected */ def startPoly(): Unit = js.native
    
    /**
      * Represents the WebGL state the Graphics required to render, excludes shader and geometry. E.g.,
      * blend mode, culling, depth testing, direction of rendering triangles, backface, etc.
      */
    /* private */ var state: Any = js.native
    
    /**
      * The tint applied to each graphic shape. This is a hex value. A value of
      * 0xFFFFFF will remove any tint effect.
      * @default 0xFFFFFF
      */
    def tint: ColorSource = js.native
    def tint_=(value: ColorSource): Unit = js.native
    
    /** Copy of the object vertex data. */
    /* protected */ var vertexData: js.typedarray.Float32Array = js.native
  }
  /* static members */
  object Graphics {
    
    @JSImport("@pixi/graphics/lib/Graphics", "Graphics")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Temporary point to use for containsPoint.
      * @private
      */
    @JSImport("@pixi/graphics/lib/Graphics", "Graphics._TEMP_POINT")
    @js.native
    def _TEMP_POINT: Point = js.native
    inline def _TEMP_POINT_=(x: Point): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TEMP_POINT")(x.asInstanceOf[js.Any])
    
    /**
      * Graphics curves resolution settings. If `adaptive` flag is set to `true`,
      * the resolution is calculated based on the curve's length to ensure better visual quality.
      * Adaptive draw works with `bezierCurveTo` and `quadraticCurveTo`.
      * @static
      * @property {boolean} [adaptive=true] - flag indicating if the resolution should be adaptive
      * @property {number} [maxLength=10] - maximal length of a single segment of the curve (if adaptive = false, ignored)
      * @property {number} [minSegments=8] - minimal number of segments in the curve (if adaptive = false, ignored)
      * @property {number} [maxSegments=2048] - maximal number of segments in the curve (if adaptive = false, ignored)
      * @property {number} [epsilon=0.0001] - precision of the curve fitting
      */
    @JSImport("@pixi/graphics/lib/Graphics", "Graphics.curves")
    @js.native
    val curves: Adaptive = js.native
  }
  
  trait IFillStyleOptions extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[ColorSource] = js.undefined
    
    var matrix: js.UndefOr[Matrix] = js.undefined
    
    var texture: js.UndefOr[Texture[Resource]] = js.undefined
  }
  object IFillStyleOptions {
    
    inline def apply(): IFillStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFillStyleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFillStyleOptions] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setColor(value: ColorSource): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setMatrix(value: Matrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      inline def setTexture(value: Texture[Resource]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
    }
  }
  
  trait IGraphicsBatchElement extends StObject {
    
    var _batchRGB: js.Array[Double]
    
    var _texture: Texture[Resource]
    
    var _tintRGB: Double
    
    var alpha: Double
    
    var blendMode: BLEND_MODES
    
    var indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array
    
    var uvs: js.typedarray.Float32Array
    
    var vertexData: js.typedarray.Float32Array
    
    var worldAlpha: Double
  }
  object IGraphicsBatchElement {
    
    inline def apply(
      _batchRGB: js.Array[Double],
      _texture: Texture[Resource],
      _tintRGB: Double,
      alpha: Double,
      blendMode: BLEND_MODES,
      indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array,
      uvs: js.typedarray.Float32Array,
      vertexData: js.typedarray.Float32Array,
      worldAlpha: Double
    ): IGraphicsBatchElement = {
      val __obj = js.Dynamic.literal(_batchRGB = _batchRGB.asInstanceOf[js.Any], _texture = _texture.asInstanceOf[js.Any], _tintRGB = _tintRGB.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], uvs = uvs.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any], worldAlpha = worldAlpha.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGraphicsBatchElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGraphicsBatchElement] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setBlendMode(value: BLEND_MODES): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      inline def setIndices(value: js.typedarray.Uint16Array | js.typedarray.Uint32Array): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setUvs(value: js.typedarray.Float32Array): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
      
      inline def setVertexData(value: js.typedarray.Float32Array): Self = StObject.set(x, "vertexData", value.asInstanceOf[js.Any])
      
      inline def setWorldAlpha(value: Double): Self = StObject.set(x, "worldAlpha", value.asInstanceOf[js.Any])
      
      inline def set_batchRGB(value: js.Array[Double]): Self = StObject.set(x, "_batchRGB", value.asInstanceOf[js.Any])
      
      inline def set_batchRGBVarargs(value: Double*): Self = StObject.set(x, "_batchRGB", js.Array(value*))
      
      inline def set_texture(value: Texture[Resource]): Self = StObject.set(x, "_texture", value.asInstanceOf[js.Any])
      
      inline def set_tintRGB(value: Double): Self = StObject.set(x, "_tintRGB", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILineStyleOptions
    extends StObject
       with IFillStyleOptions {
    
    var alignment: js.UndefOr[Double] = js.undefined
    
    var cap: js.UndefOr[LINE_CAP] = js.undefined
    
    var join: js.UndefOr[LINE_JOIN] = js.undefined
    
    var miterLimit: js.UndefOr[Double] = js.undefined
    
    var native: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ILineStyleOptions {
    
    inline def apply(): ILineStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILineStyleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILineStyleOptions] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: Double): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setCap(value: LINE_CAP): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
      
      inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
      
      inline def setJoin(value: LINE_JOIN): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      inline def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
