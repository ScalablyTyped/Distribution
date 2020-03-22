package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renderer for Particles that is designer for speed over feature set.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "ParticleRenderer")
@js.native
class ParticleRenderer protected ()
  extends typings.pixiJs.PIXI.ParticleRenderer {
  def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
}

