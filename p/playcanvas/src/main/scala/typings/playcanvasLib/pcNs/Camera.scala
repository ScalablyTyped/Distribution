package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @name pc.Camera
  * @class A camera.
  */
@JSGlobal("pc.Camera")
@js.native
class Camera () extends js.Object {
  /**
    * @private
    * @type Number
    * @name pc.Camera#aspectRatio
    * @description Camera's aspect ratio.
    */
  var aspectRatio: scala.Double = js.native
  /**
    * @private
    * @type Array
    * @name pc.Camera#clearColor
    * @description Camera's clear color.
    */
  var clearColor: js.Array[_] = js.native
  /**
    * @private
    * @type Number
    * @name pc.Camera#clearDepth
    * @description Camera's clear depth value.
    */
  var clearDepth: scala.Double = js.native
  /**
    * @private
    * @type Number
    * @name pc.Camera#clearFlags
    * @description Camera's clear flags bits value.
    */
  var clearFlags: scala.Double = js.native
  /**
    * @private
    * @type Number
    * @name pc.Camera#clearStencil
    * @description Camera's clear stencil value.
    */
  var clearStencil: scala.Double = js.native
  /**
    * @private
    * @type Number
    * @name pc.Camera#farClip
    * @description Camera's distance to far clipping plane
    */
  var farClip: scala.Double = js.native
  /**
    * @private
    * @type Number
    * @name pc.Camera#fov
    * @description Camera's field of view in degrees. This angle is in degrees
    * and is measured vertically or horizontally between the sides of camera planes.
    * hirozontalFov property defines the fov axis - vertical or horizontal.
    */
  var fov: scala.Double = js.native
  /**
    * @private
    * @type Boolean
    * @name pc.Camera#horizontalFov
    * @description Camera's horizontal or vertical field of view.
    */
  var horizontalFov: scala.Boolean = js.native
  /**
    * @private
    * @type Number
    * @name pc.Camera#nearClip
    * @description Camera's distance to near clipping plane
    */
  var nearClip: scala.Double = js.native
  /**
    * @private
    * @type Number
    * @name pc.Camera#orthoHeight
    * @description Camera's half height of the orthographics view.
    */
  var orthoHeight: scala.Double = js.native
  /**
    * @private
    * @type Number
    * @name pc.Camera#projection
    * @description Camera's projection type, to specify whether projection is orthographic (parallel projection) or perspective. Can be:
    * <ul>
    *     <li>{@link pc.PROJECTION_PERSPECTIVE}</li>
    *     <li>{@link pc.PROJECTION_ORTHOGRAPHIC}</li>
    * </ul>
    */
  var projection: scala.Double = js.native
  /**
    * @private
    * @function
    * @name pc.Camera#getClearOptions
    * @description Retrieves the options used to determine how the camera's render target will be cleared.
    * @return {Object} The options determining the behaviour of render target clears.
    */
  /* private */ def getClearOptions(): js.Object = js.native
  /**
    * @private
    * @function
    * @name pc.Camera#getProjectionMatrix
    * @description Retrieves the projection matrix for the specified camera.
    * @returns {pc.Mat4} The camera's projection matrix.
    */
  /* private */ def getProjectionMatrix(): Mat4 = js.native
  /**
    * @private
    * @function
    * @name pc.Camera#screenToWorld
    * @description Convert a point from 2D canvas pixel space to 3D world space.
    * @param {Number} x x coordinate on PlayCanvas' canvas element.
    * @param {Number} y y coordinate on PlayCanvas' canvas element.
    * @param {Number} z The distance from the camera in world space to create the new point.
    * @param {Number} cw The width of PlayCanvas' canvas element.
    * @param {Number} ch The height of PlayCanvas' canvas element.
    * @param {pc.Vec3} [worldCoord] 3D vector to receive world coordinate result.
    * @returns {pc.Vec3} The world space coordinate.
    */
  /* private */ def screenToWorld(x: scala.Double, y: scala.Double, z: scala.Double, cw: scala.Double, ch: scala.Double): Vec3 = js.native
  /* private */ def screenToWorld(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    cw: scala.Double,
    ch: scala.Double,
    worldCoord: Vec3
  ): Vec3 = js.native
  /**
    * @private
    * @function
    * @name pc.Camera#setClearOptions
    * @description Sets the options used to determine how the camera's render target will be cleared.
    * @param {Object} clearOptions The options determining the behaviour of subsequent render target clears.
    * @param {Number[]} clearOptions.color The options determining the behaviour of subsequent render target clears.
    * @param {Number} clearOptions.depth The options determining the behaviour of subsequent render target clears.
    * @param {pc.CLEARFLAG} clearOptions.flags The options determining the behaviour of subsequent render target clears.
    */
  def setClearOptions(options: playcanvasLib.Anon_ColorDepthFlags): scala.Unit = js.native
  /**
    * @private
    * @function
    * @name pc.Camera#worldToScreen
    * @description Convert a point from 3D world space to 2D canvas pixel space.
    * @param {pc.Vec3} worldCoord The world space coordinate to transform.
    * @param {Number} cw The width of PlayCanvas' canvas element.
    * @param {Number} ch The height of PlayCanvas' canvas element.
    * @param {pc.Vec3} [screenCoord] 3D vector to receive screen coordinate result.
    * @returns {pc.Vec3} The screen space coordinate.
    */
  /* private */ def worldToScreen(worldCoord: Vec3, cw: scala.Double, ch: scala.Double): Vec3 = js.native
  /* private */ def worldToScreen(worldCoord: Vec3, cw: scala.Double, ch: scala.Double, screenCoord: Vec3): Vec3 = js.native
}

