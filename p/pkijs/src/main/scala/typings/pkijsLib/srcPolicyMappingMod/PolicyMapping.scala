package typings
package pkijsLib.srcPolicyMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyMapping extends js.Object {
  var issuerDomainPolicy: java.lang.String
  var subjectDomainPolicy: java.lang.String
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyMapping {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    issuerDomainPolicy: java.lang.String,
    subjectDomainPolicy: java.lang.String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PolicyMapping = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), issuerDomainPolicy = issuerDomainPolicy, subjectDomainPolicy = subjectDomainPolicy, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[PolicyMapping]
  }
}

