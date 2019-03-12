package typings
package pkijsLib.srcECPrivateKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECPrivateKey extends js.Object {
  var namedCurve: js.UndefOr[java.lang.String] = js.undefined
  var privateKey: asn1jsLib.asn1jsMod.OctetString
  var publicKey: js.UndefOr[pkijsLib.srcECPublicKeyMod.default] = js.undefined
  var version: scala.Double
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: stdLib.JsonWebKey): scala.Unit
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ECPrivateKey {
  @scala.inline
  def apply(
    fromJSON: stdLib.JsonWebKey => scala.Unit,
    fromSchema: js.Any => scala.Unit,
    privateKey: asn1jsLib.asn1jsMod.OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: scala.Double,
    namedCurve: java.lang.String = null,
    publicKey: pkijsLib.srcECPublicKeyMod.default = null
  ): ECPrivateKey = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), privateKey = privateKey, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version)
    if (namedCurve != null) __obj.updateDynamic("namedCurve")(namedCurve)
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[ECPrivateKey]
  }
}

