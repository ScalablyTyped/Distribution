package typings
package pDashSomeLib.pDashSomeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-some", "AggregateError")
@js.native
class AggregateError protected ()
  extends aggregateDashErrorLib.aggregateDashErrorMod.default {
  /**
  	 * @param errors - If a string, a new `Error` is created with the string as the error message. If a non-Error object, a new `Error` is created with all properties from the object copied over.
  	 * @returns An Error that is also an [`Iterable`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Iterators_and_Generators#Iterables) for the individual errors.
  	 */
  def this(errors: js.Array[stdLib.Error | org.scalablytyped.runtime.StringDictionary[_] | java.lang.String]) = this()
}

