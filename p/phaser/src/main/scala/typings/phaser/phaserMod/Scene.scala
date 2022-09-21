package typings.phaser.phaserMod

import typings.phaser.Phaser.Animations.AnimationManager
import typings.phaser.Phaser.Cache.CacheManager
import typings.phaser.Phaser.Cameras.Scene2D.CameraManager
import typings.phaser.Phaser.Data.DataManager
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.GameObjects.DisplayList
import typings.phaser.Phaser.GameObjects.GameObjectCreator
import typings.phaser.Phaser.GameObjects.GameObjectFactory
import typings.phaser.Phaser.GameObjects.LightsManager
import typings.phaser.Phaser.Input.InputPlugin
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Physics.Arcade.ArcadePhysics
import typings.phaser.Phaser.Physics.Matter.MatterPhysics
import typings.phaser.Phaser.Plugins.PluginManager
import typings.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typings.phaser.Phaser.Scale.ScaleManager
import typings.phaser.Phaser.Scenes.ScenePlugin
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Sound.HTML5AudioSoundManager
import typings.phaser.Phaser.Sound.NoAudioSoundManager
import typings.phaser.Phaser.Sound.WebAudioSoundManager
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Time.Clock
import typings.phaser.Phaser.Tweens.TweenManager
import typings.phaser.Phaser.Types.Scenes.SettingsConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A base Phaser.Scene class which can be extended for your own use.
  * 
  * You can also define the optional methods {@link Phaser.Types.Scenes.SceneInitCallback init()}, {@link Phaser.Types.Scenes.ScenePreloadCallback preload()}, and {@link Phaser.Types.Scenes.SceneCreateCallback create()}.
  */
@JSImport("phaser", "Scene")
@js.native
open class Scene protected ()
  extends StObject
     with typings.phaser.Phaser.Scene {
  /**
    * 
    * @param config Scene specific configuration settings.
    */
  def this(config: String) = this()
  def this(config: SettingsConfig) = this()
  
  /**
    * The Scene Game Object Factory.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  var add: GameObjectFactory = js.native
  
  /**
    * A reference to the global Animation Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  var anims: AnimationManager = js.native
  
  /**
    * A reference to the global Cache.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  var cache: CacheManager = js.native
  
  /**
    * The Scene Camera Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  var cameras: CameraManager = js.native
  
  /**
    * The Game Object Display List belonging to this Scene.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  var children: DisplayList = js.native
  
  /**
    * A Scene specific Data Manager Plugin.
    * 
    * See the `registry` property for the global Data Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  var data: DataManager = js.native
  
  /**
    * A Scene specific Event Emitter.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  var events: EventEmitter = js.native
  
  /**
    * The Facebook Instant Games Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  /* CompleteClass */
  var facebook: typings.phaser.Phaser.FacebookInstantGamesPlugin = js.native
  
  /**
    * A reference to the Phaser.Game instance.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  var game: typings.phaser.Phaser.Game = js.native
  
  /**
    * The Scene Input Manager Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  var input: InputPlugin = js.native
  
  /**
    * The Scene Lights Manager Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  var lights: LightsManager = js.native
  
  /**
    * The Scene Loader Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  var load: LoaderPlugin = js.native
  
  /**
    * The Scene Game Object Creator.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  var make: GameObjectCreator = js.native
  
  /**
    * The Scene Matter Physics Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  /* CompleteClass */
  var matter: MatterPhysics = js.native
  
  /**
    * The Scene Arcade Physics Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  /* CompleteClass */
  var physics: ArcadePhysics = js.native
  
  /**
    * A reference to the global Plugin Manager.
    * 
    * The Plugin Manager is a global system that allows plugins to register themselves with it, and can then install
    * those plugins into Scenes as required.
    */
  /* CompleteClass */
  var plugins: PluginManager = js.native
  
  /**
    * A reference to the global Data Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  var registry: DataManager = js.native
  
  /**
    * A reference to the renderer instance Phaser is using, either Canvas Renderer or WebGL Renderer.
    */
  /* CompleteClass */
  var renderer: CanvasRenderer | WebGLRenderer = js.native
  
  /**
    * A reference to the global Scale Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  var scale: ScaleManager = js.native
  
  /**
    * A reference to the Scene Manager Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  var scene: ScenePlugin = js.native
  
  /**
    * A reference to the Sound Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  var sound: NoAudioSoundManager | HTML5AudioSoundManager | WebAudioSoundManager = js.native
  
  /**
    * The Scene Systems. You must never overwrite this property, or all hell will break lose.
    */
  /* CompleteClass */
  var sys: Systems = js.native
  
  /**
    * A reference to the Texture Manager.
    * 
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  var textures: TextureManager = js.native
  
  /**
    * The Scene Time and Clock Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  var time: Clock = js.native
  
  /**
    * The Scene Tween Manager Plugin.
    * 
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  var tweens: TweenManager = js.native
  
  /**
    * This method should be overridden by your own Scenes.
    * 
    * This method is called once per game step while the scene is running.
    * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  /* CompleteClass */
  override def update(time: Double, delta: Double): Unit = js.native
}
