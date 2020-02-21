package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.LayerComposition
  * @augments pc.EventHandler
  * @classdesc Layer Composition is a collection of {@link pc.Layer} that is fed to {@link pc.Scene#layers} to define rendering order.
  * @description Create a new layer composition.
  * @property {pc.Layer[]} layerList A read-only array of {@link pc.Layer} sorted in the order they will be rendered.
  * @property {boolean[]} subLayerList A read-only array of boolean values, matching {@link pc.Layer#layerList}.
  * True means only semi-transparent objects are rendered, and false means opaque.
  * @property {boolean[]} subLayerEnabled A read-only array of boolean values, matching {@link pc.Layer#layerList}.
  * True means the layer is rendered, false means it's skipped.
  * @property {pc.CameraComponent[]} cameras A read-only array of {@link pc.CameraComponent} that can be used during rendering, e.g. Inside
  * {@link pc.Layer#onPreCull}, {@link pc.Layer#onPostCull}, {@link pc.Layer#onPreRender}, {@link pc.Layer#onPostRender}.
  */
@JSGlobal("pc.LayerComposition")
@js.native
class LayerComposition () extends EventHandler {
  /**
    * A read-only array of {@link pc.CameraComponent} that can be used during rendering, e.g. Inside
    * {@link pc.Layer#onPreCull}, {@link pc.Layer#onPostCull}, {@link pc.Layer#onPreRender}, {@link pc.Layer#onPostRender}.
    */
  var cameras: js.Array[CameraComponent] = js.native
  /**
    * A read-only array of {@link pc.Layer} sorted in the order they will be rendered.
    */
  var layerList: js.Array[Layer] = js.native
  /**
    * A read-only array of boolean values, matching {@link pc.Layer#layerList}.
    * True means the layer is rendered, false means it's skipped.
    */
  var subLayerEnabled: js.Array[Boolean] = js.native
  /**
    * A read-only array of boolean values, matching {@link pc.Layer#layerList}.
    * True means only semi-transparent objects are rendered, and false means opaque.
    */
  var subLayerList: js.Array[Boolean] = js.native
  /**
    * @function
    * @name pc.LayerComposition#getLayerById
    * @description Finds a layer inside this composition by its ID. Null is returned, if nothing is found.
    * @param {number} id - An ID of the layer to find.
    * @returns {pc.Layer} The layer corresponding to the specified ID. Returns null if layer is not found.
    */
  def getLayerById(id: Double): Layer = js.native
  /**
    * @function
    * @name pc.LayerComposition#getLayerByName
    * @description Finds a layer inside this composition by its name. Null is returned, if nothing is found.
    * @param {string} name - The name of the layer to find.
    * @returns {pc.Layer} The layer corresponding to the specified name. Returns null if layer is not found.
    */
  def getLayerByName(name: String): Layer = js.native
  /**
    * @function
    * @name pc.LayerComposition#getOpaqueIndex
    * @description Gets index of the opaque part of the supplied layer in the {@link pc.Layer#layerList}.
    * @param {pc.Layer} layer - A {@link pc.Layer} to find index of.
    * @returns {number} The index of the opaque part of the specified layer.
    */
  def getOpaqueIndex(layer: Layer): Double = js.native
  /**
    * @function
    * @name pc.LayerComposition#getTransparentIndex
    * @description Gets index of the semi-transparent part of the supplied layer in the {@link pc.Layer#layerList}.
    * @param {pc.Layer} layer - A {@link pc.Layer} to find index of.
    * @returns {number} The index of the semi-transparent part of the specified layer.
    */
  def getTransparentIndex(layer: Layer): Double = js.native
  /**
    * @function
    * @name pc.LayerComposition#insert
    * @description Inserts a layer (both opaque and semi-transparent parts) at the chosen index in the {@link pc.Layer#layerList}.
    * @param {pc.Layer} layer - A {@link pc.Layer} to add.
    * @param {number} index - Insertion position.
    */
  def insert(layer: Layer, index: Double): Unit = js.native
  /**
    * @function
    * @name pc.LayerComposition#insertOpaque
    * @description Inserts an opaque part of the layer (non semi-transparent mesh instances) at the chosen index in the {@link pc.Layer#layerList}.
    * @param {pc.Layer} layer - A {@link pc.Layer} to add.
    * @param {number} index - Insertion position.
    */
  def insertOpaque(layer: Layer, index: Double): Unit = js.native
  /**
    * @function
    * @name pc.LayerComposition#insertTransparent
    * @description Inserts a semi-transparent part of the layer at the chosen index in the {@link pc.Layer#layerList}.
    * @param {pc.Layer} layer - A {@link pc.Layer} to add.
    * @param {number} index - Insertion position.
    */
  def insertTransparent(layer: Layer, index: Double): Unit = js.native
  /**
    * @function
    * @name pc.LayerComposition#push
    * @description Adds a layer (both opaque and semi-transparent parts) to the end of the {@link pc.Layer#layerList}.
    * @param {pc.Layer} layer - A {@link pc.Layer} to add.
    */
  def push(layer: Layer): Unit = js.native
  /**
    * @function
    * @name pc.LayerComposition#pushOpaque
    * @description Adds part of the layer with opaque (non semi-transparent) objects to the end of the {@link pc.Layer#layerList}.
    * @param {pc.Layer} layer - A {@link pc.Layer} to add.
    */
  def pushOpaque(layer: Layer): Unit = js.native
  /**
    * @function
    * @name pc.LayerComposition#pushTransparent
    * @description Adds part of the layer with semi-transparent objects to the end of the {@link pc.Layer#layerList}.
    * @param {pc.Layer} layer - A {@link pc.Layer} to add.
    */
  def pushTransparent(layer: Layer): Unit = js.native
  /**
    * @function
    * @name pc.LayerComposition#remove
    * @description Removes a layer (both opaque and semi-transparent parts) from {@link pc.Layer#layerList}.
    * @param {pc.Layer} layer - A {@link pc.Layer} to remove.
    */
  def remove(layer: Layer): Unit = js.native
  /**
    * @function
    * @name pc.LayerComposition#removeOpaque
    * @description Removes an opaque part of the layer (non semi-transparent mesh instances) from {@link pc.Layer#layerList}.
    * @param {pc.Layer} layer - A {@link pc.Layer} to remove.
    */
  def removeOpaque(layer: Layer): Unit = js.native
  /**
    * @function
    * @name pc.LayerComposition#removeTransparent
    * @description Removes a transparent part of the layer from {@link pc.Layer#layerList}.
    * @param {pc.Layer} layer - A {@link pc.Layer} to remove.
    */
  def removeTransparent(layer: Layer): Unit = js.native
  /**
    * @function
    * @name pc.LayerComposition#sortOpaqueLayers
    * @description Used to determine which array of layers has any opaque sublayer that is on top of all the opaque sublayers in the other array.
    * @param {number[]} layersA - IDs of layers.
    * @param {number[]} layersB - IDs of layers.
    * @returns {number} Returns a negative number if any of the opaque sublayers in layersA is on top of all the opaque sublayers in layersB,
    * or a positive number if any of the opaque sublayers in layersB is on top of all the opaque sublayers in layersA, or 0 otherwise.
    */
  def sortOpaqueLayers(layersA: js.Array[Double], layersB: js.Array[Double]): Double = js.native
  /**
    * @function
    * @name pc.LayerComposition#sortTransparentLayers
    * @description Used to determine which array of layers has any transparent sublayer that is on top of all the transparent sublayers in the other array.
    * @param {number[]} layersA - IDs of layers.
    * @param {number[]} layersB - IDs of layers.
    * @returns {number} Returns a negative number if any of the transparent sublayers in layersA is on top of all the transparent sublayers in layersB,
    * or a positive number if any of the transparent sublayers in layersB is on top of all the transparent sublayers in layersA, or 0 otherwise.
    */
  def sortTransparentLayers(layersA: js.Array[Double], layersB: js.Array[Double]): Double = js.native
}

