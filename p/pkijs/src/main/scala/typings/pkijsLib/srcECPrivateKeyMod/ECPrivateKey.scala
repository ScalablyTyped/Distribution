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

