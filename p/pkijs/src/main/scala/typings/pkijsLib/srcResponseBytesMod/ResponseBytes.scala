package typings
package pkijsLib.srcResponseBytesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResponseBytes extends js.Object {
  var response: asn1jsLib.asn1jsMod.OctetString
  var responseType: java.lang.String
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

