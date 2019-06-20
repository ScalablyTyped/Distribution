package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Game Object Creator is a Scene plugin that allows you to quickly create many common
  * types of Game Objects and return them. Unlike the Game Object Factory, they are not automatically
  * added to the Scene.
  * 
  * Game Objects directly register themselves with the Creator and inject their own creation
  * methods into the class.
  */
@JSGlobal("Phaser.GameObjects.GameObjectCreator")
@js.native
class GameObjectCreator protected () extends js.Object {
  /**
    * 
    * @param scene The Scene to which this Game Object Factory belongs.
    */
  def this(scene: phaserLib.PhaserNs.Scene) = this()
  /**
    * A reference to the Scene Display List.
    */
  var displayList: DisplayList = js.native
  /**
    * The Scene to which this Game Object Creator belongs.
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * A reference to the Scene.Systems.
    */
  var systems: phaserLib.PhaserNs.ScenesNs.Systems = js.native
  /**
    * A reference to the Scene Update List.
    */
  var `updateList;`: UpdateList = js.native
  /**
    * Creates a new Bitmap Text Game Object and returns it.
    * 
    * Note: This method will only be available if the Bitmap Text Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def bitmapText(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs.BitmapTextConfig): BitmapText = js.native
  def bitmapText(
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs.BitmapTextConfig,
    addToScene: scala.Boolean
  ): BitmapText = js.native
  /**
    * Creates a new Blitter Game Object and returns it.
    * 
    * Note: This method will only be available if the Blitter Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def blitter(config: js.Object): Blitter = js.native
  def blitter(config: js.Object, addToScene: scala.Boolean): Blitter = js.native
  /**
    * Creates a new Container Game Object and returns it.
    * 
    * Note: This method will only be available if the Container Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def container(config: js.Object): Container = js.native
  def container(config: js.Object, addToScene: scala.Boolean): Container = js.native
  /**
    * Creates a new Dynamic Bitmap Text Game Object and returns it.
    * 
    * Note: This method will only be available if the Dynamic Bitmap Text Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def dynamicBitmapText(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs.BitmapTextConfig): DynamicBitmapText = js.native
  def dynamicBitmapText(
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs.BitmapTextConfig,
    addToScene: scala.Boolean
  ): DynamicBitmapText = js.native
  /**
    * Creates a new Graphics Game Object and returns it.
    * 
    * Note: This method will only be available if the Graphics Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def graphics(config: js.Object): Graphics = js.native
  def graphics(config: js.Object, addToScene: scala.Boolean): Graphics = js.native
  /**
    * Creates a new Group Game Object and returns it.
    * 
    * Note: This method will only be available if the Group Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    */
  def group(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig): Group = js.native
  def group(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig): Group = js.native
  /**
    * Creates a new Image Game Object and returns it.
    * 
    * Note: This method will only be available if the Image Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def image(config: js.Object): Image = js.native
  def image(config: js.Object, addToScene: scala.Boolean): Image = js.native
  /**
    * Creates a new Mesh Game Object and returns it.
    * 
    * Note: This method will only be available if the Mesh Game Object and WebGL support have been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def mesh(config: js.Object): Mesh = js.native
  def mesh(config: js.Object, addToScene: scala.Boolean): Mesh = js.native
  /**
    * Creates a new Particle Emitter Manager Game Object and returns it.
    * 
    * Note: This method will only be available if the Particles Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def particles(config: js.Object): phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager = js.native
  def particles(config: js.Object, addToScene: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager = js.native
  /**
    * Creates a new Quad Game Object and returns it.
    * 
    * Note: This method will only be available if the Quad Game Object and WebGL support have been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def quad(config: js.Object): Quad = js.native
  def quad(config: js.Object, addToScene: scala.Boolean): Quad = js.native
  /**
    * Creates a new Render Texture Game Object and returns it.
    * 
    * Note: This method will only be available if the Render Texture Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def renderTexture(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.RenderTextureNs.RenderTextureConfig): RenderTexture = js.native
  def renderTexture(
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.RenderTextureNs.RenderTextureConfig,
    addToScene: scala.Boolean
  ): RenderTexture = js.native
  /**
    * Creates a new Shader Game Object and returns it.
    * 
    * Note: This method will only be available if the Shader Game Object and WebGL support have been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def shader(config: js.Object): Shader = js.native
  def shader(config: js.Object, addToScene: scala.Boolean): Shader = js.native
  /**
    * Creates a new Sprite Game Object and returns it.
    * 
    * Note: This method will only be available if the Sprite Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def sprite(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig): Sprite = js.native
  def sprite(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.SpriteNs.SpriteConfig, addToScene: scala.Boolean): Sprite = js.native
  /**
    * Creates a new Text Game Object and returns it.
    * 
    * Note: This method will only be available if the Text Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def text(config: js.Object): Text = js.native
  def text(config: js.Object, addToScene: scala.Boolean): Text = js.native
  /**
    * Creates a new TileSprite Game Object and returns it.
    * 
    * Note: This method will only be available if the TileSprite Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def tileSprite(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.TileSpriteNs.TileSpriteConfig): TileSprite = js.native
  def tileSprite(
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.TileSpriteNs.TileSpriteConfig,
    addToScene: scala.Boolean
  ): TileSprite = js.native
  /**
    * Creates a Tilemap from the given key or data, or creates a blank Tilemap if no key/data provided.
    * When loading from CSV or a 2D array, you should specify the tileWidth & tileHeight. When parsing
    * from a map from Tiled, the tileWidth, tileHeight, width & height will be pulled from the map
    * data. For an empty map, you should specify tileWidth, tileHeight, width & height.
    * @param config The config options for the Tilemap.
    */
  def tilemap(): phaserLib.PhaserNs.TilemapsNs.Tilemap = js.native
  def tilemap(config: phaserLib.PhaserNs.TypesNs.TilemapsNs.TilemapConfig): phaserLib.PhaserNs.TilemapsNs.Tilemap = js.native
  def tween(config: js.Object): phaserLib.PhaserNs.TweensNs.Tween = js.native
  /**
    * Creates a new Tween object and returns it.
    * 
    * Note: This method will only be available if Tweens have been built into Phaser.
    * @param config The Tween configuration.
    */
  def tween(config: phaserLib.PhaserNs.TypesNs.TweensNs.TweenBuilderConfig): phaserLib.PhaserNs.TweensNs.Tween = js.native
  /**
    * Creates a new Zone Game Object and returns it.
    * 
    * Note: This method will only be available if the Zone Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    */
  def zone(config: js.Object): Zone = js.native
}

