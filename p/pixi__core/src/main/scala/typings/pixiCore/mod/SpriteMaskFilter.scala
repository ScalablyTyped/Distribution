package typings.pixiCore.mod

import typings.pixiCore.libMaskMaskDataMod.IMaskTarget
import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "SpriteMaskFilter")
@js.native
/**
  * @param vertexSrc - The source of the vertex shader.
  * @param fragmentSrc - The source of the fragment shader.
  * @param uniforms - Custom uniforms to use to augment the built-in ones.
  */
open class SpriteMaskFilter ()
  extends typings.pixiCore.libFiltersSpriteMaskSpriteMaskFilterMod.SpriteMaskFilter {
  /**
    * @param {PIXI.Sprite} sprite - The target sprite.
    */
  def this(sprite: IMaskTarget) = this()
  def this(vertexSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String) = this()
  def this(vertexSrc: Unit, fragmentSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String, uniforms: Dict[Any]) = this()
  def this(vertexSrc: String, fragmentSrc: Unit, uniforms: Dict[Any]) = this()
  def this(vertexSrc: Unit, fragmentSrc: String, uniforms: Dict[Any]) = this()
  def this(vertexSrc: Unit, fragmentSrc: Unit, uniforms: Dict[Any]) = this()
}
