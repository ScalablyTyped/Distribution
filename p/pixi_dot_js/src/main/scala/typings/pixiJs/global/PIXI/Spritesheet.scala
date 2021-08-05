package typings.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
@JSGlobal("PIXI.Spritesheet")
@js.native
class Spritesheet protected ()
  extends StObject
     with typings.pixiJs.PIXI.Spritesheet {
  def this(baseTexture: typings.pixiJs.PIXI.BaseTexture, data: js.Any) = this()
  def this(baseTexture: typings.pixiJs.PIXI.Texture, data: js.Any) = this()
  def this(baseTexture: typings.pixiJs.PIXI.BaseTexture, data: js.Any, resolutionFilename: String) = this()
  def this(baseTexture: typings.pixiJs.PIXI.Texture, data: js.Any, resolutionFilename: String) = this()
}
object Spritesheet {
  
  @JSGlobal("PIXI.Spritesheet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The maximum number of Textures to build per process.
    *
    * @type {number}
    * @default 1000
    */
  /* static member */
  @JSGlobal("PIXI.Spritesheet.BATCH_SIZE")
  @js.native
  def BATCH_SIZE: Double = js.native
  inline def BATCH_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCH_SIZE")(x.asInstanceOf[js.Any])
}
