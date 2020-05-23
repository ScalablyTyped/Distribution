package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ParticleContainer class is a really fast version of the Container built solely for speed,
  * so use when you need a lot of sprites or particles.
  *
  * The tradeoff of the ParticleContainer is that most advanced functionality will not work.
  * ParticleContainer implements the basic object transform (position, scale, rotation)
  * and some advanced functionality like tint (as of v4.5.6).
  *
  * Other more advanced functionality like masking, children, filters, etc will not work on sprites in this batch.
  *
  * It's extremely easy to use:
  * ```js
  * let container = new ParticleContainer();
  *
  * for (let i = 0; i < 100; ++i)
  * {
  *     let sprite = PIXI.Sprite.from("myImage.png");
  *     container.addChild(sprite);
  * }
  * ```
  *
  * And here you have a hundred sprites that will be rendered at the speed of light.
  *
  * @class
  * @extends PIXI.Container
  * @memberof PIXI
  */
@js.native
trait ParticleContainer extends Container {
  /**
    * If true, container allocates more batches in case there are more than `maxSize` particles.
    * @member {boolean} PIXI.ParticleContainer#autoResize
    * @default false
    */
  var autoResize: Boolean = js.native
  /**
    * The texture used to render the children.
    *
    * @readonly
    * @member {PIXI.BaseTexture} PIXI.ParticleContainer#baseTexture
    */
  val baseTexture: BaseTexture = js.native
  /**
    * The blend mode to be applied to the sprite. Apply a value of `PIXI.BLEND_MODES.NORMAL`
    * to reset the blend mode.
    *
    * @member {number} PIXI.ParticleContainer#blendMode
    * @default PIXI.BLEND_MODES.NORMAL
    * @see PIXI.BLEND_MODES
    */
  var blendMode: Double = js.native
  /**
    * If true PixiJS will Math.floor() x/y values when rendering, stopping pixel interpolation.
    * Advantages can include sharper image quality (like text) and faster rendering on canvas.
    * The main disadvantage is movement of objects may appear less smooth.
    * Default to true here as performance is usually the priority for particles.
    *
    * @member {boolean} PIXI.ParticleContainer#roundPixels
    * @default true
    */
  var roundPixels: Boolean = js.native
  /**
    * The tint applied to the container. This is a hex value.
    * A value of 0xFFFFFF will remove any tint effect.
    ** IMPORTANT: This is a WebGL only feature and will be ignored by the canvas renderer.
    * @member {number}
    * @default 0xFFFFFF
    */
  var tint: Double = js.native
  /**
    * Sets the private properties array to dynamic / static based on the passed properties object
    *
    * @param {object} properties - The properties to be uploaded
    */
  def setProperties(properties: js.Any): Unit = js.native
}

