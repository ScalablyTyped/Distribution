package typings.murmurhash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * JS Implementation of MurmurHash3 (r136) (as of May 20, 2011)
    *
    * @param key - ASCII only
    * @param seed - (optional) positive integer
    * @returns 32-bit positive integer hash
    */
  inline def apply(key: String): Double = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(key: String, seed: Double): Double = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(key: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(key: js.typedarray.Uint8Array, seed: Double): Double = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("murmurhash/murmurhash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * JS Implementation of MurmurHash2
    *
    * @param str - ASCII only
    * @param seed - (optional) positive integer
    * @returns 32-bit positive integer hash
    */
  inline def v2(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("v2")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def v2(str: String, seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("v2")(str.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def v2(str: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("v2")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def v2(str: js.typedarray.Uint8Array, seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("v2")(str.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * JS Implementation of MurmurHash3 (r136) (as of May 20, 2011)
    *
    * @param key - ASCII only
    * @param seed - (optional) positive integer
    * @returns 32-bit positive integer hash
    */
  inline def v3(key: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("v3")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def v3(key: String, seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("v3")(key.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def v3(key: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("v3")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def v3(key: js.typedarray.Uint8Array, seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("v3")(key.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
}
