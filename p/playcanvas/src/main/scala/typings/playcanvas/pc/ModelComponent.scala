package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new ModelComponent.
  * @property type - The type of the model. Can be one of the following:
  * * "asset": The component will render a model asset
  * * "box": The component will render a box (1 unit in each dimension)
  * * "capsule": The component will render a capsule (radius 0.5, height 2)
  * * "cone": The component will render a cone (radius 0.5, height 1)
  * * "cylinder": The component will render a cylinder (radius 0.5, height 1)
  * * "plane": The component will render a plane (1 unit in each dimension)
  * * "sphere": The component will render a sphere (radius 0.5)
  * @property asset - The asset for the model (only applies to models of type 'asset') - can also be an asset id.
  * @property castShadows - If true, this model will cast shadows for lights that have shadow casting enabled.
  * @property receiveShadows - If true, shadows will be cast on this model.
  * @property material - The material {@link pc.Material} that will be used to render the model (not used on models of type 'asset').
  * @property materialAsset - The material {@link pc.Asset} that will be used to render the model (not used on models of type 'asset').
  * @property model - The model that is added to the scene graph. It can be not set or loaded, so will return null.
  * @property mapping - A dictionary that holds material overrides for each mesh instance. Only applies to model
  * components of type 'asset'. The mapping contains pairs of mesh instance index - material asset id.
  * @property castShadowsLightmap - If true, this model will cast shadows when rendering lightmaps.
  * @property lightmapped - If true, this model will be lightmapped after using lightmapper.bake().
  * @property lightmapSizeMultiplier - Lightmap resolution multiplier.
  * @property isStatic - Mark model as non-movable (optimization).
  * @property aabb - If set, the bounding box is used as a bounding box for visibility culling of attached mesh instances. This is an optimization,
  * allowing oversized bounding box to be specified for skinned characters in order to avoid per frame bounding box computations based on bone positions.
  * @property meshInstances - An array of meshInstances contained in the component's model. If model is not set or loaded for component it will return null.
  * @property batchGroupId - Assign model to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
  * @property layers - An array of layer IDs ({@link pc.Layer#id}) to which this model should belong.
  * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@js.native
trait ModelComponent extends Component {
  
  /**
    * If set, the bounding box is used as a bounding box for visibility culling of attached mesh instances. This is an optimization,
    allowing oversized bounding box to be specified for skinned characters in order to avoid per frame bounding box computations based on bone positions.
    */
  var aabb: BoundingBox = js.native
  
  /**
    * The asset for the model (only applies to models of type 'asset') - can also be an asset id.
    */
  var asset: Asset | Double = js.native
  
  /**
    * Assign model to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
    */
  var batchGroupId: Double = js.native
  
  /**
    * If true, this model will cast shadows for lights that have shadow casting enabled.
    */
  var castShadows: Boolean = js.native
  
  /**
    * If true, this model will cast shadows when rendering lightmaps.
    */
  var castShadowsLightmap: Boolean = js.native
  
  /**
    * Stop rendering model without removing it from the scene hierarchy.
    * This method sets the {@link pc.MeshInstance#visible} property of every MeshInstance in the model to false
    * Note, this does not remove the model or mesh instances from the scene hierarchy or draw call list.
    * So the model component still incurs some CPU overhead.
    * @example
    * this.timer = 0;
    * this.visible = true;
    * // ...
    * // blink model every 0.1 seconds
    * this.timer += dt;
    * if (this.timer > 0.1) {
    *     if (!this.visible) {
    *         this.entity.model.show();
    *         this.visible = true;
    *     } else {
    *         this.entity.model.hide();
    *         this.visible = false;
    *     }
    *     this.timer = 0;
    * }
    */
  def hide(): Unit = js.native
  
  /**
    * Mark model as non-movable (optimization).
    */
  var isStatic: Boolean = js.native
  
  /**
    * An array of layer IDs ({@link pc.Layer#id}) to which this model should belong.
    Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
    */
  var layers: js.Array[Double] = js.native
  
  /**
    * Lightmap resolution multiplier.
    */
  var lightmapSizeMultiplier: Double = js.native
  
  /**
    * If true, this model will be lightmapped after using lightmapper.bake().
    */
  var lightmapped: Boolean = js.native
  
  /**
    * A dictionary that holds material overrides for each mesh instance. Only applies to model
    components of type 'asset'. The mapping contains pairs of mesh instance index - material asset id.
    */
  var mapping: js.Any = js.native
  
  /**
    * The material {@link pc.Material} that will be used to render the model (not used on models of type 'asset').
    */
  var material: Material = js.native
  
  /**
    * The material {@link pc.Asset} that will be used to render the model (not used on models of type 'asset').
    */
  var materialAsset: Asset | Double = js.native
  
  /**
    * An array of meshInstances contained in the component's model. If model is not set or loaded for component it will return null.
    */
  var meshInstances: js.Array[MeshInstance] = js.native
  
  /**
    * The model that is added to the scene graph. It can be not set or loaded, so will return null.
    */
  var model: Model = js.native
  
  /**
    * If true, shadows will be cast on this model.
    */
  var receiveShadows: Boolean = js.native
  
  /**
    * Enable rendering of the model if hidden using {@link pc.ModelComponent#hide}.
    * This method sets all the {@link pc.MeshInstance#visible} property on all mesh instances to true.
    */
  def show(): Unit = js.native
  
  /**
    * The type of the model. Can be one of the following:
    * "asset": The component will render a model asset
    * "box": The component will render a box (1 unit in each dimension)
    * "capsule": The component will render a capsule (radius 0.5, height 2)
    * "cone": The component will render a cone (radius 0.5, height 1)
    * "cylinder": The component will render a cylinder (radius 0.5, height 1)
    * "plane": The component will render a plane (1 unit in each dimension)
    * "sphere": The component will render a sphere (radius 0.5)
    */
  var `type`: String = js.native
}
