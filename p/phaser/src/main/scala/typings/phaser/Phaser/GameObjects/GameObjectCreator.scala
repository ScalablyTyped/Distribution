package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.GameObjects.Particles.ParticleEmitter
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Tilemaps.Tilemap
import typings.phaser.Phaser.Tweens.Tween
import typings.phaser.Phaser.Tweens.TweenChain
import typings.phaser.Phaser.Types.GameObjects.BitmapText.BitmapTextConfig
import typings.phaser.Phaser.Types.GameObjects.Container.ContainerConfig
import typings.phaser.Phaser.Types.GameObjects.Graphics.Options
import typings.phaser.Phaser.Types.GameObjects.Group.GroupConfig
import typings.phaser.Phaser.Types.GameObjects.Group.GroupCreateConfig
import typings.phaser.Phaser.Types.GameObjects.Mesh.MeshConfig
import typings.phaser.Phaser.Types.GameObjects.NineSlice.NineSliceConfig
import typings.phaser.Phaser.Types.GameObjects.Particles.ParticleEmitterCreatorConfig
import typings.phaser.Phaser.Types.GameObjects.Plane.PlaneConfig
import typings.phaser.Phaser.Types.GameObjects.RenderTexture.RenderTextureConfig
import typings.phaser.Phaser.Types.GameObjects.Rope.RopeConfig
import typings.phaser.Phaser.Types.GameObjects.Shader.ShaderConfig
import typings.phaser.Phaser.Types.GameObjects.Sprite.SpriteConfig
import typings.phaser.Phaser.Types.GameObjects.Text.TextConfig
import typings.phaser.Phaser.Types.GameObjects.TileSprite.TileSpriteConfig
import typings.phaser.Phaser.Types.GameObjects.Video.VideoConfig
import typings.phaser.Phaser.Types.GameObjects.Zone.ZoneConfig
import typings.phaser.Phaser.Types.Tilemaps.TilemapConfig
import typings.phaser.Phaser.Types.Tweens.TweenBuilderConfig
import typings.phaser.Phaser.Types.Tweens.TweenChainBuilderConfig
import typings.phaser.SpineContainer
import typings.phaser.SpineContainerConfig
import typings.phaser.SpineGameObject
import typings.phaser.SpineGameObjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Game Object Creator is a Scene plugin that allows you to quickly create many common
  * types of Game Objects and return them using a configuration object, rather than
  * having to specify a limited set of parameters such as with the GameObjectFactory.
  * 
  * Game Objects made via this class are automatically added to the Scene and Update List
  * unless you explicitly set the `add` property in the configuration object to `false`.
  */
@js.native
trait GameObjectCreator extends StObject {
  
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
  def blitter(config: SpriteConfig): Blitter = js.native
  def blitter(config: SpriteConfig, addToScene: Boolean): Blitter = js.native
  
  /**
    * Creates a new Container Game Object and returns it.
    * 
    * Note: This method will only be available if the Container Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def container(config: ContainerConfig): Container = js.native
  def container(config: ContainerConfig, addToScene: Boolean): Container = js.native
  
  /**
    * A reference to the Scene Display List.
    */
  /* protected */ var displayList: DisplayList = js.native
  
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
    * A reference to the Scene Event Emitter.
    */
  /* protected */ var events: EventEmitter = js.native
  
  /**
    * Creates a new Graphics Game Object and returns it.
    * 
    * Note: This method will only be available if the Graphics Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def graphics(): Graphics = js.native
  def graphics(config: Unit, addToScene: Boolean): Graphics = js.native
  def graphics(config: Options): Graphics = js.native
  def graphics(config: Options, addToScene: Boolean): Graphics = js.native
  
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
  def image(config: SpriteConfig): Image = js.native
  def image(config: SpriteConfig, addToScene: Boolean): Image = js.native
  
  /**
    * Creates a new Layer Game Object and returns it.
    * 
    * Note: This method will only be available if the Layer Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def layer(config: SpriteConfig): Layer = js.native
  def layer(config: SpriteConfig, addToScene: Boolean): Layer = js.native
  
  /**
    * Creates a new Mesh Game Object and returns it.
    * 
    * Note: This method will only be available if the Mesh Game Object and WebGL support have been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def mesh(config: MeshConfig): Mesh = js.native
  def mesh(config: MeshConfig, addToScene: Boolean): Mesh = js.native
  
  /**
    * Creates a new Nine Slice Game Object and returns it.
    * 
    * Note: This method will only be available if the Nine Slice Game Object and WebGL support have been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def nineslice(config: NineSliceConfig): NineSlice = js.native
  def nineslice(config: NineSliceConfig, addToScene: Boolean): NineSlice = js.native
  
  /**
    * Creates a new Particle Emitter Game Object and returns it.
    * 
    * Prior to Phaser v3.60 this function would create a `ParticleEmitterManager`. These were removed
    * in v3.60 and replaced with creating a `ParticleEmitter` instance directly. Please see the
    * updated function parameters and class documentation for more details.
    * 
    * Note: This method will only be available if the Particles Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def particles(config: ParticleEmitterCreatorConfig): ParticleEmitter = js.native
  def particles(config: ParticleEmitterCreatorConfig, addToScene: Boolean): ParticleEmitter = js.native
  
  /**
    * Creates a new Plane Game Object and returns it.
    * 
    * Note: This method will only be available if the Plane Game Object and WebGL support have been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def plane(config: PlaneConfig): Plane = js.native
  def plane(config: PlaneConfig, addToScene: Boolean): Plane = js.native
  
  /**
    * Creates a new Point Light Game Object and returns it.
    * 
    * Note: This method will only be available if the Point Light Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def pointlight(config: js.Object): PointLight = js.native
  def pointlight(config: js.Object, addToScene: Boolean): PointLight = js.native
  
  /**
    * Creates a new Render Texture Game Object and returns it.
    * 
    * Note: This method will only be available if the Render Texture Game Object has been built into Phaser.
    * 
    * A Render Texture is a combination of Dynamic Texture and an Image Game Object, that uses the
    * Dynamic Texture to display itself with.
    * 
    * A Dynamic Texture is a special texture that allows you to draw textures, frames and most kind of
    * Game Objects directly to it.
    * 
    * You can take many complex objects and draw them to this one texture, which can then be used as the
    * base texture for other Game Objects, such as Sprites. Should you then update this texture, all
    * Game Objects using it will instantly be updated as well, reflecting the changes immediately.
    * 
    * It's a powerful way to generate dynamic textures at run-time that are WebGL friendly and don't invoke
    * expensive GPU uploads on each change.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def renderTexture(config: RenderTextureConfig): RenderTexture = js.native
  def renderTexture(config: RenderTextureConfig, addToScene: Boolean): RenderTexture = js.native
  
  /**
    * Creates a new Rope Game Object and returns it.
    * 
    * Note: This method will only be available if the Rope Game Object and WebGL support have been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def rope(config: RopeConfig): Rope = js.native
  def rope(config: RopeConfig, addToScene: Boolean): Rope = js.native
  
  /**
    * The Scene to which this Game Object Creator belongs.
    */
  /* protected */ var scene: Scene = js.native
  
  /**
    * Creates a new Shader Game Object and returns it.
    * 
    * Note: This method will only be available if the Shader Game Object and WebGL support have been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def shader(config: ShaderConfig): Shader = js.native
  def shader(config: ShaderConfig, addToScene: Boolean): Shader = js.native
  
  def spine(config: SpineGameObjectConfig): SpineGameObject = js.native
  def spine(config: SpineGameObjectConfig, addToScene: Boolean): SpineGameObject = js.native
  
  def spineContainer(config: SpineContainerConfig): SpineContainer = js.native
  def spineContainer(config: SpineContainerConfig, addToScene: Boolean): SpineContainer = js.native
  
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
    * A reference to the Scene.Systems.
    */
  /* protected */ var systems: Systems = js.native
  
  /**
    * Creates a new Text Game Object and returns it.
    * 
    * Note: This method will only be available if the Text Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def text(config: TextConfig): Text = js.native
  def text(config: TextConfig, addToScene: Boolean): Text = js.native
  
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
  
  def tween(config: Tween): Tween = js.native
  def tween(config: TweenChain): Tween = js.native
  /**
    * Creates a new Tween object and returns it.
    * 
    * Note: This method will only be available if Tweens have been built into Phaser.
    * @param config A Tween Configuration object, or a Tween or TweenChain instance.
    */
  def tween(config: TweenBuilderConfig): Tween = js.native
  def tween(config: TweenChainBuilderConfig): Tween = js.native
  
  def tweenchain(config: js.Object): TweenChain = js.native
  /**
    * Creates a new TweenChain object and returns it, without adding it to the Tween Manager.
    * 
    * Note: This method will only be available if Tweens have been built into Phaser.
    * @param config The TweenChain configuration.
    */
  def tweenchain(config: TweenBuilderConfig): TweenChain = js.native
  
  /**
    * A reference to the Scene Update List.
    */
  /* protected */ var updateList: UpdateList = js.native
  
  /**
    * Creates a new Video Game Object and returns it.
    * 
    * Note: This method will only be available if the Video Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    * @param addToScene Add this Game Object to the Scene after creating it? If set this argument overrides the `add` property in the config object.
    */
  def video(config: VideoConfig): Video = js.native
  def video(config: VideoConfig, addToScene: Boolean): Video = js.native
  
  /**
    * Creates a new Zone Game Object and returns it.
    * 
    * Note: This method will only be available if the Zone Game Object has been built into Phaser.
    * @param config The configuration object this Game Object will use to create itself.
    */
  def zone(config: ZoneConfig): Zone = js.native
}
