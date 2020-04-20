package typings.pkijs.digestInfoMod

import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DigestInfo extends js.Object {
  var digest: OctetString
  var digestAlgorithm: typings.pkijs.algorithmIdentifierMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object DigestInfo {
  @scala.inline
  def apply(
    digest: OctetString,
    digestAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): DigestInfo = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[DigestInfo]
  }
}

