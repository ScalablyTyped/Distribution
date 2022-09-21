package typings.pixiGraphics.mod

import org.scalablytyped.runtime.Instantiable0
import typings.pixiCore.mod.BatchDrawCall
import typings.pixiGraphics.anon.TypeofArcUtils
import typings.pixiGraphics.anon.TypeofBezierUtils
import typings.pixiGraphics.anon.TypeofQuadraticUtils
import typings.pixiMath.mod.SHAPES
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphicsUtils {
  
  @JSImport("@pixi/graphics", "graphicsUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi/graphics", "graphicsUtils.ArcUtils")
  @js.native
  def ArcUtils: TypeofArcUtils & Instantiable0[typings.pixiGraphics.mod.ArcUtils] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pixi/graphics", "graphicsUtils.ArcUtils")
  @js.native
  open class ArcUtilsCls ()
    extends StObject
       with ArcUtils
  
  inline def ArcUtils_=(x: TypeofArcUtils & Instantiable0[ArcUtils]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArcUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi/graphics", "graphicsUtils.BATCH_POOL")
  @js.native
  def BATCH_POOL: js.Array[BatchPart] = js.native
  inline def BATCH_POOL_=(x: js.Array[BatchPart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCH_POOL")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi/graphics", "graphicsUtils.BatchPart")
  @js.native
  def BatchPart: Instantiable0[typings.pixiGraphics.mod.BatchPart] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pixi/graphics", "graphicsUtils.BatchPart")
  @js.native
  open class BatchPartCls ()
    extends StObject
       with BatchPart
  
  inline def BatchPart_=(x: Instantiable0[BatchPart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BatchPart")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi/graphics", "graphicsUtils.BezierUtils")
  @js.native
  def BezierUtils: TypeofBezierUtils & Instantiable0[typings.pixiGraphics.mod.BezierUtils] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pixi/graphics", "graphicsUtils.BezierUtils")
  @js.native
  open class BezierUtilsCls ()
    extends StObject
       with BezierUtils
  
  inline def BezierUtils_=(x: TypeofBezierUtils & Instantiable0[BezierUtils]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BezierUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi/graphics", "graphicsUtils.DRAW_CALL_POOL")
  @js.native
  def DRAW_CALL_POOL: js.Array[BatchDrawCall] = js.native
  inline def DRAW_CALL_POOL_=(x: js.Array[BatchDrawCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAW_CALL_POOL")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi/graphics", "graphicsUtils.FILL_COMMANDS")
  @js.native
  def FILL_COMMANDS: Record[SHAPES, IShapeBuildCommand] = js.native
  inline def FILL_COMMANDS_=(x: Record[SHAPES, IShapeBuildCommand]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILL_COMMANDS")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi/graphics", "graphicsUtils.QuadraticUtils")
  @js.native
  def QuadraticUtils: TypeofQuadraticUtils & Instantiable0[typings.pixiGraphics.mod.QuadraticUtils] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pixi/graphics", "graphicsUtils.QuadraticUtils")
  @js.native
  open class QuadraticUtilsCls ()
    extends StObject
       with QuadraticUtils
  
  inline def QuadraticUtils_=(x: TypeofQuadraticUtils & Instantiable0[QuadraticUtils]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QuadraticUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi/graphics", "graphicsUtils.buildCircle")
  @js.native
  def buildCircle: IShapeBuildCommand = js.native
  inline def buildCircle_=(x: IShapeBuildCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildCircle")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi/graphics", "graphicsUtils.buildLine")
  @js.native
  def buildLine: js.Function2[/* graphicsData */ GraphicsData, /* graphicsGeometry */ GraphicsGeometry, Unit] = js.native
  inline def buildLine(graphicsData: GraphicsData, graphicsGeometry: GraphicsGeometry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLine")(graphicsData.asInstanceOf[js.Any], graphicsGeometry.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def buildLine_=(x: js.Function2[/* graphicsData */ GraphicsData, /* graphicsGeometry */ GraphicsGeometry, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildLine")(x.asInstanceOf[js.Any])
  
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
