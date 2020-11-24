package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Support line caps in `PIXI.LineStyle` for graphics.
  *
  * @see PIXI.Graphics#lineStyle
  *
  * @name LINE_CAP
  * @memberof PIXI
  * @static
  * @enum {string}
  * @property {string} BUTT - 'butt': don't add any cap at line ends (leaves orthogonal edges)
  * @property {string} ROUND - 'round': add semicircle at ends
  * @property {string} SQUARE - 'square': add square at end (like `BUTT` except more length at end)
  */
@JSImport("pixi.js", "LINE_CAP")
@js.native
object LINE_CAP extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.LINE_CAP with Double] = js.native
  
  /* 0 */ val BUTT: typings.pixiJs.PIXI.LINE_CAP.BUTT with Double = js.native
  
  /* 1 */ val ROUND: typings.pixiJs.PIXI.LINE_CAP.ROUND with Double = js.native
  
  /* 2 */ val SQUARE: typings.pixiJs.PIXI.LINE_CAP.SQUARE with Double = js.native
}
