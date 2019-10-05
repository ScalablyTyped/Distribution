package typings.playcanvas.pc

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
@JSGlobal("pc.MeshInstance")
@js.native
class MeshInstance protected () extends js.Object {
  def this(node: GraphNode, mesh: Mesh, material: Material) = this()
  /**
    * The world space axis-aligned bounding box for this
    * mesh instance.
    */
  var aabb: BoundingBox = js.native
  /**
    * Controls whether the mesh instance casts shadows.
    * Defaults to false.
    */
  var castShadow: Boolean = js.native
  /**
    * Controls whether the mesh instance can be culled by with frustum culling ({@link pc.CameraComponent#frustumCulling}).
    */
  var cull: Boolean = js.native
  /**
    * Use this value to affect rendering order of mesh instances.
    * Only used when mesh instances are added to a {@link pc.Layer} with {@link pc.Layer#opaqueSortMode} or {@link pc.Layer#transparentSortMode} (depending on the material) set to {@link pc.SORTMODE_MANUAL}.
    */
  var drawOrder: Double = js.native
  /**
    * @name pc.MeshInstance#mask
    * @type Number
    * @description Mask controlling which {@link pc.LightComponent}s light this mesh instance, which {@link pc.CameraComponent} sees it and in which {@link pc.Layer} it is rendered.
    * Defaults to 1.
    */
  var mask: Double = js.native
  /**
    * The material used by this mesh instance.
    */
  var material: Material = js.native
  /**
    * The graphics mesh being instanced.
    */
  var mesh: Mesh = js.native
  /**
    * The graph node defining the transform for this instance.
    */
  var node: GraphNode = js.native
  /**
    * The render style of the mesh instance. Can be:
    * <ul>
    * <li>pc.RENDERSTYLE_SOLID</li>
    * <li>pc.RENDERSTYLE_WIREFRAME</li>
    * <li>pc.RENDERSTYLE_POINTS</li>
    * </ul>
    * Defaults to pc.RENDERSTYLE_SOLID.
    */
  var renderStyle: Double = js.native
  /**
    * Enable rendering for this mesh instance. Use visible property to enable/disable rendering without overhead of removing from scene.
    * But note that the mesh instance is still in the hierarchy and still in the draw call list.
    */
  var visible: Boolean = js.native
  /**
    * Read this value in {@link pc.Layer#onPostCull} to determine if the object is actually going to be rendered.
    */
  var visibleThisFrame: Boolean = js.native
}

