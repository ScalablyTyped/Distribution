package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait Model extends js.Object {
  /**
    * The root node of the model's graph node hierarchy.
    */
  var graph: GraphNode = js.native
  /**
    * An array of MeshInstances contained in this model.
    */
  var meshInstances: js.Array[MeshInstance] = js.native
  /**
    * An array of MorphInstances contained in this model.
    */
  var morphInstances: js.Array[MorphInstance] = js.native
  /**
    * An array of SkinInstances contained in this model.
    */
  var skinInstances: js.Array[SkinInstance] = js.native
  /**
    * Destroys skinning texture and possibly deletes vertex/index buffers of a model.
    * Mesh is reference-counted, so buffers are only deleted if all models with referencing mesh instances were deleted.
    * That means all in-scene models + the "base" one (asset.resource) which is created when the model is parsed.
    * It is recommended to use asset.unload() instead, which will also remove the model from the scene.
    */
  def destroy(): Unit = js.native
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
  def generateWireframe(): Unit = js.native
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
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGenerateWireframe(value: () => Unit): Self = this.set("generateWireframe", js.Any.fromFunction0(value))
    @scala.inline
    def setGraph(value: GraphNode): Self = this.set("graph", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeshInstancesVarargs(value: MeshInstance*): Self = this.set("meshInstances", js.Array(value :_*))
    @scala.inline
    def setMeshInstances(value: js.Array[MeshInstance]): Self = this.set("meshInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def setMorphInstancesVarargs(value: MorphInstance*): Self = this.set("morphInstances", js.Array(value :_*))
    @scala.inline
    def setMorphInstances(value: js.Array[MorphInstance]): Self = this.set("morphInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkinInstancesVarargs(value: SkinInstance*): Self = this.set("skinInstances", js.Array(value :_*))
    @scala.inline
    def setSkinInstances(value: js.Array[SkinInstance]): Self = this.set("skinInstances", value.asInstanceOf[js.Any])
  }
  
}

