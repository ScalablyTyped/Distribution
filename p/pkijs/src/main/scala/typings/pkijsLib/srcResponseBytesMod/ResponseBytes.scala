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

object ResponseBytes {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    response: asn1jsLib.asn1jsMod.OctetString,
    responseType: java.lang.String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): ResponseBytes = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), response = response, responseType = responseType, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[ResponseBytes]
  }
}

