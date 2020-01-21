package typings.md5

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("md5", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * js function for hashing messages with MD5
    *
    * @param {(string | Buffer)} message - a string or buffer to hash
    * @returns {string} the resultant MD5 hash of the given message
    */
  def apply(message: String): String = js.native
  def apply(message: js.Array[Double]): String = js.native
  def apply(message: Buffer): String = js.native
}

