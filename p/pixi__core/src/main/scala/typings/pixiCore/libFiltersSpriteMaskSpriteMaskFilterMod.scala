package typings.pixiCore

import typings.pixiCore.libFiltersFilterMod.Filter
import typings.pixiCore.libMaskMaskDataMod.IMaskTarget
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.libTexturesTextureMod.Texture
import typings.pixiMath.mod.Matrix
import typings.pixiMath.mod.Point
import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFiltersSpriteMaskSpriteMaskFilterMod {
  
  @JSImport("@pixi/core/lib/filters/spriteMask/SpriteMaskFilter", "SpriteMaskFilter")
  @js.native
  /**
    * @param vertexSrc - The source of the vertex shader.
    * @param fragmentSrc - The source of the fragment shader.
    * @param uniforms - Custom uniforms to use to augment the built-in ones.
    */
  open class SpriteMaskFilter () extends Filter {
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
    
    /** @private */
    var _maskSprite: IMaskTarget = js.native
    
    /** Mask matrix */
    var maskMatrix: Matrix = js.native
    
    /**
      * Sprite mask
      * @type {PIXI.DisplayObject}
      */
    def maskSprite: IMaskTarget = js.native
    def maskSprite_=(value: IMaskTarget): Unit = js.native
  }
  
  @js.native
  trait ISpriteMaskFilter extends Filter {
    
    var maskSprite: IMaskTarget = js.native
  }
  
  @js.native
  trait ISpriteMaskTarget
    extends StObject
       with IMaskTarget {
    
    var _texture: Texture[Resource] = js.native
    
    var anchor: Point = js.native
    
    var worldAlpha: Double = js.native
  }
}
