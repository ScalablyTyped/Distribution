package typings.msgpackLite.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ): Unit
  /**
    * Register a custom extension to deserialize your own class instances
    *
    * @param etype an integer within the range of 0 and 127 (0x0 and 0x7F)
    * @param unpacker a function that converts bytes to an instance of T
    */
  def addExtUnpacker[T](etype: Double, unpacker: js.Function1[/* data */ Buffer | Uint8Array, T]): Unit
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
}

