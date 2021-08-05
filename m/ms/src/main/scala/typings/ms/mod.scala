package typings.ms

import typings.ms.anon.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  * Parse the given `value` and return milliseconds.
  *
  * @param {String} value
  * @return {Number}
  */
  inline def apply(value: String): Double = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(value: Double): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: Double, options: Long): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("ms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
