package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link CameraComponent#calculateTransform} and {@link CameraComponent#calculateProjection}.
  *
  * @callback CalculateMatrixCallback
  * @param {Mat4} transformMatrix - Output of the function.
  * @param {number} view - Type of view. Can be {@link VIEW_CENTER}, {@link VIEW_LEFT} or {@link VIEW_RIGHT}. Left and right are only used in stereo rendering.
  */
/**
  * The Camera Component enables an Entity to render the scene. A scene requires at least one
  * enabled camera component to be rendered. Note that multiple camera components can be enabled
  * simultaneously (for split-screen or offscreen rendering, for example).
  *
  * ```javascript
  * // Add a pc.CameraComponent to an entity
  * var entity = new pc.Entity();
  * entity.addComponent('camera', {
  *     nearClip: 1,
  *     farClip: 100,
  *     fov: 55
  * });
  *
  * // Get the pc.CameraComponent on an entity
  * var cameraComponent = entity.camera;
  *
  * // Update a property on a camera component
  * entity.camera.nearClip = 2;
  * ```
  *
  * @property {number} projection The type of projection used to render the camera. Can be:
  *
  * - {@link PROJECTION_PERSPECTIVE}: A perspective projection. The camera frustum
  * resembles a truncated pyramid.
  * - {@link PROJECTION_ORTHOGRAPHIC}: An orthographic projection. The camera
  * frustum is a cuboid.
  *
  * Defaults to {@link PROJECTION_PERSPECTIVE}.
  * @property {number} aspectRatio The aspect ratio (width divided by height) of the camera. If
  * aspectRatioMode is {@link ASPECT_AUTO}, then this value will be automatically calculated every
  * frame, and you can only read it. If it's ASPECT_MANUAL, you can set the value.
  * @property {number} aspectRatioMode The aspect ratio mode of the camera. Can be:
  *
  * - {@link ASPECT_AUTO}: aspect ratio will be calculated from the current render
  * target's width divided by height.
  * - {@link ASPECT_MANUAL}: use the aspectRatio value.
  *
  * Defaults to {@link ASPECT_AUTO}.
  * @property {Color} clearColor The color used to clear the canvas to before the camera starts to
  * render. Defaults to [0.75, 0.75, 0.75, 1].
  * @property {number} farClip The distance from the camera after which no rendering will take
  * place. Defaults to 1000.
  * @property {number} fov The field of view of the camera in degrees. Usually this is the Y-axis
  * field of view, see {@link CameraComponent#horizontalFov}. Used for
  * {@link PROJECTION_PERSPECTIVE} cameras only. Defaults to 45.
  * @property {boolean} horizontalFov Set which axis to use for the Field of View calculation.
  * Defaults to false.
  * @property {number} nearClip The distance from the camera before which no rendering will take
  * place. Defaults to 0.1.
  * @property {number} orthoHeight The half-height of the orthographic view window (in the Y-axis).
  * Used for {@link PROJECTION_ORTHOGRAPHIC} cameras only. Defaults to 10.
  * @property {Vec4} scissorRect Clips all pixels which are not in the rectangle. The order of the
  * values is [x, y, width, height]. Defaults to [0, 0, 1, 1].
  * @property {boolean} frustumCulling Controls the culling of mesh instances against the camera
  * frustum, i.e. if objects outside of camera should be omitted from rendering. If false, all mesh
  * instances in the scene are rendered by the camera, regardless of visibility. Defaults to false.
  * @property {CalculateMatrixCallback} calculateTransform Custom function you can provide to
  * calculate the camera transformation matrix manually. Can be used for complex effects like
  * reflections. Function is called using component's scope. Arguments:
  *
  * - {@link Mat4} transformMatrix: output of the function.
  * - view: Type of view. Can be {@link VIEW_CENTER}, {@link VIEW_LEFT} or {@link VIEW_RIGHT}.
  *
  * Left and right are only used in stereo rendering.
  * @property {CalculateMatrixCallback} calculateProjection Custom function you can provide to
  * calculate the camera projection matrix manually. Can be used for complex effects like doing
  * oblique projection. Function is called using component's scope. Arguments:
  *
  * - {@link Mat4} transformMatrix: output of the function
  * - view: Type of view. Can be {@link VIEW_CENTER}, {@link VIEW_LEFT} or {@link VIEW_RIGHT}.
  *
  * Left and right are only used in stereo rendering.
  * @property {boolean} cullFaces If true the camera will take material.cull into account. Otherwise
  * both front and back faces will be rendered. Defaults to true.
  * @property {boolean} flipFaces If true the camera will invert front and back faces. Can be useful
  * for reflection rendering. Defaults to false.
  * @augments Component
  */
@JSGlobal("pc.CameraComponent")
@js.native
open class CameraComponent protected ()
  extends typings.playcanvas.mod.CameraComponent {
  /**
    * Create a new CameraComponent instance.
    *
    * @param {CameraComponentSystem} system - The ComponentSystem that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: typings.playcanvas.mod.CameraComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
