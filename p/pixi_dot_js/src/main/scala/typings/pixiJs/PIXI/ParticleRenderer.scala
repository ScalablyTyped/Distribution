package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renderer for Particles that is designer for speed over feature set.
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.ParticleRenderer")
@js.native
class ParticleRenderer protected () extends js.Object {
  def this(renderer: Renderer) = this()
  /**
    * The default shader that is used if a sprite doesn't have a more specific one.
    *
    * @member {PIXI.Shader} PIXI.ParticleRenderer#shader
    */
  var shader: Shader = js.native
  /**
    * The WebGL state in which this renderer will work.
    *
    * @member {PIXI.State} PIXI.ParticleRenderer#state
    * @readonly
    */
  val state: State = js.native
  /**
    * Destroys the ParticleRenderer.
    */
  def destroy(): Unit = js.native
  /**
    * Renders the particle container object.
    *
    * @param {PIXI.ParticleContainer} container - The container to render using this ParticleRenderer
    */
  def render(container: ParticleContainer): Unit = js.native
  /**
    * Uploads the position.
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their positions uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadPosition(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  /**
    * Uploads the rotiation.
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their rotation uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadRotation(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  /**
    * Uploads the tint.
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their rotation uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadTint(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  /**
    * Uploads the Uvs
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their rotation uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadUvs(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
  /**
    * Uploads the vertices.
    *
    * @param {PIXI.DisplayObject[]} children - the array of display objects to render
    * @param {number} startIndex - the index to start from in the children array
    * @param {number} amount - the amount of children that will have their vertices uploaded
    * @param {number[]} array - The vertices to upload.
    * @param {number} stride - Stride to use for iteration.
    * @param {number} offset - Offset to start at.
    */
  def uploadVertices(
    children: js.Array[DisplayObject],
    startIndex: Double,
    amount: Double,
    array: js.Array[Double],
    stride: Double,
    offset: Double
  ): Unit = js.native
}

