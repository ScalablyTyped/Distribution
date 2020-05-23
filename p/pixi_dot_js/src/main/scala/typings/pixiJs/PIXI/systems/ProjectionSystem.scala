package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.Matrix
import typings.pixiJs.PIXI.Rectangle
import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System plugin to the renderer to manage the projection matrix.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
trait ProjectionSystem extends System {
  /**
    * Default destination frame
    * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#defaultFrame
    * @readonly
    */
  val defaultFrame: Rectangle
  /**
    * Destination frame
    * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#destinationFrame
    * @readonly
    */
  val destinationFrame: Rectangle
  /**
    * Project matrix
    * @member {PIXI.Matrix} PIXI.systems.ProjectionSystem#projectionMatrix
    * @readonly
    */
  val projectionMatrix: Matrix
  /**
    * Source frame
    * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#sourceFrame
    * @readonly
    */
  val sourceFrame: Rectangle
  /**
    * A transform that will be appended to the projection matrix
    * if null, nothing will be applied
    * @member {PIXI.Matrix} PIXI.systems.ProjectionSystem#transform
    */
  var transform: Matrix
  /**
    * Updates the projection matrix based on a projection frame (which is a rectangle)
    *
    * @param {PIXI.Rectangle} destinationFrame - The destination frame.
    * @param {PIXI.Rectangle} sourceFrame - The source frame.
    * @param {Number} resolution - Resolution
    * @param {boolean} root - If is root
    */
  def calculateProjection(destinationFrame: Rectangle, sourceFrame: Rectangle, resolution: Double, root: Boolean): Unit
  /**
    * Sets the transform of the active render target to the given matrix
    *
    * @param {PIXI.Matrix} matrix - The transformation matrix
    */
  def setTransform(matrix: Matrix): Unit
  /**
    * Updates the projection matrix based on a projection frame (which is a rectangle)
    *
    * @param {PIXI.Rectangle} destinationFrame - The destination frame.
    * @param {PIXI.Rectangle} sourceFrame - The source frame.
    * @param {Number} resolution - Resolution
    * @param {boolean} root - If is root
    */
  def update(destinationFrame: Rectangle, sourceFrame: Rectangle, resolution: Double, root: Boolean): Unit
}

object ProjectionSystem {
  @scala.inline
  def apply(
    calculateProjection: (Rectangle, Rectangle, Double, Boolean) => Unit,
    defaultFrame: Rectangle,
    destinationFrame: Rectangle,
    destroy: () => Unit,
    projectionMatrix: Matrix,
    renderer: Renderer,
    setTransform: Matrix => Unit,
    sourceFrame: Rectangle,
    transform: Matrix,
    update: (Rectangle, Rectangle, Double, Boolean) => Unit
  ): ProjectionSystem = {
    val __obj = js.Dynamic.literal(calculateProjection = js.Any.fromFunction4(calculateProjection), defaultFrame = defaultFrame.asInstanceOf[js.Any], destinationFrame = destinationFrame.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), projectionMatrix = projectionMatrix.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], setTransform = js.Any.fromFunction1(setTransform), sourceFrame = sourceFrame.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], update = js.Any.fromFunction4(update))
    __obj.asInstanceOf[ProjectionSystem]
  }
}

