package typings
package msgpackDashLiteLib.msgpackDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Codec extends js.Object {
  /**
     * Register a custom extension to serialize your own class instances
     *
     * @param etype an integer within the range of 0 and 127 (0x0 and 0x7F)
     * @param Class the constructor of the type you wish to serialize
     * @param packer a function that converts an instance of T to bytes
     */
  def addExtPacker[T](
    etype: scala.Double,
    Class: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T],
    packer: js.Function1[/* t */ T, nodeLib.Buffer | stdLib.Uint8Array]
  ): scala.Unit
  /**
     * Register a custom extension to deserialize your own class instances
     *
     * @param etype an integer within the range of 0 and 127 (0x0 and 0x7F)
     * @param unpacker a function that converts bytes to an instance of T
     */
  def addExtUnpacker[T](etype: scala.Double, unpacker: js.Function1[/* data */ nodeLib.Buffer | stdLib.Uint8Array, T]): scala.Unit
}

