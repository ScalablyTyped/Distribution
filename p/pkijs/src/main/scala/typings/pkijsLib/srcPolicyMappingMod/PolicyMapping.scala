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

