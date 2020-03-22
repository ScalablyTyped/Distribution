package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("pixi.js", "Spritesheet")
@js.native
class Spritesheet protected ()
  extends typings.pixiJs.PIXI.Spritesheet {
  def this(baseTexture: typings.pixiJs.PIXI.BaseTexture, data: js.Any) = this()
  def this(baseTexture: typings.pixiJs.PIXI.BaseTexture, data: js.Any, resolutionFilename: String) = this()
}

/* static members */
@JSImport("pixi.js", "Spritesheet")
@js.native
object Spritesheet extends js.Object {
  /**
    * The maximum number of Textures to build per process.
    *
    * @type {number}
    * @default 1000
    */
  var BATCH_SIZE: Double = js.native
}

