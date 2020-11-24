package typings.pixiJs.PIXI.systems

import typings.pixiJs.PIXI.Matrix
import typings.pixiJs.PIXI.Rectangle
import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.PIXI.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System plugin to the renderer to manage the projection matrix.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI.systems
  */
@js.native
trait ProjectionSystem extends System {
  
  /**
    * Updates the projection matrix based on a projection frame (which is a rectangle)
    *
    * @param {PIXI.Rectangle} destinationFrame - The destination frame.
    * @param {PIXI.Rectangle} sourceFrame - The source frame.
    * @param {Number} resolution - Resolution
    * @param {boolean} root - If is root
    */
  def calculateProjection(destinationFrame: Rectangle, sourceFrame: Rectangle, resolution: Double, root: Boolean): Unit = js.native
  
  /**
    * Default destination frame
    * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#defaultFrame
    * @readonly
    */
  val defaultFrame: Rectangle = js.native
  
  /**
    * Destination frame
    * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#destinationFrame
    * @readonly
    */
  val destinationFrame: Rectangle = js.native
  
  /**
    * Project matrix
    * @member {PIXI.Matrix} PIXI.systems.ProjectionSystem#projectionMatrix
    * @readonly
    */
  val projectionMatrix: Matrix = js.native
  
  /**
    * Sets the transform of the active render target to the given matrix
    *
    * @param {PIXI.Matrix} matrix - The transformation matrix
    */
  def setTransform(matrix: Matrix): Unit = js.native
  
  /**
    * Source frame
    * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#sourceFrame
    * @readonly
    */
  val sourceFrame: Rectangle = js.native
  
  /**
    * A transform that will be appended to the projection matrix
    * if null, nothing will be applied
    * @member {PIXI.Matrix} PIXI.systems.ProjectionSystem#transform
    */
  var transform: Matrix = js.native
  
  /**
    * Updates the projection matrix based on a projection frame (which is a rectangle).
    *
    * Make sure to run `renderer.framebuffer.setViewport(destinationFrame)` after calling this.
    *
    * @param {PIXI.Rectangle} destinationFrame - The destination frame.
    * @param {PIXI.Rectangle} sourceFrame - The source frame.
    * @param {Number} resolution - Resolution
    * @param {boolean} root - If is root
    */
  def update(destinationFrame: Rectangle, sourceFrame: Rectangle, resolution: Double, root: Boolean): Unit = js.native
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
  
  @scala.inline
  implicit class ProjectionSystemOps[Self <: ProjectionSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalculateProjection(value: (Rectangle, Rectangle, Double, Boolean) => Unit): Self = this.set("calculateProjection", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDefaultFrame(value: Rectangle): Self = this.set("defaultFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationFrame(value: Rectangle): Self = this.set("destinationFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionMatrix(value: Matrix): Self = this.set("projectionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetTransform(value: Matrix => Unit): Self = this.set("setTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSourceFrame(value: Rectangle): Self = this.set("sourceFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: Matrix): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: (Rectangle, Rectangle, Double, Boolean) => Unit): Self = this.set("update", js.Any.fromFunction4(value))
  }
}
