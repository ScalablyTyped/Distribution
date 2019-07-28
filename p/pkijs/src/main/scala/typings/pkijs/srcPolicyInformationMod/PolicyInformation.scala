package typings.pkijs.srcPolicyInformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyInformation extends js.Object {
  var policyIdentifier: String
  /**
    * Value of the TIME class 
    */
  var policyQualifiers: js.Array[typings.pkijs.srcPolicyQualifierInfoMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyInformation {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    policyIdentifier: String,
    policyQualifiers: js.Array[typings.pkijs.srcPolicyQualifierInfoMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PolicyInformation = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), policyIdentifier = policyIdentifier, policyQualifiers = policyQualifiers, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[PolicyInformation]
  }
}

