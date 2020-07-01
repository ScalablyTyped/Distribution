package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("pixi.js", "LINE_JOIN")
@js.native
object LINE_JOIN extends js.Object {
  /* 1 */ val BEVEL: typings.pixiJs.PIXI.LINE_JOIN.BEVEL with Double = js.native
  /* 0 */ val MITER: typings.pixiJs.PIXI.LINE_JOIN.MITER with Double = js.native
  /* 2 */ val ROUND: typings.pixiJs.PIXI.LINE_JOIN.ROUND with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.LINE_JOIN with Double] = js.native
}

