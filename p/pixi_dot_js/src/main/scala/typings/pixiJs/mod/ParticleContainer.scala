package typings.pixiJs.mod

import typings.pixiJs.AnonPosition
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
@JSImport("pixi.js", "ParticleContainer")
@js.native
class ParticleContainer ()
  extends typings.pixiJs.PIXI.ParticleContainer {
  def this(maxSize: Double) = this()
  def this(maxSize: Double, properties: AnonPosition) = this()
  def this(maxSize: Double, properties: AnonPosition, batchSize: Double) = this()
  def this(maxSize: Double, properties: AnonPosition, batchSize: Double, autoResize: Boolean) = this()
}

