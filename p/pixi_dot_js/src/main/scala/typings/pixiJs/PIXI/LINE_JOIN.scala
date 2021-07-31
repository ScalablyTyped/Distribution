package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LINE_JOIN extends StObject
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
object LINE_JOIN extends StObject {
  
  @js.native
  sealed trait BEVEL
    extends StObject
       with LINE_JOIN
  
  @js.native
  sealed trait MITER
    extends StObject
       with LINE_JOIN
  
  @js.native
  sealed trait ROUND
    extends StObject
       with LINE_JOIN
}
