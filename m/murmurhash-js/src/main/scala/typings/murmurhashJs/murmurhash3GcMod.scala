package typings.murmurhashJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object murmurhash3GcMod {
  
  inline def apply(str: String): Double = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(str: String, seed: Double): Double = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("murmurhash-js/murmurhash3_gc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
