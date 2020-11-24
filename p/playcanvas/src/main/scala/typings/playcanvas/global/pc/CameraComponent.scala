package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  * @property projection - The type of projection used to render the camera.
  Can be:
  
  * {@link pc.PROJECTION_PERSPECTIVE}: A perspective projection. The camera frustum
  resembles a truncated pyramid.
  * {@link pc.PROJECTION_ORTHOGRAPHIC}: An orthographic projection. The camera
  frustum is a cuboid.
  
  Defaults to pc.PROJECTION_PERSPECTIVE.
  * @property aspectRatio - The aspect ratio (width divided by height) of the
  camera. If aspectRatioMode is pc.ASPECT_AUTO, then this value will be automatically
  calculated every frame, and you can only read it. If it's ASPECT_MANUAL, you can set
  the value.
  * @property aspectRatioMode - The aspect ratio mode of the camera. Can be:
  
  * {@link pc.ASPECT_AUTO}: aspect ratio will be calculated from the current render
  target's width divided by height.
  * {@link pc.ASPECT_MANUAL}: use the aspectRatio value.
  
  Defaults to pc.ASPECT_AUTO.
  * @property clearColor - The color used to clear the canvas to before the
  camera starts to render. Defaults to [0.75, 0.75, 0.75, 1].
  * @property clearColorBuffer - If true the camera will clear the color buffer
  to the color set in clearColor. Defaults to true.
  * @property clearDepthBuffer - If true the camera will clear the depth buffer.
  Defaults to true.
  * @property clearStencilBuffer - If true the camera will clear the stencil
  buffer. Defaults to true.
  * @property farClip - The distance from the camera after which no rendering
  will take place. Defaults to 1000.
  * @property fov - The field of view of the camera in degrees. Usually this is
  the Y-axis field of view, see {@link pc.CameraComponent#horizontalFov}. Used for
  {@link pc.PROJECTION_PERSPECTIVE} cameras only. Defaults to 45.
  * @property horizontalFov - Set which axis to use for the Field of View
  calculation. Defaults to false.
  * @property nearClip - The distance from the camera before which no rendering
  will take place. Defaults to 0.1.
  * @property orthoHeight - The half-height of the orthographic view window (in
  the Y-axis). Used for {@link pc.PROJECTION_ORTHOGRAPHIC} cameras only. Defaults to 10.
  * @property priority - Controls the order in which cameras are rendered. Cameras
  with smaller values for priority are rendered first. Defaults to 0.
  * @property rect - Controls where on the screen the camera will be rendered in
  normalized screen coordinates. Defaults to [0, 0, 1, 1].
  * @property scissorRect - Clips all pixels which are not in the rectangle.
  The order of the values is [x, y, width, height]. Defaults to [0, 0, 1, 1].
  * @property postEffects - The post effects queue for this camera.
  Use this to add or remove post effects from the camera.
  * @property frustumCulling - Controls the culling of mesh instances against
  the camera frustum, i.e. if objects outside of camera should be omitted from rendering.
  If false, all mesh instances in the scene are rendered by the camera, regardless of
  visibility. Defaults to false.
  * @property calculateTransform - Custom function you can
  provide to calculate the camera transformation matrix manually. Can be used for complex
  effects like reflections. Function is called using component's scope.
  Arguments:
  * {pc.Mat4} transformMatrix: output of the function.
  * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT.
  Left and right are only used in stereo rendering.
  * @property calculateProjection - Custom function you can
  provide to calculate the camera projection matrix manually. Can be used for complex
  effects like doing oblique projection. Function is called using component's scope.
  Arguments:
  * {pc.Mat4} transformMatrix: output of the function
  * {number} view: Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT.
  Left and right are only used in stereo rendering.
  * @property cullFaces - If true the camera will take material.cull into account.
  Otherwise both front and back faces will be rendered. Defaults to true.
  * @property flipFaces - If true the camera will invert front and back faces.
  Can be useful for reflection rendering. Defaults to false.
  * @property layers - An array of layer IDs ({@link pc.Layer#id}) to which this
  camera should belong. Don't push/pop/splice or modify this array, if you want to
  change it, set a new one instead. Defaults to [LAYERID_WORLD, LAYERID_DEPTH,
  LAYERID_SKYBOX, LAYERID_UI, LAYERID_IMMEDIATE].
  * @param system - The ComponentSystem that created this
  Component.
  * @param entity - The Entity that this Component is attached to.
  */
@JSGlobal("pc.CameraComponent")
@js.native
class CameraComponent protected ()
  extends typings.playcanvas.pc.CameraComponent {
  def this(system: typings.playcanvas.pc.CameraComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}
