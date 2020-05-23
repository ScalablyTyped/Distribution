package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generalized convenience utilities for Graphics.
  *
  * @namespace PIXI.graphicsUtils
  */
@JSGlobal("PIXI.graphicsUtils")
@js.native
object graphicsUtils extends js.Object {
  /**
    * A structure to hold interim batch objects for Graphics.
    * @class
    * @memberof PIXI.graphicsUtils
    */
  @js.native
  class BatchPart ()
    extends typings.pixiJs.PIXI.graphicsUtils.BatchPart
  
  /**
    * Batch pool, stores unused batches for preventing allocations.
    *
    * @memberof PIXI.graphicsUtils
    * @type {Array<PIXI.graphicsUtils.BatchPart>}
    */
  var BATCH_POOL: js.Array[typings.pixiJs.PIXI.graphicsUtils.BatchPart] = js.native
  /**
    * Draw call pool, stores unused draw calls for preventing allocations.
    *
    * @memberof PIXI.graphicsUtils
    * @type {Array<PIXI.BatchDrawCall>}
    */
  var DRAW_CALL_POOL: js.Array[typings.pixiJs.PIXI.BatchDrawCall] = js.native
  /**
    * Map of fill commands for each shape type.
    *
    * @memberof PIXI.graphicsUtils
    * @member {Object}
    */
  var FILL_COMMANDS: js.Any = js.native
}

