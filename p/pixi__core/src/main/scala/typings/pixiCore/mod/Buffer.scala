package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Buffer")
@js.native
/**
  * @param {PIXI.IArrayBuffer} data - the data to store in the buffer.
  * @param _static - `true` for static buffer
  * @param index - `true` for index buffer
  */
open class Buffer ()
  extends typings.pixiCore.libGeometryBufferMod.Buffer {
  def this(data: js.typedarray.ArrayBuffer) = this()
  def this(data: js.typedarray.ArrayBuffer, _static: Boolean) = this()
  def this(data: Unit, _static: Boolean) = this()
  def this(data: js.typedarray.ArrayBuffer, _static: Boolean, index: Boolean) = this()
  def this(data: js.typedarray.ArrayBuffer, _static: Unit, index: Boolean) = this()
  def this(data: Unit, _static: Boolean, index: Boolean) = this()
  def this(data: Unit, _static: Unit, index: Boolean) = this()
}
/* static members */
object Buffer {
  
  @JSImport("@pixi/core", "Buffer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(data: js.Array[Double]): typings.pixiCore.libGeometryBufferMod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.libGeometryBufferMod.Buffer]
  /**
    * Helper function that creates a buffer based on an array or TypedArray
    * @param {ArrayBufferView | number[]} data - the TypedArray that the buffer will store. If this is a regular Array it will be converted to a Float32Array.
    * @returns - A new Buffer based on the data provided.
    */
  inline def from(data: js.typedarray.ArrayBuffer): typings.pixiCore.libGeometryBufferMod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.libGeometryBufferMod.Buffer]
}
