package typings
package pkijsLib.srcPolicyInformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyInformation extends js.Object {
  var policyIdentifier: java.lang.String
  /**
    * Value of the TIME class 
    */
  var policyQualifiers: js.Array[pkijsLib.srcPolicyQualifierInfoMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyInformation {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    policyIdentifier: java.lang.String,
    policyQualifiers: js.Array[pkijsLib.srcPolicyQualifierInfoMod.default],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): PolicyInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("policyIdentifier")(policyIdentifier)
    __obj.updateDynamic("policyQualifiers")(policyQualifiers)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.asInstanceOf[PolicyInformation]
  }
}

