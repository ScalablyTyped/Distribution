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

