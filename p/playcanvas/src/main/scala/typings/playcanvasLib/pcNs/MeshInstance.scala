package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.MeshInstance
  * @class An instance of a {@link pc.Mesh}. A single mesh can be referenced by many
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
  * @property {Number} layer The layer used by this mesh instance. Layers define drawing order. Can be:
  * <ul>
  *     <li>pc.LAYER_WORLD or 15</li>
  *     <li>pc.LAYER_FX or 2</li>
  *     <li>pc.LAYER_GIZMO or 1</li>
  *     <li>pc.LAYER_HUD or 0</li>
  *     <li>Any number between 3 and 14 can be used as a custom layer.</li>
  * </ul>
  * Defaults to pc.LAYER_WORLD.
  * @property {pc.Material} material The material used by this mesh instance.
  * @property {Number} renderStyle The render style of the mesh instance. Can be:
  * <ul>
  *     <li>pc.RENDERSTYLE_SOLID</li>
  *     <li>pc.RENDERSTYLE_WIREFRAME</li>
  *     <li>pc.RENDERSTYLE_POINTS</li>
  * </ul>
  * Defaults to pc.RENDERSTYLE_SOLID.
  * @property {Boolean} cull Controls whether the mesh instance can be culled with frustum culling
  */
@JSGlobal("pc.MeshInstance")
@js.native
class MeshInstance protected () extends js.Object {
  def this(node: GraphNode, mesh: Mesh, material: Material) = this()
  var aabb: BoundingBox = js.native
  var castShadow: scala.Boolean = js.native
  var cull: scala.Boolean = js.native
  var key: scala.Double = js.native
  var layer: scala.Double = js.native
  /**
    * @name pc.MeshInstance#mask
    * @type Number
    * @description Mask controlling which {@link pc.LightComponent}s light this mesh instance.
    * To ignore all dynamic lights, set mask to 0. Defaults to 1.
    */
  var mask: scala.Double = js.native
  var material: Material = js.native
  var mesh: Mesh = js.native
  var node: GraphNode = js.native
  var receiveShadow: scala.Boolean = js.native
  var renderStyle: scala.Double = js.native
  var screenSpace: scala.Boolean = js.native
  var skinInstance: SkinInstance = js.native
  var visible: scala.Boolean = js.native
}

