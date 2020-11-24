package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CountLimiter limits the number of items handled by a {@link PIXI.BasePrepare} to a specified
  * number of items per frame.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "CountLimiter")
@js.native
class CountLimiter protected ()
  extends typings.pixiJs.PIXI.CountLimiter {
  def this(maxItemsPerFrame: Double) = this()
}
