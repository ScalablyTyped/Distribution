package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new model.
  * @example
  * // Create a new model
  * var model = new pc.Model();
  * @property graph - The root node of the model's graph node hierarchy.
  * @property meshInstances - An array of MeshInstances contained in this model.
  * @property skinInstances - An array of SkinInstances contained in this model.
  * @property morphInstances - An array of MorphInstances contained in this model.
  */
@JSImport("playcanvas", "Model")
@js.native
class Model ()
  extends StObject
     with typings.playcanvas.pc.Model {
  
  /**
    * Destroys skinning texture and possibly deletes vertex/index buffers of a model.
    * Mesh is reference-counted, so buffers are only deleted if all models with referencing mesh instances were deleted.
    * That means all in-scene models + the "base" one (asset.resource) which is created when the model is parsed.
    * It is recommended to use asset.unload() instead, which will also remove the model from the scene.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * Generates the necessary internal data for a model to be
    * renderable as wireframe. Once this function has been called, any mesh
    * instance in the model can have its renderStyle property set to
    * pc.RENDERSTYLE_WIREFRAME.
    * @example
    * model.generateWireframe();
    * for (var i = 0; i < model.meshInstances.length; i++) {
    *     model.meshInstances[i].renderStyle = pc.RENDERSTYLE_WIREFRAME;
    * }
    */
  /* CompleteClass */
  override def generateWireframe(): Unit = js.native
  
  /**
    * The root node of the model's graph node hierarchy.
    */
  /* CompleteClass */
  var graph: typings.playcanvas.pc.GraphNode = js.native
  
  /**
    * An array of MeshInstances contained in this model.
    */
  /* CompleteClass */
  var meshInstances: js.Array[typings.playcanvas.pc.MeshInstance] = js.native
  
  /**
    * An array of MorphInstances contained in this model.
    */
  /* CompleteClass */
  var morphInstances: js.Array[typings.playcanvas.pc.MorphInstance] = js.native
  
  /**
    * An array of SkinInstances contained in this model.
    */
  /* CompleteClass */
  var skinInstances: js.Array[typings.playcanvas.pc.SkinInstance] = js.native
}
