package typings.phaser.Phaser

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
import typings.phaser.Phaser.Physics.Impact.ImpactPhysics
import typings.phaser.Phaser.Physics.Matter.MatterPhysics
import typings.phaser.Phaser.Plugins.PluginManager
import typings.phaser.Phaser.Scale.ScaleManager
import typings.phaser.Phaser.Scenes.ScenePlugin
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Sound.BaseSoundManager
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Time.Clock
import typings.phaser.Phaser.Tweens.TweenManager
import typings.phaser.Phaser.Types.Scenes.SettingsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base Phaser.Scene class which can be extended for your own use.
  * 
  * You can also define the optional methods {@link Phaser.Types.Scenes.SceneInitCallback init()}, {@link Phaser.Types.Scenes.ScenePreloadCallback preload()}, and {@link Phaser.Types.Scenes.SceneCreateCallback create()}.
  */
@JSGlobal("Phaser.Scene")
@js.native
class Scene protected () extends js.Object {
  /**
    * 
    * @param config Scene specific configuration settings.
    */
  def this(config: String) = this()
  def this(config: SettingsConfig) = this()
  /**
    * A scene level Game Object Factory.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var add: GameObjectFactory = js.native
  /**
    * A reference to the global Animation Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var anims: AnimationManager = js.native
  /**
    * A reference to the global Cache.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var cache: CacheManager = js.native
  /**
    * A scene level Camera System.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var cameras: CameraManager = js.native
  /**
    * A scene level Game Object Display List.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var children: DisplayList = js.native
  /**
    * A scene level Data Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var data: DataManager = js.native
  /**
    * A scene level Event Emitter.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var events: EventEmitter = js.native
  /**
    * A scene level Facebook Instant Games Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var facebook: FacebookInstantGamesPlugin = js.native
  /**
    * A reference to the Phaser.Game instance.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var game: Game = js.native
  /**
    * A scene level Impact Physics Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var impact: ImpactPhysics = js.native
  /**
    * A scene level Input Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var input: InputPlugin = js.native
  /**
    * A scene level Lights Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var lights: LightsManager = js.native
  /**
    * A scene level Loader Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var load: LoaderPlugin = js.native
  /**
    * A scene level Game Object Creator.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var make: GameObjectCreator = js.native
  /**
    * A scene level Matter Physics Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var matter: MatterPhysics = js.native
  /**
    * A scene level Arcade Physics Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var physics: ArcadePhysics = js.native
  /**
    * A reference to the Plugin Manager.
    * 
    * The Plugin Manager is a global system that allows plugins to register themselves with it, and can then install
    * those plugins into Scenes as required.
    */
  var plugins: PluginManager = js.native
  /**
    * A reference to the game level Data Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var registry: DataManager = js.native
  /**
    * A reference to the global Scale Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var scale: ScaleManager = js.native
  /**
    * A reference to the Scene Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var scene: ScenePlugin = js.native
  /**
    * A reference to the Sound Manager.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var sound: BaseSoundManager = js.native
  /**
    * The Scene Systems. You must never overwrite this property, or all hell will break lose.
    */
  var sys: Systems = js.native
  /**
    * A reference to the Texture Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var textures: TextureManager = js.native
  /**
    * A scene level Time and Clock Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var time: Clock = js.native
  /**
    * A scene level Tween Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var tweens: TweenManager = js.native
  /**
    * Should be overridden by your own Scenes.
    * This method is called once per game step while the scene is running.
    * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(time: Double, delta: Double): Unit = js.native
}

