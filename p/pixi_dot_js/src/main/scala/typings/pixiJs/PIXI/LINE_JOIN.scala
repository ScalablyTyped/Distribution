package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LINE_JOIN extends js.Object

/**
  * Supported line joints in `PIXI.LineStyle` for graphics.
  *
  * @see PIXI.Graphics#lineStyle
  * @see https://graphicdesign.stackexchange.com/questions/59018/what-is-a-bevel-join-of-two-lines-exactly-illustrator
  *
  * @name LINE_JOIN
  * @memberof PIXI
  * @static
  * @enum {string}
  * @property {string} MITER - 'miter': make a sharp corner where outer part of lines meet
  * @property {string} BEVEL - 'bevel': add a square butt at each end of line segment and fill the triangle at turn
  * @property {string} ROUND - 'round': add an arc at the joint
  */
@JSGlobal("PIXI.LINE_JOIN")
@js.native
object LINE_JOIN extends js.Object {
  @js.native
  sealed trait BEVEL extends LINE_JOIN
  
  @js.native
  sealed trait MITER extends LINE_JOIN
  
  @js.native
  sealed trait ROUND extends LINE_JOIN
  
}

