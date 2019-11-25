package typings.pkijs.srcResponseBytesMod

import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseBytes extends js.Object {
  var response: OctetString
  var responseType: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ResponseBytes {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    response: OctetString,
    responseType: String,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): ResponseBytes = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[ResponseBytes]
  }
}

