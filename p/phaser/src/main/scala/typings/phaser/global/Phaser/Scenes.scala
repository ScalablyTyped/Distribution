package typings.phaser.global.Phaser

import typings.phaser.Phaser.Types.Scenes.SettingsConfig
import typings.phaser.Phaser.Types.Scenes.SettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Scenes {
  
  @JSGlobal("Phaser.Scenes")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Scene state.
    */
  @JSGlobal("Phaser.Scenes.CREATING")
  @js.native
  def CREATING: Double = js.native
  inline def CREATING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATING")(x.asInstanceOf[js.Any])
  
  /**
    * Scene state.
    */
  @JSGlobal("Phaser.Scenes.DESTROYED")
  @js.native
  def DESTROYED: Double = js.native
  inline def DESTROYED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DESTROYED")(x.asInstanceOf[js.Any])
  
  object Events {
    
    /**
      * The Game Object Added to Scene Event.
      * 
      * This event is dispatched when a Game Object is added to a Scene.
      * 
      * Listen for it from a Scene using `this.events.on('addedtoscene', listener)`.
      */
    @JSGlobal("Phaser.Scenes.Events.ADDED_TO_SCENE")
    @js.native
    val ADDED_TO_SCENE: Any = js.native
    
    /**
      * The Scene Systems Boot Event.
      * 
      * This event is dispatched by a Scene during the Scene Systems boot process. Primarily used by Scene Plugins.
      * 
      * Listen to it from a Scene using `this.events.on('boot', listener)`.
      */
    @JSGlobal("Phaser.Scenes.Events.BOOT")
    @js.native
    val BOOT: Any = js.native
    
    /**
      * The Scene Create Event.
      * 
      * This event is dispatched by a Scene after it has been created by the Scene Manager.
      * 
      * If a Scene has a `create` method then this event is emitted _after_ that has run.
      * 
      * If there is a transition, this event will be fired after the `TRANSITION_START` event.
      * 
      * Listen to it from a Scene using `this.events.on('create', listener)`.
      */
    @JSGlobal("Phaser.Scenes.Events.CREATE")
    @js.native
    val CREATE: Any = js.native
    
    /**
      * The Scene Systems Destroy Event.
      * 
      * This event is dispatched by a Scene during the Scene Systems destroy process.
      * 
      * Listen to it from a Scene using `this.events.on('destroy', listener)`.
      * 
      * You should destroy any resources that may be in use by your Scene in this event handler.
      */
    @JSGlobal("Phaser.Scenes.Events.DESTROY")
    @js.native
    val DESTROY: Any = js.native
    
    /**
      * The Scene Systems Pause Event.
      * 
      * This event is dispatched by a Scene when it is paused, either directly via the `pause` method, or as an
      * action from another Scene.
      * 
      * Listen to it from a Scene using `this.events.on('pause', listener)`.
      */
    @JSGlobal("Phaser.Scenes.Events.PAUSE")
    @js.native
    val PAUSE: Any = js.native
    
    /**
      * The Scene Systems Post Update Event.
      * 
      * This event is dispatched by a Scene during the main game loop step.
      * 
      * The event flow for a single step of a Scene is as follows:
      * 
      * 1. [PRE_UPDATE]{@linkcode Phaser.Scenes.Events#event:PRE_UPDATE}
      * 2. [UPDATE]{@linkcode Phaser.Scenes.Events#event:UPDATE}
      * 3. The `Scene.update` method is called, if it exists
      * 4. [POST_UPDATE]{@linkcode Phaser.Scenes.Events#event:POST_UPDATE}
      * 5. [PRE_RENDER]{@linkcode Phaser.Scenes.Events#event:PRE_RENDER}
      * 6. [RENDER]{@linkcode Phaser.Scenes.Events#event:RENDER}
      * 
      * Listen to it from a Scene using `this.events.on('postupdate', listener)`.
      * 
      * A Scene will only run its step if it is active.
      */
    @JSGlobal("Phaser.Scenes.Events.POST_UPDATE")
    @js.native
    val POST_UPDATE: Any = js.native
    
    /**
      * The Scene Systems Pre-Render Event.
      * 
      * This event is dispatched by a Scene during the main game loop step.
      * 
      * The event flow for a single step of a Scene is as follows:
      * 
      * 1. [PRE_UPDATE]{@linkcode Phaser.Scenes.Events#event:PRE_UPDATE}
      * 2. [UPDATE]{@linkcode Phaser.Scenes.Events#event:UPDATE}
      * 3. The `Scene.update` method is called, if it exists
      * 4. [POST_UPDATE]{@linkcode Phaser.Scenes.Events#event:POST_UPDATE}
      * 5. [PRE_RENDER]{@linkcode Phaser.Scenes.Events#event:PRE_RENDER}
      * 6. [RENDER]{@linkcode Phaser.Scenes.Events#event:RENDER}
      * 
      * Listen to this event from a Scene using `this.events.on('prerender', listener)`.
      * 
      * A Scene will only render if it is visible.
      * 
      * This event is dispatched after the Scene Display List is sorted and before the Scene is rendered.
      */
    @JSGlobal("Phaser.Scenes.Events.PRE_RENDER")
    @js.native
    val PRE_RENDER: Any = js.native
    
    /**
      * The Scene Systems Pre Update Event.
      * 
      * This event is dispatched by a Scene during the main game loop step.
      * 
      * The event flow for a single step of a Scene is as follows:
      * 
      * 1. [PRE_UPDATE]{@linkcode Phaser.Scenes.Events#event:PRE_UPDATE}
      * 2. [UPDATE]{@linkcode Phaser.Scenes.Events#event:UPDATE}
      * 3. The `Scene.update` method is called, if it exists
      * 4. [POST_UPDATE]{@linkcode Phaser.Scenes.Events#event:POST_UPDATE}
      * 5. [PRE_RENDER]{@linkcode Phaser.Scenes.Events#event:PRE_RENDER}
      * 6. [RENDER]{@linkcode Phaser.Scenes.Events#event:RENDER}
      * 
      * Listen to it from a Scene using `this.events.on('preupdate', listener)`.
      * 
      * A Scene will only run its step if it is active.
      */
    @JSGlobal("Phaser.Scenes.Events.PRE_UPDATE")
    @js.native
    val PRE_UPDATE: Any = js.native
    
    /**
      * The Scene Systems Ready Event.
      * 
      * This event is dispatched by a Scene during the Scene Systems start process.
      * By this point in the process the Scene is now fully active and rendering.
      * This event is meant for your game code to use, as all plugins have responded to the earlier 'start' event.
      * 
      * Listen to it from a Scene using `this.events.on('ready', listener)`.
      */
    @JSGlobal("Phaser.Scenes.Events.READY")
    @js.native
    val READY: Any = js.native
    
    /**
      * The Game Object Removed from Scene Event.
      * 
      * This event is dispatched when a Game Object is removed from a Scene.
      * 
      * Listen for it from a Scene using `this.events.on('removedfromscene', listener)`.
      */
    @JSGlobal("Phaser.Scenes.Events.REMOVED_FROM_SCENE")
    @js.native
    val REMOVED_FROM_SCENE: Any = js.native
    
    /**
      * The Scene Systems Render Event.
      * 
      * This event is dispatched by a Scene during the main game loop step.
      * 
      * The event flow for a single step of a Scene is as follows:
      * 
      * 1. [PRE_UPDATE]{@linkcode Phaser.Scenes.Events#event:PRE_UPDATE}
      * 2. [UPDATE]{@linkcode Phaser.Scenes.Events#event:UPDATE}
      * 3. The `Scene.update` method is called, if it exists
      * 4. [POST_UPDATE]{@linkcode Phaser.Scenes.Events#event:POST_UPDATE}
      * 5. [PRE_RENDER]{@linkcode Phaser.Scenes.Events#event:PRE_RENDER}
      * 6. [RENDER]{@linkcode Phaser.Scenes.Events#event:RENDER}
      * 
      * Listen to it from a Scene using `this.events.on('render', listener)`.
      * 
      * A Scene will only render if it is visible.
      * 
      * By the time this event is dispatched, the Scene will have already been rendered.
      */
    @JSGlobal("Phaser.Scenes.Events.RENDER")
    @js.native
    val RENDER: Any = js.native
    
    /**
      * The Scene Systems Resume Event.
      * 
      * This event is dispatched by a Scene when it is resumed from a paused state, either directly via the `resume` method,
      * or as an action from another Scene.
      * 
      * Listen to it from a Scene using `this.events.on('resume', listener)`.
      */
    @JSGlobal("Phaser.Scenes.Events.RESUME")
    @js.native
    val RESUME: Any = js.native
    
    /**
      * The Scene Systems Shutdown Event.
      * 
      * This event is dispatched by a Scene during the Scene Systems shutdown process.
      * 
      * Listen to it from a Scene using `this.events.on('shutdown', listener)`.
      * 
      * You should free-up any resources that may be in use by your Scene in this event handler, on the understanding
      * that the Scene may, at any time, become active again. A shutdown Scene is not 'destroyed', it's simply not
      * currently active. Use the [DESTROY]{@linkcode Phaser.Scenes.Events#event:DESTROY} event to completely clear resources.
      */
    @JSGlobal("Phaser.Scenes.Events.SHUTDOWN")
    @js.native
    val SHUTDOWN: Any = js.native
    
    /**
      * The Scene Systems Sleep Event.
      * 
      * This event is dispatched by a Scene when it is sent to sleep, either directly via the `sleep` method,
      * or as an action from another Scene.
      * 
      * Listen to it from a Scene using `this.events.on('sleep', listener)`.
      */
    @JSGlobal("Phaser.Scenes.Events.SLEEP")
    @js.native
    val SLEEP: Any = js.native
    
    /**
      * The Scene Systems Start Event.
      * 
      * This event is dispatched by a Scene during the Scene Systems start process. Primarily used by Scene Plugins.
      * 
      * Listen to it from a Scene using `this.events.on('start', listener)`.
      */
    @JSGlobal("Phaser.Scenes.Events.START")
    @js.native
    val START: Any = js.native
    
    /**
      * The Scene Transition Complete Event.
      * 
      * This event is dispatched by the Target Scene of a transition.
      * 
      * It happens when the transition process has completed. This occurs when the duration timer equals or exceeds the duration
      * of the transition.
      * 
      * Listen to it from a Scene using `this.events.on('transitioncomplete', listener)`.
      * 
      * The Scene Transition event flow is as follows:
      * 
      * 1. [TRANSITION_OUT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_OUT} - the Scene that started the transition will emit this event.
      * 2. [TRANSITION_INIT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_INIT} - the Target Scene will emit this event if it has an `init` method.
      * 3. [TRANSITION_START]{@linkcode Phaser.Scenes.Events#event:TRANSITION_START} - the Target Scene will emit this event after its `create` method is called, OR ...
      * 4. [TRANSITION_WAKE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_WAKE} - the Target Scene will emit this event if it was asleep and has been woken-up to be transitioned to.
      * 5. [TRANSITION_COMPLETE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_COMPLETE} - the Target Scene will emit this event when the transition finishes.
      */
    @JSGlobal("Phaser.Scenes.Events.TRANSITION_COMPLETE")
    @js.native
    val TRANSITION_COMPLETE: Any = js.native
    
    /**
      * The Scene Transition Init Event.
      * 
      * This event is dispatched by the Target Scene of a transition.
      * 
      * It happens immediately after the `Scene.init` method is called. If the Scene does not have an `init` method,
      * this event is not dispatched.
      * 
      * Listen to it from a Scene using `this.events.on('transitioninit', listener)`.
      * 
      * The Scene Transition event flow is as follows:
      * 
      * 1. [TRANSITION_OUT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_OUT} - the Scene that started the transition will emit this event.
      * 2. [TRANSITION_INIT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_INIT} - the Target Scene will emit this event if it has an `init` method.
      * 3. [TRANSITION_START]{@linkcode Phaser.Scenes.Events#event:TRANSITION_START} - the Target Scene will emit this event after its `create` method is called, OR ...
      * 4. [TRANSITION_WAKE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_WAKE} - the Target Scene will emit this event if it was asleep and has been woken-up to be transitioned to.
      * 5. [TRANSITION_COMPLETE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_COMPLETE} - the Target Scene will emit this event when the transition finishes.
      */
    @JSGlobal("Phaser.Scenes.Events.TRANSITION_INIT")
    @js.native
    val TRANSITION_INIT: Any = js.native
    
    /**
      * The Scene Transition Out Event.
      * 
      * This event is dispatched by a Scene when it initiates a transition to another Scene.
      * 
      * Listen to it from a Scene using `this.events.on('transitionout', listener)`.
      * 
      * The Scene Transition event flow is as follows:
      * 
      * 1. [TRANSITION_OUT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_OUT} - the Scene that started the transition will emit this event.
      * 2. [TRANSITION_INIT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_INIT} - the Target Scene will emit this event if it has an `init` method.
      * 3. [TRANSITION_START]{@linkcode Phaser.Scenes.Events#event:TRANSITION_START} - the Target Scene will emit this event after its `create` method is called, OR ...
      * 4. [TRANSITION_WAKE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_WAKE} - the Target Scene will emit this event if it was asleep and has been woken-up to be transitioned to.
      * 5. [TRANSITION_COMPLETE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_COMPLETE} - the Target Scene will emit this event when the transition finishes.
      */
    @JSGlobal("Phaser.Scenes.Events.TRANSITION_OUT")
    @js.native
    val TRANSITION_OUT: Any = js.native
    
    /**
      * The Scene Transition Start Event.
      * 
      * This event is dispatched by the Target Scene of a transition, only if that Scene was not asleep.
      * 
      * It happens immediately after the `Scene.create` method is called. If the Scene does not have a `create` method,
      * this event is dispatched anyway.
      * 
      * If the Target Scene was sleeping then the [TRANSITION_WAKE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_WAKE} event is
      * dispatched instead of this event.
      * 
      * Listen to it from a Scene using `this.events.on('transitionstart', listener)`.
      * 
      * The Scene Transition event flow is as follows:
      * 
      * 1. [TRANSITION_OUT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_OUT} - the Scene that started the transition will emit this event.
      * 2. [TRANSITION_INIT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_INIT} - the Target Scene will emit this event if it has an `init` method.
      * 3. [TRANSITION_START]{@linkcode Phaser.Scenes.Events#event:TRANSITION_START} - the Target Scene will emit this event after its `create` method is called, OR ...
      * 4. [TRANSITION_WAKE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_WAKE} - the Target Scene will emit this event if it was asleep and has been woken-up to be transitioned to.
      * 5. [TRANSITION_COMPLETE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_COMPLETE} - the Target Scene will emit this event when the transition finishes.
      */
    @JSGlobal("Phaser.Scenes.Events.TRANSITION_START")
    @js.native
    val TRANSITION_START: Any = js.native
    
    /**
      * The Scene Transition Wake Event.
      * 
      * This event is dispatched by the Target Scene of a transition, only if that Scene was asleep before
      * the transition began. If the Scene was not asleep the [TRANSITION_START]{@linkcode Phaser.Scenes.Events#event:TRANSITION_START} event is dispatched instead.
      * 
      * Listen to it from a Scene using `this.events.on('transitionwake', listener)`.
      * 
      * The Scene Transition event flow is as follows:
      * 
      * 1. [TRANSITION_OUT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_OUT} - the Scene that started the transition will emit this event.
      * 2. [TRANSITION_INIT]{@linkcode Phaser.Scenes.Events#event:TRANSITION_INIT} - the Target Scene will emit this event if it has an `init` method.
      * 3. [TRANSITION_START]{@linkcode Phaser.Scenes.Events#event:TRANSITION_START} - the Target Scene will emit this event after its `create` method is called, OR ...
      * 4. [TRANSITION_WAKE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_WAKE} - the Target Scene will emit this event if it was asleep and has been woken-up to be transitioned to.
      * 5. [TRANSITION_COMPLETE]{@linkcode Phaser.Scenes.Events#event:TRANSITION_COMPLETE} - the Target Scene will emit this event when the transition finishes.
      */
    @JSGlobal("Phaser.Scenes.Events.TRANSITION_WAKE")
    @js.native
    val TRANSITION_WAKE: Any = js.native
    
    /**
      * The Scene Systems Update Event.
      * 
      * This event is dispatched by a Scene during the main game loop step.
      * 
      * The event flow for a single step of a Scene is as follows:
      * 
      * 1. [PRE_UPDATE]{@linkcode Phaser.Scenes.Events#event:PRE_UPDATE}
      * 2. [UPDATE]{@linkcode Phaser.Scenes.Events#event:UPDATE}
      * 3. The `Scene.update` method is called, if it exists
      * 4. [POST_UPDATE]{@linkcode Phaser.Scenes.Events#event:POST_UPDATE}
      * 5. [PRE_RENDER]{@linkcode Phaser.Scenes.Events#event:PRE_RENDER}
      * 6. [RENDER]{@linkcode Phaser.Scenes.Events#event:RENDER}
      * 
      * Listen to it from a Scene using `this.events.on('update', listener)`.
      * 
      * A Scene will only run its step if it is active.
      */
    @JSGlobal("Phaser.Scenes.Events.UPDATE")
    @js.native
    val UPDATE: Any = js.native
    
    /**
      * The Scene Systems Wake Event.
      * 
      * This event is dispatched by a Scene when it is woken from sleep, either directly via the `wake` method,
      * or as an action from another Scene.
      * 
      * Listen to it from a Scene using `this.events.on('wake', listener)`.
      */
    @JSGlobal("Phaser.Scenes.Events.WAKE")
    @js.native
    val WAKE: Any = js.native
  }
  
  /**
    * Builds an array of which physics plugins should be activated for the given Scene.
    * @param sys The scene system to get the physics systems of.
    */
  inline def GetPhysicsPlugins(sys: typings.phaser.Phaser.Scenes.Systems): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPhysicsPlugins")(sys.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  /**
    * Builds an array of which plugins (not including physics plugins) should be activated for the given Scene.
    * @param sys The Scene Systems object to check for plugins.
    */
  inline def GetScenePlugins(sys: typings.phaser.Phaser.Scenes.Systems): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetScenePlugins")(sys.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  /**
    * Scene state.
    */
  @JSGlobal("Phaser.Scenes.INIT")
  @js.native
  def INIT: Double = js.native
  inline def INIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INIT")(x.asInstanceOf[js.Any])
  
  /**
    * Scene state.
    */
  @JSGlobal("Phaser.Scenes.LOADING")
  @js.native
  def LOADING: Double = js.native
  inline def LOADING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADING")(x.asInstanceOf[js.Any])
  
  /**
    * Scene state.
    */
  @JSGlobal("Phaser.Scenes.PAUSED")
  @js.native
  def PAUSED: Double = js.native
  inline def PAUSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAUSED")(x.asInstanceOf[js.Any])
  
  /**
    * Scene state.
    */
  @JSGlobal("Phaser.Scenes.PENDING")
  @js.native
  def PENDING: Double = js.native
  inline def PENDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING")(x.asInstanceOf[js.Any])
  
  /**
    * Scene state.
    */
  @JSGlobal("Phaser.Scenes.RUNNING")
  @js.native
  def RUNNING: Double = js.native
  inline def RUNNING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUNNING")(x.asInstanceOf[js.Any])
  
  /**
    * Scene state.
    */
  @JSGlobal("Phaser.Scenes.SHUTDOWN")
  @js.native
  def SHUTDOWN: Double = js.native
  inline def SHUTDOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHUTDOWN")(x.asInstanceOf[js.Any])
  
  /**
    * Scene state.
    */
  @JSGlobal("Phaser.Scenes.SLEEPING")
  @js.native
  def SLEEPING: Double = js.native
  inline def SLEEPING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLEEPING")(x.asInstanceOf[js.Any])
  
  /**
    * Scene state.
    */
  @JSGlobal("Phaser.Scenes.START")
  @js.native
  def START: Double = js.native
  inline def START_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("START")(x.asInstanceOf[js.Any])
  
  /**
    * The Scene Manager.
    * 
    * The Scene Manager is a Game level system, responsible for creating, processing and updating all of the
    * Scenes in a Game instance.
    * 
    * You should not usually interact directly with the Scene Manager at all. Instead, you should use
    * the Scene Plugin, which is available from every Scene in your game via the `this.scene` property.
    * 
    * Using methods in this Scene Manager directly will break queued operations and can cause runtime
    * errors. Instead, go via the Scene Plugin. Every feature this Scene Manager provides is also
    * available via the Scene Plugin.
    */
  @JSGlobal("Phaser.Scenes.SceneManager")
  @js.native
  open class SceneManager protected ()
    extends StObject
       with typings.phaser.Phaser.Scenes.SceneManager {
    /**
      * 
      * @param game The Phaser.Game instance this Scene Manager belongs to.
      * @param sceneConfig Scene specific configuration settings.
      */
    def this(game: typings.phaser.Phaser.Game, sceneConfig: js.Object) = this()
  }
  
  /**
    * The Scene Plugin is the main interface to the Scene Manager and allows you to control
    * any Scene running in your game. You should always use this plugin. By default, it is
    * mapped to the Scene property `this.scene`. Meaning, from within a Scene, you can call
    * methods such as `this.scene.start()`.
    * 
    * Note that nearly all methods in this class are run on a queue-basis and not
    * immediately. For example, calling `this.scene.launch('SceneB')` will try to
    * launch SceneB when the Scene Manager next updates, which is at the start of the game
    * step. All operations are queued and run in the order in which they are invoked here.
    */
  @JSGlobal("Phaser.Scenes.ScenePlugin")
  @js.native
  open class ScenePlugin protected ()
    extends StObject
       with typings.phaser.Phaser.Scenes.ScenePlugin {
    /**
      * 
      * @param scene The Scene that this ScenePlugin belongs to.
      */
    def this(scene: typings.phaser.Phaser.Scene) = this()
  }
  
  object Settings {
    
    @JSGlobal("Phaser.Scenes.Settings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Takes a Scene configuration object and returns a fully formed System Settings object.
      * @param config The Scene configuration object used to create this Scene Settings.
      */
    inline def create(config: String): SettingsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[SettingsObject]
    inline def create(config: SettingsConfig): SettingsObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[SettingsObject]
  }
  
  /**
    * The Scene Systems class.
    * 
    * This class is available from within a Scene under the property `sys`.
    * It is responsible for managing all of the plugins a Scene has running, including the display list, and
    * handling the update step and renderer. It also contains references to global systems belonging to Game.
    */
  @JSGlobal("Phaser.Scenes.Systems")
  @js.native
  open class Systems protected ()
    extends StObject
       with typings.phaser.Phaser.Scenes.Systems {
    /**
      * 
      * @param scene The Scene that owns this Systems instance.
      * @param config Scene specific configuration settings.
      */
    def this(scene: typings.phaser.Phaser.Scene, config: String) = this()
    def this(scene: typings.phaser.Phaser.Scene, config: SettingsConfig) = this()
  }
}
