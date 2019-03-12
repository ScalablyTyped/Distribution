package typings
package pkijsLib.srcPolicyQualifierInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyQualifierInfo extends js.Object {
  var policyQualifierId: java.lang.String
  var qualifier: js.Any
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyQualifierInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    policyQualifierId: java.lang.String,
    qualifier: js.Any,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PolicyQualifierInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), policyQualifierId = policyQualifierId, qualifier = qualifier, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[PolicyQualifierInfo]
  }
}

