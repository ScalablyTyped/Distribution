package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.MeshInstance
  * @classdesc An instance of a {@link pc.Mesh}. A single mesh can be referenced by many
  * mesh instances that can have different transforms and materials.
  * @description Create a new mesh instance.
  * @param {pc.GraphNode} node - The graph node defining the transform for this instance.
  * @param {pc.Mesh} mesh - The graphics mesh being instanced.
  * @param {pc.Material} material - The material used to render this instance.
  * @property {pc.BoundingBox} aabb The world space axis-aligned bounding box for this
  * mesh instance.
  * @property {boolean} castShadow Controls whether the mesh instance casts shadows.
  * Defaults to false.
  * @property {boolean} visible Enable rendering for this mesh instance. Use visible property to enable/disable rendering without overhead of removing from scene.
  * But note that the mesh instance is still in the hierarchy and still in the draw call list.
  * @property {pc.GraphNode} node The graph node defining the transform for this instance.
  * @property {pc.Mesh} mesh The graphics mesh being instanced.
  * @property {pc.Material} material The material used by this mesh instance.
  * @property {number} renderStyle The render style of the mesh instance. Can be:
  *
  * * {@link pc.RENDERSTYLE_SOLID}
  * * {@link pc.RENDERSTYLE_WIREFRAME}
  * * {@link pc.RENDERSTYLE_POINTS}
  *
  * Defaults to pc.RENDERSTYLE_SOLID.
  * @property {boolean} cull Controls whether the mesh instance can be culled by with frustum culling ({@link pc.CameraComponent#frustumCulling}).
  * @property {number} drawOrder Use this value to affect rendering order of mesh instances.
  * Only used when mesh instances are added to a {@link pc.Layer} with {@link pc.Layer#opaqueSortMode} or {@link pc.Layer#transparentSortMode} (depending on the material) set to {@link pc.SORTMODE_MANUAL}.
  * @property {pc.callbacks.CalculateSortDistance} calculateSortDistance In some circumstances mesh instances are sorted by a distance calculation to determine their rendering order.
  * Set this callback to override the default distance calculation, which gives the dot product of the camera forward vector and the vector between the camera position and
  * the center of the mesh instance's axis-aligned bounding box. This option can be particularly useful for rendering transparent meshes in a better order than default.
  * @property {boolean} visibleThisFrame Read this value in {@link pc.Layer#onPostCull} to determine if the object is actually going to be rendered.
  * @example
  * // Create a mesh instance pointing to a 1x1x1 'cube' mesh
  * var mesh = pc.createBox(graphicsDevice);
  * var material = new pc.StandardMaterial();
  * var node = new pc.GraphNode();
  * var meshInstance = new pc.MeshInstance(node, mesh, material);
  */
@JSImport("playcanvas", "MeshInstance")
@js.native
class MeshInstance protected ()
  extends typings.playcanvas.pc.MeshInstance {
  def this(
    node: typings.playcanvas.pc.GraphNode,
    mesh: typings.playcanvas.pc.Mesh,
    material: typings.playcanvas.pc.Material
  ) = this()
}

