package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Utility class for maintaining reference to a collection
  * of Textures on a single Spritesheet.
  *
  * To access a sprite sheet from your code pass its JSON data file to Pixi's loader:
  *
  * ```js
  * PIXI.Loader.shared.add("images/spritesheet.json").load(setup);
  *
  * function setup() {
  *   let sheet = PIXI.Loader.shared.resources["images/spritesheet.json"].spritesheet;
  *   ...
  * }
  * ```
  * With the `sheet.textures` you can create Sprite objects,`sheet.animations` can be used to create an AnimatedSprite.
  *
  * Sprite sheets can be packed using tools like {@link https://codeandweb.com/texturepacker|TexturePacker},
  * {@link https://renderhjs.net/shoebox/|Shoebox} or {@link https://github.com/krzysztof-o/spritesheet.js|Spritesheet.js}.
  * Default anchor points (see {@link PIXI.Texture#defaultAnchor}) and grouping of animation sprites are currently only
  * supported by TexturePacker.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Spritesheet extends js.Object {
  
  /**
    * A map containing the textures for each animation.
    * Can be used to create an {@link PIXI.AnimatedSprite|AnimatedSprite}:
    * ```js
    * new PIXI.AnimatedSprite(sheet.animations["anim_name"])
    * ```
    * @member {Object} PIXI.Spritesheet#animations
    */
  var animations: js.Any = js.native
  
  /**
    * Reference to ths source texture.
    * @type {PIXI.BaseTexture}
    */
  var baseTexture: BaseTexture = js.native
  
  /**
    * Reference to the original JSON data.
    * @type {Object}
    */
  var data: js.Any = js.native
  
  /**
    * Destroy Spritesheet and don't use after this.
    *
    * @param {boolean} [destroyBase=false] - Whether to destroy the base texture as well
    */
  def destroy(): Unit = js.native
  def destroy(destroyBase: Boolean): Unit = js.native
  
  /**
    * Parser spritesheet from loaded data. This is done asynchronously
    * to prevent creating too many Texture within a single process.
    *
    * @param {Function} callback - Callback when complete returns
    *        a map of the Textures for this spritesheet.
    */
  def parse(callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  
  /**
    * The resolution of the spritesheet.
    * @type {number}
    */
  var resolution: Double = js.native
  
  /**
    * A map containing all textures of the sprite sheet.
    * Can be used to create a {@link PIXI.Sprite|Sprite}:
    * ```js
    * new PIXI.Sprite(sheet.textures["image.png"]);
    * ```
    * @member {Object} PIXI.Spritesheet#textures
    */
  var textures: js.Any = js.native
}
