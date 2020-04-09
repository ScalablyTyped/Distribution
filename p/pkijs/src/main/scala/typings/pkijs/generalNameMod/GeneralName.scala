package typings.pkijs.generalNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralName extends js.Object {
  /**
    * value type - from a tagged value (0 for "otherName", 1 for "rfc822Name" etc.)
    *
    * @type {number}
    * @memberOf GeneralName
    */
  var `type`: Double
  /**
    * asn1js object having GENERAL_NAME value (type depends on "type" value)
    *
    * @type {*}
    * @memberOf GeneralName
    */
  var value: js.Any
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object GeneralName {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    `type`: Double,
    value: js.Any
  ): GeneralName = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralName]
  }
}

