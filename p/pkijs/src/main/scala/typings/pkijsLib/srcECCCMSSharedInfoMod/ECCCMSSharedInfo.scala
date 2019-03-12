package typings
package pkijsLib.srcECCCMSSharedInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECCCMSSharedInfo extends js.Object {
  var entityUInfo: js.UndefOr[asn1jsLib.asn1jsMod.OctetString] = js.undefined
  var keyInfo: stdLib.AlgorithmIdentifier
  var suppPubInfo: asn1jsLib.asn1jsMod.OctetString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ECCCMSSharedInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    keyInfo: stdLib.AlgorithmIdentifier,
    suppPubInfo: asn1jsLib.asn1jsMod.OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    entityUInfo: asn1jsLib.asn1jsMod.OctetString = null
  ): ECCCMSSharedInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyInfo = keyInfo.asInstanceOf[js.Any], suppPubInfo = suppPubInfo, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (entityUInfo != null) __obj.updateDynamic("entityUInfo")(entityUInfo)
    __obj.asInstanceOf[ECCCMSSharedInfo]
  }
}

