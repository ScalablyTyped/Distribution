package typings.pixiCore

import typings.pixiCore.libTexturesResourcesBufferResourceMod.BufferResource
import typings.pixiMath.mod.ISize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesResourcesDepthResourceMod {
  
  @JSImport("@pixi/core/lib/textures/resources/DepthResource", "DepthResource")
  @js.native
  open class DepthResource protected () extends BufferResource {
    /**
      * @param source - Source buffer
      * @param options - Options
      * @param {number} options.width - Width of the texture
      * @param {number} options.height - Height of the texture
      */
    def this(source: js.typedarray.Float32Array, options: ISize) = this()
    def this(source: js.typedarray.Int32Array, options: ISize) = this()
    def this(source: js.typedarray.Uint16Array, options: ISize) = this()
    def this(source: js.typedarray.Uint32Array, options: ISize) = this()
    def this(source: js.typedarray.Uint8Array, options: ISize) = this()
  }
}
