package typings
package pkijsLib.srcPrivateKeyInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PrivateKeyInfo extends js.Object {
  var attributes: js.UndefOr[js.Array[pkijsLib.srcAttributeMod.default]] = js.undefined
  var parsedKey: js.UndefOr[pkijsLib.srcECPrivateKeyMod.default | pkijsLib.srcRSAPrivateKeyMod.default] = js.undefined
  var privateKey: asn1jsLib.asn1jsMod.OctetString
  var privateKeyAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
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

