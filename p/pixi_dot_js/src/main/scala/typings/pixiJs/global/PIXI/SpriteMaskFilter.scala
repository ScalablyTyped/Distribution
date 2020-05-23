package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This handles a Sprite acting as a mask, as opposed to a Graphic.
  *
  * WebGL only.
  *
  * @class
  * @extends PIXI.Filter
  * @memberof PIXI
  */
@JSGlobal("PIXI.SpriteMaskFilter")
@js.native
class SpriteMaskFilter protected ()
  extends typings.pixiJs.PIXI.SpriteMaskFilter {
  def this(sprite: typings.pixiJs.PIXI.Sprite) = this()
  /**
    * Program that the shader uses
    *
    * @member {PIXI.Program} PIXI.Shader#program
    */
  /* CompleteClass */
  override var program: typings.pixiJs.PIXI.Program = js.native
  /**
    * Shader uniform values, shortcut for `uniformGroup.uniforms`
    * @readonly
    * @member {object}
    */
  /* CompleteClass */
  override val uniforms: js.Any = js.native
}

