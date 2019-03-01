package typings
package pkijsLib.srcGeneralNameMod

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
  var `type`: scala.Double
  /**
    * asn1js object having GENERAL_NAME value (type depends on "type" value)
    * 
    * @type {*}
    * @memberOf GeneralName
    */
  var value: js.Any
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object GeneralName {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    `type`: scala.Double,
    value: js.Any
  ): GeneralName = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GeneralName]
  }
}

