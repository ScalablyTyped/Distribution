package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.GameObjects.Particles.ParticleEmitterManager
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Tilemaps.Tilemap
import typings.phaser.Phaser.Tweens.Tween
import typings.phaser.Phaser.Types.GameObjects.BitmapText.BitmapTextConfig
import typings.phaser.Phaser.Types.GameObjects.Group.GroupConfig
import typings.phaser.Phaser.Types.GameObjects.Group.GroupCreateConfig
import typings.phaser.Phaser.Types.GameObjects.RenderTexture.RenderTextureConfig
import typings.phaser.Phaser.Types.GameObjects.Sprite.SpriteConfig
import typings.phaser.Phaser.Types.GameObjects.TileSprite.TileSpriteConfig
import typings.phaser.Phaser.Types.Tilemaps.TilemapConfig
import typings.phaser.Phaser.Types.Tweens.TweenBuilderConfig
import typings.phaser.SpineGameObject
import typings.phaser.SpineGameObjectConfig
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
  def this(scene: Scene) = this()
  /**
    * A reference to the Scene Display List.
    */
  var displayList: DisplayList = js.native
  /**
    * The Scene to which this Game Object Creator belongs.
    */
  var scene: Scene = js.native
  /**
    * A reference to the Scene.Systems.
    */
  var systems: Systems = js.native
  /**
    * A reference to the Scene Update List.
    */
  @JSName("updateList;")
  var updateListSemicolon: UpdateList = js.native
  /**
    * Creates a new Bitmap Text Game Object and returns it.
    * 
    * Note: This method will only be available if the Bitmap Text Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def bitmapText(config: BitmapTextConfig): BitmapText = js.native
  def bitmapText(config: BitmapTextConfig, addToScene: Boolean): BitmapText = js.native
  /**
    * Creates a new Blitter Game Object and returns it.
    * 
    * Note: This method will only be available if the Blitter Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def blitter(config: js.Object): Blitter = js.native
  def blitter(config: js.Object, addToScene: Boolean): Blitter = js.native
  /**
    * Creates a new Container Game Object and returns it.
    * 
    * Note: This method will only be available if the Container Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def container(config: js.Object): Container = js.native
  def container(config: js.Object, addToScene: Boolean): Container = js.native
  /**
    * Creates a new Dynamic Bitmap Text Game Object and returns it.
    * 
    * Note: This method will only be available if the Dynamic Bitmap Text Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def dynamicBitmapText(config: BitmapTextConfig): DynamicBitmapText = js.native
  def dynamicBitmapText(config: BitmapTextConfig, addToScene: Boolean): DynamicBitmapText = js.native
  /**
    * Creates a new Graphics Game Object and returns it.
    * 
    * Note: This method will only be available if the Graphics Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def graphics(config: js.Object): Graphics = js.native
  def graphics(config: js.Object, addToScene: Boolean): Graphics = js.native
  /**
    * Creates a new Group Game Object and returns it.
    * 
    * Note: This method will only be available if the Group Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    */
  def group(config: GroupConfig): Group = js.native
  def group(config: GroupCreateConfig): Group = js.native
  /**
    * Creates a new Image Game Object and returns it.
    * 
    * Note: This method will only be available if the Image Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def image(config: js.Object): Image = js.native
  def image(config: js.Object, addToScene: Boolean): Image = js.native
  /**
    * Creates a new Mesh Game Object and returns it.
    * 
    * Note: This method will only be available if the Mesh Game Object and WebGL support have been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def mesh(config: js.Object): Mesh = js.native
  def mesh(config: js.Object, addToScene: Boolean): Mesh = js.native
  /**
    * Creates a new Particle Emitter Manager Game Object and returns it.
    * 
    * Note: This method will only be available if the Particles Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def particles(config: js.Object): ParticleEmitterManager = js.native
  def particles(config: js.Object, addToScene: Boolean): ParticleEmitterManager = js.native
  /**
    * Creates a new Quad Game Object and returns it.
    * 
    * Note: This method will only be available if the Quad Game Object and WebGL support have been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def quad(config: js.Object): Quad = js.native
  def quad(config: js.Object, addToScene: Boolean): Quad = js.native
  /**
    * Creates a new Render Texture Game Object and returns it.
    * 
    * Note: This method will only be available if the Render Texture Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def renderTexture(config: RenderTextureConfig): RenderTexture = js.native
  def renderTexture(config: RenderTextureConfig, addToScene: Boolean): RenderTexture = js.native
  /**
    * Creates a new Shader Game Object and returns it.
    * 
    * Note: This method will only be available if the Shader Game Object and WebGL support have been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def shader(config: js.Object): Shader = js.native
  def shader(config: js.Object, addToScene: Boolean): Shader = js.native
  def spine(config: SpineGameObjectConfig): SpineGameObject = js.native
  def spine(config: SpineGameObjectConfig, addToScene: Boolean): SpineGameObject = js.native
  /**
    * Creates a new Sprite Game Object and returns it.
    * 
    * Note: This method will only be available if the Sprite Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def sprite(config: SpriteConfig): Sprite = js.native
  def sprite(config: SpriteConfig, addToScene: Boolean): Sprite = js.native
  /**
    * Creates a new Text Game Object and returns it.
    * 
    * Note: This method will only be available if the Text Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def text(config: js.Object): Text = js.native
  def text(config: js.Object, addToScene: Boolean): Text = js.native
  /**
    * Creates a new TileSprite Game Object and returns it.
    * 
    * Note: This method will only be available if the TileSprite Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def tileSprite(config: TileSpriteConfig): TileSprite = js.native
  def tileSprite(config: TileSpriteConfig, addToScene: Boolean): TileSprite = js.native
  /**
    * Creates a Tilemap from the given key or data, or creates a blank Tilemap if no key/data provided.
    * When loading from CSV or a 2D array, you should specify the tileWidth & tileHeight. When parsing
    * from a map from Tiled, the tileWidth, tileHeight, width & height will be pulled from the map
    * data. For an empty map, you should specify tileWidth, tileHeight, width & height.
    * @param config The config options for the Tilemap.
    */
  def tilemap(): Tilemap = js.native
  def tilemap(config: TilemapConfig): Tilemap = js.native
  def tween(config: js.Object): Tween = js.native
  /**
    * Creates a new Tween object and returns it.
    * 
    * Note: This method will only be available if Tweens have been built into Phaser.
    * @param config The Tween configuration.
    */
  def tween(config: TweenBuilderConfig): Tween = js.native
  /**
    * Creates a new Video Game Object and returns it.
    * 
    * Note: This method will only be available if the Video Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def video(config: js.Object): Video = js.native
  def video(config: js.Object, addToScene: Boolean): Video = js.native
  /**
    * Creates a new Zone Game Object and returns it.
    * 
    * Note: This method will only be available if the Zone Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    */
  def zone(config: js.Object): Zone = js.native
}

