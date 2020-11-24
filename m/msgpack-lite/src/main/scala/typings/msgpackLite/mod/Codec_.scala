package typings.msgpackLite.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Codec_ extends js.Object {
  
  /**
    * Register a custom extension to serialize your own class instances
    *
    * @param etype an integer within the range of 0 and 127 (0x0 and 0x7F)
    * @param Class the constructor of the type you wish to serialize
    * @param packer a function that converts an instance of T to bytes
    */
  def addExtPacker[T](
    etype: Double,
    Class: Instantiable1[/* args (repeated) */ js.Any, T],
    packer: js.Function1[/* t */ T, Buffer | Uint8Array]
  ): Unit = js.native
  
  /**
    * Register a custom extension to deserialize your own class instances
    *
    * @param etype an integer within the range of 0 and 127 (0x0 and 0x7F)
    * @param unpacker a function that converts bytes to an instance of T
    */
  def addExtUnpacker[T](etype: Double, unpacker: js.Function1[/* data */ Buffer | Uint8Array, T]): Unit = js.native
}
object Codec_ {
  
  @scala.inline
  def apply(
    addExtPacker: (Double, Instantiable1[/* args (repeated) */ js.Any, js.Any], js.Function1[js.Any, Buffer | Uint8Array]) => Unit,
    addExtUnpacker: (Double, js.Function1[/* data */ Buffer | Uint8Array, js.Any]) => Unit
  ): Codec_ = {
    val __obj = js.Dynamic.literal(addExtPacker = js.Any.fromFunction3(addExtPacker), addExtUnpacker = js.Any.fromFunction2(addExtUnpacker))
    __obj.asInstanceOf[Codec_]
  }
  
  @scala.inline
  implicit class Codec_Ops[Self <: Codec_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddExtPacker(
      value: (Double, Instantiable1[/* args (repeated) */ js.Any, js.Any], js.Function1[js.Any, Buffer | Uint8Array]) => Unit
    ): Self = this.set("addExtPacker", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddExtUnpacker(value: (Double, js.Function1[/* data */ Buffer | Uint8Array, js.Any]) => Unit): Self = this.set("addExtUnpacker", js.Any.fromFunction2(value))
  }
}
