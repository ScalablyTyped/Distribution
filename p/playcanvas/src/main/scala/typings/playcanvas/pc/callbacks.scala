package typings.playcanvas.pc

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Namespace for callback definitions.
  */
@JSGlobal("pc.callbacks")
@js.native
object callbacks extends js.Object {
  /**
    * Callback used by {@link pc.ModelHandler#addParser} to decide on which parser to use.
    * @param url - The resource url.
    * @param data - The raw model data.
    */
  type AddParser = js.Function2[/* url */ String, /* data */ js.Any, Boolean]
  /**
    * Callback used by {@link pc.Asset#ready} and called when an asset is ready.
    * @param asset - The ready asset.
    */
  type AssetReady = js.Function1[/* asset */ Asset, Unit]
  /**
    * Callback used by {@link pc.CameraComponent#calculateTransform} and {@link pc.CameraComponent#calculateProjection}.
    * @param transformMatrix - Output of the function.
    * @param view - Type of view. Can be pc.VIEW_CENTER, pc.VIEW_LEFT or pc.VIEW_RIGHT. Left and right are only used in stereo rendering.
    */
  type CalculateMatrix = js.Function2[/* transformMatrix */ Mat4, /* view */ Double, Unit]
  /**
    * Callback used by {@link pc.Layer} to calculate the "sort distance" for a {@link pc.MeshInstance}, which determines its place in the render order.
    * @param meshInstance - The mesh instance.
    * @param cameraPosition - The position of the camera.
    * @param cameraForward - The forward vector of the camera.
    */
  type CalculateSortDistance = js.Function3[
    /* meshInstance */ MeshInstance, 
    /* cameraPosition */ Vec3, 
    /* cameraForward */ Vec3, 
    Unit
  ]
  /**
    * Callback used by {@link pc.Application#configure} when configuration file is loaded and parsed (or an error occurs).
    * @param err - The error message in the case where the loading or parsing fails.
    */
  type ConfigureApp = js.Function1[/* err */ String | Null, Unit]
  /**
    * Callback used by {@link pc.script.createLoadingScreen}.
    * @param app - The application.
    */
  type CreateScreen = js.Function1[/* app */ Application, Unit]
  /**
    * Callback used by {@link pc.AssetRegistry#filter} to filter assets.
    * @param asset - The current asset to filter.
    */
  type FilterAsset = js.Function1[/* asset */ Asset, Boolean]
  /**
    * Callback used by {@link pc.GraphNode#find} and {@link pc.GraphNode#findOne} to search through a graph node and all of its descendants.
    * @param node - The current graph node.
    */
  type FindNode = js.Function1[/* node */ GraphNode, Boolean]
  /**
    * Callback used by {@link pc.GraphNode#forEach} to iterate through a graph node and all of its descendants.
    * @param node - The current graph node.
    */
  type ForEach = js.Function1[/* node */ GraphNode, Unit]
  /**
    * Callback used by {@link pc.events} functions. Note the callback is limited to 8 arguments.
    * @param [arg1] - First argument that is passed from caller.
    * @param [arg2] - Second argument that is passed from caller.
    * @param [arg3] - Third argument that is passed from caller.
    * @param [arg4] - Fourth argument that is passed from caller.
    * @param [arg5] - Fifth argument that is passed from caller.
    * @param [arg6] - Sixth argument that is passed from caller.
    * @param [arg7] - Seventh argument that is passed from caller.
    * @param [arg8] - Eighth argument that is passed from caller.
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
    * Callback used by {@link pc.Http#get}, {@link pc.Http#post}, {@link pc.Http#put}, {@link pc.Http#del}, and {@link pc.Http#request}.
    * @param err - The error code, message, or exception in the case where the request fails.
    * @param [response] - The response data if no errors were encountered. (format depends on response type: text, Object, ArrayBuffer, XML).
    */
  type HttpResponse = js.Function2[/* err */ Double | String | Error | Null, /* response */ js.UndefOr[js.Any], Unit]
  /**
    * Callback used by {@link pc.AssetRegistry#loadFromUrl} and called when an asset is loaded (or an error occurs).
    * @param err - The error message is null if no errors were encountered.
    * @param [asset] - The loaded asset if no errors were encountered.
    */
  type LoadAsset = js.Function2[/* err */ String | Null, /* asset */ js.UndefOr[Asset], Unit]
  /**
    * Callback used by {@link pc.SceneRegistry#loadSceneHierarchy}.
    * @param err - The error message in the case where the loading or parsing fails.
    * @param [entity] - The loaded root entity if no errors were encountered.
    */
  type LoadHierarchy = js.Function2[/* err */ String | Null, /* entity */ js.UndefOr[Entity], Unit]
  /**
    * Callback used by {@link pc.SceneRegistry#loadScene}.
    * @param err - The error message in the case where the loading or parsing fails.
    * @param [entity] - The loaded root entity if no errors were encountered.
    */
  type LoadScene = js.Function2[/* err */ String | Null, /* entity */ js.UndefOr[Entity], Unit]
  /**
    * Callback used by {@link pc.SceneRegistry#loadSceneSettings}.
    * @param err - The error message in the case where the loading or parsing fails.
    */
  type LoadSettings = js.Function1[/* err */ String | Null, Unit]
  /**
    * Callback used by {@link pc.Mouse#enablePointerLock} and {@link pc.Application#disablePointerLock}.
    */
  type LockMouse = js.Function0[Unit]
  /**
    * Callback used by {@link pc.Application#preload} when all assets (marked as 'preload') are loaded.
    */
  type PreloadApp = js.Function0[Unit]
  /**
    * Callback used by {@link pc.ResourceHandler#load} when a resource is loaded (or an error occurs).
    * @param err - The error message in the case where the load fails.
    * @param [response] - The raw data that has been successfully loaded.
    */
  type ResourceHandler = js.Function2[/* err */ String | Null, /* response */ js.UndefOr[js.Any], Unit]
  /**
    * Callback used by {@link pc.ResourceLoader#load} when a resource is loaded (or an error occurs).
    * @param err - The error message in the case where the load fails.
    * @param [resource] - The resource that has been successfully loaded.
    */
  type ResourceLoader = js.Function2[/* err */ String | Null, /* resource */ js.UndefOr[js.Any], Unit]
  /**
    * Callback used by {@link pc.StandardMaterial#onUpdateShader}.
    * @param options - An object with shader generator settings (based on current material and scene properties), that you can change and then return.
    * Properties of the object passed into this function are documented in {@link pc.StandardMaterial#onUpdateShader}.
    */
  type UpdateShader = js.Function1[/* options */ js.Any, js.Any]
  /**
    * Callback used by {@link pc.CameraComponent#enterVr} and {@link pc.CameraComponent#exitVr}.
    * @param err - On success it is null on failure it is the error message.
    */
  type VrCamera = js.Function1[/* err */ String | Null, Unit]
  /**
    * Callback used by {@link pc.VrDisplay#requestPresent} and {@link pc.VrDisplay#exitPresent}.
    * @param err - The error message if presenting fails, or null if the call succeeds.
    */
  type VrDisplay = js.Function1[/* err */ String | Null, Unit]
  /**
    * Callback used by {@link pc.VrDisplay#requestAnimationFrame}.
    */
  type VrFrame = js.Function0[Unit]
  /**
    * Callback used by {@link pc.XrManager#endXr} and {@link pc.XrManager#startXr}.
    * @param err - The Error object or null if operation was successfull.
    */
  type XrError = js.Function1[/* err */ Error | Null, Unit]
  /**
    * Callback used by {@link pc.XrHitTest#start} and {@link pc.XrHitTest#startForInputSource}.
    * @param err - The Error object if failed to create hit test source or null.
    * @param hitTestSource - object that provides access to hit results against real world geometry.
    */
  type XrHitTestStart = js.Function2[/* err */ Error | Null, /* hitTestSource */ XrHitTestSource | Null, Unit]
}

