package typings.microsoftAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectConstructor extends js.Object {
  /**
    * Formats a number by using the invariant culture.
    */
  def getType(instance: js.Any): Type
  /**
    * Returns a string that identifies the run-time type name of an object.
    */
  def getTypeName(instance: js.Any): java.lang.String
}

object ObjectConstructor {
  @scala.inline
  def apply(getType: js.Any => Type, getTypeName: js.Any => java.lang.String): ObjectConstructor = {
    val __obj = js.Dynamic.literal(getType = js.Any.fromFunction1(getType), getTypeName = js.Any.fromFunction1(getTypeName))
  
    __obj.asInstanceOf[ObjectConstructor]
  }
}

