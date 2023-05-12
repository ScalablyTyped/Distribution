package typings.playcanvas.mod

import typings.playcanvas.anon.FboTime
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The lightmapper is used to bake scene lights into textures.
  */
@JSImport("playcanvas", "Lightmapper")
@js.native
open class Lightmapper protected () extends StObject {
  /**
    * Create a new Lightmapper instance.
    *
    * @param {import('../../platform/graphics/graphics-device.js').GraphicsDevice} device - The
    * graphics device used by the lightmapper.
    * @param {import('../entity.js').Entity} root - The root entity of the scene.
    * @param {import('../../scene/scene.js').Scene} scene - The scene to lightmap.
    * @param {import('../../scene/renderer/forward-renderer.js').ForwardRenderer} renderer - The
    * renderer.
    * @param {import('../asset/asset-registry.js').AssetRegistry} assets - Registry of assets to
    * lightmap.
    * @hideconstructor
    */
  def this(
    device: GraphicsDevice,
    root: Entity,
    scene: Scene_,
    renderer: ForwardRenderer,
    assets: AssetRegistry
  ) = this()
  
  var _initCalled: Boolean = js.native
  
  var _tempSet: Set[Any] = js.native
  
  def allocateTextures(bakeNodes: Any, passCount: Any): Unit = js.native
  
  var ambientAOMaterial: StandardMaterial = js.native
  
  var ambientLight: Color = js.native
  
  var assets: AssetRegistry = js.native
  
  def backupMaterials(meshInstances: Any): Unit = js.native
  
  /**
    * Generates and applies the lightmaps.
    *
    * @param {import('../entity.js').Entity[]|null} nodes - An array of entities (with model or
    * render components) to render lightmaps for. If not supplied, the entire scene will be baked.
    * @param {number} [mode] - Baking mode. Can be:
    *
    * - {@link BAKE_COLOR}: single color lightmap
    * - {@link BAKE_COLORDIR}: single color lightmap + dominant light direction (used for
    * bump/specular)
    *
    * Only lights with bakeDir=true will be used for generating the dominant light direction.
    * Defaults to {@link BAKE_COLORDIR}.
    */
  def bake(): Unit = js.native
  def bake(nodes: js.Array[Entity]): Unit = js.native
  def bake(nodes: js.Array[Entity], mode: Double): Unit = js.native
  def bake(nodes: Null, mode: Double): Unit = js.native
  
  def bakeInternal(passCount: Any, bakeNodes: Any, allNodes: Any): Unit = js.native
  
  var blackTex: Texture = js.native
  
  def calculateLightmapSize(node: Any): Double = js.native
  
  var camera: Camera = js.native
  
  def collectModels(node: Any, bakeNodes: Any, allNodes: Any): Unit = js.native
  
  def computeBounds(meshInstances: Any): BoundingBox = js.native
  
  def computeNodeBounds(meshInstances: Any): BoundingBox = js.native
  
  def computeNodesBounds(nodes: Any): Unit = js.native
  
  var constantBakeDir: Any = js.native
  
  def createMaterialForPass(device: Any, scene: Any, pass: Any, addAmbient: Any): StandardMaterial = js.native
  
  def createMaterials(device: Any, scene: Any, passCount: Any): Unit = js.native
  
  def createTexture(size: Any, name: Any): Texture = js.native
  
  def destroy(): Unit = js.native
  
  var device: GraphicsDevice = js.native
  
  def finishBake(bakeNodes: Any): Unit = js.native
  
  var fog: String = js.native
  
  def initBake(device: Any): Unit = js.native
  
  def lightCameraPrepare(device: Any, bakeLight: Any): Any = js.native
  
  def lightCameraPrepareAndCull(bakeLight: Any, bakeNode: Any, shadowCam: Any, casterBounds: Any): Boolean = js.native
  
  var lightingParams: LightingParams = js.native
  
  var lightmapFilters: LightmapFilters = js.native
  
  var materials: js.Array[Any] = js.native
  
  var passMaterials: js.Array[Any] = js.native
  
  def postprocessTextures(device: Any, bakeNodes: Any, passCount: Any): Unit = js.native
  
  def prepareLightsToBake(layerComposition: Any, allLights: Any, bakeLights: Any): Unit = js.native
  
  def prepareShadowCasters(nodes: Any): js.Array[Any] = js.native
  
  def renderShadowMap(shadowMapRendered: Any, casters: Any, bakeLight: Any): Boolean = js.native
  
  var renderTargets: Map[Any, Any] = js.native
  
  var renderer: ForwardRenderer = js.native
  
  def restoreLights(allLights: Any): Unit = js.native
  
  def restoreMaterials(meshInstances: Any): Unit = js.native
  
  def restoreScene(): Unit = js.native
  
  var revertStatic: Boolean = js.native
  
  var root: Entity = js.native
  
  var scene: Scene_ = js.native
  
  def setLightmapping(nodes: Any, value: Any, passCount: Any, shaderDefs: Any): Unit = js.native
  
  def setupLightArray(lightArray: Any, light: Any): Unit = js.native
  
  def setupScene(): Unit = js.native
  
  var shadowMapCache: ShadowMapCache = js.native
  
  var stats: FboTime = js.native
  
  def updateTransforms(nodes: Any): Unit = js.native
  
  var worldClusters: WorldClusters = js.native
}
