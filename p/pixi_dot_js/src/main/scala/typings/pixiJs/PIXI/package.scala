package typings.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PIXI {
  type AnimatedSprite = typings.pixiJs.PIXI.AnimatedSprite_
  type Application = typings.pixiJs.PIXI.Application_
  /**
    * {@link PIXI.Loader Loader} middleware for loading
    * bitmap-based fonts suitable for using with {@link PIXI.BitmapText}.
    * @class
    * @memberof PIXI
    * @implements PIXI.ILoaderPlugin
    */
  type BitmapFontLoader = typings.pixiJs.PIXI.ILoaderPlugin
  /**
    * @memberof PIXI
    * @typedef {number} GD8Symmetry
    * @see PIXI.groupD8
    */
  type GD8Symmetry = scala.Double
  type IResourceDictionary = org.scalablytyped.runtime.StringDictionary[typings.pixiJs.PIXI.LoaderResource]
  type ITextureDictionary = org.scalablytyped.runtime.StringDictionary[typings.pixiJs.PIXI.Texture]
  type LoaderResource = typings.pixiJs.PIXI.LoaderResource_
  /**
    * {@link PIXI.Loader Loader} middleware for loading texture atlases that have been created with
    * TexturePacker or similar JSON-based spritesheet.
    *
    * This middleware automatically generates Texture resources.
    *
    * @class
    * @memberof PIXI
    * @implements PIXI.ILoaderPlugin
    */
  type SpritesheetLoader = typings.pixiJs.PIXI.ILoaderPlugin
  /**
    * Loader plugin for handling Texture resources.
    * @class
    * @memberof PIXI
    * @implements PIXI.ILoaderPlugin
    */
  type TextureLoader = typings.pixiJs.PIXI.ILoaderPlugin
}
