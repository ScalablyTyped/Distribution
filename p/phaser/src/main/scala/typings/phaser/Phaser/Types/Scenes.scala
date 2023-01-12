package typings.phaser.Phaser.Types

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.Cameras.Scene2D.JSONCamera
import typings.phaser.Phaser.Types.Core.LoaderConfig
import typings.phaser.Phaser.Types.Core.PhysicsConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.PackFileSection
import typings.phaser.phaserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Scenes {
  
  trait CreateSceneFromObjectConfig extends StObject {
    
    /**
      * The scene's create callback.
      */
    var create: js.UndefOr[SceneCreateCallback] = js.undefined
    
    /**
      * Any additional properties, which will be copied to the Scene after it's created (except `data` or `sys`).
      */
    var extend: js.UndefOr[Any] = js.undefined
    
    /**
      * Any values, which will be merged into the Scene's Data Manager store.
      */
    @JSName("extend.data")
    var extendDotdata: js.UndefOr[Any] = js.undefined
    
    /**
      * The scene's init callback.
      */
    var init: js.UndefOr[SceneInitCallback] = js.undefined
    
    /**
      * The scene's preload callback.
      */
    var preload: js.UndefOr[ScenePreloadCallback] = js.undefined
    
    /**
      * The scene's update callback. See {@link Phaser.Scene#update}.
      */
    var update: js.UndefOr[SceneUpdateCallback] = js.undefined
  }
  object CreateSceneFromObjectConfig {
    
    inline def apply(): CreateSceneFromObjectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSceneFromObjectConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateSceneFromObjectConfig] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: SceneCreateCallback): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setExtend(value: Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      inline def setExtendDotdata(value: Any): Self = StObject.set(x, "extend.data", value.asInstanceOf[js.Any])
      
      inline def setExtendDotdataUndefined: Self = StObject.set(x, "extend.data", js.undefined)
      
      inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
      
      inline def setInit(value: SceneInitCallback): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setPreload(value: ScenePreloadCallback): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setUpdate(value: SceneUpdateCallback): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  /**
    * Can be defined on your own Scenes. Use it to create your game objects.
    * This method is called by the Scene Manager when the scene starts, after `init()` and `preload()`.
    * If the LoaderPlugin started after `preload()`, then this method is called only after loading is complete.
    */
  type SceneCreateCallback = js.ThisFunction1[/* this */ Scene, /* data */ js.Object, Unit]
  
  /**
    * Can be defined on your own Scenes.
    * This method is called by the Scene Manager when the scene starts, before `preload()` and `create()`.
    */
  type SceneInitCallback = js.ThisFunction1[/* this */ Scene, /* data */ js.Object, Unit]
  
  /**
    * Can be defined on your own Scenes. Use it to load assets.
    * This method is called by the Scene Manager, after `init()` and before `create()`, only if the Scene has a LoaderPlugin.
    * After this method completes, if the LoaderPlugin's queue isn't empty, the LoaderPlugin will start automatically.
    */
  type ScenePreloadCallback = js.ThisFunction0[/* this */ Scene, Unit]
  
  trait SceneTransitionConfig extends StObject {
    
    /**
      * Will the Scenes Input system be able to process events while it is transitioning in or out?
      */
    var allowInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An object containing any data you wish to be passed to the target scene's init / create methods (if sleep is false) or to the target scene's wake event callback (if sleep is true).
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * The duration, in ms, for the transition to last.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Move the target Scene to be above this one before the transition starts.
      */
    var moveAbove: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Move the target Scene to be below this one before the transition starts.
      */
    var moveBelow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This callback is invoked every frame for the duration of the transition.
      */
    var onUpdate: js.UndefOr[js.Function] = js.undefined
    
    /**
      * The context in which the callback is invoked.
      */
    var onUpdateScope: js.UndefOr[Any] = js.undefined
    
    /**
      * Will the Scene responsible for the transition be removed from the Scene Manager after the transition completes?
      */
    var remove: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Will the Scene responsible for the transition be sent to sleep on completion (`true`), or stopped? (`false`)
      */
    var sleep: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The Scene key to transition to.
      */
    var target: String
  }
  object SceneTransitionConfig {
    
    inline def apply(target: String): SceneTransitionConfig = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneTransitionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SceneTransitionConfig] (val x: Self) extends AnyVal {
      
      inline def setAllowInput(value: Boolean): Self = StObject.set(x, "allowInput", value.asInstanceOf[js.Any])
      
      inline def setAllowInputUndefined: Self = StObject.set(x, "allowInput", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMoveAbove(value: Boolean): Self = StObject.set(x, "moveAbove", value.asInstanceOf[js.Any])
      
      inline def setMoveAboveUndefined: Self = StObject.set(x, "moveAbove", js.undefined)
      
      inline def setMoveBelow(value: Boolean): Self = StObject.set(x, "moveBelow", value.asInstanceOf[js.Any])
      
      inline def setMoveBelowUndefined: Self = StObject.set(x, "moveBelow", js.undefined)
      
      inline def setOnUpdate(value: js.Function): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnUpdateScope(value: Any): Self = StObject.set(x, "onUpdateScope", value.asInstanceOf[js.Any])
      
      inline def setOnUpdateScopeUndefined: Self = StObject.set(x, "onUpdateScope", js.undefined)
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setSleep(value: Boolean): Self = StObject.set(x, "sleep", value.asInstanceOf[js.Any])
      
      inline def setSleepUndefined: Self = StObject.set(x, "sleep", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type SceneUpdateCallback = js.ThisFunction0[/* this */ Scene, Unit]
  
  trait SettingsConfig extends StObject {
    
    /**
      * Does the Scene start as active or not? An active Scene updates each step.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional Camera configuration object.
      */
    var cameras: js.UndefOr[JSONCamera | js.Array[JSONCamera]] = js.undefined
    
    /**
      * The unique key of this Scene. Must be unique within the entire Game instance.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * The loader configuration object for the Scene.
      */
    var loader: js.UndefOr[LoaderConfig] = js.undefined
    
    /**
      * Overwrites the default injection map for a scene.
      */
    var map: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Extends the injection map for a scene.
      */
    var mapAdd: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Files to be loaded before the Scene begins.
      */
    var pack: js.UndefOr[`false` | PackFileSection] = js.undefined
    
    /**
      * The physics configuration object for the Scene.
      */
    var physics: js.UndefOr[PhysicsConfig] = js.undefined
    
    /**
      * The plugin configuration object for the Scene.
      */
    var plugins: js.UndefOr[`false` | Any] = js.undefined
    
    /**
      * Does the Scene start as visible or not? A visible Scene renders each step.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object SettingsConfig {
    
    inline def apply(): SettingsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SettingsConfig] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setCameras(value: JSONCamera | js.Array[JSONCamera]): Self = StObject.set(x, "cameras", value.asInstanceOf[js.Any])
      
      inline def setCamerasUndefined: Self = StObject.set(x, "cameras", js.undefined)
      
      inline def setCamerasVarargs(value: JSONCamera*): Self = StObject.set(x, "cameras", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLoader(value: LoaderConfig): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setMap(value: StringDictionary[String]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapAdd(value: StringDictionary[String]): Self = StObject.set(x, "mapAdd", value.asInstanceOf[js.Any])
      
      inline def setMapAddUndefined: Self = StObject.set(x, "mapAdd", js.undefined)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPack(value: `false` | PackFileSection): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      inline def setPackUndefined: Self = StObject.set(x, "pack", js.undefined)
      
      inline def setPhysics(value: PhysicsConfig): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
      
      inline def setPhysicsUndefined: Self = StObject.set(x, "physics", js.undefined)
      
      inline def setPlugins(value: `false` | Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait SettingsObject extends StObject {
    
    /**
      * The active state of this Scene. An active Scene updates each step.
      */
    var active: Boolean
    
    /**
      * The Camera configuration object.
      */
    var cameras: JSONCamera | js.Array[JSONCamera]
    
    /**
      * a data bundle passed to this Scene from the Scene Manager.
      */
    var data: js.Object
    
    /**
      * Has the Scene finished booting?
      */
    var isBooted: Boolean
    
    /**
      * Is the Scene in a state of transition?
      */
    var isTransition: Boolean
    
    /**
      * The unique key of this Scene. Unique within the entire Game instance.
      */
    var key: String
    
    /**
      * The loader configuration object for the Scene.
      */
    var loader: LoaderConfig
    
    /**
      * The Scene's Injection Map.
      */
    var map: StringDictionary[String]
    
    /**
      * Files to be loaded before the Scene begins.
      */
    var pack: `false` | PackFileSection
    
    /**
      * The physics configuration object for the Scene.
      */
    var physics: PhysicsConfig
    
    /**
      * The plugin configuration object for the Scene.
      */
    var plugins: `false` | Any
    
    /**
      * The current status of the Scene. Maps to the Scene constants.
      */
    var status: Double
    
    /**
      * Is this Scene allowed to receive input during transitions?
      */
    var transitionAllowInput: Boolean
    
    /**
      * The duration of the transition, if set.
      */
    var transitionDuration: Double
    
    /**
      * The Scene this Scene is transitioning from, if set.
      */
    var transitionFrom: Scene
    
    /**
      * The visible state of this Scene. A visible Scene renders each step.
      */
    var visible: Boolean
  }
  object SettingsObject {
    
    inline def apply(
      active: Boolean,
      cameras: JSONCamera | js.Array[JSONCamera],
      data: js.Object,
      isBooted: Boolean,
      isTransition: Boolean,
      key: String,
      loader: LoaderConfig,
      map: StringDictionary[String],
      pack: `false` | PackFileSection,
      physics: PhysicsConfig,
      plugins: `false` | Any,
      status: Double,
      transitionAllowInput: Boolean,
      transitionDuration: Double,
      transitionFrom: Scene,
      visible: Boolean
    ): SettingsObject = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], cameras = cameras.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isBooted = isBooted.asInstanceOf[js.Any], isTransition = isTransition.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transitionAllowInput = transitionAllowInput.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionFrom = transitionFrom.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SettingsObject] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCameras(value: JSONCamera | js.Array[JSONCamera]): Self = StObject.set(x, "cameras", value.asInstanceOf[js.Any])
      
      inline def setCamerasVarargs(value: JSONCamera*): Self = StObject.set(x, "cameras", js.Array(value*))
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIsBooted(value: Boolean): Self = StObject.set(x, "isBooted", value.asInstanceOf[js.Any])
      
      inline def setIsTransition(value: Boolean): Self = StObject.set(x, "isTransition", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLoader(value: LoaderConfig): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setMap(value: StringDictionary[String]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setPack(value: `false` | PackFileSection): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      inline def setPhysics(value: PhysicsConfig): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: `false` | Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTransitionAllowInput(value: Boolean): Self = StObject.set(x, "transitionAllowInput", value.asInstanceOf[js.Any])
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionFrom(value: Scene): Self = StObject.set(x, "transitionFrom", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
