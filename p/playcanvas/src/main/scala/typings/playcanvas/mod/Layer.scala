package typings.playcanvas.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Layer represents a renderable subset of the scene. It can contain a list of mesh instances,
  * lights and cameras, their render settings and also defines custom callbacks before, after or
  * during rendering. Layers are organized inside {@link LayerComposition} in a desired order.
  */
@JSImport("playcanvas", "Layer")
@js.native
/**
  * Create a new Layer instance.
  *
  * @param {object} options - Object for passing optional arguments. These arguments are the
  * same as properties of the Layer.
  */
open class Layer () extends StObject {
  def this(options: js.Object) = this()
  
  /**
    * @param {MeshInstance[]} drawCalls - Array of mesh instances.
    * @param {number} drawCallsCount - Number of mesh instances.
    * @param {Vec3} camPos - Camera position.
    * @param {Vec3} camFwd - Camera forward vector.
    * @private
    */
  /* private */ var _calculateSortDistances: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _clearColorBuffer: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _clearDepthBuffer: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _clearStencilBuffer: Any = js.native
  
  /**
    * Set of light used by clustered lighting (omni and spot, but no directional).
    *
    * @type {Set<Light>}
    * @private
    */
  /* private */ var _clusteredLightsSet: Any = js.native
  
  var _dirty: Boolean = js.native
  
  var _dirtyCameras: Boolean = js.native
  
  var _dirtyLights: Boolean = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _enabled: Any = js.native
  
  var _forwardDrawCalls: Double = js.native
  
  /** @private */
  /* private */ var _generateLightHash: Any = js.native
  
  /**
    * @type {Float32Array}
    * @ignore
    */
  var _lightCube: js.typedarray.Float32Array = js.native
  
  var _lightHash: Double = js.native
  
  /**
    * @type {Light[]}
    * @private
    */
  /* private */ var _lights: Any = js.native
  
  /**
    * @type {Set<Light>}
    * @private
    */
  /* private */ var _lightsSet: Any = js.native
  
  var _needsStaticPrepare: Boolean = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _refCounter: Any = js.native
  
  /**
    * @type {RenderTarget}
    * @private
    */
  /* private */ var _renderTarget: Any = js.native
  
  var _renderTime: Double = js.native
  
  var _shaderVersion: Double = js.native
  
  var _shadowDrawCalls: Double = js.native
  
  var _skipRenderCounter: Double = js.native
  
  /**
    * @param {boolean} transparent - True if transparent sorting should be used.
    * @param {GraphNode} cameraNode - Graph node that the camera is attached to.
    * @param {number} cameraPass - Camera pass.
    * @ignore
    */
  def _sortVisible(transparent: Boolean, cameraNode: GraphNode, cameraPass: Double): Unit = js.native
  
  /**
    * Lights separated by light type.
    *
    * @type {Light[][]}
    * @ignore
    */
  var _splitLights: js.Array[js.Array[Light]] = js.native
  
  var _staticLightHash: Double = js.native
  
  var _staticPrepareDone: Boolean = js.native
  
  /**
    * Adds a camera to this layer.
    *
    * @param {CameraComponent} camera - A {@link CameraComponent}.
    */
  def addCamera(camera: CameraComponent): Unit = js.native
  
  /**
    * Adds a light to this layer.
    *
    * @param {LightComponent} light - A {@link LightComponent}.
    */
  def addLight(light: LightComponent): Unit = js.native
  
  /**
    * Adds an array of mesh instances to this layer.
    *1
    *
    * @param {MeshInstance[]} meshInstances - Array of {@link MeshInstance}.
    * @param {boolean} [skipShadowCasters] - Set it to true if you don't want these mesh instances
    * to cast shadows in this layer.
    */
  def addMeshInstances(meshInstances: js.Array[MeshInstance]): Unit = js.native
  def addMeshInstances(meshInstances: js.Array[MeshInstance], skipShadowCasters: Boolean): Unit = js.native
  
  /**
    * Adds an array of mesh instances to this layer, but only as shadow casters (they will not be
    * rendered anywhere, but only cast shadows on other objects).
    *
    * @param {MeshInstance[]} meshInstances - Array of {@link MeshInstance}.
    */
  def addShadowCasters(meshInstances: js.Array[MeshInstance]): Unit = js.native
  
  /**
    * @type {CameraComponent[]}
    * @ignore
    */
  var cameras: js.Array[CameraComponent] = js.native
  
  /**
    * Removes all cameras from this layer.
    */
  def clearCameras(): Unit = js.native
  
  def clearColorBuffer: Boolean = js.native
  /**
    * If true, the camera will clear the color buffer when it renders this layer.
    *
    * @type {boolean}
    */
  def clearColorBuffer_=(arg: Boolean): Unit = js.native
  
  def clearDepthBuffer: Boolean = js.native
  /**
    * If true, the camera will clear the depth buffer when it renders this layer.
    *
    * @type {boolean}
    */
  def clearDepthBuffer_=(arg: Boolean): Unit = js.native
  
  /**
    * Removes all lights from this layer.
    */
  def clearLights(): Unit = js.native
  
  /**
    * Removes all mesh instances from this layer.
    *
    * @param {boolean} [skipShadowCasters] - Set it to true if you want to still cast shadows from
    * removed mesh instances or if they never did cast shadows before.
    */
  def clearMeshInstances(): Unit = js.native
  def clearMeshInstances(skipShadowCasters: Boolean): Unit = js.native
  
  def clearStencilBuffer: Boolean = js.native
  /**
    * If true, the camera will clear the stencil buffer when it renders this layer.
    *
    * @type {boolean}
    */
  def clearStencilBuffer_=(arg: Boolean): Unit = js.native
  
  /**
    * Returns lights used by clustered lighting in a set.
    *
    * @type {Set<Light>}
    * @ignore
    */
  def clusteredLightsSet: Set[Light] = js.native
  
  /**
    * Visibility bit mask that interacts with {@link MeshInstance#mask}. Especially useful
    * when combined with layerReference, allowing for the filtering of some objects, while
    * sharing their list and culling.
    *
    * @type {number}
    */
  var cullingMask: Double = js.native
  
  /**
    * @type {Function|null}
    * @ignore
    */
  var customCalculateSortValues: js.Function | Null = js.native
  
  /**
    * @type {Function|null}
    * @ignore
    */
  var customSortCallback: js.Function | Null = js.native
  
  /**
    * Decrements the usage counter of this layer. Decrementing the counter from 1 to 0 will
    * disable the layer and call {@link Layer.onDisable}. See {@link Layer#incrementCounter} for
    * more details.
    *
    * @ignore
    */
  def decrementCounter(): Unit = js.native
  
  def enabled: Boolean = js.native
  /**
    * Enable the layer. Disabled layers are skipped. Defaults to true.
    *
    * @type {boolean}
    */
  def enabled_=(arg: Boolean): Unit = js.native
  
  /**
    * True if the layer contains omni or spot lights
    *
    * @type {boolean}
    * @ignore
    */
  def hasClusteredLights: Boolean = js.native
  
  /**
    * A unique ID of the layer. Layer IDs are stored inside {@link ModelComponent#layers},
    * {@link RenderComponent#layers}, {@link CameraComponent#layers},
    * {@link LightComponent#layers} and {@link ElementComponent#layers} instead of names.
    * Can be used in {@link LayerComposition#getLayerById}.
    *
    * @type {number}
    */
  var id: Double = js.native
  
  /**
    * Increments the usage counter of this layer. By default, layers are created with counter set
    * to 1 (if {@link Layer.enabled} is true) or 0 (if it was false). Incrementing the counter
    * from 0 to 1 will enable the layer and call {@link Layer.onEnable}. Use this function to
    * "subscribe" multiple effects to the same layer. For example, if the layer is used to render
    * a reflection texture which is used by 2 mirrors, then each mirror can call this function
    * when visible and {@link Layer.decrementCounter} if invisible. In such case the reflection
    * texture won't be updated, when there is nothing to use it, saving performance.
    *
    * @ignore
    */
  def incrementCounter(): Unit = js.native
  
  /**
    * @type {InstanceList}
    * @ignore
    */
  var instances: InstanceList = js.native
  
  /**
    * Make this layer render the same mesh instances that another layer does instead of having
    * its own mesh instance list. Both layers must share cameras. Frustum culling is only
    * performed for one layer. Useful for rendering multiple passes using different shaders.
    *
    * @type {Layer}
    */
  var layerReference: Layer = js.native
  
  /**
    * Name of the layer. Can be used in {@link LayerComposition#getLayerByName}.
    *
    * @type {string}
    */
  var name: String = js.native
  
  /**
    * Custom function that is called after the layer has been disabled. This happens when:
    *
    * - {@link Layer#enabled} was changed from true to false
    * - {@link Layer#decrementCounter} was called and set the counter to zero.
    *
    * @type {Function}
    */
  var onDisable: js.Function = js.native
  
  /**
    * Custom function that is called before every mesh instance in this layer is rendered. It
    * is not recommended to set this function when rendering many objects every frame due to
    * performance reasons.
    *
    * @type {Function}
    */
  var onDrawCall: js.Function = js.native
  
  /**
    * Custom function that is called after the layer has been enabled. This happens when:
    *
    * - The layer is created with {@link Layer#enabled} set to true (which is the default value).
    * - {@link Layer#enabled} was changed from false to true
    * - {@link Layer#incrementCounter} was called and incremented the counter above zero.
    *
    * Useful for allocating resources this layer will use (e.g. creating render targets).
    *
    * @type {Function}
    */
  var onEnable: js.Function = js.native
  
  /**
    * Custom function that is called after visibility culling is performed for this layer.
    * Useful for reverting changes done in {@link Layer#onPreCull} and determining final mesh
    * instance visibility (see {@link MeshInstance#visibleThisFrame}). This function will
    * receive camera index as the only argument. You can get the actual camera being used by
    * looking up {@link LayerComposition#cameras} with this index.
    *
    * @type {Function}
    */
  var onPostCull: js.Function = js.native
  
  /**
    * Custom function that is called after this layer is rendered. Useful to revert changes
    * made in {@link Layer#onPreRender}. This function is called after the last occurrence of this
    * layer in {@link LayerComposition}. It will receive camera index as the only argument.
    * You can get the actual camera being used by looking up {@link LayerComposition#cameras}
    * with this index.
    *
    * @type {Function}
    */
  var onPostRender: js.Function = js.native
  
  /**
    * Custom function that is called after opaque mesh instances (not semi-transparent) in
    * this layer are rendered. This function will receive camera index as the only argument.
    * You can get the actual camera being used by looking up {@link LayerComposition#cameras}
    * with this index.
    *
    * @type {Function}
    */
  var onPostRenderOpaque: js.Function = js.native
  
  /**
    * Custom function that is called after semi-transparent mesh instances in this layer are
    * rendered. This function will receive camera index as the only argument. You can get the
    * actual camera being used by looking up {@link LayerComposition#cameras} with this index.
    *
    * @type {Function}
    */
  var onPostRenderTransparent: js.Function = js.native
  
  /**
    * Custom function that is called before visibility culling is performed for this layer.
    * Useful, for example, if you want to modify camera projection while still using the same
    * camera and make frustum culling work correctly with it (see
    * {@link CameraComponent#calculateTransform} and {@link CameraComponent#calculateProjection}).
    * This function will receive camera index as the only argument. You can get the actual
    * camera being used by looking up {@link LayerComposition#cameras} with this index.
    *
    * @type {Function}
    */
  var onPreCull: js.Function = js.native
  
  /**
    * Custom function that is called before this layer is rendered. Useful, for example, for
    * reacting on screen size changes. This function is called before the first occurrence of
    * this layer in {@link LayerComposition}. It will receive camera index as the only
    * argument. You can get the actual camera being used by looking up
    * {@link LayerComposition#cameras} with this index.
    *
    * @type {Function}
    */
  var onPreRender: js.Function = js.native
  
  /**
    * Custom function that is called before opaque mesh instances (not semi-transparent) in
    * this layer are rendered. This function will receive camera index as the only argument.
    * You can get the actual camera being used by looking up {@link LayerComposition#cameras}
    * with this index.
    *
    * @type {Function}
    */
  var onPreRenderOpaque: js.Function = js.native
  
  /**
    * Custom function that is called before semi-transparent mesh instances in this layer are
    * rendered. This function will receive camera index as the only argument. You can get the
    * actual camera being used by looking up {@link LayerComposition#cameras} with this index.
    *
    * @type {Function}
    */
  var onPreRenderTransparent: js.Function = js.native
  
  /**
    * @type {MeshInstance[]}
    * @ignore
    */
  var opaqueMeshInstances: js.Array[MeshInstance] = js.native
  
  /**
    * Defines the method used for sorting opaque (that is, not semi-transparent) mesh
    * instances before rendering. Can be:
    *
    * - {@link SORTMODE_NONE}
    * - {@link SORTMODE_MANUAL}
    * - {@link SORTMODE_MATERIALMESH}
    * - {@link SORTMODE_BACK2FRONT}
    * - {@link SORTMODE_FRONT2BACK}
    *
    * Defaults to {@link SORTMODE_MATERIALMESH}.
    *
    * @type {number}
    */
  var opaqueSortMode: Double = js.native
  
  /**
    * Tells that this layer is simple and needs to just render a bunch of mesh instances
    * without lighting, skinning and morphing (faster). Used for UI and Gizmo layers (the
    * layer doesn't use lights, shadows, culling, etc).
    *
    * @type {boolean}
    */
  var passThrough: Boolean = js.native
  
  /**
    * Removes a camera from this layer.
    *
    * @param {CameraComponent} camera - A {@link CameraComponent}.
    */
  def removeCamera(camera: CameraComponent): Unit = js.native
  
  /**
    * Removes a light from this layer.
    *
    * @param {LightComponent} light - A {@link LightComponent}.
    */
  def removeLight(light: LightComponent): Unit = js.native
  
  /**
    * Internal function to remove a mesh instance from an array.
    *
    * @param {MeshInstance} m - Mesh instance to remove.
    * @param {MeshInstance[]} arr - Array of mesh instances to remove from.
    * @private
    */
  /* private */ var removeMeshInstanceFromArray: Any = js.native
  
  /**
    * Removes multiple mesh instances from this layer.
    *
    * @param {MeshInstance[]} meshInstances - Array of {@link MeshInstance}. If they were added to
    * this layer, they will be removed.
    * @param {boolean} [skipShadowCasters] - Set it to true if you want to still cast shadows from
    * removed mesh instances or if they never did cast shadows before.
    */
  def removeMeshInstances(meshInstances: js.Array[MeshInstance]): Unit = js.native
  def removeMeshInstances(meshInstances: js.Array[MeshInstance], skipShadowCasters: Boolean): Unit = js.native
  
  /**
    * Removes multiple mesh instances from the shadow casters list of this layer, meaning they
    * will stop casting shadows.
    *
    * @param {MeshInstance[]} meshInstances - Array of {@link MeshInstance}. If they were added to
    * this layer, they will be removed.
    */
  def removeShadowCasters(meshInstances: js.Array[MeshInstance]): Unit = js.native
  
  def renderTarget: RenderTarget = js.native
  /**
    * @type {RenderTarget}
    * @ignore
    */
  def renderTarget_=(arg: RenderTarget): Unit = js.native
  
  /**
    * A type of shader to use during rendering. Possible values are:
    *
    * - {@link SHADER_FORWARD}
    * - {@link SHADER_FORWARDHDR}
    * - {@link SHADER_DEPTH}
    * - Your own custom value. Should be in 19 - 31 range. Use {@link StandardMaterial#onUpdateShader}
    * to apply shader modifications based on this value.
    *
    * Defaults to {@link SHADER_FORWARD}.
    *
    * @type {number}
    */
  var shaderPass: Double = js.native
  
  /**
    * @type {MeshInstance[]}
    * @ignore
    */
  var shadowCasters: js.Array[MeshInstance] = js.native
  
  var skipRenderAfter: Double = js.native
  
  /**
    * @type {MeshInstance[]}
    * @ignore
    */
  var transparentMeshInstances: js.Array[MeshInstance] = js.native
  
  /**
    * Defines the method used for sorting semi-transparent mesh instances before rendering. Can be:
    *
    * - {@link SORTMODE_NONE}
    * - {@link SORTMODE_MANUAL}
    * - {@link SORTMODE_MATERIALMESH}
    * - {@link SORTMODE_BACK2FRONT}
    * - {@link SORTMODE_FRONT2BACK}
    *
    * Defaults to {@link SORTMODE_BACK2FRONT}.
    *
    * @type {number}
    */
  var transparentSortMode: Double = js.native
}
