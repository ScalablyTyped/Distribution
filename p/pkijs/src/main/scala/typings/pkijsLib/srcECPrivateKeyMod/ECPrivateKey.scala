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
    fromJSON: js.Function1[stdLib.JsonWebKey, scala.Unit],
    fromSchema: js.Function1[js.Any, scala.Unit],
    privateKey: asn1jsLib.asn1jsMod.OctetString,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    version: scala.Double,
    namedCurve: java.lang.String = null,
    publicKey: pkijsLib.srcECPublicKeyMod.default = null
  ): ECPrivateKey = {
    val __obj = js.Dynamic.literal(fromJSON = fromJSON, fromSchema = fromSchema, privateKey = privateKey, toJSON = toJSON, toSchema = toSchema, version = version)
    if (namedCurve != null) __obj.updateDynamic("namedCurve")(namedCurve)
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[ECPrivateKey]
  }
}

