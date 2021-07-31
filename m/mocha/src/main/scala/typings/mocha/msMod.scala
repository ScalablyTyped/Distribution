package typings.mocha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msMod {
  
  /**
    * Parse the given `str` and return milliseconds.
    *
    * @see {@link https://mochajs.org/api/module-milliseconds.html}
    * @see {@link https://mochajs.org/api/module-milliseconds.html#~parse}
    */
  @scala.inline
  def apply(`val`: String): Double = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  /**
    * Format for `ms`.
    *
    * @see {@link https://mochajs.org/api/module-milliseconds.html}
    * @see {@link https://mochajs.org/api/module-milliseconds.html#~format}
    */
  @scala.inline
  def apply(`val`: Double): String = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("mocha/lib/ms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
