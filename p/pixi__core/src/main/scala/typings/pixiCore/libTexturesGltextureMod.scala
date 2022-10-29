package typings.pixiCore

import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesGltextureMod {
  
  @JSImport("@pixi/core/lib/textures/GLTexture", "GLTexture")
  @js.native
  open class GLTexture protected () extends StObject {
    def this(texture: WebGLTexture) = this()
    
    /** Texture contents dirty flag. */
    var dirtyId: Double = js.native
    
    /** Texture style dirty flag. */
    var dirtyStyleId: Double = js.native
    
    /** Height of texture that was used in texImage2D. */
    var height: Double = js.native
    
    /** Type copied from baseTexture. */
    var internalFormat: Double = js.native
    
    /** Whether mip levels has to be generated. */
    var mipmap: Boolean = js.native
    
    /** Type of sampler corresponding to this texture. See {@link PIXI.SAMPLER_TYPES} */
    var samplerType: Double = js.native
    
    /** The WebGL texture. */
    var texture: WebGLTexture = js.native
    
    /** Type copied from baseTexture. */
    var `type`: Double = js.native
    
    /** Width of texture that was used in texImage2D. */
    var width: Double = js.native
    
    /** WrapMode copied from baseTexture. */
    var wrapMode: Double = js.native
  }
}
