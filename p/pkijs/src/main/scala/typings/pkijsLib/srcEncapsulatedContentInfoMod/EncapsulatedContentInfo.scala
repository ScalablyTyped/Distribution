package typings
package pkijsLib.srcEncapsulatedContentInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncapsulatedContentInfo extends js.Object {
  var eContent: asn1jsLib.asn1jsMod.OctetString
  var eContentType: java.lang.String
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object EncapsulatedContentInfo {
  @scala.inline
  def apply(
    eContent: asn1jsLib.asn1jsMod.OctetString,
    eContentType: java.lang.String,
    fromSchema: js.Any => scala.Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): EncapsulatedContentInfo = {
    val __obj = js.Dynamic.literal(eContent = eContent, eContentType = eContentType, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[EncapsulatedContentInfo]
  }
}

