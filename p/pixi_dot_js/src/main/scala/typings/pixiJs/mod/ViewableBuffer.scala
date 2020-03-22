package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Flexible wrapper around `ArrayBuffer` that also provides
  * typed array views on demand.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "ViewableBuffer")
@js.native
class ViewableBuffer protected ()
  extends typings.pixiJs.PIXI.ViewableBuffer {
  def this(size: Double) = this()
}

