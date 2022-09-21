package typings.playcanvas.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../graphics/bind-group.js').BindGroup} BindGroup */
/** @typedef {import('../../graphics/render-target.js').RenderTarget} RenderTarget */
/** @typedef {import('./layer-composition.js').LayerComposition} LayerComposition */
/**
  * Class representing an entry in the final order of rendering of cameras and layers in the engine
  * this is populated at runtime based on LayerComposition
  *
  * @ignore
  */
@js.native
trait RenderAction extends StObject {
  
  var camera: Any = js.native
  
  var cameraIndex: Double = js.native
  
  var clearColor: Boolean = js.native
  
  var clearDepth: Boolean = js.native
  
  var clearStencil: Boolean = js.native
  
  def collectDirectionalLights(cameraLayers: Any, dirLights: Any, allLights: Any): Unit = js.native
  
  def destroy(): Unit = js.native
  
  var directionalLights: js.Array[Any] = js.native
  
  var directionalLightsIndices: js.Array[Any] = js.native
  
  var directionalLightsSet: Set[Any] = js.native
  
  var firstCameraUse: Boolean = js.native
  
  def hasDirectionalShadowLights: Boolean = js.native
  
  /**
    * @param {LayerComposition} layerComposition - The layer composition.
    * @returns {boolean} - True if the layer / sublayer referenced by the render action is enabled
    */
  def isLayerEnabled(layerComposition: LayerComposition): Boolean = js.native
  
  var lastCameraUse: Boolean = js.native
  
  var layerIndex: Double = js.native
  
  var lightClusters: Any = js.native
  
  /**
    * render target this render action renders to (taken from either camera or layer)
    *
    * @type {RenderTarget|null}
    */
  var renderTarget: RenderTarget | Null = js.native
  
  def reset(): Unit = js.native
  
  var triggerPostprocess: Boolean = js.native
  
  /** @type {Array<BindGroup>} */
  var viewBindGroups: js.Array[BindGroup] = js.native
}
