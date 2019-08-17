package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreNs {
  import typings.pixiDotJs.PIXINs.Container
  import typings.pixiDotJs.PIXINs.Filter
  import typings.pixiDotJs.PIXINs.TransformBase
  import typings.pixiDotJs.PIXINs.extrasNs.AnimatedSprite
  import typings.pixiDotJs.PIXINs.loadersNs.Loader
  import typings.pixiDotJs.PIXINs.meshNs.Mesh
  import typings.std.RegExp

  /**
    * @class
    * @private
    * @name PIXI.AbstractFilter
    * @see PIXI.Filter
    * @deprecated since version 3.0.6
    */
  type AbstractFilter[U /* <: js.Object */] = Filter[U]
  /**
    * @class
    * @private
    * @name AssetLoader
    * @memberof PIXI
    * @see PIXI.loaders.Loader
    * @throws {ReferenceError} The loader system was overhauled in pixi v3, please see the new PIXI.loaders.Loader class.
    * @deprecated since version 3.0.0
    */
  type AssetLoader = Loader
  /**
    * @class
    * @private
    * @name BaseTextureCache
    * @memberof PIXI
    * @see PIXI.utils.BaseTextureCache
    * @deprecated since version 3.0.0
    */
  type BaseTextureCache = js.Any
  /**
    * @class
    * @private
    * @name BitmapText
    * @memberof PIXI
    * @see PIXI.extras.BitmapText
    * @deprecated since version 3.0.0
    */
  type BitmapText = typings.pixiDotJs.PIXINs.extrasNs.BitmapText
  /**
    * @static
    * @constant
    * @name PIXI.DEFAULT_RENDER_OPTIONS
    * @see PIXI.settings.RENDER_OPTIONS
    * @deprecated since version 4.2.0
    */
  type DEFAULT_RENDER_OPTIONS = Double
  /**
    * @class
    * @private
    * @name DisplayObjectContainer
    * @memberof PIXI
    * @see PIXI.Container
    * @deprecated since version 3.0.0
    */
  type DisplayObjectContainer = Container
  /**
    * @static
    * @constant
    * @name PIXI.FILTER_RESOLUTION
    * @see PIXI.settings.FILTER_RESOLUTION
    * @deprecated since version 4.2.0
    */
  type FILTER_RESOLUTION = Double
  /**
    * @static
    * @constant
    * @name PIXI.MIPMAP_TEXTURES
    * @see PIXI.settings.MIPMAP_TEXTURES
    * @deprecated since version 4.2.0
    */
  type MIPMAP_TEXTURES = js.Any
  /**
    * @class
    * @private
    * @name MovieClip
    * @memberof PIXI
    * @see PIXI.extras.MovieClip
    * @deprecated since version 3.0.0
    */
  type MovieClip = AnimatedSprite
  /**
    * @static
    * @name PRECISION
    * @memberof PIXI.settings
    * @see PIXI.PRECISION
    * @deprecated since version 4.4.0
    */
  type PRECISION = String
  /**
    * @class
    * @private
    * @name ParticleContainer
    * @memberof PIXI
    * @see PIXI.particles.ParticleContainer
    * @deprecated since version 4.0.0
    */
  type ParticleContainer = typings.pixiDotJs.PIXINs.particlesNs.ParticleContainer
  /**
    * @static
    * @constant
    * @name PIXI.RESOLUTION
    * @see PIXI.settings.RESOLUTION
    * @deprecated since version 4.2.0
    */
  type RESOLUTION = Double
  /**
    * @static
    * @constant
    * @name PIXI.RETINA_PREFIX
    * @see PIXI.settings.RETINA_PREFIX
    * @deprecated since version 4.2.0
    */
  type RETINA_PREFIX = RegExp | String
  /**
    * @class
    * @private
    * @name Rope
    * @memberof PIXI
    * @see PIXI.mesh.Rope
    * @deprecated since version 3.0.0
    */
  type Rope = typings.pixiDotJs.PIXINs.meshNs.Rope
  /**
    * @static
    * @constant
    * @name PIXI.SPRITE_BATCH_SIZE
    * @see PIXI.settings.SPRITE_BATCH_SIZE
    * @deprecated since version 4.2.0
    */
  type SPRITE_BATCH_SIZE = Double
  /**
    * @static
    * @constant
    * @name PIXI.SPRITE_MAX_TEXTURES
    * @see PIXI.settings.SPRITE_MAX_TEXTURES
    * @deprecated since version 4.2.0
    */
  type SPRITE_MAX_TEXTURES = Double
  /**
    * @class
    * @private
    * @name SpriteBatch
    * @memberof PIXI
    * @see PIXI.ParticleContainer
    * @throws {ReferenceError} SpriteBatch does not exist any more, please use the new ParticleContainer instead.
    * @deprecated since version 3.0.0
    */
  type SpriteBatch = ParticleContainer
  /**
    * @class
    * @private
    * @name Stage
    * @memberof PIXI
    * @see PIXI.Container
    * @deprecated since version 3.0.0
    */
  type Stage = Container
  /**
    * @class
    * @private
    * @name Strip
    * @memberof PIXI
    * @see PIXI.mesh.Mesh
    * @deprecated since version 3.0.0
    */
  type Strip = Mesh
  /**
    * @static
    * @constant
    * @name PIXI.TARGET_FPMS
    * @see PIXI.settings.TARGET_FPMS
    * @deprecated since version 4.2.0
    */
  type TARGET_FPMS = Double
  /**
    * @class
    * @private
    * @name TilingSprite
    * @memberof PIXI
    * @see PIXI.extras.TilingSprite
    * @deprecated since version 3.0.0
    */
  type TilingSprite = typings.pixiDotJs.PIXINs.extrasNs.TilingSprite
  /**
    * @class
    * @private
    * @name PIXI.TransformManual
    * @see PIXI.TransformBase
    * @deprecated since version 4.0.0
    */
  type TransformManual = TransformBase
  /**
    * @namespace
    * @private
    * @name math
    * @memberof PIXI
    * @see PIXI
    * @deprecated since version 3.0.6
    */
  type math = js.Any
}
