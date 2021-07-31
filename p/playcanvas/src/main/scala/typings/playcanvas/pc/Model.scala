package typings.playcanvas.pc

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
trait Model extends StObject {
  
  /**
    * Destroys skinning texture and possibly deletes vertex/index buffers of a model.
    * Mesh is reference-counted, so buffers are only deleted if all models with referencing mesh instances were deleted.
    * That means all in-scene models + the "base" one (asset.resource) which is created when the model is parsed.
    * It is recommended to use asset.unload() instead, which will also remove the model from the scene.
    */
  def destroy(): Unit
  
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
  def generateWireframe(): Unit
  
  /**
    * The root node of the model's graph node hierarchy.
    */
  var graph: GraphNode
  
  /**
    * An array of MeshInstances contained in this model.
    */
  var meshInstances: js.Array[MeshInstance]
  
  /**
    * An array of MorphInstances contained in this model.
    */
  var morphInstances: js.Array[MorphInstance]
  
  /**
    * An array of SkinInstances contained in this model.
    */
  var skinInstances: js.Array[SkinInstance]
}
object Model {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    generateWireframe: () => Unit,
    graph: GraphNode,
    meshInstances: js.Array[MeshInstance],
    morphInstances: js.Array[MorphInstance],
    skinInstances: js.Array[SkinInstance]
  ): Model = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), generateWireframe = js.Any.fromFunction0(generateWireframe), graph = graph.asInstanceOf[js.Any], meshInstances = meshInstances.asInstanceOf[js.Any], morphInstances = morphInstances.asInstanceOf[js.Any], skinInstances = skinInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGenerateWireframe(value: () => Unit): Self = StObject.set(x, "generateWireframe", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGraph(value: GraphNode): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshInstances(value: js.Array[MeshInstance]): Self = StObject.set(x, "meshInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshInstancesVarargs(value: MeshInstance*): Self = StObject.set(x, "meshInstances", js.Array(value :_*))
    
    @scala.inline
    def setMorphInstances(value: js.Array[MorphInstance]): Self = StObject.set(x, "morphInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMorphInstancesVarargs(value: MorphInstance*): Self = StObject.set(x, "morphInstances", js.Array(value :_*))
    
    @scala.inline
    def setSkinInstances(value: js.Array[SkinInstance]): Self = StObject.set(x, "skinInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinInstancesVarargs(value: SkinInstance*): Self = StObject.set(x, "skinInstances", js.Array(value :_*))
  }
}
