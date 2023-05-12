package typings.playcanvas.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables an Entity to render a model or a primitive shape. This Component attaches additional
  * model geometry in to the scene graph below the Entity.
  *
  * @augments Component
  */
@JSImport("playcanvas", "ModelComponent")
@js.native
open class ModelComponent protected () extends Component {
  /**
    * Create a new ModelComponent instance.
    *
    * @param {import('./system.js').ModelComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this Component is
    * attached to.
    */
  def this(system: ModelComponentSystem, entity: Entity) = this()
  
  var _area: Any = js.native
  
  /**
    * @type {Asset|number|null}
    * @private
    */
  /* private */ var _asset: Any = js.native
  
  var _batchGroup: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _batchGroupId: Any = js.native
  
  /**
    * @param {Asset} asset - The material asset to bind events to.
    * @private
    */
  /* private */ var _bindMaterialAsset: Any = js.native
  
  /**
    * @param {Asset} asset - The model asset to bind events to.
    * @private
    */
  /* private */ var _bindModelAsset: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _castShadows: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _castShadowsLightmap: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _clonedModel: Any = js.native
  
  /**
    * @type {import('../../../core/shape/bounding-box.js').BoundingBox|null}
    * @private
    */
  /* private */ var _customAabb: Any = js.native
  
  /**
    * @param {string} idOrPath - The asset id or path.
    * @returns {Asset|null} The asset.
    * @private
    */
  /* private */ var _getAssetByIdOrPath: Any = js.native
  
  /**
    * @param {string} path - The path of the model asset.
    * @returns {string|null} The model asset URL or null if the asset is not in the registry.
    * @private
    */
  /* private */ var _getMaterialAssetUrl: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _isStatic: Any = js.native
  
  /**
    * @type {number[]}
    * @private
    */
  /* private */ var _layers: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _lightmapSizeMultiplier: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _lightmapped: Any = js.native
  
  /**
    * @param {Asset} materialAsset -The material asset to load.
    * @param {MeshInstance} meshInstance - The mesh instance to assign the material to.
    * @param {number} index - The index of the mesh instance.
    * @private
    */
  /* private */ var _loadAndSetMeshInstanceMaterial: Any = js.native
  
  /**
    * @type {Object<string, number>}
    * @private
    */
  /* private */ var _mapping: Any = js.native
  
  /**
    * @type {import('../../../scene/materials/material.js').Material}
    * @private
    */
  /* private */ var _material: Any = js.native
  
  /**
    * @type {Asset|number|null}
    * @private
    */
  /* private */ var _materialAsset: Any = js.native
  
  var _materialEvents: Any = js.native
  
  /**
    * @type {Model|null}
    * @private
    */
  /* private */ var _model: Any = js.native
  
  /**
    * @param {Asset} asset - The material asset on which an asset add event has been fired.
    * @private
    */
  /* private */ var _onMaterialAssetAdd: Any = js.native
  
  /**
    * @param {Asset} asset - The material asset on which an asset change event has been fired.
    * @private
    */
  /* private */ var _onMaterialAssetChange: Any = js.native
  
  /**
    * @param {Asset} asset - The material asset on which an asset load event has been fired.
    * @private
    */
  /* private */ var _onMaterialAssetLoad: Any = js.native
  
  /**
    * @param {Asset} asset - The material asset on which an asset remove event has been fired.
    * @private
    */
  /* private */ var _onMaterialAssetRemove: Any = js.native
  
  /**
    * @param {Asset} asset - The material asset on which an asset unload event has been fired.
    * @private
    */
  /* private */ var _onMaterialAssetUnload: Any = js.native
  
  /**
    * @param {Asset} asset - The model asset on which an asset add event has been fired.
    * @private
    */
  /* private */ var _onModelAssetAdded: Any = js.native
  
  /**
    * @param {Asset} asset - The model asset on which an asset change event has been fired.
    * @param {string} attr - The attribute that was changed.
    * @param {*} _new - The new value of the attribute.
    * @param {*} _old - The old value of the attribute.
    * @private
    */
  /* private */ var _onModelAssetChange: Any = js.native
  
  /**
    * @param {Asset} asset - The model asset on which an asset load event has been fired.
    * @private
    */
  /* private */ var _onModelAssetLoad: Any = js.native
  
  /**
    * @param {Asset} asset - The model asset on which an asset remove event has been fired.
    * @private
    */
  /* private */ var _onModelAssetRemove: Any = js.native
  
  /**
    * @param {Asset} asset - The model asset on which an asset unload event has been fired.
    * @private
    */
  /* private */ var _onModelAssetUnload: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _receiveShadows: Any = js.native
  
  /**
    * @param {import('../../../scene/materials/material.js').Material} material - The material to
    * be set.
    * @private
    */
  /* private */ var _setMaterial: Any = js.native
  
  /**
    * @param {number} index - The index of the mesh instance.
    * @param {string} event - The event name.
    * @param {number} id - The asset id.
    * @param {*} handler - The handler function to be bound to the specified event.
    * @private
    */
  /* private */ var _setMaterialEvent: Any = js.native
  
  /**
    * @type {string}
    * @private
    */
  /* private */ var _type: Any = js.native
  
  /**
    * @param {Asset} asset - The material asset to unbind events from.
    * @private
    */
  /* private */ var _unbindMaterialAsset: Any = js.native
  
  /**
    * @param {Asset} asset - The model asset to unbind events from.
    * @private
    */
  /* private */ var _unbindModelAsset: Any = js.native
  
  /** @private */
  /* private */ var _unsetMaterialEvents: Any = js.native
  
  def addModelToLayers(): Unit = js.native
  
  def asset: Double | Asset_ = js.native
  /**
    * The asset for the model (only applies to models of type 'asset') can also be an asset id.
    *
    * @type {Asset|number|null}
    */
  def asset_=(arg: Double | Asset_): Unit = js.native
  
  def batchGroupId: Double = js.native
  /**
    * Assign model to a specific batch group (see {@link BatchGroup}). Default is -1 (no group).
    *
    * @type {number}
    */
  def batchGroupId_=(arg: Double): Unit = js.native
  
  def castShadows: Boolean = js.native
  
  def castShadowsLightmap: Boolean = js.native
  /**
    * If true, this model will cast shadows when rendering lightmaps.
    *
    * @type {boolean}
    */
  def castShadowsLightmap_=(arg: Boolean): Unit = js.native
  
  /**
    * If true, this model will cast shadows for lights that have shadow casting enabled.
    *
    * @type {boolean}
    */
  def castShadows_=(arg: Boolean): Unit = js.native
  
  def customAabb: BoundingBox = js.native
  /**
    * If set, the object space bounding box is used as a bounding box for visibility culling of
    * attached mesh instances. This is an optimization, allowing oversized bounding box to be
    * specified for skinned characters in order to avoid per frame bounding box computations based
    * on bone positions.
    *
    * @type {import('../../../core/shape/bounding-box.js').BoundingBox|null}
    */
  def customAabb_=(arg: BoundingBox): Unit = js.native
  
  /**
    * Stop rendering model without removing it from the scene hierarchy. This method sets the
    * {@link MeshInstance#visible} property of every MeshInstance in the model to false Note, this
    * does not remove the model or mesh instances from the scene hierarchy or draw call list. So
    * the model component still incurs some CPU overhead.
    *
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
  
  def isStatic: Boolean = js.native
  /**
    * Mark model as non-movable (optimization).
    *
    * @type {boolean}
    */
  def isStatic_=(arg: Boolean): Unit = js.native
  
  def layers: js.Array[Double] = js.native
  /**
    * An array of layer IDs ({@link Layer#id}) to which this model should belong. Don't push, pop,
    * splice or modify this array, if you want to change it - set a new one instead.
    *
    * @type {number[]}
    */
  def layers_=(arg: js.Array[Double]): Unit = js.native
  
  def lightmapSizeMultiplier: Double = js.native
  /**
    * Lightmap resolution multiplier.
    *
    * @type {number}
    */
  def lightmapSizeMultiplier_=(arg: Double): Unit = js.native
  
  def lightmapped: Boolean = js.native
  /**
    * If true, this model will be lightmapped after using lightmapper.bake().
    *
    * @type {boolean}
    */
  def lightmapped_=(arg: Boolean): Unit = js.native
  
  def mapping: StringDictionary[Double] = js.native
  /**
    * A dictionary that holds material overrides for each mesh instance. Only applies to model
    * components of type 'asset'. The mapping contains pairs of mesh instance index - material
    * asset id.
    *
    * @type {Object<string, number>}
    */
  def mapping_=(arg: StringDictionary[Double]): Unit = js.native
  
  def material: Material = js.native
  
  def materialAsset: Double | Asset_ = js.native
  /**
    * The material {@link Asset} that will be used to render the model (not used on models of type
    * 'asset').
    *
    * @type {Asset|number|null}
    */
  def materialAsset_=(arg: Double | Asset_): Unit = js.native
  
  /**
    * The material {@link Material} that will be used to render the model (not used on models of
    * type 'asset').
    *
    * @type {import('../../../scene/materials/material.js').Material}
    */
  def material_=(arg: Material): Unit = js.native
  
  def meshInstances: js.Array[MeshInstance] = js.native
  /**
    * An array of meshInstances contained in the component's model. If model is not set or loaded
    * for component it will return null.
    *
    * @type {MeshInstance[]|null}
    */
  def meshInstances_=(arg: js.Array[MeshInstance]): Unit = js.native
  
  def model: Model = js.native
  /**
    * The model that is added to the scene graph. It can be not set or loaded, so will return null.
    *
    * @type {Model}
    */
  def model_=(arg: Model): Unit = js.native
  
  def onInsertChild(): Unit = js.native
  
  /**
    * @param {Layer} layer - The layer that was added.
    * @private
    */
  /* private */ var onLayerAdded: Any = js.native
  
  /**
    * @param {Layer} layer - The layer that was removed.
    * @private
    */
  /* private */ var onLayerRemoved: Any = js.native
  
  /**
    * @param {import('../../../scene/composition/layer-composition.js').LayerComposition} oldComp - The
    * old layer composition.
    * @param {import('../../../scene/composition/layer-composition.js').LayerComposition} newComp - The
    * new layer composition.
    * @private
    */
  /* private */ var onLayersChanged: Any = js.native
  
  def onRemove(): Unit = js.native
  
  def onRemoveChild(): Unit = js.native
  
  def receiveShadows: Boolean = js.native
  /**
    * If true, shadows will be cast on this model.
    *
    * @type {boolean}
    */
  def receiveShadows_=(arg: Boolean): Unit = js.native
  
  def removeModelFromLayers(): Unit = js.native
  
  /**
    * Enable rendering of the model if hidden using {@link ModelComponent#hide}. This method sets
    * all the {@link MeshInstance#visible} property on all mesh instances to true.
    */
  def show(): Unit = js.native
  
  def `type`: String = js.native
  /**
    * The type of the model. Can be:
    *
    * - "asset": The component will render a model asset
    * - "box": The component will render a box (1 unit in each dimension)
    * - "capsule": The component will render a capsule (radius 0.5, height 2)
    * - "cone": The component will render a cone (radius 0.5, height 1)
    * - "cylinder": The component will render a cylinder (radius 0.5, height 1)
    * - "plane": The component will render a plane (1 unit in each dimension)
    * - "sphere": The component will render a sphere (radius 0.5)
    * - "torus": The component will render a torus (tubeRadius: 0.2, ringRadius: 0.3)
    *
    * @type {string}
    */
  def type_=(arg: String): Unit = js.native
}
