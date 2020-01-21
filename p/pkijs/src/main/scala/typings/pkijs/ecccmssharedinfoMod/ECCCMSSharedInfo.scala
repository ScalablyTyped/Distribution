package typings.pkijs.ecccmssharedinfoMod

import typings.asn1js.mod.OctetString
import typings.std.AlgorithmIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECCCMSSharedInfo extends js.Object {
  var entityUInfo: js.UndefOr[OctetString] = js.undefined
  var keyInfo: AlgorithmIdentifier
  var suppPubInfo: OctetString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ECCCMSSharedInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    keyInfo: AlgorithmIdentifier,
    suppPubInfo: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    entityUInfo: OctetString = null
  ): ECCCMSSharedInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyInfo = keyInfo.asInstanceOf[js.Any], suppPubInfo = suppPubInfo.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (entityUInfo != null) __obj.updateDynamic("entityUInfo")(entityUInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECCCMSSharedInfo]
  }
}

