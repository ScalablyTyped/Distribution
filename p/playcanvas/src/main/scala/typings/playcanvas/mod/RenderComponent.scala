package typings.playcanvas.mod

import typings.playcanvas.anon.Uv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../../scene/materials/material.js').Material} Material */
/** @typedef {import('../../../shape/bounding-box.js').BoundingBox} BoundingBox */
/** @typedef {import('../../entity.js').Entity} Entity */
/** @typedef {import('./system.js').RenderComponentSystem} RenderComponentSystem */
/**
  * Enables an Entity to render a {@link Mesh} or a primitive shape. This component attaches
  * {@link MeshInstance} geometry to the Entity.
  *
  * @property {Entity} rootBone A reference to the entity to be used as the root bone for any
  * skinned meshes that are rendered by this component.
  * @augments Component
  */
@JSImport("playcanvas", "RenderComponent")
@js.native
open class RenderComponent protected () extends Component {
  /**
    * Create a new RenderComponent.
    *
    * @param {RenderComponentSystem} system - The ComponentSystem that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: RenderComponentSystem, entity: Entity) = this()
  
  /**
    * Used by lightmapper.
    *
    * @type {{x: number, y: number, z: number, uv: number}|null}
    * @ignore
    */
  var _area: Uv | Null = js.native
  
  /**
    * @type {AssetReference}
    * @private
    */
  /* private */ var _assetReference: Any = js.native
  
  /** @private */
  /* private */ var _batchGroupId: Any = js.native
  
  /** @private */
  /* private */ var _castShadows: Any = js.native
  
  /** @private */
  /* private */ var _castShadowsLightmap: Any = js.native
  
  def _clearSkinInstances(): Unit = js.native
  
  def _cloneMeshes(meshes: Any): Unit = js.native
  
  def _cloneSkinInstances(): Unit = js.native
  
  /**
    * @type {BoundingBox|null}
    * @private
    */
  /* private */ var _customAabb: Any = js.native
  
  /** @private */
  /* private */ var _isStatic: Any = js.native
  
  /** @private */
  /* private */ var _layers: Any = js.native
  
  /** @private */
  /* private */ var _lightmapSizeMultiplier: Any = js.native
  
  /** @private */
  /* private */ var _lightmapped: Any = js.native
  
  /**
    * Material used to render meshes other than asset type. It gets priority when set to
    * something else than defaultMaterial, otherwise materialASsets[0] is used.
    *
    * @type {Material}
    * @private
    */
  /* private */ var _material: Any = js.native
  
  /**
    * @type {AssetReference[]}
    * @private
    */
  /* private */ var _materialReferences: Any = js.native
  
  /**
    * @type {MeshInstance[]}
    * @private
    */
  /* private */ var _meshInstances: Any = js.native
  
  def _onMaterialAdded(index: Any, component: Any, asset: Any): Unit = js.native
  
  def _onMaterialLoad(index: Any, component: Any, asset: Any): Unit = js.native
  
  def _onMaterialRemove(index: Any, component: Any, asset: Any): Unit = js.native
  
  def _onMaterialUnload(index: Any, component: Any, asset: Any): Unit = js.native
  
  def _onRenderAssetAdded(): Unit = js.native
  
  def _onRenderAssetLoad(): Unit = js.native
  
  def _onRenderAssetRemove(): Unit = js.native
  
  def _onRenderAssetUnload(): Unit = js.native
  
  /** @private */
  /* private */ var _onRootBoneChanged: Any = js.native
  
  def _onSetMeshes(meshes: Any): Unit = js.native
  
  /**
    * @param {Entity} entity - The entity set as the root bone.
    * @private
    */
  /* private */ var _onSetRootBone: Any = js.native
  
  /** @private */
  /* private */ var _receiveShadows: Any = js.native
  
  /** @private */
  /* private */ var _renderStyle: Any = js.native
  
  /**
    * @type {EntityReference}
    * @private
    */
  /* private */ var _rootBone: Any = js.native
  
  /** @private */
  /* private */ var _type: Any = js.native
  
  def _updateMainMaterial(index: Any, material: Any): Unit = js.native
  
  /** @private */
  /* private */ var addToLayers: Any = js.native
  
  def asset: Any = js.native
  /**
    * The render asset for the render component (only applies to type 'asset') - can also be an
    * asset id.
    *
    * @type {Asset|number}
    */
  def asset_=(arg: Any): Unit = js.native
  
  def assignAsset(asset: Double): Unit = js.native
  /**
    * Assign asset id to the component, without updating the component with the new asset.
    * This can be used to assign the asset id to already fully created component.
    *
    * @param {Asset|number} asset - The render asset or asset id to assign.
    * @ignore
    */
  def assignAsset(asset: Asset_): Unit = js.native
  
  def batchGroupId: Double = js.native
  /**
    * Assign meshes to a specific batch group (see {@link BatchGroup}). Default is -1 (no group).
    *
    * @type {number}
    */
  def batchGroupId_=(arg: Double): Unit = js.native
  
  def castShadows: Boolean = js.native
  
  def castShadowsLightmap: Boolean = js.native
  /**
    * If true, the meshes will cast shadows when rendering lightmaps.
    *
    * @type {boolean}
    */
  def castShadowsLightmap_=(arg: Boolean): Unit = js.native
  
  /**
    * If true, attached meshes will cast shadows for lights that have shadow casting enabled.
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
    * @type {BoundingBox}
    */
  def customAabb_=(arg: BoundingBox): Unit = js.native
  
  /** @private */
  /* private */ var destroyMeshInstances: Any = js.native
  
  /**
    * Stop rendering {@link MeshInstance}s without removing them from the scene hierarchy. This
    * method sets the {@link MeshInstance#visible} property of every MeshInstance to false. Note,
    * this does not remove the mesh instances from the scene hierarchy or draw call list. So the
    * render component still incurs some CPU overhead.
    */
  def hide(): Unit = js.native
  
  def isStatic: Boolean = js.native
  /**
    * Mark meshes as non-movable (optimization).
    *
    * @type {boolean}
    */
  def isStatic_=(arg: Boolean): Unit = js.native
  
  def layers: js.Array[Double] = js.native
  /**
    * An array of layer IDs ({@link Layer#id}) to which the meshes should belong. Don't push, pop,
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
    * If true, the meshes will be lightmapped after using lightmapper.bake().
    *
    * @type {boolean}
    */
  def lightmapped_=(arg: Boolean): Unit = js.native
  
  def material: Material = js.native
  
  var materialAsset: Any = js.native
  
  def materialAssets: js.Array[Any] = js.native
  /**
    * The material assets that will be used to render the meshes. Each material corresponds to the
    * respective mesh instance.
    *
    * @type {Asset[]|number[]}
    */
  def materialAssets_=(arg: js.Array[Any]): Unit = js.native
  
  /**
    * The material {@link Material} that will be used to render the meshes (not used on renders of
    * type 'asset').
    *
    * @type {Material}
    */
  def material_=(arg: Material): Unit = js.native
  
  def meshInstances: js.Array[MeshInstance] = js.native
  /**
    * An array of meshInstances contained in the component. If meshes are not set or loaded for
    * component it will return null.
    *
    * @type {MeshInstance[]}
    */
  def meshInstances_=(arg: js.Array[MeshInstance]): Unit = js.native
  
  /** @private */
  /* private */ var onInsertChild: Any = js.native
  
  def onLayerAdded(layer: Any): Unit = js.native
  
  def onLayerRemoved(layer: Any): Unit = js.native
  
  def onLayersChanged(oldComp: Any, newComp: Any): Unit = js.native
  
  def onRemove(): Unit = js.native
  
  /** @private */
  /* private */ var onRemoveChild: Any = js.native
  
  def receiveShadows: Boolean = js.native
  /**
    * If true, shadows will be cast on attached meshes.
    *
    * @type {boolean}
    */
  def receiveShadows_=(arg: Boolean): Unit = js.native
  
  def removeFromLayers(): Unit = js.native
  
  def renderStyle: Double = js.native
  /**
    * Set rendering of all {@link MeshInstance}s to the specified render style. Can be:
    *
    * - {@link RENDERSTYLE_SOLID}
    * - {@link RENDERSTYLE_WIREFRAME}
    * - {@link RENDERSTYLE_POINTS}
    *
    * Defaults to {@link RENDERSTYLE_SOLID}.
    *
    * @type {number}
    */
  def renderStyle_=(arg: Double): Unit = js.native
  
  def resolveDuplicatedEntityReferenceProperties(oldRender: Any, duplicatedIdsMap: Any): Unit = js.native
  
  var rootBone: Any = js.native
  
  /**
    * Enable rendering of the component's {@link MeshInstance}s if hidden using
    * {@link RenderComponent#hide}. This method sets the {@link MeshInstance#visible} property on
    * all mesh instances to true.
    */
  def show(): Unit = js.native
  
  def `type`: String = js.native
  /**
    * The type of the render. Can be one of the following:
    *
    * - "asset": The component will render a render asset
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
