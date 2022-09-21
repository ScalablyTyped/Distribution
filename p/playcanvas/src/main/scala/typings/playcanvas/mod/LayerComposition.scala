package typings.playcanvas.mod

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Layer Composition is a collection of {@link Layer} that is fed to {@link Scene#layers} to define
  * rendering order.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "LayerComposition")
@js.native
/**
  * Create a new layer composition.
  *
  * @param {string} [name] - Optional non-unique name of the layer composition. Defaults to
  * "Untitled" if not specified.
  */
open class LayerComposition () extends EventHandler {
  def this(name: String) = this()
  
  var _dirty: Boolean = js.native
  
  var _dirtyBlend: Boolean = js.native
  
  var _dirtyCameras: Boolean = js.native
  
  var _dirtyLights: Boolean = js.native
  
  var _emptyWorldClusters: WorldClusters = js.native
  
  def _getSublayerIndex(layer: Any, transparent: Any): Double = js.native
  
  def _isLayerAdded(layer: Any): Boolean = js.native
  
  def _isSublayerAdded(layer: Any, transparent: Any): Boolean = js.native
  
  var _lightCompositionData: js.Array[Any] = js.native
  
  var _lights: js.Array[Any] = js.native
  
  var _lightsMap: Map[Any, Any] = js.native
  
  def _logRenderActions(): Unit = js.native
  
  var _meshInstances: js.Array[Any] = js.native
  
  var _meshInstancesSet: Set[Any] = js.native
  
  /**
    * The actual rendering sequence, generated based on layers and cameras
    *
    * @type {RenderAction[]}
    * @ignore
    */
  var _renderActions: js.Array[RenderAction] = js.native
  
  def _sortLayersDescending(layersA: Any, layersB: Any, order: Any): Double = js.native
  
  var _splitLights: js.Array[js.Array[Any]] = js.native
  
  def _splitLightsArray(target: Any): Unit = js.native
  
  def _update(device: Any): Double = js.native
  def _update(device: Any, clusteredLightingEnabled: Boolean): Double = js.native
  
  def _updateOpaqueOrder(startIndex: Any, endIndex: Any): Unit = js.native
  
  def _updateTransparentOrder(startIndex: Any, endIndex: Any): Unit = js.native
  
  var _worldClusters: js.Array[Any] = js.native
  
  def addRenderAction(
    renderActions: Any,
    renderActionIndex: Any,
    layer: Any,
    layerIndex: Any,
    cameraIndex: Any,
    cameraFirstRenderAction: Any,
    postProcessMarked: Any
  ): RenderAction = js.native
  
  def allocateLightClusters(device: Any): Unit = js.native
  
  /**
    * A read-only array of {@link CameraComponent} that can be used during rendering. e.g.
    * Inside {@link Layer#onPreCull}, {@link Layer#onPostCull}, {@link Layer#onPreRender},
    * {@link Layer#onPostRender}.
    *
    * @type {CameraComponent[]}
    */
  var cameras: js.Array[CameraComponent] = js.native
  
  def destroy(): Unit = js.native
  
  def findCompatibleCluster(layer: Any, renderActionCount: Any, emptyWorldClusters: Any): Any = js.native
  
  def getEmptyWorldClusters(device: Any): WorldClusters = js.native
  
  /**
    * Finds a layer inside this composition by its ID. Null is returned, if nothing is found.
    *
    * @param {number} id - An ID of the layer to find.
    * @returns {Layer|null} The layer corresponding to the specified ID. Returns null if layer is
    * not found.
    */
  def getLayerById(id: Double): Layer | Null = js.native
  
  /**
    * Finds a layer inside this composition by its name. Null is returned, if nothing is found.
    *
    * @param {string} name - The name of the layer to find.
    * @returns {Layer|null} The layer corresponding to the specified name. Returns null if layer
    * is not found.
    */
  def getLayerByName(name: String): Layer | Null = js.native
  
  /**
    * Gets index of the opaque part of the supplied layer in the {@link Layer#layerList}.
    *
    * @param {Layer} layer - A {@link Layer} to find index of.
    * @returns {number} The index of the opaque part of the specified layer.
    */
  def getOpaqueIndex(layer: Layer): Double = js.native
  
  /**
    * Gets index of the semi-transparent part of the supplied layer in the {@link Layer#layerList}.
    *
    * @param {Layer} layer - A {@link Layer} to find index of.
    * @returns {number} The index of the semi-transparent part of the specified layer.
    */
  def getTransparentIndex(layer: Layer): Double = js.native
  
  /**
    * Inserts a layer (both opaque and semi-transparent parts) at the chosen index in the
    * {@link Layer#layerList}.
    *
    * @param {Layer} layer - A {@link Layer} to add.
    * @param {number} index - Insertion position.
    */
  def insert(layer: Layer, index: Double): Unit = js.native
  
  /**
    * Inserts an opaque part of the layer (non semi-transparent mesh instances) at the chosen
    * index in the {@link Layer#layerList}.
    *
    * @param {Layer} layer - A {@link Layer} to add.
    * @param {number} index - Insertion position.
    */
  def insertOpaque(layer: Layer, index: Double): Unit = js.native
  
  /**
    * Inserts a semi-transparent part of the layer at the chosen index in the {@link Layer#layerList}.
    *
    * @param {Layer} layer - A {@link Layer} to add.
    * @param {number} index - Insertion position.
    */
  def insertTransparent(layer: Layer, index: Double): Unit = js.native
  
  /**
    * A read-only array of {@link Layer} sorted in the order they will be rendered.
    *
    * @type {Layer[]}
    */
  var layerList: js.Array[Layer] = js.native
  
  var name: String = js.native
  
  def propagateRenderTarget(startIndex: Any, fromCamera: Any): Unit = js.native
  
  /**
    * Adds a layer (both opaque and semi-transparent parts) to the end of the {@link Layer#layerList}.
    *
    * @param {Layer} layer - A {@link Layer} to add.
    */
  def push(layer: Layer): Unit = js.native
  
  /**
    * Adds part of the layer with opaque (non semi-transparent) objects to the end of the
    * {@link Layer#layerList}.
    *
    * @param {Layer} layer - A {@link Layer} to add.
    */
  def pushOpaque(layer: Layer): Unit = js.native
  
  /**
    * Adds part of the layer with semi-transparent objects to the end of the {@link Layer#layerList}.
    *
    * @param {Layer} layer - A {@link Layer} to add.
    */
  def pushTransparent(layer: Layer): Unit = js.native
  
  /**
    * Removes a layer (both opaque and semi-transparent parts) from {@link Layer#layerList}.
    *
    * @param {Layer} layer - A {@link Layer} to remove.
    */
  def remove(layer: Layer): Unit = js.native
  
  /**
    * Removes an opaque part of the layer (non semi-transparent mesh instances) from
    * {@link Layer#layerList}.
    *
    * @param {Layer} layer - A {@link Layer} to remove.
    */
  def removeOpaque(layer: Layer): Unit = js.native
  
  /**
    * Removes a transparent part of the layer from {@link Layer#layerList}.
    *
    * @param {Layer} layer - A {@link Layer} to remove.
    */
  def removeTransparent(layer: Layer): Unit = js.native
  
  /**
    * Used to determine which array of layers has any opaque sublayer that is on top of all the
    * opaque sublayers in the other array.
    *
    * @param {number[]} layersA - IDs of layers.
    * @param {number[]} layersB - IDs of layers.
    * @returns {number} Returns a negative number if any of the opaque sublayers in layersA is on
    * top of all the opaque sublayers in layersB, or a positive number if any of the opaque
    * sublayers in layersB is on top of all the opaque sublayers in layersA, or 0 otherwise.
    * @private
    */
  /* private */ var sortOpaqueLayers: Any = js.native
  
  /**
    * Used to determine which array of layers has any transparent sublayer that is on top of all
    * the transparent sublayers in the other array.
    *
    * @param {number[]} layersA - IDs of layers.
    * @param {number[]} layersB - IDs of layers.
    * @returns {number} Returns a negative number if any of the transparent sublayers in layersA
    * is on top of all the transparent sublayers in layersB, or a positive number if any of the
    * transparent sublayers in layersB is on top of all the transparent sublayers in layersA, or 0
    * otherwise.
    * @private
    */
  /* private */ var sortTransparentLayers: Any = js.native
  
  /**
    * A read-only array of boolean values, matching {@link Layer#layerList}. True means the
    * layer is rendered, false means it's skipped.
    *
    * @type {boolean[]}
    */
  var subLayerEnabled: js.Array[Boolean] = js.native
  
  /**
    * A read-only array of boolean values, matching {@link Layer#layerList}. True means only
    * semi-transparent objects are rendered, and false means opaque.
    *
    * @type {boolean[]}
    */
  var subLayerList: js.Array[Boolean] = js.native
  
  def updateLights(): Unit = js.native
  
  def updateShadowCasters(): Unit = js.native
}
