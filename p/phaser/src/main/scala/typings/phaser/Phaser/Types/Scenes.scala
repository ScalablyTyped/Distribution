package typings.phaser.Phaser.Types

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.Cameras.Scene2D.JSONCamera
import typings.phaser.Phaser.Types.Core.LoaderConfig
import typings.phaser.Phaser.Types.Core.PhysicsConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.PackFileSection
import typings.phaser.integer
import typings.phaser.phaserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Scenes {
  
  @js.native
  trait CreateSceneFromObjectConfig extends StObject {
    
    /**
      * The scene's create callback.
      */
    var create: js.UndefOr[SceneCreateCallback] = js.native
    
    /**
      * Any additional properties, which will be copied to the Scene after it's created (except `data` or `sys`).
      */
    var extend: js.UndefOr[js.Any] = js.native
    
    /**
      * Any values, which will be merged into the Scene's Data Manager store.
      */
    @JSName("extend.data")
    var extendDotdata: js.UndefOr[js.Any] = js.native
    
    /**
      * The scene's init callback.
      */
    var init: js.UndefOr[SceneInitCallback] = js.native
    
    /**
      * The scene's preload callback.
      */
    var preload: js.UndefOr[ScenePreloadCallback] = js.native
    
    /**
      * The scene's update callback. See {@link Phaser.Scene#update}.
      */
    var update: js.UndefOr[js.Function] = js.native
  }
  object CreateSceneFromObjectConfig {
    
    @scala.inline
    def apply(): CreateSceneFromObjectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSceneFromObjectConfig]
    }
    
    @scala.inline
    implicit class CreateSceneFromObjectConfigMutableBuilder[Self <: CreateSceneFromObjectConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: /* data */ js.Object => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setExtend(value: js.Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendDotdata(value: js.Any): Self = StObject.set(x, "extend.data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendDotdataUndefined: Self = StObject.set(x, "extend.data", js.undefined)
      
      @scala.inline
      def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
      
      @scala.inline
      def setInit(value: /* data */ js.Object => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setPreload(value: () => Unit): Self = StObject.set(x, "preload", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setUpdate(value: js.Function): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  /**
    * Can be defined on your own Scenes. Use it to create your game objects.
    * This method is called by the Scene Manager when the scene starts, after `init()` and `preload()`.
    * If the LoaderPlugin started after `preload()`, then this method is called only after loading is complete.
    */
  type SceneCreateCallback = js.Function1[/* data */ js.Object, Unit]
  
  /**
    * Can be defined on your own Scenes.
    * This method is called by the Scene Manager when the scene starts, before `preload()` and `create()`.
    */
  type SceneInitCallback = js.Function1[/* data */ js.Object, Unit]
  
  /**
    * Can be defined on your own Scenes. Use it to load assets.
    * This method is called by the Scene Manager, after `init()` and before `create()`, only if the Scene has a LoaderPlugin.
    * After this method completes, if the LoaderPlugin's queue isn't empty, the LoaderPlugin will start automatically.
    */
  type ScenePreloadCallback = js.Function0[Unit]
  
  @js.native
  trait SceneTransitionConfig extends StObject {
    
    /**
      * Will the Scenes Input system be able to process events while it is transitioning in or out?
      */
    var allowInput: js.UndefOr[Boolean] = js.native
    
    /**
      * An object containing any data you wish to be passed to the target scene's init / create methods (if sleep is false) or to the target scene's wake event callback (if sleep is true).
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /**
      * The duration, in ms, for the transition to last.
      */
    var duration: js.UndefOr[integer] = js.native
    
    /**
      * Move the target Scene to be above this one before the transition starts.
      */
    var moveAbove: js.UndefOr[Boolean] = js.native
    
    /**
      * Move the target Scene to be below this one before the transition starts.
      */
    var moveBelow: js.UndefOr[Boolean] = js.native
    
    /**
      * This callback is invoked every frame for the duration of the transition.
      */
    var onUpdate: js.UndefOr[js.Function] = js.native
    
    /**
      * The context in which the callback is invoked.
      */
    var onUpdateScope: js.UndefOr[js.Any] = js.native
    
    /**
      * Will the Scene responsible for the transition be removed from the Scene Manager after the transition completes?
      */
    var remove: js.UndefOr[Boolean] = js.native
    
    /**
      * Will the Scene responsible for the transition be sent to sleep on completion (`true`), or stopped? (`false`)
      */
    var sleep: js.UndefOr[Boolean] = js.native
    
    /**
      * The Scene key to transition to.
      */
    var target: String = js.native
  }
  object SceneTransitionConfig {
    
    @scala.inline
    def apply(target: String): SceneTransitionConfig = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[SceneTransitionConfig]
    }
    
    @scala.inline
    implicit class SceneTransitionConfigMutableBuilder[Self <: SceneTransitionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowInput(value: Boolean): Self = StObject.set(x, "allowInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowInputUndefined: Self = StObject.set(x, "allowInput", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDuration(value: integer): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setMoveAbove(value: Boolean): Self = StObject.set(x, "moveAbove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveAboveUndefined: Self = StObject.set(x, "moveAbove", js.undefined)
      
      @scala.inline
      def setMoveBelow(value: Boolean): Self = StObject.set(x, "moveBelow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveBelowUndefined: Self = StObject.set(x, "moveBelow", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: js.Function): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateScope(value: js.Any): Self = StObject.set(x, "onUpdateScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateScopeUndefined: Self = StObject.set(x, "onUpdateScope", js.undefined)
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setSleep(value: Boolean): Self = StObject.set(x, "sleep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSleepUndefined: Self = StObject.set(x, "sleep", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SettingsConfig extends StObject {
    
    /**
      * Does the Scene start as active or not? An active Scene updates each step.
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional Camera configuration object.
      */
    var cameras: js.UndefOr[JSONCamera | js.Array[JSONCamera]] = js.native
    
    /**
      * The unique key of this Scene. Must be unique within the entire Game instance.
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * The loader configuration object for the Scene.
      */
    var loader: js.UndefOr[LoaderConfig] = js.native
    
    /**
      * Overwrites the default injection map for a scene.
      */
    var map: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Extends the injection map for a scene.
      */
    var mapAdd: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Files to be loaded before the Scene begins.
      */
    var pack: js.UndefOr[`false` | PackFileSection] = js.native
    
    /**
      * The physics configuration object for the Scene.
      */
    var physics: js.UndefOr[PhysicsConfig] = js.native
    
    /**
      * The plugin configuration object for the Scene.
      */
    var plugins: js.UndefOr[`false` | js.Any] = js.native
    
    /**
      * Does the Scene start as visible or not? A visible Scene renders each step.
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object SettingsConfig {
    
    @scala.inline
    def apply(): SettingsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsConfig]
    }
    
    @scala.inline
    implicit class SettingsConfigMutableBuilder[Self <: SettingsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setCameras(value: JSONCamera | js.Array[JSONCamera]): Self = StObject.set(x, "cameras", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamerasUndefined: Self = StObject.set(x, "cameras", js.undefined)
      
      @scala.inline
      def setCamerasVarargs(value: JSONCamera*): Self = StObject.set(x, "cameras", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLoader(value: LoaderConfig): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      @scala.inline
      def setMap(value: StringDictionary[String]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapAdd(value: StringDictionary[String]): Self = StObject.set(x, "mapAdd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapAddUndefined: Self = StObject.set(x, "mapAdd", js.undefined)
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setPack(value: `false` | PackFileSection): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackUndefined: Self = StObject.set(x, "pack", js.undefined)
      
      @scala.inline
      def setPhysics(value: PhysicsConfig): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhysicsUndefined: Self = StObject.set(x, "physics", js.undefined)
      
      @scala.inline
      def setPlugins(value: `false` | js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait SettingsObject extends StObject {
    
    /**
      * The active state of this Scene. An active Scene updates each step.
      */
    var active: Boolean = js.native
    
    /**
      * The Camera configuration object.
      */
    var cameras: JSONCamera | js.Array[JSONCamera] = js.native
    
    /**
      * a data bundle passed to this Scene from the Scene Manager.
      */
    var data: js.Object = js.native
    
    /**
      * Has the Scene finished booting?
      */
    var isBooted: Boolean = js.native
    
    /**
      * Is the Scene in a state of transition?
      */
    var isTransition: Boolean = js.native
    
    /**
      * The unique key of this Scene. Unique within the entire Game instance.
      */
    var key: String = js.native
    
    /**
      * The loader configuration object for the Scene.
      */
    var loader: LoaderConfig = js.native
    
    /**
      * The Scene's Injection Map.
      */
    var map: StringDictionary[String] = js.native
    
    /**
      * Files to be loaded before the Scene begins.
      */
    var pack: `false` | PackFileSection = js.native
    
    /**
      * The physics configuration object for the Scene.
      */
    var physics: PhysicsConfig = js.native
    
    /**
      * The plugin configuration object for the Scene.
      */
    var plugins: `false` | js.Any = js.native
    
    /**
      * The current status of the Scene. Maps to the Scene constants.
      */
    var status: Double = js.native
    
    /**
      * Is this Scene allowed to receive input during transitions?
      */
    var transitionAllowInput: Boolean = js.native
    
    /**
      * The duration of the transition, if set.
      */
    var transitionDuration: integer = js.native
    
    /**
      * The Scene this Scene is transitioning from, if set.
      */
    var transitionFrom: Scene = js.native
    
    /**
      * The visible state of this Scene. A visible Scene renders each step.
      */
    var visible: Boolean = js.native
  }
  object SettingsObject {
    
    @scala.inline
    def apply(
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
      plugins: `false` | js.Any,
      status: Double,
      transitionAllowInput: Boolean,
      transitionDuration: integer,
      transitionFrom: Scene,
      visible: Boolean
    ): SettingsObject = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], cameras = cameras.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isBooted = isBooted.asInstanceOf[js.Any], isTransition = isTransition.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transitionAllowInput = transitionAllowInput.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], transitionFrom = transitionFrom.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingsObject]
    }
    
    @scala.inline
    implicit class SettingsObjectMutableBuilder[Self <: SettingsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCameras(value: JSONCamera | js.Array[JSONCamera]): Self = StObject.set(x, "cameras", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamerasVarargs(value: JSONCamera*): Self = StObject.set(x, "cameras", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBooted(value: Boolean): Self = StObject.set(x, "isBooted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTransition(value: Boolean): Self = StObject.set(x, "isTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoader(value: LoaderConfig): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: StringDictionary[String]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPack(value: `false` | PackFileSection): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhysics(value: PhysicsConfig): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugins(value: `false` | js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionAllowInput(value: Boolean): Self = StObject.set(x, "transitionAllowInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDuration(value: integer): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionFrom(value: Scene): Self = StObject.set(x, "transitionFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
