package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new Camera Component.
  * @example
  * // Add a pc.CameraComponent to an entity
  var entity = new pc.Entity();
  entity.addComponent('camera', {
  nearClip: 1,
  farClip: 100,
  fov: 55
  });
  * @example
  * // Get the pc.CameraComponent on an entity
  var cameraComponent = entity.camera;
  * @example
  * // Update a property on a camera component
  entity.camera.nearClip = 2;
  * @property projection - The type of projection used to render the camera. Can be:
  
  * {@link pc.PROJECTION_PERSPECTIVE}: A perspective projection. The camera frustum resembles a truncated pyramid.
  * {@link pc.PROJECTION_ORTHOGRAPHIC}: An orthographic projection. The camera frustum is a cuboid.
  
  Defaults to pc.PROJECTION_PERSPECTIVE.
  * @property nearClip - The distance from the camera before which no rendering will take place.
  * @property farClip - The distance from the camera after which no rendering will take place.
  * @property aspectRatioMode - The aspect ratio mode of the camera. Can be pc.ASPECT_AUTO (default) or pc.ASPECT_MANUAL. ASPECT_AUTO will always be current render target's width divided by height. ASPECT_MANUAL will use the aspectRatio value instead.
  * @property aspectRatio - The aspect ratio (width divided by height) of the camera. If aspectRatioMode is ASPECT_AUTO, then this value will be automatically calculated every frame, and you can only read it. If it's ASPECT_MANUAL, you can set the value.
  * @property horizontalFov - Set which axis to use for the Field of View calculation. Defaults to false (use Y-axis).
  * @property fov - The field of view of the camera in degrees. Usually this is the Y-axis field of
  view, see {@link pc.CameraComponent#horizontalFov}. Used for {@link pc.PROJECTION_PERSPECTIVE} cameras only. Defaults to 45.
  * @property orthoHeight - The half-height of the orthographic view window (in the Y-axis). Used for
  {@link pc.PROJECTION_ORTHOGRAPHIC} cameras only. Defaults to 10.
  * @property priority - Controls the order in which cameras are rendered. Cameras with smaller values for priority are rendered first.
  * @property clearColor - The color used to clear the canvas to before the camera starts to render.
  * @property clearColorBuffer - If true the camera will clear the color buffer to the color set in clearColor.
  * @property clearDepthBuffer - If true the camera will clear the depth buffer.
  * @property clearStencilBuffer - If true the camera will clear the stencil buffer.
  * @property rect - Controls where on the screen the camera will be rendered in normalized screen coordinates.
  * @property scissorRect - Clips all pixels which are not in the rectangle.
  The order of the values is [x, y, width, height].
  * @property postEffects - The post effects queue for this camera. Use this to add or remove post effects from the camera.
  * @property frustumCulling - Controls the culling of mesh instances against the camera frustum, i.e. if objects outside of camera should be omitted from rendering.
  If true, culling is enabled.
  If false, all mesh instances in the scene are rendered by the camera, regardless of visibility. Defaults to false.
  * @property calculateTransform - Custom function you can provide to calculate the camera transformation matrix manually. Can be used for complex effects like reflections. Function is called using component's scope.
  Arguments:
  
  * {pc.Mat4} transformMatrix: output of the function.
  * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.
  * @property calculateProjection - Custom function you can provide to calculate the camera projection matrix manually. Can be used for complex effects like doing oblique projection. Function is called using component's scope.
  Arguments:
  
  * {pc.Mat4} transformMatrix: output of the function
  * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.
  * @property cullFaces - If true the camera will take material.cull into account. Otherwise both front and back faces will be rendered.
  * @property flipFaces - If true the camera will invert front and back faces. Can be useful for reflection rendering.
  * @property layers - An array of layer IDs ({@link pc.Layer#id}) to which this camera should belong.
  Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@JSGlobal("pc.CameraComponent")
@js.native
class CameraComponent protected ()
  extends typings.playcanvas.pc.CameraComponent {
  def this(system: typings.playcanvas.pc.CameraComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

