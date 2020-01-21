package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.MeshInstance
  * @classdesc An instance of a {@link pc.Mesh}. A single mesh can be referenced by many
  * mesh instances that can have different transforms and materials.
  * @description Create a new mesh instance.
  * @param {pc.GraphNode} node The graph node defining the transform for this instance.
  * @param {pc.Mesh} mesh The graphics mesh being instanced.
  * @param {pc.Material} material The material used to render this instance.
  * @example
  * // Create a mesh instance pointing to a 1x1x1 'cube' mesh
  * var mesh = pc.createBox(graphicsDevice);
  * var material = new pc.StandardMaterial();
  * var node = new pc.GraphNode();
  * var meshInstance = new pc.MeshInstance(node, mesh, material);
  * @property {pc.BoundingBox} aabb The world space axis-aligned bounding box for this
  * mesh instance.
  * @property {Boolean} castShadow Controls whether the mesh instance casts shadows.
  * Defaults to false.
  * @property {Boolean} visible Enable rendering for this mesh instance. Use visible property to enable/disable rendering without overhead of removing from scene.
  * But note that the mesh instance is still in the hierarchy and still in the draw call list.
  * @property {pc.GraphNode} node The graph node defining the transform for this instance.
  * @property {pc.Mesh} mesh The graphics mesh being instanced.
  * @property {pc.Material} material The material used by this mesh instance.
  * @property {Number} renderStyle The render style of the mesh instance. Can be:
  * <ul>
  *     <li>pc.RENDERSTYLE_SOLID</li>
  *     <li>pc.RENDERSTYLE_WIREFRAME</li>
  *     <li>pc.RENDERSTYLE_POINTS</li>
  * </ul>
  * Defaults to pc.RENDERSTYLE_SOLID.
  * @property {Boolean} cull Controls whether the mesh instance can be culled by with frustum culling ({@link pc.CameraComponent#frustumCulling}).
  * @property {Number} drawOrder Use this value to affect rendering order of mesh instances.
  * Only used when mesh instances are added to a {@link pc.Layer} with {@link pc.Layer#opaqueSortMode} or {@link pc.Layer#transparentSortMode} (depending on the material) set to {@link pc.SORTMODE_MANUAL}.
  * @property {Boolean} visibleThisFrame Read this value in {@link pc.Layer#onPostCull} to determine if the object is actually going to be rendered.
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

