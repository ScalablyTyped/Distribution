package typings.phaser.Phaser.Renderer.WebGL.Pipelines

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implements a model view projection matrices.
  * Pipelines can implement this for doing 2D and 3D rendering.
  */
trait ModelViewProjection extends js.Object {
  /**
    * Model matrix
    */
  var modelMatrix: Float32Array
  /**
    * Dirty flag for checking if model matrix needs to be updated on GPU.
    */
  var modelMatrixDirty: Boolean
  /**
    * Projection matrix
    */
  var projectionMatrix: Float32Array
  /**
    * Dirty flag for checking if projection matrix needs to be updated on GPU.
    */
  var projectionMatrixDirty: Boolean
  /**
    * View matrix
    */
  var viewMatrix: Float32Array
  /**
    * Dirty flag for checking if view matrix needs to be updated on GPU.
    */
  var viewMatrixDirty: Boolean
  /**
    * Loads an identity matrix to the model matrix
    */
  def modelIdentity(): Unit
  /**
    * Rotates the model matrix in the X axis.
    * @param radians The amount to rotate by.
    */
  def modelRotateX(radians: Double): this.type
  /**
    * Rotates the model matrix in the Y axis.
    * @param radians The amount to rotate by.
    */
  def modelRotateY(radians: Double): this.type
  /**
    * Rotates the model matrix in the Z axis.
    * @param radians The amount to rotate by.
    */
  def modelRotateZ(radians: Double): this.type
  /**
    * Scale model matrix
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def modelScale(x: Double, y: Double, z: Double): this.type
  /**
    * Translate model matrix
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def modelTranslate(x: Double, y: Double, z: Double): this.type
  /**
    * Initializes MVP matrices with an identity matrix
    */
  def mvpInit(): Unit
  /**
    * If dirty flags are set then the matrices are uploaded to the GPU.
    */
  def mvpUpdate(): Unit
  /**
    * Loads identity matrix into the projection matrix.
    */
  def projIdentity(): this.type
  /**
    * Sets up an orthographic projection matrix
    * @param left The left value.
    * @param right The right value.
    * @param bottom The bottom value.
    * @param top The top value.
    * @param near The near value.
    * @param far The far value.
    */
  def projOrtho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): this.type
  /**
    * Sets up a perspective projection matrix
    * @param fovY The fov value.
    * @param aspectRatio The aspectRatio value.
    * @param near The near value.
    * @param far The far value.
    */
  def projPersp(fovY: Double, aspectRatio: Double, near: Double, far: Double): this.type
  /**
    * Loads identity matrix into the view matrix
    */
  def viewIdentity(): this.type
  /**
    * Copies a 4x4 matrix into the view matrix
    * @param matrix The Matrix2D.
    */
  def viewLoad(matrix: Float32Array): this.type
  /**
    * Loads a 2D view matrix (3x2 matrix) into a 4x4 view matrix
    * @param matrix2D The Matrix2D.
    */
  def viewLoad2D(matrix2D: Float32Array): this.type
  /**
    * Rotates view matrix in the X axis.
    * @param radians The amount to rotate by.
    */
  def viewRotateX(radians: Double): this.type
  /**
    * Rotates view matrix in the Y axis.
    * @param radians The amount to rotate by.
    */
  def viewRotateY(radians: Double): this.type
  /**
    * Rotates view matrix in the Z axis.
    * @param radians The amount to rotate by.
    */
  def viewRotateZ(radians: Double): this.type
  /**
    * Scales view matrix
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def viewScale(x: Double, y: Double, z: Double): this.type
  /**
    * Translates view matrix
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def viewTranslate(x: Double, y: Double, z: Double): this.type
}

object ModelViewProjection {
  @scala.inline
  def apply(
    modelIdentity: () => Unit,
    modelMatrix: Float32Array,
    modelMatrixDirty: Boolean,
    modelRotateX: Double => ModelViewProjection,
    modelRotateY: Double => ModelViewProjection,
    modelRotateZ: Double => ModelViewProjection,
    modelScale: (Double, Double, Double) => ModelViewProjection,
    modelTranslate: (Double, Double, Double) => ModelViewProjection,
    mvpInit: () => Unit,
    mvpUpdate: () => Unit,
    projIdentity: () => ModelViewProjection,
    projOrtho: (Double, Double, Double, Double, Double, Double) => ModelViewProjection,
    projPersp: (Double, Double, Double, Double) => ModelViewProjection,
    projectionMatrix: Float32Array,
    projectionMatrixDirty: Boolean,
    viewIdentity: () => ModelViewProjection,
    viewLoad: Float32Array => ModelViewProjection,
    viewLoad2D: Float32Array => ModelViewProjection,
    viewMatrix: Float32Array,
    viewMatrixDirty: Boolean,
    viewRotateX: Double => ModelViewProjection,
    viewRotateY: Double => ModelViewProjection,
    viewRotateZ: Double => ModelViewProjection,
    viewScale: (Double, Double, Double) => ModelViewProjection,
    viewTranslate: (Double, Double, Double) => ModelViewProjection
  ): ModelViewProjection = {
    val __obj = js.Dynamic.literal(modelIdentity = js.Any.fromFunction0(modelIdentity), modelMatrix = modelMatrix, modelMatrixDirty = modelMatrixDirty, modelRotateX = js.Any.fromFunction1(modelRotateX), modelRotateY = js.Any.fromFunction1(modelRotateY), modelRotateZ = js.Any.fromFunction1(modelRotateZ), modelScale = js.Any.fromFunction3(modelScale), modelTranslate = js.Any.fromFunction3(modelTranslate), mvpInit = js.Any.fromFunction0(mvpInit), mvpUpdate = js.Any.fromFunction0(mvpUpdate), projIdentity = js.Any.fromFunction0(projIdentity), projOrtho = js.Any.fromFunction6(projOrtho), projPersp = js.Any.fromFunction4(projPersp), projectionMatrix = projectionMatrix, projectionMatrixDirty = projectionMatrixDirty, viewIdentity = js.Any.fromFunction0(viewIdentity), viewLoad = js.Any.fromFunction1(viewLoad), viewLoad2D = js.Any.fromFunction1(viewLoad2D), viewMatrix = viewMatrix, viewMatrixDirty = viewMatrixDirty, viewRotateX = js.Any.fromFunction1(viewRotateX), viewRotateY = js.Any.fromFunction1(viewRotateY), viewRotateZ = js.Any.fromFunction1(viewRotateZ), viewScale = js.Any.fromFunction3(viewScale), viewTranslate = js.Any.fromFunction3(viewTranslate))
  
    __obj.asInstanceOf[ModelViewProjection]
  }
}

