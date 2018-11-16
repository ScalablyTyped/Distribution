package typings
package pkijsLib.srcRevocationInfoChoicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RevocationInfoChoices extends js.Object {
  var crls: js.Array[pkijsLib.srcCertificateRevocationListMod.default]
  var otherRevocationInfos: js.Array[pkijsLib.srcOtherRevocationInfoFormatMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

