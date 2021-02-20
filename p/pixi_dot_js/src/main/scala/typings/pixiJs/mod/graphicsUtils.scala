package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generalized convenience utilities for Graphics.
  *
  * @namespace graphicsUtils
  * @memberof PIXI
  */
object graphicsUtils {
  
  @JSImport("pixi.js", "graphicsUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Batch pool, stores unused batches for preventing allocations.
    *
    * @memberof PIXI.graphicsUtils
    * @member {Array<PIXI.graphicsUtils.BatchPart>} BATCH_POOL
    */
  @JSImport("pixi.js", "graphicsUtils.BATCH_POOL")
  @js.native
  def BATCH_POOL: js.Array[typings.pixiJs.PIXI.graphicsUtils.BatchPart] = js.native
  @scala.inline
  def BATCH_POOL_=(x: js.Array[typings.pixiJs.PIXI.graphicsUtils.BatchPart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCH_POOL")(x.asInstanceOf[js.Any])
  
  /**
    * A structure to hold interim batch objects for Graphics.
    * @class
    * @memberof PIXI.graphicsUtils
    */
  @JSImport("pixi.js", "graphicsUtils.BatchPart")
  @js.native
  class BatchPart ()
    extends typings.pixiJs.PIXI.graphicsUtils.BatchPart
  
  /**
    * Draw call pool, stores unused draw calls for preventing allocations.
    *
    * @memberof PIXI.graphicsUtils
    * @member {Array<PIXI.BatchDrawCall>} DRAW_CALL_POOL
    */
  @JSImport("pixi.js", "graphicsUtils.DRAW_CALL_POOL")
  @js.native
  def DRAW_CALL_POOL: js.Array[typings.pixiJs.PIXI.BatchDrawCall] = js.native
  @scala.inline
  def DRAW_CALL_POOL_=(x: js.Array[typings.pixiJs.PIXI.BatchDrawCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRAW_CALL_POOL")(x.asInstanceOf[js.Any])
  
  /**
    * Map of fill commands for each shape type.
    *
    * @memberof PIXI.graphicsUtils
    * @member {Object} FILL_COMMANDS
    */
  @JSImport("pixi.js", "graphicsUtils.FILL_COMMANDS")
  @js.native
  def FILL_COMMANDS: js.Any = js.native
  @scala.inline
  def FILL_COMMANDS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILL_COMMANDS")(x.asInstanceOf[js.Any])
  
  /**
    * Draw a star shape with an arbitrary number of points.
    *
    * @class
    * @extends PIXI.Polygon
    * @memberof PIXI.graphicsUtils
    * @param {number} x - Center X position of the star
    * @param {number} y - Center Y position of the star
    * @param {number} points - The number of points of the star, must be > 1
    * @param {number} radius - The outer radius of the star
    * @param {number} [innerRadius] - The inner radius between points, default half `radius`
    * @param {number} [rotation=0] - The rotation of the star in radians, where 0 is vertical
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  @JSImport("pixi.js", "graphicsUtils.Star")
  @js.native
  class Star protected ()
    extends typings.pixiJs.PIXI.graphicsUtils.Star {
    def this(x: Double, y: Double, points: Double, radius: Double) = this()
    def this(x: Double, y: Double, points: Double, radius: Double, innerRadius: Double) = this()
    def this(
      x: Double,
      y: Double,
      points: Double,
      radius: Double,
      innerRadius: js.UndefOr[scala.Nothing],
      rotation: Double
    ) = this()
    def this(x: Double, y: Double, points: Double, radius: Double, innerRadius: Double, rotation: Double) = this()
  }
}
