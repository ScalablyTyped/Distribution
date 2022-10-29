package typings.pixiJs.mod

import org.scalablytyped.runtime.Instantiable0
import typings.pixiGraphics.anon.TypeofArcUtils
import typings.pixiGraphics.anon.TypeofBezierUtils
import typings.pixiGraphics.anon.TypeofQuadraticUtils
import typings.pixiGraphics.libUtilsIshapebuildcommandMod.IShapeBuildCommand
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphicsUtils {
  
  @JSImport("pixi.js", "graphicsUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "graphicsUtils.ArcUtils")
  @js.native
  open class ArcUtils ()
    extends typings.pixiGraphics.libUtilsMod.ArcUtils
  @JSImport("pixi.js", "graphicsUtils.ArcUtils")
  @js.native
  def ArcUtils: TypeofArcUtils = js.native
  inline def ArcUtils_=(x: TypeofArcUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArcUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.BATCH_POOL")
  @js.native
  def BATCH_POOL: js.Array[typings.pixiGraphics.libUtilsMod.BatchPart] = js.native
  inline def BATCH_POOL_=(x: js.Array[typings.pixiGraphics.libUtilsMod.BatchPart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCH_POOL")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "graphicsUtils.BatchPart")
  @js.native
  open class BatchPart ()
    extends typings.pixiGraphics.libUtilsMod.BatchPart
  @JSImport("pixi.js", "graphicsUtils.BatchPart")
  @js.native
  def BatchPart: Instantiable0[typings.pixiGraphics.libUtilsMod.BatchPart] = js.native
  inline def BatchPart_=(x: Instantiable0[typings.pixiGraphics.libUtilsMod.BatchPart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BatchPart")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "graphicsUtils.BezierUtils")
  @js.native
  open class BezierUtils ()
    extends typings.pixiGraphics.libUtilsMod.BezierUtils
  @JSImport("pixi.js", "graphicsUtils.BezierUtils")
  @js.native
  def BezierUtils: TypeofBezierUtils = js.native
  inline def BezierUtils_=(x: TypeofBezierUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BezierUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.DRAW_CALL_POOL")
  @js.native
  def DRAW_CALL_POOL: js.Array[typings.pixiCore.mod.BatchDrawCall] = js.native
  inline def DRAW_CALL_POOL_=(x: js.Array[typings.pixiCore.mod.BatchDrawCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAW_CALL_POOL")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.FILL_COMMANDS")
  @js.native
  def FILL_COMMANDS: Record[typings.pixiMath.libConstMod.SHAPES, IShapeBuildCommand] = js.native
  inline def FILL_COMMANDS_=(x: Record[typings.pixiMath.libConstMod.SHAPES, IShapeBuildCommand]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILL_COMMANDS")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pixi.js", "graphicsUtils.QuadraticUtils")
  @js.native
  open class QuadraticUtils ()
    extends typings.pixiGraphics.libUtilsMod.QuadraticUtils
  @JSImport("pixi.js", "graphicsUtils.QuadraticUtils")
  @js.native
  def QuadraticUtils: TypeofQuadraticUtils = js.native
  inline def QuadraticUtils_=(x: TypeofQuadraticUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QuadraticUtils")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.buildCircle")
  @js.native
  def buildCircle: IShapeBuildCommand = js.native
  inline def buildCircle_=(x: IShapeBuildCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildCircle")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.buildLine")
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
  
  @JSImport("pixi.js", "graphicsUtils.buildPoly")
  @js.native
  def buildPoly: IShapeBuildCommand = js.native
  inline def buildPoly_=(x: IShapeBuildCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildPoly")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.buildRectangle")
  @js.native
  def buildRectangle: IShapeBuildCommand = js.native
  inline def buildRectangle_=(x: IShapeBuildCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildRectangle")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "graphicsUtils.buildRoundedRectangle")
  @js.native
  def buildRoundedRectangle: IShapeBuildCommand = js.native
  inline def buildRoundedRectangle_=(x: IShapeBuildCommand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildRoundedRectangle")(x.asInstanceOf[js.Any])
}
