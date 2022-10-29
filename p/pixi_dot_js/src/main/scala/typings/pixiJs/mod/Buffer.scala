package typings.pixiJs.mod

import typings.pixiCore.libGeometryBufferMod.IArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Buffer")
@js.native
/**
  * @param {PIXI.IArrayBuffer} data - the data to store in the buffer.
  * @param _static - `true` for static buffer
  * @param index - `true` for index buffer
  */
open class Buffer ()
  extends typings.pixiCore.mod.Buffer {
  def this(data: IArrayBuffer) = this()
  def this(data: Unit, _static: Boolean) = this()
  def this(data: IArrayBuffer, _static: Boolean) = this()
  def this(data: Unit, _static: Boolean, index: Boolean) = this()
  def this(data: Unit, _static: Unit, index: Boolean) = this()
  def this(data: IArrayBuffer, _static: Boolean, index: Boolean) = this()
  def this(data: IArrayBuffer, _static: Unit, index: Boolean) = this()
}
/* static members */
object Buffer {
  
  @JSImport("pixi.js", "Buffer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(data: js.Array[Double]): typings.pixiCore.libGeometryBufferMod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.libGeometryBufferMod.Buffer]
  /**
    * Helper function that creates a buffer based on an array or TypedArray
    * @param {ArrayBufferView | number[]} data - the TypedArray that the buffer will store. If this is a regular Array it will be converted to a Float32Array.
    * @returns - A new Buffer based on the data provided.
    */
  inline def from(data: IArrayBuffer): typings.pixiCore.libGeometryBufferMod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.libGeometryBufferMod.Buffer]
}
