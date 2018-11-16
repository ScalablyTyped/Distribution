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

