package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.CameraComponent
  * @extends pc.Component
  * @classdesc The Camera Component enables an Entity to render the scene. A scene requires at least one
  * enabled camera component to be rendered. Note that multiple camera components can be enabled
  * simultaneously (for split-screen or offscreen rendering, for example).
  * @description Create a new Camera Component.
  * @param {pc.CameraComponentSystem} system The ComponentSystem that created this Component.
  * @param {pc.Entity} entity The Entity that this Component is attached to.
  * @example
  * // Add a pc.CameraComponent to an entity
  * var entity = new pc.Entity();
  * entity.addComponent('camera', {
  *     nearClip: 1,
  *     farClip: 100,
  *     fov: 55
  * });
  * @example
  * // Get the pc.CameraComponent on an entity
  * var cameraComponent = entity.camera;
  * @example
  * // Update a property on a camera component
  * entity.camera.nearClip = 2;
  * @property {Number} projection The type of projection used to render the camera. Can be:
  * <ul>
  *     <li>{@link pc.PROJECTION_PERSPECTIVE}: A perspective projection. The camera frustum resembles a truncated pyramid.</li>
  *     <li>{@link pc.PROJECTION_ORTHOGRAPHIC}: An orthographic projection. The camera frustum is a cuboid.</li>
  * </ul>
  * Defaults to pc.PROJECTION_PERSPECTIVE.
  * @property {Number} nearClip The distance from the camera before which no rendering will take place.
  * @property {Number} farClip The distance from the camera after which no rendering will take place.
  * @property {Number} aspectRatioMode The aspect ratio mode of the camera. Can be pc.ASPECT_AUTO (default) or pc.ASPECT_MANUAL. ASPECT_AUTO will always be current render target's width divided by height. ASPECT_MANUAL will use the aspectRatio value instead.
  * @property {Number} aspectRatio The aspect ratio (width divided by height) of the camera. If aspectRatioMode is ASPECT_AUTO, then this value will be automatically calculated every frame, and you can only read it. If it's ASPECT_MANUAL, you can set the value.
  * @property {Boolean} horizontalFov Set which axis to use for the Field of View calculation. Defaults to false (use Y-axis).
  * @property {Number} fov The field of view of the camera in degrees. Usually this is the Y-axis field of
  * view, see {@link pc.CameraComponent#horizontalFov}. Used for {@link pc.PROJECTION_PERSPECTIVE} cameras only. Defaults to 45.
  * @property {Number} orthoHeight The half-height of the orthographic view window (in the Y-axis). Used for
  * {@link pc.PROJECTION_ORTHOGRAPHIC} cameras only. Defaults to 10.
  * @property {Number} priority Controls the order in which cameras are rendered. Cameras with smaller values for priority are rendered first.
  * @property {pc.Color} clearColor The color used to clear the canvas to before the camera starts to render.
  * @property {Boolean} clearColorBuffer If true the camera will clear the color buffer to the color set in clearColor.
  * @property {Boolean} clearDepthBuffer If true the camera will clear the depth buffer.
  * @property {Boolean} clearStencilBuffer If true the camera will clear the stencil buffer.
  * @property {pc.Vec4} rect Controls where on the screen the camera will be rendered in normalized screen coordinates.
  * @property {pc.Vec4} scissorRect Clips all pixels which are not in the rectangle.
  * The order of the values is [x, y, width, height].
  * @property {pc.PostEffectQueue} postEffects The post effects queue for this camera. Use this to add or remove post effects from the camera.
  * @property {Boolean} frustumCulling Controls the culling of mesh instances against the camera frustum, i.e. if objects outside of camera should be omitted from rendering.
  * If true, culling is enabled.
  * If false, all mesh instances in the scene are rendered by the camera, regardless of visibility. Defaults to false.
  * @property {pc.callbacks.CalculateMatrix} calculateTransform Custom function you can provide to calculate the camera transformation matrix manually. Can be used for complex effects like reflections. Function is called using component's scope.
  * Arguments:
  *     <li>{pc.Mat4} transformMatrix: output of the function</li>
  *     <li>{Number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.</li>
  * @property {pc.callbacks.CalculateMatrix} calculateProjection Custom function you can provide to calculate the camera projection matrix manually. Can be used for complex effects like doing oblique projection. Function is called using component's scope.
  * Arguments:
  *     <li>{pc.Mat4} transformMatrix: output of the function</li>
  *     <li>{Number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.</li>
  * @property {Boolean} cullFaces If true the camera will take material.cull into account. Otherwise both front and back faces will be rendered.
  * @property {Boolean} flipFaces If true the camera will invert front and back faces. Can be useful for reflection rendering.
  * @property {Number[]} layers An array of layer IDs ({@link pc.Layer#id}) to which this camera should belong.
  * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
  */
@JSImport("playcanvas", "CameraComponent")
@js.native
class CameraComponent protected ()
  extends typings.playcanvas.pc.CameraComponent {
  def this(system: typings.playcanvas.pc.CameraComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

