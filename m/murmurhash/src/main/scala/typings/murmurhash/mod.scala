package typings.murmurhash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * JS Implementation of MurmurHash3 (r136) (as of May 20, 2011)
    *
    * @param key - ASCII only
    * @param seed - (optional) positive integer
    * @returns 32-bit positive integer hash
    */
  @JSImport("murmurhash", JSImport.Namespace)
  @js.native
  def apply(key: String): Double = js.native
  @JSImport("murmurhash", JSImport.Namespace)
  @js.native
  def apply(key: String, seed: Double): Double = js.native
  
  /**
    * JS Implementation of MurmurHash2
    *
    * @param str - ASCII only
    * @param seed - (optional) positive integer
    * @returns 32-bit positive integer hash
    */
  @JSImport("murmurhash", "v2")
  @js.native
  def v2(str: String): Double = js.native
  @JSImport("murmurhash", "v2")
  @js.native
  def v2(str: String, seed: Double): Double = js.native
  
  /**
    * JS Implementation of MurmurHash3 (r136) (as of May 20, 2011)
    *
    * @param key - ASCII only
    * @param seed - (optional) positive integer
    * @returns 32-bit positive integer hash
    */
  @JSImport("murmurhash", "v3")
  @js.native
  def v3(key: String): Double = js.native
  @JSImport("murmurhash", "v3")
  @js.native
  def v3(key: String, seed: Double): Double = js.native
}
