package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TimeLimiter limits the number of items handled by a {@link PIXI.BasePrepare} to a specified
  * number of milliseconds per frame.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "TimeLimiter")
@js.native
class TimeLimiter protected ()
  extends typings.pixiJs.PIXI.TimeLimiter {
  def this(maxMilliseconds: Double) = this()
}

