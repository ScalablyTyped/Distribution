package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.Model
  * @class A model is a graphical object that can be added to or removed from a scene.
  * It contains a hierarchy and any number of mesh instances.
  * @description Creates a new model.
  * @example
  * // Create a new model
  * var model = new pc.Model();
  * @property {pc.GraphNode} graph The root node of the model's graph node hierarchy.
  * @property {pc.MeshInstance[]} meshInstances An array of meshInstances contained in this model.
  */
@JSGlobal("pc.Model")
@js.native
class Model () extends js.Object {
  var graph: GraphNode = js.native
  var meshInstances: js.Array[MeshInstance] = js.native
  /**
    * @function
    * @name pc.Model#destroy
    * @description destroys skinning texture and possibly deletes vertex/index buffers of a model.
    * Mesh is reference-counted, so buffers are only deleted if all models with referencing mesh instances were deleted.
    * That means all in-scene models + the "base" one (asset.resource) which is created when the model is parsed.
    * It is recommended to use asset.unload() instead, which will also remove the model from the scene.
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.Model#generateWireframe
    * @description Generates the necessary internal data for a model to be
    * renderable as wireframe. Once this function has been called, any mesh
    * instance in the model can have its renderStyle property set to
    * pc.RENDERSTYLE_WIREFRAME
    * @example
    * model.generateWireframe();
    * for (var i = 0; i < model.meshInstances.length; i++) {
    *     model.meshInstances[i].renderStyle = pc.RENDERSTYLE_WIREFRAME;
    * }
    * @author Will Eastcott
    */
  def generateWireframe(): Unit = js.native
  def getMaterials(): js.Array[StandardMaterial] = js.native
}

