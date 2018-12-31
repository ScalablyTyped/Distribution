package typings
package murmurhashLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("murmurhash", JSImport.Namespace)
@js.native
object murmurhashMod extends js.Object {
  /**
    * JS Implementation of MurmurHash3 (r136) (as of May 20, 2011)
    *
    * @param key - ASCII only
    * @param seed - (optional) positive integer
    * @returns 32-bit positive integer hash
    */
  def apply(key: java.lang.String): scala.Double = js.native
  def apply(key: java.lang.String, seed: scala.Double): scala.Double = js.native
  /**
    * JS Implementation of MurmurHash2
    *
    * @param str - ASCII only
    * @param seed - (optional) positive integer
    * @returns 32-bit positive integer hash
    */
  def v2(str: java.lang.String): scala.Double = js.native
  def v2(str: java.lang.String, seed: scala.Double): scala.Double = js.native
  /**
    * JS Implementation of MurmurHash3 (r136) (as of May 20, 2011)
    *
    * @param key - ASCII only
    * @param seed - (optional) positive integer
    * @returns 32-bit positive integer hash
    */
  def v3(key: java.lang.String): scala.Double = js.native
  def v3(key: java.lang.String, seed: scala.Double): scala.Double = js.native
}

