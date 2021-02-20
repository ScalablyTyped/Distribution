package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LINE_CAP extends StObject
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
@JSGlobal("PIXI.LINE_CAP")
@js.native
object LINE_CAP extends StObject {
  
  @js.native
  sealed trait BUTT extends LINE_CAP
  
  @js.native
  sealed trait ROUND extends LINE_CAP
  
  @js.native
  sealed trait SQUARE extends LINE_CAP
}
