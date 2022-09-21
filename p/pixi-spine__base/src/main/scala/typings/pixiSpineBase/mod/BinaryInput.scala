package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/base", "BinaryInput")
@js.native
open class BinaryInput protected () extends StObject {
  def this(data: js.typedarray.Uint8Array) = this()
  def this(data: js.typedarray.Uint8Array, strings: js.Array[String]) = this()
  def this(data: js.typedarray.Uint8Array, strings: js.Array[String], index: Double) = this()
  def this(data: js.typedarray.Uint8Array, strings: Unit, index: Double) = this()
  def this(
    data: js.typedarray.Uint8Array,
    strings: js.Array[String],
    index: Double,
    buffer: js.typedarray.DataView
  ) = this()
  def this(
    data: js.typedarray.Uint8Array,
    strings: js.Array[String],
    index: Unit,
    buffer: js.typedarray.DataView
  ) = this()
  def this(data: js.typedarray.Uint8Array, strings: Unit, index: Double, buffer: js.typedarray.DataView) = this()
  def this(data: js.typedarray.Uint8Array, strings: Unit, index: Unit, buffer: js.typedarray.DataView) = this()
  
  /* private */ var buffer: Any = js.native
  
  /* private */ var index: Any = js.native
  
  def readBoolean(): Boolean = js.native
  
  def readByte(): Double = js.native
  
  def readFloat(): Double = js.native
  
  def readInt(optimizePositive: Boolean): Double = js.native
  
  def readInt32(): Double = js.native
  
  def readShort(): Double = js.native
  
  def readString(): String | Null = js.native
  
  def readStringRef(): String | Null = js.native
  
  def readUnsignedByte(): Double = js.native
  
  var strings: js.Array[String] = js.native
}
