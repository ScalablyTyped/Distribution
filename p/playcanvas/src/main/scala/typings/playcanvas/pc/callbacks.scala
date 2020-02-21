package typings.playcanvas.pc

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.callbacks
  * @namespace
  * @description Namespace for callback definitions.
  */
@JSGlobal("pc.callbacks")
@js.native
object callbacks extends js.Object {
  /**
    * @callback pc.callbacks.AddParser
    * @description Callback used by {@link pc.ModelHandler#addParser} to decide on which parser to use.
    * @param {string} url - The resource url.
    * @param {object} data - The raw model data.
    * @returns {boolean} Return true if this parser should be used to parse the data into a {@link pc.Model}.
    */
  type AddParser = js.Function2[/* url */ String, /* data */ js.Any, Boolean]
  /**
    * @callback pc.callbacks.AssetReady
    * @description Callback used by {@link pc.Asset#ready} and called when an asset is ready.
    * @param {pc.Asset} asset - The ready asset.
    */
  type AssetReady = js.Function1[/* asset */ Asset, Unit]
  /**
    * @callback pc.callbacks.CalculateMatrix
    * @description Callback used by {@link pc.CameraComponent#calculateTransform} and {@link pc.CameraComponent#calculateProjection}.
    * @param {pc.Mat4} transformMatrix - Output of the function.
    * @param {number} view - Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.
    */
  type CalculateMatrix = js.Function2[/* transformMatrix */ Mat4, /* view */ Double, Unit]
  /**
    * @callback pc.callbacks.CalculateSortDistance
    * @description Callback used by {@link pc.Layer} to calculate the "sort distance" for a {@link pc.MeshInstance}, which determines its place in the render order.
    * @param {pc.MeshInstance} meshInstance - The mesh instance.
    * @param {pc.Vec3} cameraPosition - The position of the camera.
    * @param {pc.Vec3} cameraForward - The forward vector of the camera.
    */
  type CalculateSortDistance = js.Function3[
    /* meshInstance */ MeshInstance, 
    /* cameraPosition */ Vec3, 
    /* cameraForward */ Vec3, 
    Unit
  ]
  /**
    * @callback pc.callbacks.ConfigureApp
    * @description Callback used by {@link pc.Application#configure} when configuration file is loaded and parsed (or an error occurs).
    * @param {string|null} err - The error message in the case where the loading or parsing fails.
    */
  type ConfigureApp = js.Function1[/* err */ String | Null, Unit]
  /**
    * @callback pc.callbacks.CreateScreen
    * @description Callback used by {@link pc.script.createLoadingScreen}.
    * @param {pc.Application} app - The application.
    */
  type CreateScreen = js.Function1[/* app */ Application, Unit]
  /**
    * @callback pc.callbacks.FilterAsset
    * @description Callback used by {@link pc.AssetRegistry#filter} to filter assets.
    * @param {pc.Asset} asset - The current asset to filter.
    * @returns {boolean} Return `true` to include asset to result list.
    */
  type FilterAsset = js.Function1[/* asset */ Asset, Boolean]
  /**
    * @callback pc.callbacks.FindNode
    * @description Callback used by {@link pc.GraphNode#find} and {@link pc.GraphNode#findOne} to search through a graph node and all of its descendants.
    * @param {pc.GraphNode} node - The current graph node.
    * @returns {boolean} Returning `true` will result in that node being returned from {@link pc.GraphNode#find} or {@link pc.GraphNode#findOne}.
    */
  type FindNode = js.Function1[/* node */ GraphNode, Boolean]
  /**
    * @callback pc.callbacks.ForEach
    * @description Callback used by {@link pc.GraphNode#forEach} to iterate through a graph node and all of its descendants.
    * @param {pc.GraphNode} node - The current graph node.
    */
  type ForEach = js.Function1[/* node */ GraphNode, Unit]
  /**
    * @callback pc.callbacks.HandleEvent
    * @description Callback used by {@link pc.events} functions. Note the callback is limited to 8 arguments.
    * @param {*} [arg1] - First argument that is passed from caller.
    * @param {*} [arg2] - Second argument that is passed from caller.
    * @param {*} [arg3] - Third argument that is passed from caller.
    * @param {*} [arg4] - Fourth argument that is passed from caller.
    * @param {*} [arg5] - Fifth argument that is passed from caller.
    * @param {*} [arg6] - Sixth argument that is passed from caller.
    * @param {*} [arg7] - Seventh argument that is passed from caller.
    * @param {*} [arg8] - Eighth argument that is passed from caller.
    */
  type HandleEvent = js.Function8[
    /* arg1 */ js.UndefOr[js.Any], 
    /* arg2 */ js.UndefOr[js.Any], 
    /* arg3 */ js.UndefOr[js.Any], 
    /* arg4 */ js.UndefOr[js.Any], 
    /* arg5 */ js.UndefOr[js.Any], 
    /* arg6 */ js.UndefOr[js.Any], 
    /* arg7 */ js.UndefOr[js.Any], 
    /* arg8 */ js.UndefOr[js.Any], 
    Unit
  ]
  /**
    * @callback pc.callbacks.HttpResponse
    * @description Callback used by {@link pc.Http#get}, {@link pc.Http#post}, {@link pc.Http#put}, {@link pc.Http#del}, and {@link pc.Http#request}.
    * @param {number|string|Error|null} err - The error code, message, or exception in the case where the request fails.
    * @param {*} [response] - The response data if no errors were encountered. (format depends on response type: text, Object, ArrayBuffer, XML).
    */
  type HttpResponse = js.Function2[/* err */ Double | String | Error | Null, /* response */ js.UndefOr[js.Any], Unit]
  /**
    * @callback pc.callbacks.LoadAsset
    * @description Callback used by {@link pc.AssetRegistry#loadFromUrl} and called when an asset is loaded (or an error occurs).
    * @param {string|null} err - The error message is null if no errors were encountered.
    * @param {pc.Asset} [asset] - The loaded asset if no errors were encountered.
    */
  type LoadAsset = js.Function2[/* err */ String | Null, /* asset */ js.UndefOr[Asset], Unit]
  /**
    * @callback pc.callbacks.LoadHierarchy
    * @description Callback used by {@link pc.Application#loadSceneHierarchy}.
    * @param {string|null} err - The error message in the case where the loading or parsing fails.
    * @param {pc.Entity} [entity] - The loaded root entity if no errors were encountered.
    */
  type LoadHierarchy = js.Function2[/* err */ String | Null, /* entity */ js.UndefOr[Entity], Unit]
  /**
    * @callback pc.callbacks.LoadSettings
    * @description Callback used by {@link pc.Application#loadSceneSettings}.
    * @param {string|null} err - The error message in the case where the loading or parsing fails.
    */
  type LoadSettings = js.Function1[/* err */ String | Null, Unit]
  /**
    * @callback pc.callbacks.LockMouse
    * @description Callback used by {@link pc.Mouse#enablePointerLock} and {@link pc.Application#disablePointerLock}.
    */
  type LockMouse = js.Function0[Unit]
  /**
    * @callback pc.callbacks.PreloadApp
    * @description Callback used by {@link pc.Application#preload} when all assets (marked as 'preload') are loaded.
    */
  type PreloadApp = js.Function0[Unit]
  /**
    * @callback pc.callbacks.ResourceHandler
    * @description Callback used by {@link pc.ResourceHandler#load} when a resource is loaded (or an error occurs).
    * @param {string|null} err - The error message in the case where the load fails.
    * @param {*} [response] - The raw data that has been successfully loaded.
    */
  type ResourceHandler = js.Function2[/* err */ String | Null, /* response */ js.UndefOr[js.Any], Unit]
  /**
    * @callback pc.callbacks.ResourceLoader
    * @description Callback used by {@link pc.ResourceLoader#load} when a resource is loaded (or an error occurs).
    * @param {string|null} err - The error message in the case where the load fails.
    * @param {*} [resource] - The resource that has been successfully loaded.
    */
  type ResourceLoader = js.Function2[/* err */ String | Null, /* resource */ js.UndefOr[js.Any], Unit]
  /**
    * @callback pc.callbacks.UpdateShader
    * @description Callback used by {@link pc.StandardMaterial#onUpdateShader}.
    * @param {object} options - An object with shader generator settings (based on current material and scene properties), that you can change and then return.
    * Properties of the object passed into this function are documented in {@link pc.StandardMaterial#onUpdateShader}.
    * @returns {object} Returned settings will be used by the shader.
    */
  type UpdateShader = js.Function1[/* options */ js.Any, js.Any]
  /**
    * @callback pc.callbacks.VrCamera
    * @description Callback used by {@link pc.CameraComponent#enterVr} and {@link pc.CameraComponent#exitVr}.
    * @param {string|null} err - On success it is null on failure it is the error message.
    */
  type VrCamera = js.Function1[/* err */ String | Null, Unit]
  /**
    * @callback pc.callbacks.VrDisplay
    * @description Callback used by {@link pc.VrDisplay#requestPresent} and {@link pc.VrDisplay#exitPresent}.
    * @param {string|null} err - The error message if presenting fails, or null if the call succeeds.
    */
  type VrDisplay = js.Function1[/* err */ String | Null, Unit]
  /**
    * @callback pc.callbacks.VrFrame
    * @description Callback used by {@link pc.VrDisplay#requestAnimationFrame}.
    */
  type VrFrame = js.Function0[Unit]
}

