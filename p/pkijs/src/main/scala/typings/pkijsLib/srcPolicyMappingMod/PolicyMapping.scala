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
    fromSchema: js.Function1[js.Any, scala.Unit],
    issuerDomainPolicy: java.lang.String,
    subjectDomainPolicy: java.lang.String,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): PolicyMapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("issuerDomainPolicy")(issuerDomainPolicy)
    __obj.updateDynamic("subjectDomainPolicy")(subjectDomainPolicy)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.asInstanceOf[PolicyMapping]
  }
}

