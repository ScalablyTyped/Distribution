package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new mesh instance.
  * @example
  * // Create a mesh instance pointing to a 1x1x1 'cube' mesh
  * var mesh = pc.createBox(graphicsDevice);
  * var material = new pc.StandardMaterial();
  * var node = new pc.GraphNode();
  * var meshInstance = new pc.MeshInstance(node, mesh, material);
  * @example
  * // A script you can attach on an entity to test if it is visible on a Layer
  * var MeshVisScript = pc.createScript('meshVisScript');
  * MeshVisScript.prototype.initialize = function () {
  *     var _this = this;
  *     this.app.scene.layers.getLayerByName("World").onPostCull = function (cameraIndex) {
  *         var meshInstance = _this.entity.model.model.meshInstances[0];
  *         console.log("visible: " + meshInstance.visibleThisFrame);
  *     };
  * };
  * @property aabb - The world space axis-aligned bounding box for this
  * mesh instance.
  * @property castShadow - Controls whether the mesh instance casts shadows.
  * Defaults to false.
  * @property visible - Enable rendering for this mesh instance. Use visible property to enable/disable rendering without overhead of removing from scene.
  * But note that the mesh instance is still in the hierarchy and still in the draw call list.
  * @property node - The graph node defining the transform for this instance.
  * @property mesh - The graphics mesh being instanced.
  * @property material - The material used by this mesh instance.
  * @property renderStyle - The render style of the mesh instance. Can be:
  *
  * * {@link pc.RENDERSTYLE_SOLID}
  * * {@link pc.RENDERSTYLE_WIREFRAME}
  * * {@link pc.RENDERSTYLE_POINTS}
  *
  * Defaults to pc.RENDERSTYLE_SOLID.
  * @property cull - Controls whether the mesh instance can be culled by with frustum culling ({@link pc.CameraComponent#frustumCulling}).
  * @property drawOrder - Use this value to affect rendering order of mesh instances.
  * Only used when mesh instances are added to a {@link pc.Layer} with {@link pc.Layer#opaqueSortMode} or {@link pc.Layer#transparentSortMode} (depending on the material) set to {@link pc.SORTMODE_MANUAL}.
  * @property calculateSortDistance - In some circumstances mesh instances are sorted by a distance calculation to determine their rendering order.
  * Set this callback to override the default distance calculation, which gives the dot product of the camera forward vector and the vector between the camera position and
  * the center of the mesh instance's axis-aligned bounding box. This option can be particularly useful for rendering transparent meshes in a better order than default.
  * @property visibleThisFrame - Read this value in {@link pc.Layer#onPostCull} to determine if the object is actually going to be rendered.
  * @param node - The graph node defining the transform for this instance.
  * @param mesh - The graphics mesh being instanced.
  * @param material - The material used to render this instance.
  */
@JSGlobal("pc.MeshInstance")
@js.native
class MeshInstance protected ()
  extends typings.playcanvas.pc.MeshInstance {
  def this(
    node: typings.playcanvas.pc.GraphNode,
    mesh: typings.playcanvas.pc.Mesh,
    material: typings.playcanvas.pc.Material
  ) = this()
}

