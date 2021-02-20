package typings.playcanvas.pc

import typings.playcanvas.pc.callbacks.CalculateSortDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait MeshInstance extends StObject {
  
  /**
    * The world space axis-aligned bounding box for this
    mesh instance.
    */
  var aabb: BoundingBox = js.native
  
  /**
    * In some circumstances mesh instances are sorted by a distance calculation to determine their rendering order.
    Set this callback to override the default distance calculation, which gives the dot product of the camera forward vector and the vector between the camera position and
    the center of the mesh instance's axis-aligned bounding box. This option can be particularly useful for rendering transparent meshes in a better order than default.
    */
  def calculateSortDistance(meshInstance: MeshInstance, cameraPosition: Vec3, cameraForward: Vec3): Unit = js.native
  /**
    * In some circumstances mesh instances are sorted by a distance calculation to determine their rendering order.
    Set this callback to override the default distance calculation, which gives the dot product of the camera forward vector and the vector between the camera position and
    the center of the mesh instance's axis-aligned bounding box. This option can be particularly useful for rendering transparent meshes in a better order than default.
    */
  @JSName("calculateSortDistance")
  var calculateSortDistance_Original: CalculateSortDistance = js.native
  
  /**
    * Controls whether the mesh instance casts shadows.
    Defaults to false.
    */
  var castShadow: Boolean = js.native
  
  /**
    * Controls whether the mesh instance can be culled by with frustum culling ({@link pc.CameraComponent#frustumCulling}).
    */
  var cull: Boolean = js.native
  
  /**
    * Deletes a shader parameter on a mesh instance.
    * @param name - The name of the parameter to delete.
    */
  def deleteParameter(name: String): Unit = js.native
  
  /**
    * Use this value to affect rendering order of mesh instances.
    Only used when mesh instances are added to a {@link pc.Layer} with {@link pc.Layer#opaqueSortMode} or {@link pc.Layer#transparentSortMode} (depending on the material) set to {@link pc.SORTMODE_MANUAL}.
    */
  var drawOrder: Double = js.native
  
  /**
    * Retrieves the specified shader parameter from a mesh instance.
    * @param name - The name of the parameter to query.
    * @returns The named parameter.
    */
  def getParameter(name: String): js.Any = js.native
  
  /**
    * Number of instances when using hardware instancing to render the mesh.
    */
  var instancingCount: Double = js.native
  
  /**
    * Mask controlling which {@link pc.LightComponent}s light this mesh instance, which {@link pc.CameraComponent} sees it and in which {@link pc.Layer} it is rendered.
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
    
    * {@link pc.RENDERSTYLE_SOLID}
    * {@link pc.RENDERSTYLE_WIREFRAME}
    * {@link pc.RENDERSTYLE_POINTS}
    
    Defaults to pc.RENDERSTYLE_SOLID.
    */
  var renderStyle: Double = js.native
  
  /**
    * Sets up {@link pc.MeshInstance} to be rendered using Hardware Instancing.
    * @param vertexBuffer - Vertex buffer to hold per-instance vertex data (usually world matrices).
    * Pass null to turn off hardware instancing.
    */
  def setInstancing(): Unit = js.native
  def setInstancing(vertexBuffer: VertexBuffer): Unit = js.native
  
  def setParameter(name: String, data: js.Array[Double]): Unit = js.native
  def setParameter(name: String, data: js.Array[Double], passFlags: Double): Unit = js.native
  /**
    * Sets a shader parameter on a mesh instance. Note that this parameter will take precedence over parameter of the same name
    * if set on Material this mesh instance uses for rendering.
    * @param name - The name of the parameter to set.
    * @param data - The value for the specified parameter.
    * @param [passFlags] - Mask describing which passes the material should be included in.
    */
  def setParameter(name: String, data: Double): Unit = js.native
  def setParameter(name: String, data: Double, passFlags: Double): Unit = js.native
  def setParameter(name: String, data: Texture): Unit = js.native
  def setParameter(name: String, data: Texture, passFlags: Double): Unit = js.native
  
  /**
    * Enable rendering for this mesh instance. Use visible property to enable/disable rendering without overhead of removing from scene.
    But note that the mesh instance is still in the hierarchy and still in the draw call list.
    */
  var visible: Boolean = js.native
  
  /**
    * Read this value in {@link pc.Layer#onPostCull} to determine if the object is actually going to be rendered.
    */
  var visibleThisFrame: Boolean = js.native
}
