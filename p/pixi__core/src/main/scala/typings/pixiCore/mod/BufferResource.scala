package typings.pixiCore.mod

import typings.pixiMath.mod.ISize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "BufferResource")
@js.native
open class BufferResource protected ()
  extends typings.pixiCore.libTexturesResourcesMod.BufferResource {
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
/* static members */
object BufferResource {
  
  @JSImport("@pixi/core", "BufferResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to auto-detect the type of resource.
    * @param {*} source - The source object
    * @returns {boolean} `true` if \<canvas\>
    */
  inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
