package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A model is a graphical object that can be added to or removed from a scene. It contains a
  * hierarchy and any number of mesh instances.
  */
@JSImport("playcanvas", "Model")
@js.native
open class Model () extends StObject {
  
  var _immutable: Boolean = js.native
  
  var _shadersVersion: Double = js.native
  
  var cameras: js.Array[Any] = js.native
  
  /**
    * Destroys skinning texture and possibly deletes vertex/index buffers of a model. Mesh is
    * reference-counted, so buffers are only deleted if all models with referencing mesh instances
    * were deleted. That means all in-scene models + the "base" one (asset.resource) which is
    * created when the model is parsed. It is recommended to use asset.unload() instead, which
    * will also remove the model from the scene.
    */
  def destroy(): Unit = js.native
  
  /**
    * Generates the necessary internal data for a model to be renderable as wireframe. Once this
    * function has been called, any mesh instance in the model can have its renderStyle property
    * set to {@link RENDERSTYLE_WIREFRAME}.
    *
    * @example
    * model.generateWireframe();
    * for (let i = 0; i < model.meshInstances.length; i++) {
    *     model.meshInstances[i].renderStyle = pc.RENDERSTYLE_WIREFRAME;
    * }
    */
  def generateWireframe(): Unit = js.native
  
  def getCameras(): js.Array[Any] = js.native
  
  def getGraph(): GraphNode = js.native
  
  def getLights(): js.Array[Any] = js.native
  
  def getMaterials(): js.Array[Material] = js.native
  
  /**
    * The root node of the model's graph node hierarchy.
    *
    * @type {import('./graph-node.js').GraphNode|null}
    */
  var graph: GraphNode | Null = js.native
  
  var lights: js.Array[Any] = js.native
  
  /**
    * An array of MeshInstances contained in this model.
    *
    * @type {MeshInstance[]}
    */
  var meshInstances: js.Array[MeshInstance] = js.native
  
  /**
    * An array of MorphInstances contained in this model.
    *
    * @type {MorphInstance[]}
    */
  var morphInstances: js.Array[MorphInstance] = js.native
  
  def setCameras(cameras: Any): Unit = js.native
  
  def setGraph(graph: Any): Unit = js.native
  
  def setLights(lights: Any): Unit = js.native
  
  /**
    * An array of SkinInstances contained in this model.
    *
    * @type {SkinInstance[]}
    */
  var skinInstances: js.Array[SkinInstance] = js.native
}
