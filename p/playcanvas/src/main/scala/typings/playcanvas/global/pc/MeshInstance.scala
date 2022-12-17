package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link Layer} to calculate the "sort distance" for a {@link MeshInstance},
  * which determines its place in the render order.
  *
  * @callback CalculateSortDistanceCallback
  * @param {MeshInstance} meshInstance - The mesh instance.
  * @param {Vec3} cameraPosition - The position of the camera.
  * @param {Vec3} cameraForward - The forward vector of the camera.
  */
/**
  * An instance of a {@link Mesh}. A single mesh can be referenced by many mesh instances that can
  * have different transforms and materials.
  */
@JSGlobal("pc.MeshInstance")
@js.native
open class MeshInstance protected ()
  extends typings.playcanvas.mod.MeshInstance {
  /**
    * Create a new MeshInstance instance.
    *
    * @param {Mesh} mesh - The graphics mesh to instance.
    * @param {Material} material - The material to use for this mesh instance.
    * @param {GraphNode} [node] - The graph node defining the transform for this instance. This
    * parameter is optional when used with {@link RenderComponent} and will use the node the
    * component is attached to.
    * @example
    * // Create a mesh instance pointing to a 1x1x1 'cube' mesh
    * var mesh = pc.createBox(graphicsDevice);
    * var material = new pc.StandardMaterial();
    *
    * var meshInstance = new pc.MeshInstance(mesh, material);
    *
    * var entity = new pc.Entity();
    * entity.addComponent('render', {
    *     meshInstances: [meshInstance]
    * });
    *
    * // Add the entity to the scene hierarchy
    * this.app.scene.root.addChild(entity);
    */
  def this(mesh: typings.playcanvas.mod.Mesh, material: typings.playcanvas.mod.Material) = this()
  def this(
    mesh: typings.playcanvas.mod.Mesh,
    material: typings.playcanvas.mod.Material,
    node: typings.playcanvas.mod.GraphNode
  ) = this()
}
object MeshInstance {
  
  @JSGlobal("pc.MeshInstance")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("pc.MeshInstance.lightmapParamNames")
  @js.native
  def lightmapParamNames: js.Array[String] = js.native
  inline def lightmapParamNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightmapParamNames")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def prepareRenderStyleForArray(meshInstances: Any, renderStyle: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_prepareRenderStyleForArray")(meshInstances.asInstanceOf[js.Any], renderStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
