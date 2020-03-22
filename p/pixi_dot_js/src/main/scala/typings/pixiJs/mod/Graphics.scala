package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Graphics class contains methods used to draw primitive shapes such as lines, circles and
  * rectangles to the display, and to color and fill them.
  *
  * Note that because Graphics can share a GraphicsGeometry with other instances,
  * it is necessary to call `destroy()` to properly dereference the underlying
  * GraphicsGeometry and avoid a memory leak. Alternatively, keep using the same
  * Graphics instance and call `clear()` between redraws.
  *
  * @class
  * @extends PIXI.Container
  * @memberof PIXI
  */
@JSImport("pixi.js", "Graphics")
@js.native
class Graphics ()
  extends typings.pixiJs.PIXI.Graphics {
  def this(geometry: typings.pixiJs.PIXI.GraphicsGeometry) = this()
}

