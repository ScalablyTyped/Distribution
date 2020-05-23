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
import typings.phaser.Phaser.Physics.Matter.MatterPhysics
import typings.phaser.Phaser.Plugins.PluginManager
import typings.phaser.Phaser.Scale.ScaleManager
import typings.phaser.Phaser.Scenes.ScenePlugin
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Sound.BaseSoundManager
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Time.Clock
import typings.phaser.Phaser.Tweens.TweenManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base Phaser.Scene class which can be extended for your own use.
  * 
  * You can also define the optional methods {@link Phaser.Types.Scenes.SceneInitCallback init()}, {@link Phaser.Types.Scenes.ScenePreloadCallback preload()}, and {@link Phaser.Types.Scenes.SceneCreateCallback create()}.
  */
trait Scene extends js.Object {
  /**
    * A scene level Game Object Factory.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var add: GameObjectFactory
  /**
    * A reference to the global Animation Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var anims: AnimationManager
  /**
    * A reference to the global Cache.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var cache: CacheManager
  /**
    * A scene level Camera System.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var cameras: CameraManager
  /**
    * A scene level Game Object Display List.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var children: DisplayList
  /**
    * A scene level Data Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var data: DataManager
  /**
    * A scene level Event Emitter.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var events: EventEmitter
  /**
    * A scene level Facebook Instant Games Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var facebook: FacebookInstantGamesPlugin
  /**
    * A reference to the Phaser.Game instance.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var game: Game
  /**
    * A scene level Input Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var input: InputPlugin
  /**
    * A scene level Lights Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var lights: LightsManager
  /**
    * A scene level Loader Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var load: LoaderPlugin
  /**
    * A scene level Game Object Creator.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var make: GameObjectCreator
  /**
    * A scene level Matter Physics Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var matter: MatterPhysics
  /**
    * A scene level Arcade Physics Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var physics: ArcadePhysics
  /**
    * A reference to the Plugin Manager.
    * 
    * The Plugin Manager is a global system that allows plugins to register themselves with it, and can then install
    * those plugins into Scenes as required.
    */
  var plugins: PluginManager
  /**
    * A reference to the game level Data Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var registry: DataManager
  /**
    * A reference to the global Scale Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var scale: ScaleManager
  /**
    * A reference to the Scene Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var scene: ScenePlugin
  /**
    * A reference to the Sound Manager.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var sound: BaseSoundManager
  /**
    * The Scene Systems. You must never overwrite this property, or all hell will break lose.
    */
  var sys: Systems
  /**
    * A reference to the Texture Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var textures: TextureManager
  /**
    * A scene level Time and Clock Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var time: Clock
  /**
    * A scene level Tween Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var tweens: TweenManager
  /**
    * Should be overridden by your own Scenes.
    * This method is called once per game step while the scene is running.
    * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(time: Double, delta: Double): Unit
}

object Scene {
  @scala.inline
  def apply(
    add: GameObjectFactory,
    anims: AnimationManager,
    cache: CacheManager,
    cameras: CameraManager,
    children: DisplayList,
    data: DataManager,
    events: EventEmitter,
    facebook: FacebookInstantGamesPlugin,
    game: Game,
    input: InputPlugin,
    lights: LightsManager,
    load: LoaderPlugin,
    make: GameObjectCreator,
    matter: MatterPhysics,
    physics: ArcadePhysics,
    plugins: PluginManager,
    registry: DataManager,
    scale: ScaleManager,
    scene: ScenePlugin,
    sound: BaseSoundManager,
    sys: Systems,
    textures: TextureManager,
    time: Clock,
    tweens: TweenManager,
    update: (Double, Double) => Unit
  ): Scene = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], anims = anims.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cameras = cameras.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], facebook = facebook.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], make = make.asInstanceOf[js.Any], matter = matter.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tweens = tweens.asInstanceOf[js.Any], update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Scene]
  }
}

