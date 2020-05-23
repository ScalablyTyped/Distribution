package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Graphics class contains methods used to draw primitive shapes such as lines, circles and
  * rectangles to the display, and to color and fill them.
  *
  * GraphicsGeometry is designed to not be continually updating the geometry since it's expensive
  * to re-tesselate using **earcut**. Consider using {@link PIXI.Mesh} for this use-case, it's much faster.
  *
  * @class
  * @extends PIXI.BatchGeometry
  * @memberof PIXI
  */
@JSGlobal("PIXI.GraphicsGeometry")
@js.native
class GraphicsGeometry ()
  extends typings.pixiJs.PIXI.GraphicsGeometry {
  /**
    * Buffer used for position, color, texture IDs
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_buffer
    * @protected
    */
  /* CompleteClass */
  override var _buffer: typings.pixiJs.PIXI.Buffer = js.native
  /**
    * Index buffer data
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_indexBuffer
    * @protected
    */
  /* CompleteClass */
  override var _indexBuffer: typings.pixiJs.PIXI.Buffer = js.native
}

/* static members */
@JSGlobal("PIXI.GraphicsGeometry")
@js.native
object GraphicsGeometry extends js.Object {
  /**
    * The maximum number of points to consider an object "batchable",
    * able to be batched by the renderer's batch system.
    *
    * @memberof PIXI.GraphicsGeometry
    * @static
    * @member {number} BATCHABLE_SIZE
    * @default 100
    */
  var BATCHABLE_SIZE: Double = js.native
}

