package typings.pkijs.srcPolicyMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyMapping extends js.Object {
  var issuerDomainPolicy: String
  var subjectDomainPolicy: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyMapping {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    issuerDomainPolicy: String,
    subjectDomainPolicy: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PolicyMapping = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), issuerDomainPolicy = issuerDomainPolicy.asInstanceOf[js.Any], subjectDomainPolicy = subjectDomainPolicy.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[PolicyMapping]
  }
}

