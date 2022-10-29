package typings.pixiGraphics

import org.scalablytyped.runtime.Instantiable0
import typings.pixiCore.mod.BatchDrawCall
import typings.pixiCore.mod.Matrix
import typings.pixiCore.mod.Point
import typings.pixiGraphics.anon.TypeofArcUtils
import typings.pixiGraphics.anon.TypeofBezierUtils
import typings.pixiGraphics.anon.TypeofQuadraticUtils
import typings.pixiGraphics.libConstMod.IGraphicsCurvesSettings
import typings.pixiGraphics.libUtilsIshapebuildcommandMod.IShapeBuildCommand
import typings.pixiMath.libConstMod.SHAPES
import typings.pixiMath.mod.IShape
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/graphics", "FillStyle")
  @js.native
  open class FillStyle ()
    extends typings.pixiGraphics.libStylesFillStyleMod.FillStyle
  
  @JSImport("@pixi/graphics", "GRAPHICS_CURVES")
  @js.native
  val GRAPHICS_CURVES: IGraphicsCurvesSettings = js.native
  
  @JSImport("@pixi/graphics", "Graphics")
  @js.native
  /**
    * @param geometry - Geometry to use, if omitted will create a new GraphicsGeometry instance.
    */
  open class Graphics ()
    extends typings.pixiGraphics.libGraphicsMod.Graphics {
    def this(geometry: typings.pixiGraphics.libGraphicsGeometryMod.GraphicsGeometry) = this()
  }
  /* static members */
  object Graphics {
    
    @JSImport("@pixi/graphics", "Graphics")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Temporary point to use for containsPoint.
      * @private
      */
    @JSImport("@pixi/graphics", "Graphics._TEMP_POINT")
    @js.native
    def _TEMP_POINT: Point = js.native
    inline def _TEMP_POINT_=(x: Point): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TEMP_POINT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/graphics", "GraphicsData")
  @js.native
  open class GraphicsData protected ()
    extends typings.pixiGraphics.libGraphicsDataMod.GraphicsData {
    /**
      * @param {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} shape - The shape object to draw.
      * @param fillStyle - the width of the line to draw
      * @param lineStyle - the color of the line to draw
      * @param matrix - Transform matrix
      */
    def this(shape: IShape) = this()
    def this(shape: IShape, fillStyle: typings.pixiGraphics.libStylesFillStyleMod.FillStyle) = this()
    def this(shape: IShape, fillStyle: Unit, lineStyle: typings.pixiGraphics.libStylesLineStyleMod.LineStyle) = this()
    def this(
      shape: IShape,
      fillStyle: typings.pixiGraphics.libStylesFillStyleMod.FillStyle,
      lineStyle: typings.pixiGraphics.libStylesLineStyleMod.LineStyle
    ) = this()
    def this(shape: IShape, fillStyle: Unit, lineStyle: Unit, matrix: Matrix) = this()
    def this(
      shape: IShape,
      fillStyle: Unit,
      lineStyle: typings.pixiGraphics.libStylesLineStyleMod.LineStyle,
      matrix: Matrix
    ) = this()
    def this(
      shape: IShape,
      fillStyle: typings.pixiGraphics.libStylesFillStyleMod.FillStyle,
      lineStyle: Unit,
      matrix: Matrix
    ) = this()
    def this(
      shape: IShape,
      fillStyle: typings.pixiGraphics.libStylesFillStyleMod.FillStyle,
      lineStyle: typings.pixiGraphics.libStylesLineStyleMod.LineStyle,
      matrix: Matrix
    ) = this()
  }
  
  @JSImport("@pixi/graphics", "GraphicsGeometry")
  @js.native
  open class GraphicsGeometry ()
    extends typings.pixiGraphics.libGraphicsGeometryMod.GraphicsGeometry
  /* static members */
  object GraphicsGeometry {
    
    @JSImport("@pixi/graphics", "GraphicsGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The maximum number of points to consider an object "batchable",
      * able to be batched by the renderer's batch system.
    \
      */
    @JSImport("@pixi/graphics", "GraphicsGeometry.BATCHABLE_SIZE")
    @js.native
    def BATCHABLE_SIZE: Double = js.native
    inline def BATCHABLE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCHABLE_SIZE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/graphics", "LINE_CAP")
  @js.native
  object LINE_CAP extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.pixiGraphics.libConstMod.LINE_CAP & String] = js.native
    
    /* "butt" */ val BUTT: typings.pixiGraphics.libConstMod.LINE_CAP.BUTT & String = js.native
    
    /* "round" */ val ROUND: typings.pixiGraphics.libConstMod.LINE_CAP.ROUND & String = js.native
    
    /* "square" */ val SQUARE: typings.pixiGraphics.libConstMod.LINE_CAP.SQUARE & String = js.native
  }
  
  @JSImport("@pixi/graphics", "LINE_JOIN")
  @js.native
  object LINE_JOIN extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.pixiGraphics.libConstMod.LINE_JOIN & String] = js.native
    
    /* "bevel" */ val BEVEL: typings.pixiGraphics.libConstMod.LINE_JOIN.BEVEL & String = js.native
    
    /* "miter" */ val MITER: typings.pixiGraphics.libConstMod.LINE_JOIN.MITER & String = js.native
    
    /* "round" */ val ROUND: typings.pixiGraphics.libConstMod.LINE_JOIN.ROUND & String = js.native
  }
  
  @JSImport("@pixi/graphics", "LineStyle")
  @js.native
  open class LineStyle ()
    extends typings.pixiGraphics.libStylesLineStyleMod.LineStyle
  
  object graphicsUtils {
    
    @JSImport("@pixi/graphics", "graphicsUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@pixi/graphics", "graphicsUtils.ArcUtils")
    @js.native
    open class ArcUtils ()
      extends typings.pixiGraphics.libUtilsMod.ArcUtils
    @JSImport("@pixi/graphics", "graphicsUtils.ArcUtils")
    @js.native
    def ArcUtils: TypeofArcUtils = js.native
    inline def ArcUtils_=(x: TypeofArcUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArcUtils")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics", "graphicsUtils.BATCH_POOL")
    @js.native
    def BATCH_POOL: js.Array[typings.pixiGraphics.libUtilsMod.BatchPart] = js.native
    inline def BATCH_POOL_=(x: js.Array[typings.pixiGraphics.libUtilsMod.BatchPart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCH_POOL")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@pixi/graphics", "graphicsUtils.BatchPart")
    @js.native
    open class BatchPart ()
      extends typings.pixiGraphics.libUtilsMod.BatchPart
    @JSImport("@pixi/graphics", "graphicsUtils.BatchPart")
    @js.native
    def BatchPart: Instantiable0[typings.pixiGraphics.libUtilsMod.BatchPart] = js.native
    inline def BatchPart_=(x: Instantiable0[typings.pixiGraphics.libUtilsMod.BatchPart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BatchPart")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@pixi/graphics", "graphicsUtils.BezierUtils")
    @js.native
    open class BezierUtils ()
      extends typings.pixiGraphics.libUtilsMod.BezierUtils
    @JSImport("@pixi/graphics", "graphicsUtils.BezierUtils")
    @js.native
    def BezierUtils: TypeofBezierUtils = js.native
    inline def BezierUtils_=(x: TypeofBezierUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BezierUtils")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics", "graphicsUtils.DRAW_CALL_POOL")
    @js.native
    def DRAW_CALL_POOL: js.Array[BatchDrawCall] = js.native
    inline def DRAW_CALL_POOL_=(x: js.Array[BatchDrawCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAW_CALL_POOL")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics", "graphicsUtils.FILL_COMMANDS")
    @js.native
    def FILL_COMMANDS: Record[SHAPES, IShapeBuildCommand] = js.native
    inline def FILL_COMMANDS_=(x: Record[SHAPES, IShapeBuildCommand]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILL_COMMANDS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@pixi/graphics", "graphicsUtils.QuadraticUtils")
    @js.native
    open class QuadraticUtils ()
      extends typings.pixiGraphics.libUtilsMod.QuadraticUtils
    @JSImport("@pixi/graphics", "graphicsUtils.QuadraticUtils")
    @js.native
    def QuadraticUtils: TypeofQuadraticUtils = js.native
    inline def QuadraticUtils_=(x: TypeofQuadraticUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QuadraticUtils")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics", "graphicsUtils.buildCircle")
    @js.native
    def buildCircle: IShapeBuildCommand = js.native
    inline def buildCircle_=(x: IShapeBuildCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildCircle")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics", "graphicsUtils.buildLine")
    @js.native
    def buildLine: js.Function2[
        /* graphicsData */ typings.pixiGraphics.libGraphicsDataMod.GraphicsData, 
        /* graphicsGeometry */ typings.pixiGraphics.libGraphicsGeometryMod.GraphicsGeometry, 
        Unit
      ] = js.native
    inline def buildLine(
      graphicsData: typings.pixiGraphics.libGraphicsDataMod.GraphicsData,
      graphicsGeometry: typings.pixiGraphics.libGraphicsGeometryMod.GraphicsGeometry
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLine")(graphicsData.asInstanceOf[js.Any], graphicsGeometry.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def buildLine_=(
      x: js.Function2[
          /* graphicsData */ typings.pixiGraphics.libGraphicsDataMod.GraphicsData, 
          /* graphicsGeometry */ typings.pixiGraphics.libGraphicsGeometryMod.GraphicsGeometry, 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildLine")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics", "graphicsUtils.buildPoly")
    @js.native
    def buildPoly: IShapeBuildCommand = js.native
    inline def buildPoly_=(x: IShapeBuildCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildPoly")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics", "graphicsUtils.buildRectangle")
    @js.native
    def buildRectangle: IShapeBuildCommand = js.native
    inline def buildRectangle_=(x: IShapeBuildCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildRectangle")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/graphics", "graphicsUtils.buildRoundedRectangle")
    @js.native
    def buildRoundedRectangle: IShapeBuildCommand = js.native
    inline def buildRoundedRectangle_=(x: IShapeBuildCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildRoundedRectangle")(x.asInstanceOf[js.Any])
  }
}
