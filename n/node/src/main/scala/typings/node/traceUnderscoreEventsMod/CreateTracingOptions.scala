package typings.node.traceUnderscoreEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTracingOptions extends js.Object {
  /**
    * An array of trace category names. Values included in the array are
    * coerced to a string when possible. An error will be thrown if the
    * value cannot be coerced.
    */
  var categories: js.Array[java.lang.String]
}

object CreateTracingOptions {
  @scala.inline
  def apply(categories: js.Array[java.lang.String]): CreateTracingOptions = {
    val __obj = js.Dynamic.literal(categories = categories)
  
    __obj.asInstanceOf[CreateTracingOptions]
  }
}

