package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link CameraComponent#calculateTransform} and {@link CameraComponent#calculateProjection}.
  *
  * @callback CalculateMatrixCallback
  * @param {import('../../../core/math/mat4.js').Mat4} transformMatrix - Output of the function.
  * @param {number} view - Type of view. Can be {@link VIEW_CENTER}, {@link VIEW_LEFT} or {@link VIEW_RIGHT}. Left and right are only used in stereo rendering.
  */
/**
  * The Camera Component enables an Entity to render the scene. A scene requires at least one
  * enabled camera component to be rendered. Note that multiple camera components can be enabled
  * simultaneously (for split-screen or offscreen rendering, for example).
  *
  * ```javascript
  * // Add a pc.CameraComponent to an entity
  * const entity = new pc.Entity();
  * entity.addComponent('camera', {
  *     nearClip: 1,
  *     farClip: 100,
  *     fov: 55
  * });
  *
  * // Get the pc.CameraComponent on an entity
  * const cameraComponent = entity.camera;
  *
  * // Update a property on a camera component
  * entity.camera.nearClip = 2;
  * ```
  *
  * @augments Component
  */
@JSGlobal("pc.CameraComponent")
@js.native
open class CameraComponent protected ()
  extends typings.playcanvas.mod.CameraComponent {
  /**
    * Create a new CameraComponent instance.
    *
    * @param {import('./system.js').CameraComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this Component is
    * attached to.
    */
  def this(system: typings.playcanvas.mod.CameraComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
