package typings
package microsoftDashAjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Provides extensions to the base ECMAScript (JavaScript) Boolean object.
* Boolean Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb397557(v=vs.100).aspx}
*/
trait BooleanConstructor extends js.Object {
  //#region Extensions
  /**
    * Converts a string representation of a logical value to its Boolean object equivalent.
    */
  def parse(value: java.lang.String): scala.Boolean
}

object BooleanConstructor {
  @scala.inline
  def apply(parse: js.Function1[java.lang.String, scala.Boolean]): BooleanConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[BooleanConstructor]
  }
}

