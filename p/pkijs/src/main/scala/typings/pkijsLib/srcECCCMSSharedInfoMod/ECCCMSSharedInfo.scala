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
    fromSchema: js.Function1[js.Any, scala.Unit],
    keyInfo: stdLib.AlgorithmIdentifier,
    suppPubInfo: asn1jsLib.asn1jsMod.OctetString,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    entityUInfo: asn1jsLib.asn1jsMod.OctetString = null
  ): ECCCMSSharedInfo = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, keyInfo = keyInfo.asInstanceOf[js.Any], suppPubInfo = suppPubInfo, toJSON = toJSON, toSchema = toSchema)
    if (entityUInfo != null) __obj.updateDynamic("entityUInfo")(entityUInfo)
    __obj.asInstanceOf[ECCCMSSharedInfo]
  }
}

