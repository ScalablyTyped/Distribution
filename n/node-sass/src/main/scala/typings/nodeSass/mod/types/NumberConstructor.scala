package typings.nodeSass.mod.types

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberConstructor
  extends /**
		 * Constructs a new Sass number. Does not require use of the `new` keyword.
		 */
Instantiable1[/* value */ Double, Number]
     with Instantiable2[/* value */ Double, /* unit */ java.lang.String, Number] {
  /**
  		 * Constructs a new Sass number. Can also be used with the `new` keyword.
  		 */
  def apply(value: Double): Number = js.native
  def apply(value: Double, unit: java.lang.String): Number = js.native
}

