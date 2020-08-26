package typings.phaser.Phaser.Renderer.WebGL.Pipelines

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implements a model view projection matrices.
  * Pipelines can implement this for doing 2D and 3D rendering.
  */
@js.native
trait ModelViewProjection extends js.Object {
  /**
    * Model matrix
    */
  var modelMatrix: Float32Array = js.native
  /**
    * Dirty flag for checking if model matrix needs to be updated on GPU.
    */
  var modelMatrixDirty: Boolean = js.native
  /**
    * Projection matrix
    */
  var projectionMatrix: Float32Array = js.native
  /**
    * Dirty flag for checking if projection matrix needs to be updated on GPU.
    */
  var projectionMatrixDirty: Boolean = js.native
  /**
    * View matrix
    */
  var viewMatrix: Float32Array = js.native
  /**
    * Dirty flag for checking if view matrix needs to be updated on GPU.
    */
  var viewMatrixDirty: Boolean = js.native
  /**
    * Loads an identity matrix to the model matrix
    */
  def modelIdentity(): Unit = js.native
  /**
    * Rotates the model matrix in the X axis.
    * @param radians The amount to rotate by.
    */
  def modelRotateX(radians: Double): this.type = js.native
  /**
    * Rotates the model matrix in the Y axis.
    * @param radians The amount to rotate by.
    */
  def modelRotateY(radians: Double): this.type = js.native
  /**
    * Rotates the model matrix in the Z axis.
    * @param radians The amount to rotate by.
    */
  def modelRotateZ(radians: Double): this.type = js.native
  /**
    * Scale model matrix
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def modelScale(x: Double, y: Double, z: Double): this.type = js.native
  /**
    * Translate model matrix
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def modelTranslate(x: Double, y: Double, z: Double): this.type = js.native
  /**
    * Initializes MVP matrices with an identity matrix
    */
  def mvpInit(): Unit = js.native
  /**
    * If dirty flags are set then the matrices are uploaded to the GPU.
    */
  def mvpUpdate(): Unit = js.native
  /**
    * Loads identity matrix into the projection matrix.
    */
  def projIdentity(): this.type = js.native
  /**
    * Sets up an orthographic projection matrix
    * @param left The left value.
    * @param right The right value.
    * @param bottom The bottom value.
    * @param top The top value.
    * @param near The near value.
    * @param far The far value.
    */
  def projOrtho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): this.type = js.native
  /**
    * Sets up a perspective projection matrix
    * @param fovY The fov value.
    * @param aspectRatio The aspectRatio value.
    * @param near The near value.
    * @param far The far value.
    */
  def projPersp(fovY: Double, aspectRatio: Double, near: Double, far: Double): this.type = js.native
  /**
    * Loads identity matrix into the view matrix
    */
  def viewIdentity(): this.type = js.native
  /**
    * Copies a 4x4 matrix into the view matrix
    * @param matrix The Matrix2D.
    */
  def viewLoad(matrix: Float32Array): this.type = js.native
  /**
    * Loads a 2D view matrix (3x2 matrix) into a 4x4 view matrix
    * @param matrix2D The Matrix2D.
    */
  def viewLoad2D(matrix2D: Float32Array): this.type = js.native
  /**
    * Rotates view matrix in the X axis.
    * @param radians The amount to rotate by.
    */
  def viewRotateX(radians: Double): this.type = js.native
  /**
    * Rotates view matrix in the Y axis.
    * @param radians The amount to rotate by.
    */
  def viewRotateY(radians: Double): this.type = js.native
  /**
    * Rotates view matrix in the Z axis.
    * @param radians The amount to rotate by.
    */
  def viewRotateZ(radians: Double): this.type = js.native
  /**
    * Scales view matrix
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def viewScale(x: Double, y: Double, z: Double): this.type = js.native
  /**
    * Translates view matrix
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def viewTranslate(x: Double, y: Double, z: Double): this.type = js.native
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
    val __obj = js.Dynamic.literal(modelIdentity = js.Any.fromFunction0(modelIdentity), modelMatrix = modelMatrix.asInstanceOf[js.Any], modelMatrixDirty = modelMatrixDirty.asInstanceOf[js.Any], modelRotateX = js.Any.fromFunction1(modelRotateX), modelRotateY = js.Any.fromFunction1(modelRotateY), modelRotateZ = js.Any.fromFunction1(modelRotateZ), modelScale = js.Any.fromFunction3(modelScale), modelTranslate = js.Any.fromFunction3(modelTranslate), mvpInit = js.Any.fromFunction0(mvpInit), mvpUpdate = js.Any.fromFunction0(mvpUpdate), projIdentity = js.Any.fromFunction0(projIdentity), projOrtho = js.Any.fromFunction6(projOrtho), projPersp = js.Any.fromFunction4(projPersp), projectionMatrix = projectionMatrix.asInstanceOf[js.Any], projectionMatrixDirty = projectionMatrixDirty.asInstanceOf[js.Any], viewIdentity = js.Any.fromFunction0(viewIdentity), viewLoad = js.Any.fromFunction1(viewLoad), viewLoad2D = js.Any.fromFunction1(viewLoad2D), viewMatrix = viewMatrix.asInstanceOf[js.Any], viewMatrixDirty = viewMatrixDirty.asInstanceOf[js.Any], viewRotateX = js.Any.fromFunction1(viewRotateX), viewRotateY = js.Any.fromFunction1(viewRotateY), viewRotateZ = js.Any.fromFunction1(viewRotateZ), viewScale = js.Any.fromFunction3(viewScale), viewTranslate = js.Any.fromFunction3(viewTranslate))
    __obj.asInstanceOf[ModelViewProjection]
  }
  @scala.inline
  implicit class ModelViewProjectionOps[Self <: ModelViewProjection] (val x: Self) extends AnyVal {
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
    def setModelIdentity(value: () => Unit): Self = this.set("modelIdentity", js.Any.fromFunction0(value))
    @scala.inline
    def setModelMatrix(value: Float32Array): Self = this.set("modelMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelMatrixDirty(value: Boolean): Self = this.set("modelMatrixDirty", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelRotateX(value: Double => ModelViewProjection): Self = this.set("modelRotateX", js.Any.fromFunction1(value))
    @scala.inline
    def setModelRotateY(value: Double => ModelViewProjection): Self = this.set("modelRotateY", js.Any.fromFunction1(value))
    @scala.inline
    def setModelRotateZ(value: Double => ModelViewProjection): Self = this.set("modelRotateZ", js.Any.fromFunction1(value))
    @scala.inline
    def setModelScale(value: (Double, Double, Double) => ModelViewProjection): Self = this.set("modelScale", js.Any.fromFunction3(value))
    @scala.inline
    def setModelTranslate(value: (Double, Double, Double) => ModelViewProjection): Self = this.set("modelTranslate", js.Any.fromFunction3(value))
    @scala.inline
    def setMvpInit(value: () => Unit): Self = this.set("mvpInit", js.Any.fromFunction0(value))
    @scala.inline
    def setMvpUpdate(value: () => Unit): Self = this.set("mvpUpdate", js.Any.fromFunction0(value))
    @scala.inline
    def setProjIdentity(value: () => ModelViewProjection): Self = this.set("projIdentity", js.Any.fromFunction0(value))
    @scala.inline
    def setProjOrtho(value: (Double, Double, Double, Double, Double, Double) => ModelViewProjection): Self = this.set("projOrtho", js.Any.fromFunction6(value))
    @scala.inline
    def setProjPersp(value: (Double, Double, Double, Double) => ModelViewProjection): Self = this.set("projPersp", js.Any.fromFunction4(value))
    @scala.inline
    def setProjectionMatrix(value: Float32Array): Self = this.set("projectionMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectionMatrixDirty(value: Boolean): Self = this.set("projectionMatrixDirty", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewIdentity(value: () => ModelViewProjection): Self = this.set("viewIdentity", js.Any.fromFunction0(value))
    @scala.inline
    def setViewLoad(value: Float32Array => ModelViewProjection): Self = this.set("viewLoad", js.Any.fromFunction1(value))
    @scala.inline
    def setViewLoad2D(value: Float32Array => ModelViewProjection): Self = this.set("viewLoad2D", js.Any.fromFunction1(value))
    @scala.inline
    def setViewMatrix(value: Float32Array): Self = this.set("viewMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewMatrixDirty(value: Boolean): Self = this.set("viewMatrixDirty", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewRotateX(value: Double => ModelViewProjection): Self = this.set("viewRotateX", js.Any.fromFunction1(value))
    @scala.inline
    def setViewRotateY(value: Double => ModelViewProjection): Self = this.set("viewRotateY", js.Any.fromFunction1(value))
    @scala.inline
    def setViewRotateZ(value: Double => ModelViewProjection): Self = this.set("viewRotateZ", js.Any.fromFunction1(value))
    @scala.inline
    def setViewScale(value: (Double, Double, Double) => ModelViewProjection): Self = this.set("viewScale", js.Any.fromFunction3(value))
    @scala.inline
    def setViewTranslate(value: (Double, Double, Double) => ModelViewProjection): Self = this.set("viewTranslate", js.Any.fromFunction3(value))
  }
  
}

