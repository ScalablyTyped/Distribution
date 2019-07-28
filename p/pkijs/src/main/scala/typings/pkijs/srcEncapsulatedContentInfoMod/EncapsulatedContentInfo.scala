package typings.pkijs.srcEncapsulatedContentInfoMod

import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncapsulatedContentInfo extends js.Object {
  var eContent: OctetString
  var eContentType: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object EncapsulatedContentInfo {
  @scala.inline
  def apply(
    eContent: OctetString,
    eContentType: String,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): EncapsulatedContentInfo = {
    val __obj = js.Dynamic.literal(eContent = eContent, eContentType = eContentType, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[EncapsulatedContentInfo]
  }
}

