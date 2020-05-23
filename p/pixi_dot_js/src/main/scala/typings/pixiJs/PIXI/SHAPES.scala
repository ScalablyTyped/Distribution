package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SHAPES extends js.Object

/**
  * Constants that identify shapes, mainly to prevent `instanceof` calls.
  *
  * @static
  * @constant
  * @name SHAPES
  * @memberof PIXI
  * @type {enum}
  * @property {number} POLY Polygon
  * @property {number} RECT Rectangle
  * @property {number} CIRC Circle
  * @property {number} ELIP Ellipse
  * @property {number} RREC Rounded Rectangle
  * @enum {number}
  */
@JSGlobal("PIXI.SHAPES")
@js.native
object SHAPES extends js.Object {
  @js.native
  sealed trait CIRC extends SHAPES
  
  @js.native
  sealed trait ELIP extends SHAPES
  
  @js.native
  sealed trait POLY extends SHAPES
  
  @js.native
  sealed trait RECT extends SHAPES
  
  @js.native
  sealed trait RREC extends SHAPES
  
}

