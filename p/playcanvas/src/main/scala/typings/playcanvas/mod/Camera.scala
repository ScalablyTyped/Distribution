package typings.playcanvas.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A camera.
  *
  * @ignore
  */
@JSImport("playcanvas", "Camera")
@js.native
open class Camera () extends StObject {
  
  var _aperture: Double = js.native
  
  var _aspectRatio: Double = js.native
  
  var _aspectRatioMode: Double = js.native
  
  var _calculateProjection: Any = js.native
  
  var _calculateTransform: Any = js.native
  
  var _clearColor: Color = js.native
  
  var _clearColorBuffer: Boolean = js.native
  
  var _clearDepth: Double = js.native
  
  var _clearDepthBuffer: Boolean = js.native
  
  var _clearStencil: Double = js.native
  
  var _clearStencilBuffer: Boolean = js.native
  
  var _cullFaces: Boolean = js.native
  
  var _cullingMask: Double = js.native
  
  def _evaluateProjectionMatrix(): Unit = js.native
  
  var _farClip: Double = js.native
  
  var _flipFaces: Boolean = js.native
  
  var _fov: Double = js.native
  
  var _frustumCulling: Boolean = js.native
  
  var _horizontalFov: Boolean = js.native
  
  var _layers: js.Array[Double] = js.native
  
  var _layersSet: Set[Double] = js.native
  
  var _nearClip: Double = js.native
  
  var _node: Any = js.native
  
  var _orthoHeight: Double = js.native
  
  var _projMat: Mat4 = js.native
  
  var _projMatDirty: Boolean = js.native
  
  var _projMatSkybox: Mat4 = js.native
  
  var _projection: Double = js.native
  
  var _rect: Vec4 = js.native
  
  var _renderTarget: Any = js.native
  
  var _scissorRect: Vec4 = js.native
  
  var _scissorRectClear: Boolean = js.native
  
  var _sensitivity: Double = js.native
  
  var _shutter: Double = js.native
  
  def _updateViewProjMat(): Unit = js.native
  
  var _viewMat: Mat4 = js.native
  
  var _viewMatDirty: Boolean = js.native
  
  var _viewProjMat: Mat4 = js.native
  
  var _viewProjMatDirty: Boolean = js.native
  
  def aperture: Double = js.native
  def aperture_=(arg: Double): Unit = js.native
  
  def aspectRatio: Double = js.native
  
  def aspectRatioMode: Double = js.native
  def aspectRatioMode_=(arg: Double): Unit = js.native
  
  def aspectRatio_=(arg: Double): Unit = js.native
  
  def calculateProjection: Any = js.native
  def calculateProjection_=(arg: Any): Unit = js.native
  
  def calculateTransform: Any = js.native
  def calculateTransform_=(arg: Any): Unit = js.native
  
  def clearColor: Color = js.native
  
  def clearColorBuffer: Boolean = js.native
  def clearColorBuffer_=(arg: Boolean): Unit = js.native
  
  def clearColor_=(arg: Color): Unit = js.native
  
  def clearDepth: Double = js.native
  
  def clearDepthBuffer: Boolean = js.native
  def clearDepthBuffer_=(arg: Boolean): Unit = js.native
  
  def clearDepth_=(arg: Double): Unit = js.native
  
  def clearStencil: Double = js.native
  
  def clearStencilBuffer: Boolean = js.native
  def clearStencilBuffer_=(arg: Boolean): Unit = js.native
  
  def clearStencil_=(arg: Double): Unit = js.native
  
  /**
    * Copies one camera to another.
    *
    * @param {Camera} other - Camera to copy.
    * @returns {Camera} Self for chaining.
    */
  def copy(other: Camera): Camera = js.native
  
  def cullFaces: Boolean = js.native
  def cullFaces_=(arg: Boolean): Unit = js.native
  
  def cullingMask: Double = js.native
  def cullingMask_=(arg: Double): Unit = js.native
  
  def farClip: Double = js.native
  def farClip_=(arg: Double): Unit = js.native
  
  def flipFaces: Boolean = js.native
  def flipFaces_=(arg: Boolean): Unit = js.native
  
  def fov: Double = js.native
  def fov_=(arg: Double): Unit = js.native
  
  var frustum: Frustum = js.native
  
  def frustumCulling: Boolean = js.native
  def frustumCulling_=(arg: Boolean): Unit = js.native
  
  /**
    * True if the camera clears the full render target. (viewport / scissor are full size)
    */
  def fullSizeClearRect: Boolean = js.native
  
  def getExposure(): Double = js.native
  
  /**
    * Returns an array of corners of the frustum of the camera in the local coordinate system of the camera.
    *
    * @param {number} [near] - Near distance for the frustum points. Defaults to the near clip distance of the camera.
    * @param {number} [far] - Far distance for the frustum points. Defaults to the far clip distance of the camera.
    * @returns {Vec3[]} - An array of corners, using a global storage space.
    */
  def getFrustumCorners(): js.Array[Vec3] = js.native
  def getFrustumCorners(near: Double): js.Array[Vec3] = js.native
  def getFrustumCorners(near: Double, far: Double): js.Array[Vec3] = js.native
  def getFrustumCorners(near: Unit, far: Double): js.Array[Vec3] = js.native
  
  def getProjectionMatrixSkybox(): Mat4 = js.native
  
  def getScreenSize(sphere: Any): Double = js.native
  
  def horizontalFov: Boolean = js.native
  def horizontalFov_=(arg: Boolean): Unit = js.native
  
  def layers: js.Array[Double] = js.native
  
  def layersSet: Set[Double] = js.native
  
  def layers_=(arg: js.Array[Double]): Unit = js.native
  
  def nearClip: Double = js.native
  def nearClip_=(arg: Double): Unit = js.native
  
  def node: Any = js.native
  def node_=(arg: Any): Unit = js.native
  
  def orthoHeight: Double = js.native
  def orthoHeight_=(arg: Double): Unit = js.native
  
  def projection: Double = js.native
  
  def projectionMatrix: Mat4 = js.native
  
  def projection_=(arg: Double): Unit = js.native
  
  def rect: Vec4 = js.native
  def rect_=(arg: Vec4): Unit = js.native
  
  def renderTarget: Any = js.native
  def renderTarget_=(arg: Any): Unit = js.native
  
  def scissorRect: Vec4 = js.native
  def scissorRect_=(arg: Vec4): Unit = js.native
  
  /**
    * Convert a point from 2D canvas pixel space to 3D world space.
    *
    * @param {number} x - X coordinate on PlayCanvas' canvas element.
    * @param {number} y - Y coordinate on PlayCanvas' canvas element.
    * @param {number} z - The distance from the camera in world space to create the new point.
    * @param {number} cw - The width of PlayCanvas' canvas element.
    * @param {number} ch - The height of PlayCanvas' canvas element.
    * @param {Vec3} [worldCoord] - 3D vector to receive world coordinate result.
    * @returns {Vec3} The world space coordinate.
    */
  def screenToWorld(x: Double, y: Double, z: Double, cw: Double, ch: Double): Vec3 = js.native
  def screenToWorld(x: Double, y: Double, z: Double, cw: Double, ch: Double, worldCoord: Vec3): Vec3 = js.native
  
  def sensitivity: Double = js.native
  def sensitivity_=(arg: Double): Unit = js.native
  
  def shutter: Double = js.native
  def shutter_=(arg: Double): Unit = js.native
  
  def viewMatrix: Mat4 = js.native
  
  /**
    * Convert a point from 3D world space to 2D canvas pixel space.
    *
    * @param {Vec3} worldCoord - The world space coordinate to transform.
    * @param {number} cw - The width of PlayCanvas' canvas element.
    * @param {number} ch - The height of PlayCanvas' canvas element.
    * @param {Vec3} [screenCoord] - 3D vector to receive screen coordinate result.
    * @returns {Vec3} The screen space coordinate.
    */
  def worldToScreen(worldCoord: Vec3, cw: Double, ch: Double): Vec3 = js.native
  def worldToScreen(worldCoord: Vec3, cw: Double, ch: Double, screenCoord: Vec3): Vec3 = js.native
}
