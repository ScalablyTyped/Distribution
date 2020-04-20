package typings.md5.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("md5", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * js function for hashing messages with MD5
    *
    * @param message - a string or buffer to hash
    * @param options
    * @returns the resultant MD5 hash of the given message
    */
  def apply(message: String): String = js.native
  def apply(message: String, options: Options): String = js.native
  def apply(message: js.Array[Double]): String = js.native
  def apply(message: js.Array[Double], options: Options): String = js.native
  def apply(message: Buffer): String = js.native
  def apply(message: Buffer, options: Options): String = js.native
}

