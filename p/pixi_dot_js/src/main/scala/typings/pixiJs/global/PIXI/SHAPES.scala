package typings.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object SHAPES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.SHAPES & Double] = js.native
  
  /* 2 */ val CIRC: typings.pixiJs.PIXI.SHAPES.CIRC & Double = js.native
  
  /* 3 */ val ELIP: typings.pixiJs.PIXI.SHAPES.ELIP & Double = js.native
  
  /* 0 */ val POLY: typings.pixiJs.PIXI.SHAPES.POLY & Double = js.native
  
  /* 1 */ val RECT: typings.pixiJs.PIXI.SHAPES.RECT & Double = js.native
  
  /* 4 */ val RREC: typings.pixiJs.PIXI.SHAPES.RREC & Double = js.native
}
