package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This handles a Sprite acting as a mask, as opposed to a Graphic.
  *
  * WebGL only.
  *
  * @class
  * @extends PIXI.Filter
  * @memberof PIXI
  */
@js.native
trait SpriteMaskFilter extends Filter {
  
  /**
    * Mask matrix
    * @member {PIXI.Matrix} PIXI.SpriteMaskFilter#maskMatrix
    */
  var maskMatrix: Matrix = js.native
  
  /**
    * Sprite mask
    * @member {PIXI.Sprite} PIXI.SpriteMaskFilter#maskSprite
    */
  var maskSprite: Sprite = js.native
}
